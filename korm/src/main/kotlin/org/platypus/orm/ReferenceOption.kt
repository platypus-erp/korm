package org.platypus.orm

import org.platypus.orm.sql.QueryBuilder

enum class ReferenceOption : Sqlable {
    RESTRICT {
        override fun toSQL(query: QueryBuilder) = " ON DELETE RESTRICT"
    },
    CASCADE {
        override fun toSQL(query: QueryBuilder) = " ON DELETE CASCADE"
    },
    SET_NULL {
        override fun toSQL(query: QueryBuilder) = " ON DELETE SET NULL"

    },
    NO_ACTION {
        override fun toSQL(query: QueryBuilder) = ""
    }
//    ,SET_DEFAULT {
//        override fun toSQL(query: QueryBuilder) = " ON DELETE SET DEFAULT"
//    }
}