package org.platypus.visitor

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
import org.platypus.orm.sql.expression.Avg
import org.platypus.orm.sql.expression.CaseWhenElse
import org.platypus.orm.sql.expression.Coalesce
import org.platypus.orm.sql.expression.Count
import org.platypus.orm.sql.expression.CurrentDateTime
import org.platypus.orm.sql.expression.Date
import org.platypus.orm.sql.expression.DivideOp
import org.platypus.orm.sql.expression.ExpressionAlias
import org.platypus.orm.sql.expression.ExpressionAliasOnly
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.GroupConcat
import org.platypus.orm.sql.expression.LiteralOp
import org.platypus.orm.sql.expression.LowerCase
import org.platypus.orm.sql.expression.Max
import org.platypus.orm.sql.expression.Min
import org.platypus.orm.sql.expression.MinusOp
import org.platypus.orm.sql.expression.Month
import org.platypus.orm.sql.expression.MultiplyOp
import org.platypus.orm.sql.expression.NoOpConversion
import org.platypus.orm.sql.expression.NotOp
import org.platypus.orm.sql.expression.PlusOp
import org.platypus.orm.sql.expression.QueryParameter
import org.platypus.orm.sql.expression.StdDevPop
import org.platypus.orm.sql.expression.StdDevSamp
import org.platypus.orm.sql.expression.Sum
import org.platypus.orm.sql.expression.Trim
import org.platypus.orm.sql.expression.UpperCase
import org.platypus.orm.sql.expression.VarPop
import org.platypus.orm.sql.expression.VarSamp
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

object CanonicalNameExpression : ExpressionVisitor<Any?, String> {
    override fun visit(element: LiteralOp<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NoOpConversion<*,*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: QueryParameter<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: PlusOp<*,*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: MinusOp<*,*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: MultiplyOp<*,*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: DivideOp<*,*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Count, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Date, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: CurrentDateTime, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Month, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: LowerCase<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: UpperCase<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Min<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Max<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Avg<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: StdDevPop<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: StdDevSamp<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: VarPop<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: VarSamp<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Sum<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Coalesce<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Trim, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: CaseWhenElse<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: GroupConcat, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")


    override fun visit(element: IsNullOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: IsNotNullOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: BetweenOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: InList<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NotInList<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: EqOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NeqOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: LessOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: LessEqOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: GreaterEqOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: LikeOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: GreaterOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: ILikeOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NotLikeOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: RegexpOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NotRegexpOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: AndOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: OrOp, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: Exists, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NotExists, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: NotOp<*>, param: Any?): String = throw IllegalStateException("Can't find a name of ${element::class}")

    override fun visit(element: ExpressionAlias<*>, param: Any?): String = element.alias

    override fun visit(element: ExpressionAliasOnly<*>, param: Any?): String = element.alias

    override fun visit(field: StringField<*>, p: Any?): String = field.fieldName

    override fun visit(field: DateField<*>, p: Any?): String = field.fieldName

    override fun visit(field: DateTimeField<*>, p: Any?): String = field.fieldName

    override fun visit(field: TimeField<*>, p: Any?): String = field.fieldName

    override fun visit(field: BooleanField<*>, p: Any?): String = field.fieldName

    override fun visit(field: TextField<*>, p: Any?): String = field.fieldName

    override fun visit(field: DecimalField<*>, p: Any?): String = field.fieldName

    override fun visit(field: IntField<*>, p: Any?): String = field.fieldName

    override fun visit(field: BinaryField<*>, p: Any?): String = field.fieldName

    override fun visit(field: One2ManyField< *, *>, p: Any?): String = field.fieldName

    override fun visit(field: Many2OneField< *, *>, p: Any?): String = field.fieldName

    override fun visit(field: One2OneField<*, *>, p: Any?): String = field.fieldName

    override fun visit(field: RevOne2OneField<*, *>, p: Any?): String = field.fieldName

    override fun visit(field: Many2ManyField< *, *>, p: Any?): String = field.fieldName

    override fun visit(field: PKModelField<*>, p: Any?): String = field.fieldName

    override fun visit(field: SelectionField< *, *>, p: Any?): String = field.fieldName

    override fun visit(field: NameModelField<*>, p: Any?): String = field.fieldName

    override fun visit(field: ExternalRefModelField<*>, p: Any?): String = field.fieldName

    override fun visit(field: WriteDateModelField<*>, p: Any?): String = field.fieldName

    override fun visit(field: CreateDateModelField<*>, p: Any?): String = field.fieldName

    override fun visit(field: ArchivedModelField<*>, p: Any?): String = field.fieldName

    override fun visit(field: FieldAlias<*, *>, p: Any?): String = field.fieldName

    override fun visit(field: CreateUID<*>, p: Any?): String = field.fieldName

    override fun visit(field: WriteUID<*>, p: Any?): String = field.fieldName

    override fun visit(field: Many2OneFieldLink<*, *>, p: Any?): String = field.fieldName
}