package org.platypus

import io.ktor.application.call
import io.ktor.content.file
import io.ktor.content.resolveResource
import io.ktor.content.resources
import io.ktor.content.static
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondFile
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.ApplicationEngine
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.platypus.ErpModule.models
import org.platypus.ErpModule.routes
import org.platypus.api.web.RouteFactory
import org.platypus.api.config.PlatypusConf
import org.platypus.api.context.PlatypusContext
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.entities.User
import org.platypus.base.models.GroupModel
import org.platypus.base.models.UserModel
import org.platypus.base.ui.uiMenu
import org.platypus.api.i18n.PlatypusI18N
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.*
import org.platypus.impl.korm.sql.Database
import org.platypus.impl.korm.sql.SchemaUtils
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.platypus.impl.module.ModuleDataHolder
import org.platypus.impl.module.ModuleDef
import org.platypus.api.module.PlatypusModuleInfo
import org.platypus.impl.ui.ViewApi
import org.platypus.impl.ui.engine.PlatypusEngine
import org.slf4j.LoggerFactory
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.properties.Delegates


private object ErpModule : PlatypusModuleInfo {
    override val name: String = "platypus-erp-module"
    val models: MutableSet<BaseModel<*, *>> = HashSet()
    val depends: MutableSet<ModuleDef> = HashSet()
    val datas: MutableSet<ModuleDataHolder> = HashSet()
    val routes: MutableMap<BaseModel<*, *>, MutableSet<RouteFactory>> = HashMap()
    val modelFactory: MutableMap<BaseModel<*, *>, (env: PlatypusEnvironement) -> PlatypusEntityGetter<*, *>> = HashMap()
    val views: MutableMap<BaseModel<*, *>, MutableSet<ViewApi>> = HashMap()


    override fun models() = models

    override fun depends() = depends.map { it.getModule() }.toSet()

    override fun datas() = datas

    override fun routes() = routes

    override fun modelFactory() = modelFactory

    override fun views() = views
}

class Platypus private constructor(val conf: PlatypusConf) {
    private val LOGGER = LoggerFactory.getLogger("org.platypus.Platypus")
    val tableRegistry = HashMap<String, ModelTable>()
    internal val m2mregistry = HashMap<String, ManyToManyTable<*, *>>()
    private lateinit var db: Database
    private var startupEnv: PlatypusEnvironement? = null
    private val loadedModule = mutableSetOf<PlatypusModuleInfo>()
    private val loadedModuleData = mutableSetOf<PlatypusModuleInfo>()
    private val memoryCache = TransactionCache()
    private lateinit var server: ApplicationEngine
    private val templateEngine = PlatypusEngine(conf)
    private val locales: Array<Locale> = conf.locales

    private fun init(module: PlatypusModuleInfo): Platypus {
        LOGGER.info("Connecting to DB")
        connect()
        LOGGER.info("Loading Module base")
        loadModule(conf.loadModule.getModule())
        LOGGER.info("Loading Module $module")
        loadDepends(setOf(module))
        startupEnv = newEnv()
        LOGGER.info("Creating or updating Table")
        SchemaUtils.create(startupEnv!!)
        LOGGER.info("Loading Data")
        loadData(setOf(module))
        startupEnv?.closeEnv()
        server = generatingRouting()
        generateViews()
        return this
    }

    fun start() {
        init(conf.loadModule.getModule())
        server.start(wait = true)
    }

