package org.platypus.api.config

import org.platypus.base.baseModule
import org.platypus.impl.module.ModuleDef
import java.sql.Connection
import java.util.*


class PlatypusConf(
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
        val loadModule: ModuleDef
) {
    companion object {
        private val webConfBuilder = PlatypusWebConfBuilder()
        private val uiConfBuilder = PlatypusUIConf()
        private val dataBaseConf = PlatypusDataBaseConf()
        var locales: Array<Locale> = arrayOf(Locale.US)
        var loadModule: ModuleDef = baseModule

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
                    locales = locales
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
    val pathPlatypus: String = "platypus"
    val pathViews: String = "pathViews"
}

class PlatypusDataBaseConf {
    var dbName: String = "platypus"
    var urlDb: String = "jdbc:postgresql://localhost:5432/"
    var driverDb: String = "org.postgresql.Driver"
    var userDb: String = "platypus"
    var passwordDb: String = "platypus"
    var insolationLevel: Int = Connection.TRANSACTION_SERIALIZABLE
}