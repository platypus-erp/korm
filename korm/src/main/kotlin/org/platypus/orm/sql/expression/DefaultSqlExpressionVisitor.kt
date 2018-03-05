package org.platypus.orm.sql.expression

import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.CreateDateModelField
import org.platypus.model.field.impl.CreateUID
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
import org.platypus.model.field.impl.ExternalRefModelField
import org.platypus.model.field.impl.FieldAlias
import org.platypus.model.field.impl.IntField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.Many2OneFieldLink
import org.platypus.model.field.impl.NameModelField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.One2OneField
import org.platypus.model.field.impl.PKModelField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.literal
import org.platypus.orm.sql.predicate.AndOp
import org.platypus.orm.sql.predicate.BetweenOp
import org.platypus.orm.sql.predicate.EqOp
import org.platypus.orm.sql.predicate.Exists
import org.platypus.orm.sql.predicate.GreaterEqOp
import org.platypus.orm.sql.predicate.GreaterOp
import org.platypus.orm.sql.predicate.ILikeOp
import org.platypus.orm.sql.predicate.InList
import org.platypus.orm.sql.predicate.IsNotNullOp
import org.platypus.orm.sql.predicate.IsNullOp
import org.platypus.orm.sql.predicate.LessEqOp
import org.platypus.orm.sql.predicate.LessOp
import org.platypus.orm.sql.predicate.LikeOp
import org.platypus.orm.sql.predicate.NeqOp
import org.platypus.orm.sql.predicate.NotExists
import org.platypus.orm.sql.predicate.NotInList
import org.platypus.orm.sql.predicate.NotLikeOp
import org.platypus.orm.sql.predicate.NotRegexpOp
import org.platypus.orm.sql.predicate.OrOp
import org.platypus.orm.sql.predicate.RegexpOp
import org.platypus.utils.space
import java.io.File.separator
import java.util.*

interface DefaultSqlExpressionVisitor : ExpressionVisitor<QueryBuilder, String> {


    override fun visit(element: LiteralOp<*>, param: QueryBuilder): String = Objects.toString(element.value)

    override fun visit(element: NoOpConversion<*,*>, param: QueryBuilder): String = element.expr.accept(this, param)

    override fun visit(element: QueryParameter<*>, param: QueryBuilder): String = param.registerArgument(element.colType, element.value)


    override fun visit(element: PlusOp<*,*>, param: QueryBuilder): String = buildString {
        append(element.expr1.accept(this@DefaultSqlExpressionVisitor, param))
        append(" + ")
        append(element.expr2.accept(this@DefaultSqlExpressionVisitor, param))
    }

    override fun visit(element: MinusOp<*,*>, param: QueryBuilder): String = buildString {
        append(element.expr1.accept(this@DefaultSqlExpressionVisitor, param))
        append(" - ")
        append(element.expr2.accept(this@DefaultSqlExpressionVisitor, param))
    }

    override fun visit(element: MultiplyOp<*,*>, param: QueryBuilder): String = buildString {
        append(element.expr1.accept(this@DefaultSqlExpressionVisitor, param))
        append(" * ")
        append(element.expr2.accept(this@DefaultSqlExpressionVisitor, param))
    }

    override fun visit(element: DivideOp<*,*>, param: QueryBuilder): String = buildString {
        append(element.expr1.accept(this@DefaultSqlExpressionVisitor, param))
        append(" / ")
        append(element.expr2.accept(this@DefaultSqlExpressionVisitor, param))
    }

    override fun visit(element: Count, param: QueryBuilder): String = buildString {
        append("COUNT(")
        if (element.distinct) {
            append("DISTINCT ")
        }
        append(element.expr.accept(this@DefaultSqlExpressionVisitor, param))
        append(")")
    }

    override fun visit(element: Date, param: QueryBuilder): String = "DATE".toExpr(element.expr, param)

    override fun visit(element: CurrentDateTime, param: QueryBuilder): String = "CURRENT_TIMESTAMP"

    override fun visit(element: Month, param: QueryBuilder): String = "MONTH".toExpr(element.expr, param)

