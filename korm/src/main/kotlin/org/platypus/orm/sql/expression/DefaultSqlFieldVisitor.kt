package org.platypus.orm.sql.expression

import org.platypus.model.field.api.FieldVisitor
import org.platypus.orm.sql.QueryBuilder

abstract class DefaultSqlFieldVisitor : FieldVisitor<QueryBuilder, String> {

}