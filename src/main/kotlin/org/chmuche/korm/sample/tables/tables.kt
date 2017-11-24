package org.chmuche.korm.sample.tables

import org.chmuche.korm.sql.Table


object User : Table("user") {
    val name = varchar("name")
}

object Group : Table("group") {
    val name = varchar("name")
}

object Role : Table("role") {
    val name = varchar("name")
}