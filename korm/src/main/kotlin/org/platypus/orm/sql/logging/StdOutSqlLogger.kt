package org.platypus.orm.sql.logging

import org.platypus.PlatypusEnvironment
import org.platypus.orm.sql.dml.StatementContext

object StdOutSqlLogger : SqlLogger {

    override fun log(context: StatementContext, env: PlatypusEnvironment) {
        System.out.println("SQL: ${context.expandArgs()}")
    }

    override fun log(s: Any) {
        System.out.println("SQL: $s")
    }

    override fun logError(s: Any, e: Throwable?) {
        System.out.println("ERROR SQL: $s")
        e?.let { System.out.println("ERROR SQL: $e") }
    }
}