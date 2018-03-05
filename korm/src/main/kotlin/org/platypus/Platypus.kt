package org.platypus

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.content.resolveResource
import io.ktor.features.CallLogging
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.ApplicationEngine
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.html.stream.createHTML
import org.platypus.cache.PlatypusCache
import org.platypus.config.PlatypusConf
import org.platypus.context.PlatypusContext
import org.platypus.i18n.PlatypusI18N
import org.platypus.model.Model
import org.platypus.model.functions.asResult
import org.platypus.module.ModuleDataHolder
import org.platypus.module.ModuleDef
import org.platypus.module.PlatypusModuleInfo
import org.platypus.module.base.dataBaseModule
import org.platypus.module.base.entities.User
import org.platypus.orm.database.vendors.PostgreSQLDialect
import org.platypus.orm.sql.ddl.schema.SchemaCreator
import org.platypus.orm.transaction.SqlTransactionFactory
import org.platypus.orm.transaction.TransactionMode
import org.platypus.repository.RecordRepository
import org.platypus.ui.ToViewApi
import org.platypus.ui.action.UIMenuAction
import org.platypus.ui.menu.UIMenu
import org.platypus.utils.toJsonArray
import org.platypus.utils.toJsonObj
import org.platypus.web.RouteFactory
import org.platypus.web.json.toJson
import org.slf4j.LoggerFactory
import org.slf4j.event.Level
import java.util.*
import java.util.stream.Collectors.toList
import kotlin.collections.HashMap
import kotlin.collections.HashSet


object PlatypusAppCache {
    val cache = PlatypusCache()
}

private object PlatypusWebCache {

}


internal object ErpModule : PlatypusModuleInfo {
    override val name: String = "platypus-erp-module"
    val models: MutableSet<Model<*>> = HashSet()
    val depends: MutableSet<ModuleDef> = HashSet()
    val datas: MutableSet<ModuleDataHolder> = HashSet()
    val routes: MutableMap<Model<*>, MutableSet<RouteFactory>> = HashMap()
    val modelFactory: MutableMap<Model<*>, (env: PlatypusEnvironment) -> RecordRepository<*>> = HashMap()
    val views: MutableMap<Model<*>, MutableSet<ToViewApi<*>>> = HashMap()
    val actions: MutableMap<Model<*>, Set<UIMenuAction<*>>> = HashMap()
    val menus: MutableSet<UIMenu> = HashSet()

    override fun actions(): Map<Model<*>, Set<UIMenuAction<*>>> = actions

    override fun menus(): Set<UIMenu> = menus

    override fun models() = models

    override fun depends() = depends.map { it.getModule() }.toSet()

    override fun datas() = datas

    override fun routes() = routes

    override fun modelFactory() = modelFactory

    override fun views() = views
}

enum class ServerMode {
    TEST, DEMO, DEV, PRODUCTION
}

class Platypus private constructor(val conf: PlatypusConf) : EnvironementFactory {
    private val LOGGER = LoggerFactory.getLogger("org.platypus.excule.Platypus")
    private val db = SqlTransactionFactory.connect(PostgreSQLDialect, conf.urlDb + conf.dbName, conf.driverDb, conf.userDb, conf.passwordDb)
    private val loadedModule = mutableSetOf<PlatypusModuleInfo>()
    private val loadedModuleData = mutableSetOf<PlatypusModuleInfo>()
    private val memoryCache = PlatypusCache()
    private lateinit var server: ApplicationEngine
    private val locales: Array<Locale> = conf.locales

    init {
        if (conf.autoStart) {
            start()
        }
    }

    private fun init(module: PlatypusModuleInfo): Platypus {
        LOGGER.info("Connecting to DB")
        connect()
        LOGGER.info("Loading Module base")
        loadModule(conf.loadModule.module.getModule())
        LOGGER.info("Loading Module $module")
        loadDepends(setOf(module))
        createOrUpdateDatabase()
        LOGGER.info("Loading User")
        initUser(conf, db.newTransaction(TransactionMode.NORMAL))
        LOGGER.info("Loading Data")
        newEnv().use {
            it.loadData(setOf(module))
        }
        generatingRouting()
        return this
    }


