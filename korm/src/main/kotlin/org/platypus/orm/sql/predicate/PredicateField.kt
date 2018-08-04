package org.platypus.orm.sql.predicate

import org.platypus.model.Alias
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.QueryParameter
import org.platypus.orm.sql.expression.asLiteral
import org.platypus.utils.space

interface PredicateField : Expression<Boolean> {
    fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String

    fun convertToAlias(alias:Alias<*>):PredicateField{
        return this
    }
}

data class QueryParameterField(val colType: SqlFieldType, val value: Any)

class IsNullOpField(val expr: IModelField<*, *>) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String = expr.describeDML(dialect) + "IS NULL"

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return IsNullOp(expr).accept(visitor, param)
    }
}

class IsNotNullOpField(val expr: IModelField<*, *>) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String = expr.describeDML(dialect) + "IS NOT NULL"

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return IsNotNullOp(expr).accept(visitor, param)
    }
}

class BetweenOpField<T : Comparable<T>>(val expr: IModelField<*, T>, val from: T, val to: T) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String = buildString {
        append(expr.describeDML(dialect))
        space()
        append("BETWEEN")
        space()
        append(query.registerArgument(expr.type, from))
        space()
        append("AND")
        space()
        append(query.registerArgument(expr.type, to))
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return BetweenOp(expr, asLiteral(from), asLiteral(to)).accept(visitor, param)
    }
}


class InListField<T : Any>(val expr: IModelField<*, T>, val list: Iterable<T>) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return inInListOrIsNotInList(expr, list, true, dialect, query)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return InListOp(expr, list).accept(visitor, param)
    }
}

class NotInListField<T : Any>(val expr: IModelField<*, T>, val list: Iterable<T>) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return inInListOrIsNotInList(expr, list, false, dialect, query)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return NotInListOp(expr, list).accept(visitor, param)
    }
}

private fun inInListOrIsNotInList(expr: IModelField<*, *>, list: Iterable<*>, isInList: Boolean, dialect: PersistenceDialect, query: QueryBuilder) = buildString {
    list.iterator().let { i ->
        if (i.hasNext()) {
            val first = i.next()
            append(expr.describeDML(dialect))
            if (!i.hasNext()) {
                when {
                    isInList -> append(" = ")
                    else -> append(" != ")
                }
                append(query.registerArgument(expr.type, first))
            } else {
                when {
                    isInList -> append(" IN (")
                    else -> append(" NOT IN (")
                }
                query.registerArguments(expr.type, list).joinTo(this)
                append(")")
            }
        }
    }
}


class EqOpField<T : Any>(val expr1: IModelField<*, T>, val expr2: T?) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " = " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return EqOp(expr1, QueryParameter(expr1.type, expr2)).accept(visitor, param)
    }
}

class NeqOpField<T : Any>(val expr1: IModelField<*, T>, val expr2: T?) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " != " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return NeqOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class LessOpField<T : Comparable<T>>(val expr1: IModelField<*, T>, val expr2: T) : PredicateField {

    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " < " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return LessOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class LessEqOpField<T : Comparable<T>>(val expr1: IModelField<*, T>, val expr2: T) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " <= " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return LessEqOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class GreaterOpField<T : Comparable<T>>(val expr1: IModelField<*, T>, val expr2: T) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " > " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return GreaterOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class GreaterEqOpField<T : Comparable<T>>(val expr1: IModelField<*, T>, val expr2: T) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " >= " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return GreaterEqOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class LikeOpField(val expr1: IModelField<*, String>, val expr2: String) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " LIKE " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return LikeOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class ILikeOpField(val expr1: IModelField<*, String>, val expr2: String) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " LIKE " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return ILikeOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}


class NotLikeOpField(val expr1: IModelField<*, String>, val expr2: String) : PredicateField {

    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " NOT LIKE " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return NotLikeOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class NotILikeOpField(val expr1: IModelField<*, String>, val expr2: String) : PredicateField {

    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeDML(dialect) + " NOT ILIKE " + query.registerArgument(expr1.type, expr2)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return NotILikeOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class RegexpOpField(val expr1: IModelField<*, String>, val expr2: String) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        TODO()
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return RegexpOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}

class NotRegexpOpField(val expr1: IModelField<*, String>, val expr2: String) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        TODO()
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return NotRegexpOp(expr1, asLiteral(expr2)).accept(visitor, param)
    }
}


class AndOpField(val expr1: PredicateField, val expr2: PredicateField) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeToSql(dialect, query) + " AND " + expr2.describeToSql(dialect, query)
    }
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return AndOp(expr1, expr2).accept(visitor, param)
    }
}

class OrOpField(val expr1: PredicateField, val expr2: PredicateField) : PredicateField {
    override fun describeToSql(dialect: PersistenceDialect, query: QueryBuilder): String {
        return expr1.describeToSql(dialect, query) + " OR " + expr2.describeToSql(dialect, query)
    }

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN {
        return OrOp(expr1, expr2).accept(visitor, param)
    }
}