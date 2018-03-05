package org.platypus.config

import org.platypus.ServerMode
import org.platypus.module.ModuleBuilder
import org.platypus.module.base.BaseModule
import org.platypus.orm.sql.dml.statements.StatementInterceptor
import java.sql.Connection
import java.util.*


class PlatypusConf(
        val autoStart: Boolean,
        val startServerWeb:Boolean,
        val dbName: String,
        val urlDb: String,
        val driverDb: String,
        val userDb: String,
        val passwordDb: String,
        val insolationLevel: Int,
        val port: Int,
        val pathViews: String,
        val pathPlatypus: String,
        val locales: Array<Locale>,
        val loadModule: ModuleBuilder,
        val loadData: Boolean,
        val debug: Boolean,
        val mode: ServerMode,
        val adminUserRef: String
) {
    companion object {
        private val webConfBuilder = PlatypusWebConfBuilder()
        private val uiConfBuilder = PlatypusUIConf()
        private val dataBaseConf = PlatypusDataBaseConf()
        var locales: Array<Locale> = arrayOf(Locale.US)
        var loadModule: ModuleBuilder = BaseModule
        var autoStart: Boolean = true
        var mode: ServerMode = ServerMode.DEV
        var debug: Boolean = false
        var loadData: Boolean = false
        var startServerWeb: Boolean = true
        var adminUserRef: String = "platypus_root"

        fun web(conf: PlatypusWebConfBuilder.() -> Unit) {
            webConfBuilder.conf()
        }

        fun db(conf: PlatypusDataBaseConf.() -> Unit) {
            dataBaseConf.conf()
        }

        fun ui(conf: PlatypusUIConf.() -> Unit) {
            uiConfBuilder.conf()
        }

        fun getConf(): PlatypusConf {
            return PlatypusConf(
                    autoStart = autoStart,
                    startServerWeb = startServerWeb,
                    dbName = dataBaseConf.dbName,
                    urlDb = dataBaseConf.urlDb,
                    driverDb = dataBaseConf.driverDb,
                    userDb = dataBaseConf.userDb,
                    passwordDb = dataBaseConf.passwordDb,
                    insolationLevel = dataBaseConf.insolationLevel,
                    pathViews = uiConfBuilder.pathViews,
                    pathPlatypus = uiConfBuilder.pathPlatypus,
                    port = webConfBuilder.httpPort,
                    loadModule = loadModule,
                    locales = locales,
                    loadData = loadData,
                    debug = debug,
                    mode = mode,
                    adminUserRef = adminUserRef
            )
        }
    }
}


enum class SupportedServer {
    NETTY
}

class PlatypusWebConfBuilder {
    var server: SupportedServer = SupportedServer.NETTY
    var httpPort: Int = 8080
}


class PlatypusUIConf {
    var pathPlatypus: String = "platypus"
    var pathViews: String = "pathViews"
}

class PlatypusDataBaseConf {
    var dbName: String = "platypus"
    var urlDb: String = "jdbc:postgresql://localhost:5432/"
    var driverDb: String = "org.postgresql.Driver"
    var userDb: String = "platypus"
    var passwordDb: String = "platypus"
    var insolationLevel: Int = Connection.TRANSACTION_SERIALIZABLE
    var statementInterceptor: Set<StatementInterceptor> = emptySet()
}