    fun generatingRouting() {
        server = embeddedServer(Netty, conf.port) {
            install(CallLogging) {
                level = Level.INFO
            }
            routing {
                ressourseRouting(conf)
                get("web/{next...}") {
                    val next = call.parameters.getAll("next")
                    println("Call $next")
                    val content = call.resolveResource("/ui/index.html", classLoader = this@Platypus::class.java.classLoader)
                    if (content != null)
                        call.respond(content)
                }
                for (model in ErpModule.models) {
                    println("Creating Route /${model.tableName}")
                    route(model.tableName) {
                        for (modelRoute in ErpModule.routes[model] ?: emptySet<RouteFactory>()) {
                            println("Creating Route /${model.tableName}/$modelRoute")
                            modelRoute.createRoute(this, this@Platypus)
                        }
                        route("actions") {
                            for (action in ErpModule.actions[model] ?: emptySet()) {
                                println("Creating Route /${model.tableName}/actions/${action.uuid}")
                                get(action.uuid) {
                                    val html = action.render(createHTML(true), newReadOnlyEnv())
                                    call.respondText(html, ContentType.Text.Html)
                                }
                            }
                        }
                        route("views") {
                            for (view in ErpModule.views[model] ?: emptySet<ToViewApi<*>>()) {
                                println("Creating Route /${model.tableName}/views/${view.uniqueName}")
                                route(view.uniqueName) {
                                    get {
                                        val html = view.toViewApi().render(createHTML(true), newReadOnlyEnv())
                                        call.respondText(html, ContentType.Text.Html)
                                    }
                                    get("search") {
                                        val filter = call.parameters["filter"]
                                        val orderby = call.parameters["orderby"].toJsonArray<String>()
                                        val groupby = call.parameters["groupby"]
                                        val limit = call.parameters["limit"] ?: "80"
                                        val page = call.parameters["page"] ?: "0"
                                        val param = SearchTreeParam(
                                                filter = filter,
                                                orderby = orderby,
                                                groupby = groupby,
                                                limit = limit.toInt(),
                                                page = page.toInt()
                                        )
                                        val query = view.querySearch(param).buildQuery(newEnv())
                                        val res = JsonObject(
                                                mapOf<String, Any?>(
                                                        "result" to query.toJson(),
                                                        "warnings" to JsonArray(emptyList<String>()),
                                                        "success" to JsonArray(emptyList<String>()),
                                                        "errors" to JsonArray(emptyList<String>())
                                                )
                                        )
                                        call.respondText(res.toJsonString(true), ContentType.Application.Json, HttpStatusCode.OK)
                                    }
                                }
                            }
                        }
                        route("call") {
                            //                            TODO route of model
                        }
                        get("{id}") {
                            val env = newEnv()
                            val obj = ErpModule.modelFactory[model]!!.invoke(env).browse(call.parameters["id"]!!.toInt())
                            call.respondText(toJsonObj(obj).asResult().toJson(env).toJsonString(true), ContentType.Application.Json)
                        }
                        get {
                            val name = call.parameters["name"]
                            if (name != null) {
//                                TODO call a nameSearch or something extendable
                                val env = newEnv()
                                val obj = ErpModule.modelFactory[model]!!.invoke(env).find { model.name ilike "%$name%" }
                                call.respondText(toJsonArray(obj).asResult().toJson(env).toJsonString(true), ContentType.Application.Json)
                            }
                        }

                    }
                }
                get("menus") {
                    val topParents = JsonArray<JsonObject>(ErpModule.menus.stream()
                            .filter { it.parent == null }
                            .sorted { m1, m2 -> m1.sequence.compareTo(m2.sequence) }
                            .map { it.toJson() }
                            .collect(toList()))
                    call.respondText(topParents[0].toJsonString(true), ContentType.Application.Json)
                }


            }
        }
    }

