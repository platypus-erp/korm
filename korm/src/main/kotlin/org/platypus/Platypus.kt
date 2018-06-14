package org.platypus

import io.ktor.server.engine.ApplicationEngine
import org.platypus.cache.PlatypusCache
import org.platypus.config.PlatypusConf
import org.platypus.context.PlatypusContext
import org.platypus.i18n.PlatypusI18N
import org.platypus.module.PlatypusModuleInfo
import org.platypus.module.base.BaseModule
import org.platypus.module.base.dataBaseModule
import org.platypus.orm.database.vendors.PostgreSQLDialect
import org.platypus.orm.sql.ddl.schema.SchemaCreator
import org.platypus.orm.transaction.SqlTransactionFactory
import org.platypus.orm.transaction.TransactionMode
import org.platypus.security.PlatypusUser
import org.platypus.web.generatingRouting
import org.slf4j.LoggerFactory
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

const val PLATYPUS_ROOT_USER_REF: String = "platypus_root_user"
const val PLATYPUS_ROOT_GROUP_REF: String = "platypus_root_group"

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
        LOGGER.info("Is in debug =" + conf.debug)
        LOGGER.info("Connecting to DB")
        connect()
        LOGGER.info("Loading Module base")
        loadModule(BaseModule.module.getModule())
        LOGGER.info("Loading Module $module")
        loadDepends(setOf(module))
        createOrUpdateDatabase()
        LOGGER.info("Loading User")
        initUser(conf, db.newTransaction(TransactionMode.NORMAL))
        LOGGER.info("Loading Data")

//        newEnv().use {
//            it.loadData(setOf(module))
//        }
        server = generatingRouting(conf)
        return this
    }




    private fun createOrUpdateDatabase() {
        LOGGER.info("Creating or updating Table")
        BaseInternalEnvironment(db.newTransaction(TransactionMode.NORMAL)).use {
            val schema = SchemaCreator.create(it)
            schema.create(ErpModule.models)
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
        if (module !in loadedModule) {
            loadDepends(module.depends())
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

    override fun newEnv(user: PlatypusUser?, ctx: PlatypusContext?): PlatypusEnvironment {
        return BaseEnvironment.create(user, conf, ctx ?: PlatypusContext(), db.newTransaction(TransactionMode.NORMAL))
    }

    override fun newReadOnlyEnv(user: PlatypusUser?, ctx: PlatypusContext?): ReadOnlyPlatypusEnvironment {
        return BaseEnvironment.create(user, conf, ctx
                ?: PlatypusContext(), db.newTransaction(TransactionMode.READ_ONLY))
    }

    override fun newFakeEnv(user: PlatypusUser?, ctx: PlatypusContext?): PlatypusEnvironment {
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


