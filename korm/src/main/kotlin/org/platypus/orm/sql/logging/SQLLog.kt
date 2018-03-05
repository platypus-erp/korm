package org.platypus.orm.sql.logging

import org.slf4j.LoggerFactory

val exposedLogger = LoggerFactory.getLogger("Exposed")!!

inline fun <R> logTimeSpent(message: String, block: () -> R): R {
    val start = System.currentTimeMillis()
    val answer = block()
    exposedLogger.info(message + " took " + (System.currentTimeMillis() - start) + "ms")
    return answer
}