    private fun generatingRouting() = embeddedServer(Netty, conf.port) {
        routing {
            static {
                file("web", "index.html")
                resources("ui")
            }
            route("web") {
                get {
                    call.respond(call.resolveResource(
                            "index.html",
                            "/ui/")!!)
                }
                route("/views") {
                    get {
                        call.respond(call.resolveResource(
                                "index.html",
                                "/ui/")!!)
                    }
                    route("{modelName}") {
                        get {
                            val modelName = call.parameters["modelName"]!!
                            println(modelName)
                            call.respond(call.resolveResource(
                                    "index.html",
                                    "/ui/")!!)
                        }
                    }
                }

            }
            get("menu/{ref?}") {
                val env = this@Platypus.newEnv()
                val lazy = call.parameters["lazy"]?.toBoolean() ?: true
                val ref = call.parameters["ref"] ?: "config_menu"
                println("/web/menu/{$ref}?lazy=$lazy")
                val res = env.uiMenu[ref]
                env.closeEnv()
                call.respondText(res.toJson(LazyLoadType.CHILDREN_AND_LINK, true)
                        .toJsonString(true), ContentType.Application.Json)
            }
            route("component") {
                route("{modelName}") {
                    get {
                        val modelName = call.parameters["modelName"]!!
                        println("web/component/$modelName")
                        val fileModel = templateEngine.pathViews.resolve(modelName)
                        when (modelName) {
                            UserModel.modelName -> call.respondFile(fileModel.toFile(), "tree.html")
                            GroupModel.modelName -> call.respond(call.resolveResource(
                                    "$modelName.html",
                                    "/ui/component/")!!)
                            "dashboard" -> call.respond(call.resolveResource(
                                    "users-views.html",
                                    "/ui/component/")!!)
                            else -> println("404 not found")
                        }
                    }
                    get("{viewHtml}") {
                        val modelName = call.parameters["modelName"]!!
                        val viewHtml = call.parameters["viewHtml"]!!
                        val fileModel = templateEngine.pathViews.resolve(modelName)
                        when (modelName) {
                            UserModel.modelName -> call.respondFile(fileModel.toFile(), viewHtml)
                            else -> println("404 not found")
                        }
                    }
                }
            }
            for (model in models) {
                route(model.modelName) {
                    for (modelRoute in routes[model] ?: mutableSetOf()) {
                        println("Creating Route /$model/$modelRoute")
                        modelRoute.createRoute(this, this@Platypus)
                    }
                }
            }
            get("/users/search") {
                val env = this@Platypus.newEnv()
                call.parameters["filter"]
                val param = SearchQueryParam<UserModel>(
                        fields = mutableSetOf(UserModel.name, UserModel.password, UserModel.locale)
                )
                val res = UserModel.search.call(env.User, param)
                env.closeEnv()
                call.respondText(res.toJson(env).toJsonString(), ContentType.Application.Json)
            }

        }
    }

    private fun generateViews() {
        templateEngine.init()
        for ((model, views) in ErpModule.views) {
            templateEngine.generateViewsForModel(model, views)
        }
    }


    internal fun connect() {
        db = Database.connect(conf.urlDb + conf.dbName, conf.driverDb, conf.userDb, conf.passwordDb)
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
            for (mod in module.models()) {
                mod.freezeDDL()
                ErpModule.models.add(mod)
            }
            for ((key, route) in module.routes()) {
                ErpModule.routes.merge(key, route.toMutableSet(), { o, n -> HashSet(o + n) })
            }
            for ((key, view) in module.views()) {
                ErpModule.views.merge(key, view.toMutableSet(), { o, n -> HashSet(o + n) })
            }
        }
        loadedModule.add(module)
    }

    private fun loadData(dependsModule: Set<PlatypusModuleInfo>) {
        for (module in dependsModule) {
            if (module.name != "base" || module !in loadedModuleData) {
                loadData(module.depends())
                LOGGER.info("Load Data of $module")
                for (datas in module.datas()) {
                    datas.loadData(startupEnv!!)
                }
            }
            loadedModuleData.add(module)
        }
    }

    fun newEnv(): PlatypusEnvironement {
        return PlatypusEnvironement(TransactionManager.currentOrNew(instance.conf.insolationLevel))
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger("org.platypus.Platypus")
        private val i18nMap: MutableMap<Locale, PlatypusI18N> = HashMap()
        private var instance: Platypus by Delegates.notNull()

        fun i18nDef(local: Locale, def: PlatypusI18N.() -> Unit) {
            i18nMap.computeIfAbsent(local, { l -> PlatypusI18N(l) }).def()
        }

        fun create(init: PlatypusConf.Companion.() -> Unit): Platypus {
            PlatypusConf.init()
            LOGGER.info("Starting platypus !!!!!!!!!!")
            return Platypus(PlatypusConf.getConf()).apply {
                instance = this
            }
        }

        internal fun get(): Platypus = instance

        internal fun memoryCache() = instance.memoryCache
    }
}
