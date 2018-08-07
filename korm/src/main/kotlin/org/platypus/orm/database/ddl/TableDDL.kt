package org.platypus.orm.database.ddl

data class TableDDL(val struc: String, val alter: Set<String>)