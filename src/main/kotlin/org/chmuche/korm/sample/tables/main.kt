package org.chmuche.korm.sample.tables

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.chmuche.korm.sql.Database
import org.chmuche.korm.sql.SchemaUtils
import org.chmuche.korm.sql.Slf4jSqlLogger
import org.chmuche.korm.sql.StdOutSqlLogger
import org.chmuche.korm.sql.transactions.transaction

fun main(args: Array<String>) {
    connectToDb()
    transaction {
        logger.addLogger(StdOutSqlLogger)
        print("ttt")
        SchemaUtils.create(User, Group, Role)
    }
}

fun connectToDb(h2: Boolean = false) {
    if (h2) {
        Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver")
    } else {
        val cfg = HikariConfig()
        cfg.jdbcUrl = "jdbc:postgresql://localhost:5432/korm"
        cfg.username = "odoo"
        cfg.password = "odoo"
        val ds = HikariDataSource(cfg)
        ds.logWriter = Slf4jSqlLogger
        Database.connect(ds)
    }

}