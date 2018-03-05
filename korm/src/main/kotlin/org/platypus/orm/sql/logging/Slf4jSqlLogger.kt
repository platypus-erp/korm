package org.platypus.orm.sql.logging

import org.platypus.PlatypusEnvironment
import org.platypus.orm.sql.dml.StatementContext

object Slf4jSqlLogger : SqlLogger {

    override fun log(context: StatementContext, env: PlatypusEnvironment) {
        if (env.debug) {
            exposedLogger.info(context.expandArgs())
        }
    }

    override fun log(s: Any) {
        exposedLogger.info(s.toString())
    }

    override fun logError(s: Any, e: Throwable?) {
        exposedLogger.error(s.toString(), e)
    }
}