    override fun visit(element: LowerCase<*>, param: QueryBuilder): String = "LOWER".toExpr(element.expr, param)

    override fun visit(element: UpperCase<*>, param: QueryBuilder): String = "UPPER".toExpr(element.expr, param)

    override fun visit(element: Min<*>, param: QueryBuilder): String = "MIN".toExpr(element.expr, param)

    override fun visit(element: Max<*>, param: QueryBuilder): String = "MAX".toExpr(element.expr, param)

    override fun visit(element: Avg<*>, param: QueryBuilder): String = "AVG".toExpr(element.expr, param)

    override fun visit(element: StdDevPop<*>, param: QueryBuilder): String = "LOWER".toExpr(element.expr, param)


    fun String.toExpr(expr: Expression<*>, param: QueryBuilder): String = buildString {
        append(this@toExpr).append("(")
        append(expr.accept(this@DefaultSqlExpressionVisitor, param))
        append(")")
    }

    override fun visit(element: StdDevSamp<*>, param: QueryBuilder): String = "LOWER".toExpr(element.expr, param)

    override fun visit(element: VarPop<*>, param: QueryBuilder): String = "LOWER".toExpr(element.expr, param)

    override fun visit(element: VarSamp<*>, param: QueryBuilder): String = "LOWER".toExpr(element.expr, param)

    override fun visit(element: Sum<*>, param: QueryBuilder): String = "LOWER".toExpr(element.expr, param)

    override fun visit(element: Coalesce<*>, param: QueryBuilder): String = buildString {
        append("COALESCE(")
        append(element.expr.accept(this@DefaultSqlExpressionVisitor, param))
        append(", ")
        append(element.alternate.accept(this@DefaultSqlExpressionVisitor, param))
        append(")")
    }

    override fun visit(element: ExpressionAlias<*>, param: QueryBuilder): String = buildString {
        append(element.delegate.accept(this@DefaultSqlExpressionVisitor, param))
        append(" AS ")
        append(element.alias)
    }

    override fun visit(element: ExpressionAliasOnly<*>, param: QueryBuilder): String = element.alias

    override fun visit(element: Trim, param: QueryBuilder): String = "TRIM".toExpr(element.expr, param)


    override fun visit(element: CaseWhenElse<*>, param: QueryBuilder): String = buildString {
        append("CASE")
        if (element.caseWhen.value != null) {
            append(" ")
            append(element.caseWhen.value.accept(this@DefaultSqlExpressionVisitor, param))
        }
        for ((first, second) in element.caseWhen.cases) {
            append(" WHEN")
            append(first.accept(this@DefaultSqlExpressionVisitor, param))
            append("THEN ")
            append(second.accept(this@DefaultSqlExpressionVisitor, param))
        }
        append(" ELSE ")
        append(element.elseResult.accept(this@DefaultSqlExpressionVisitor, param))
        append(" END")
    }

    override fun visit(element: GroupConcat, param: QueryBuilder): String = buildString {
        append("GROUP_CONCAT(")
        if (element.distinct) {
            append("DISTINCT ")
        }
        append(element.expr.accept(this@DefaultSqlExpressionVisitor, param))
        element.orderBy.forEach {
            append(it.first.accept(this@DefaultSqlExpressionVisitor, param))
            append(" ")
            if (it.second) {
                append("ASC")
            } else {
                append("DESC")
            }
        }
        separator?.let {
            append(" SEPARATOR '$separator'")
        }
        append(")")
    }

    override fun visit(element: IsNullOp, param: QueryBuilder): String =
            "${element.expr.accept(this@DefaultSqlExpressionVisitor, param)} IS NULL"

    override fun visit(element: IsNotNullOp, param: QueryBuilder): String =
            "${element.expr.accept(this@DefaultSqlExpressionVisitor, param)} IS NOT NULL"

    override fun visit(element: NotOp<*>, param: QueryBuilder): String =
            "NOT ${element.expr.accept(this@DefaultSqlExpressionVisitor, param)}"


