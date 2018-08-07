package org.platypus.orm.database.ddl

data class FieldDDL(val fieldDef: String, val constraint: Set<String> = emptySet())