    private fun createOrUpdateDatabase() {
        LOGGER.info("Creating or updating Table")
        BaseInternalEnvironment(db.newTransaction(TransactionMode.NORMAL)).use {
            val schema = SchemaCreator.create(it)
            schema.create(ErpModule.models.toList())
            it.cr.commit()
        }

    }

    fun start() {
        init(conf.loadModule.module.getModule())
        if (conf.startServerWeb) {
            server.start(wait = conf.mode != ServerMode.TEST)
        }
    }


    internal fun connect() {

    }

    internal fun initContext(): PlatypusContext = PlatypusContext()


    private fun loadDepends(dependsModule: Set<PlatypusModuleInfo>) {
        for (module in dependsModule) {
            loadModule(module)
        }
    }

    private fun loadModule(module: PlatypusModuleInfo) {
        if (module.name != "base" || module !in loadedModule) {
            loadDepends(module.depends())
            LOGGER.info("Load of $module")
            ErpModule.modelFactory.putAll(module.modelFactory())
            for (mod in module.models()) {
                ErpModule.models.add(mod)
            }
            for ((key, route) in module.routes()) {
                ErpModule.routes.merge(key, route.toMutableSet(), { o, n -> HashSet(o + n) })
            }
            for ((key, view) in module.views()) {
                ErpModule.views.merge(key, view.toMutableSet(), { o, n -> HashSet(o + n) })
            }
            for ((key, act) in module.actions()) {
                ErpModule.actions.merge(key, act, { o, n -> HashSet(o + n) })
            }
            ErpModule.menus.addAll(module.menus())
        }
        loadedModule.add(module)
    }

    private fun PlatypusEnvironment.loadData(dependsModule: Set<PlatypusModuleInfo>) {
        if (!conf.loadData) {
            return
        }
        for (module in dependsModule) {
            if (module.name != "base" || module !in loadedModuleData) {
                loadData(module.depends())
                LOGGER.info("Load Data of $module")
                for (datas in module.datas()) {
                    datas.loadData(this)
                }
            }
            loadedModuleData.add(module)
        }

    }

    private fun loadBase() {
        newEnv().use{
            dataBaseModule.loadData(it)
            it.internal.cache.toInsert
        }
    }

    override fun newEnv(user: User?, ctx: PlatypusContext?): PlatypusEnvironment {
        return BaseEnvironment.create(user, conf, ctx ?: PlatypusContext(), db.newTransaction(TransactionMode.NORMAL))
    }

    override fun newReadOnlyEnv(user: User?, ctx: PlatypusContext?): ReadOnlyPlatypusEnvironment {
        return BaseEnvironment.create(user, conf, ctx
                ?: PlatypusContext(), db.newTransaction(TransactionMode.READ_ONLY))
    }

    override fun newFakeEnv(user: User?, ctx: PlatypusContext?): PlatypusEnvironment {
        return BaseEnvironment.create(user, conf, ctx
                ?: PlatypusContext(), db.newTransaction(TransactionMode.ROLLBACK))
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger("org.platypus.excule.Platypus")
        private val i18nMap: MutableMap<Locale, PlatypusI18N> = HashMap()

        fun i18nDef(local: Locale, def: PlatypusI18N.() -> Unit) {
            i18nMap.computeIfAbsent(local, { l -> PlatypusI18N(l) }).def()
        }

        fun create(init: PlatypusConf.Companion.() -> Unit): Platypus {
            PlatypusConf.init()
            LOGGER.info("Starting platypus !!!!!!!!!!")
            return Platypus(PlatypusConf.getConf())
        }
    }
}


data class SearchTreeParam(
        val filter: String?,
        val orderby: JsonArray<String>,
        val groupby: String?,
        val limit: Int,
        val page: Int
)
