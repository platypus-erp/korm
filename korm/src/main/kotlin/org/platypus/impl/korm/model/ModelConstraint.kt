package org.platypus.impl.korm.model

import org.platypus.impl.korm.sql.Op


data class SqlConstraint(val name: String, val sqlConstraint: Op<Boolean>, val errorMsg: String, val active: Boolean = true)