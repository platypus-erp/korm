package org.platypus.orm.sql.logging

import org.platypus.PlatypusEnvironment
import org.platypus.orm.sql.dml.StatementContext

interface SqlLogger {
    fun log(context: StatementContext, env: PlatypusEnvironment)
    fun log(s: Any)
    fun logError(s: Any, e: Throwable? = null)
}