    override fun visit(element: BetweenOp, param: QueryBuilder): String = buildString {
        append(element.expr.accept(this@DefaultSqlExpressionVisitor, param))
        space()
        append("BETWEEN")
        space()
        append(element.from.accept(this@DefaultSqlExpressionVisitor, param))
        space()
        append("AND")
        space()
        append(element.to.accept(this@DefaultSqlExpressionVisitor, param))
    }


    private fun inInListOrIsNotInList(expr: TypedExpression<*>, list: Iterable<*>, isInList: Boolean, query: QueryBuilder) = buildString {
        list.iterator().let { i ->
            if (!i.hasNext()) {
                append(((!isInList).literal() eq true.literal()).accept(this@DefaultSqlExpressionVisitor, query))
            } else {
                val first = i.next()
                if (!i.hasNext()) {
                    append(expr.accept(this@DefaultSqlExpressionVisitor, query))
                    when {
                        isInList -> append(" = ")
                        else -> append(" != ")
                    }
                    append(query.registerArgument(expr.type, first))
                } else {
                    append(expr.accept(this@DefaultSqlExpressionVisitor, query))
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

    override fun visit(element: InList<*>, param: QueryBuilder): String {
        return inInListOrIsNotInList(element.expr, element.list, true, param)
    }

    override fun visit(element: NotInList<*>, param: QueryBuilder): String {
        return inInListOrIsNotInList(element.expr, element.list, false, param)
    }

    fun QueryBuilder.comparisonOp(expr1: Expression<*>, expr2: Expression<*>, opSign: String): String {
        val res = buildString {
            append(expr1.accept(this@DefaultSqlExpressionVisitor, this@comparisonOp))
            append(" $opSign ")
            append(expr2.accept(this@DefaultSqlExpressionVisitor, this@comparisonOp))
        }
        return res
    }

    override fun visit(element: EqOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "=")


    override fun visit(element: NeqOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "<>")

    override fun visit(element: LessOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "<")

    override fun visit(element: LessEqOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "<=")

    override fun visit(element: GreaterEqOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, ">=")

    override fun visit(element: GreaterOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, ">")

    override fun visit(element: LikeOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "LIKE")

    override fun visit(element: ILikeOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "ILIKE")

    override fun visit(element: NotLikeOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "NOT LIKE")

    override fun visit(element: RegexpOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "REGEXP")

    override fun visit(element: NotRegexpOp, param: QueryBuilder): String = param.comparisonOp(element.expr1, element.expr2, "NOT REGEXP")

    override fun visit(element: AndOp, param: QueryBuilder): String = buildString {
        append(element.expr1.accept(this@DefaultSqlExpressionVisitor, param))
        append(" AND ")
        append(element.expr2.accept(this@DefaultSqlExpressionVisitor, param))
    }

    override fun visit(element: OrOp, param: QueryBuilder): String = buildString {
        append("(")
        append(element.expr1.accept(this@DefaultSqlExpressionVisitor, param))
        append(" OR ")
        append(element.expr2.accept(this@DefaultSqlExpressionVisitor, param))
        append(")")
    }

    override fun visit(element: Exists, param: QueryBuilder): String =
            "EXISTS (${element.query.prepareSQL(param)})"


    override fun visit(element: NotExists, param: QueryBuilder): String =
            "NOT EXISTS (${element.query.prepareSQL(param)})"

    override fun visit(field: PKModelField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: Many2OneFieldLink<*, *>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: StringField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: DateField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: DateTimeField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: TimeField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: BooleanField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: TextField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: DecimalField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: IntField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: BinaryField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: One2ManyField<*,*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: Many2OneField<*,*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: Many2ManyField<*,*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: One2OneField<*,*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: RevOne2OneField<*,*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: SelectionField<*,*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: NameModelField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: ExternalRefModelField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: WriteDateModelField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: CreateDateModelField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: ArchivedModelField<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: FieldAlias<*, *>, p: QueryBuilder): String = field.newModel.alias + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: CreateUID<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    override fun visit(field: WriteUID<*>, p: QueryBuilder): String = field.model.tableName + "." + field.fieldName.quotedIfNeeded()

    fun String.quotedIfNeeded(): String
}