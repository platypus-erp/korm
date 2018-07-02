package org.platypus.orm.sql.query

import org.platypus.model.Alias
import org.platypus.model.Model
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.utils.space
import org.platypus.utils.token

interface JoinStatementPart<M1 : Model<M1>, M2 : Model<M2>> {
    val alias: Alias<M2>
    val field: ReferenceField<M1, M2>
    fun createJoin(previous: Alias<M1>, colSet: ColumnSet): ColumnSet {
        return colSet.join(alias, Join.JoinType.LEFT, previous[field], alias[field.target.id])
    }
}

private fun PersistenceDialect.getAliasStatement(field: ReferenceField<*, *>, alias: String, joinAlias: String) = buildString {
    if (field.required) {
        token("INNER")
    } else {
        token("LEFT")
    }
    token("JOIN")
    token(identity(field.target))
    token("AS")
    token(alias)
    token("ON")
    append(joinAlias)
    append(".")
    append(identity(field))
    space()
    token("=")
    append(alias)
    append(".")
    append(identity(field.model.id))
}

data class Join2<M1 : Model<M1>, M2 : Model<M2>>(
        override val field: ReferenceField<M1, M2>,
        override val alias: Alias<M2>) : JoinStatementPart<M1, M2>

data class Join3<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>>(
        val join: Join2<M1, M2>,
        override val field: ReferenceField<M2, M3>,
        override val alias: Alias<M3>
) : JoinStatementPart<M2, M3>


data class Join4<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>>(
        val join: Join3<M1, M2, M3>,
        override val field: ReferenceField<M3, M4>,
        override val alias: Alias<M4>
) : JoinStatementPart<M3, M4>

data class Join5<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>>(
        val join: Join4<M1, M2, M3, M4>,
        override val field: ReferenceField<M4, M5>,
        override val alias: Alias<M5>
) : JoinStatementPart<M4, M5>

data class Join6<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>>(
        val join: Join5<M1, M2, M3, M4, M5>,
        override val field: ReferenceField<M5, M6>,
        override val alias: Alias<M6>
) : JoinStatementPart<M5, M6>

data class Join7<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>>(
        val join: Join6<M1, M2, M3, M4, M5, M6>,
        override val field: ReferenceField<M6, M7>,
        override val alias: Alias<M7>
) : JoinStatementPart<M6, M7>

data class Join8<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>>(
        val join: Join7<M1, M2, M3, M4, M5, M6, M7>,
        override val field: ReferenceField<M7, M8>,
        override val alias: Alias<M8>
) : JoinStatementPart<M7, M8>

data class Join9<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>>(
        val join: Join8<M1, M2, M3, M4, M5, M6, M7, M8>,
        override val field: ReferenceField<M8, M9>,
        override val alias: Alias<M9>
) : JoinStatementPart<M8, M9>

data class Join10<M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>, M10 : Model<M10>>(
        val join: Join9<M1, M2, M3, M4, M5, M6, M7, M8, M9>,
        override val field: ReferenceField<M9, M10>,
        override val alias: Alias<M10>
) : JoinStatementPart<M9, M10>

interface FieldJoiner<M : Model<M>> {
    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>>
            Many2OneField<M, M1>.join(field: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>>
            Join3<M, M1, M2>.join(field: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>>
            Join4<M, M1, M2, M3>.join(field: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>>
            Join5<M, M1, M2, M3, M4>.join(field: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>>
            Join6<M, M1, M2, M3, M4, M5>.join(field: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            M7 : Model<M7>>
            Join7<M, M1, M2, M3, M4, M5, M6>.join(field: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            M7 : Model<M7>,
            M8 : Model<M8>>
            Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(field: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            M7 : Model<M7>,
            M8 : Model<M8>,
            M9 : Model<M9>>
            Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(field: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>
}

interface FieldGetter<M : Model<M>> : FieldJoiner<M> {
    //    fun <T : Any> select(field:RealModelField<M, T>)
    fun <T : Any> RealModelField<M, T>.select()

    infix fun <M1 : Model<M1>, T : Any> Many2OneField<M, M1>.select(field: M1.() -> RealModelField<M1, T>): RealModelField<M1, T>

    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            T : Any>
            Join3<M, M1, M2>.select(field: M2.() -> RealModelField<M2, T>): RealModelField<M2, T>


    infix fun <
            M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            T : Any>
            Join4<M, M1, M2, M3>.select(field: M3.() -> RealModelField<M3, T>): RealModelField<M3, T>


    fun <M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            T : Any>
            Join5<M, M1, M2, M3, M4>.select(field: M4.() -> RealModelField<M4, T>): RealModelField<M4, T>

    fun <M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            T : Any>
            Join6<M, M1, M2, M3, M4, M5>.select(field: M5.() -> RealModelField<M5, T>): RealModelField<M5, T>

    fun <M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            T : Any>
            Join7<M, M1, M2, M3, M4, M5, M6>.select(field: M6.() -> RealModelField<M6, T>): RealModelField<M6, T>

    fun <M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            M7 : Model<M7>,
            T : Any>
            Join8<M, M1, M2, M3, M4, M5, M6, M7>.select(field: M7.() -> RealModelField<M7, T>): RealModelField<M7, T>

    fun <M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            M7 : Model<M7>,
            M8 : Model<M8>,
            T : Any>
            Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.select(field: M8.() -> RealModelField<M8, T>): RealModelField<M8, T>

    fun <M1 : Model<M1>,
            M2 : Model<M2>,
            M3 : Model<M3>,
            M4 : Model<M4>,
            M5 : Model<M5>,
            M6 : Model<M6>,
            M7 : Model<M7>,
            M8 : Model<M8>,
            M9 : Model<M9>,
            T : Any>
            Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.select(field: M9.() -> RealModelField<M9, T>): RealModelField<M9, T>
}