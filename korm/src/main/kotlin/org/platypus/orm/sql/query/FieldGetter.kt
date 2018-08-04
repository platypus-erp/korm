package org.platypus.orm.sql.query

import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.utils.space
import org.platypus.utils.token

interface JoinStatementPart<M1: IModel<M1>, M2: IModel<M2>> {
    val alias: Alias<M2>
    val field: ReferenceField<M1, M2>

    fun queryJoin(from: ColumnSet): Join
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

data class Join2<M1: IModel<M1>, M2: IModel<M2>>(
        val fromTable: M1,
        override val field: ReferenceField<M1, M2>,
        override val alias: Alias<M2>) : JoinStatementPart<M1, M2> {

    override fun queryJoin(from: ColumnSet): Join {
        return from.join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], field)
    }
}

data class Join3<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>>(
        val join: Join2<M1, M2>,
        override val field: ReferenceField<M2, M3>,
        override val alias: Alias<M3>
) : JoinStatementPart<M2, M3> {

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }

    fun <M4: IModel<M4>> join4(field: ReferenceField<M3, M4>): Join4<M1, M2, M3, M4> =
            Join4(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))
}


data class Join4<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>>(
        val join: Join3<M1, M2, M3>,
        override val field: ReferenceField<M3, M4>,
        override val alias: Alias<M4>
) : JoinStatementPart<M3, M4> {
    fun <M5: IModel<M5>> join5(field: ReferenceField<M4, M5>): Join5<M1, M2, M3, M4, M5> =
            Join5(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

data class Join5<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>>(
        val join: Join4<M1, M2, M3, M4>,
        override val field: ReferenceField<M4, M5>,
        override val alias: Alias<M5>
) : JoinStatementPart<M4, M5> {
    fun <M6: IModel<M6>> join6(field: ReferenceField<M5, M6>): Join6<M1, M2, M3, M4, M5, M6> =
            Join6(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

data class Join6<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>>(
        val join: Join5<M1, M2, M3, M4, M5>,
        override val field: ReferenceField<M5, M6>,
        override val alias: Alias<M6>
) : JoinStatementPart<M5, M6> {
    fun <M7: IModel<M7>> join7(field: ReferenceField<M6, M7>): Join7<M1, M2, M3, M4, M5, M6, M7> =
            Join7(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

data class Join7<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>>(
        val join: Join6<M1, M2, M3, M4, M5, M6>,
        override val field: ReferenceField<M6, M7>,
        override val alias: Alias<M7>
) : JoinStatementPart<M6, M7> {
    fun <M8: IModel<M8>> join8(field: ReferenceField<M7, M8>): Join8<M1, M2, M3, M4, M5, M6, M7, M8> =
            Join8(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

data class Join8<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>>(
        val join: Join7<M1, M2, M3, M4, M5, M6, M7>,
        override val field: ReferenceField<M7, M8>,
        override val alias: Alias<M8>
) : JoinStatementPart<M7, M8> {
    fun <M9: IModel<M9>> join9(field: ReferenceField<M8, M9>): Join9<M1, M2, M3, M4, M5, M6, M7, M8, M9> =
            Join9(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

data class Join9<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, M9: IModel<M9>>(
        val join: Join8<M1, M2, M3, M4, M5, M6, M7, M8>,
        override val field: ReferenceField<M8, M9>,
        override val alias: Alias<M9>
) : JoinStatementPart<M8, M9> {
    fun <M10: IModel<M10>> join10(field: ReferenceField<M9, M10>): Join10<M1, M2, M3, M4, M5, M6, M7, M8, M9, M10> =
            Join10(this, field, Alias(field.target, join.alias.alias + "_" + field.fieldName))

    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

data class Join10<M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, M9: IModel<M9>, M10: IModel<M10>>(
        val join: Join9<M1, M2, M3, M4, M5, M6, M7, M8, M9>,
        override val field: ReferenceField<M9, M10>,
        override val alias: Alias<M10>
) : JoinStatementPart<M9, M10>{
    override fun queryJoin(from: ColumnSet): Join {
        return join.queryJoin(from).join(alias, Join.JoinType.LEFT, alias[alias.delegate.id], join.alias[field])
    }
}

interface FieldJoiner<M: IModel<M>> {
    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>>
            Many2OneField<M, M1>.join(getter: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>>
            Join3<M, M1, M2>.join(getter: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>>
            Join4<M, M1, M2, M3>.join(getter: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>>
            Join5<M, M1, M2, M3, M4>.join(getter: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>>
            Join6<M, M1, M2, M3, M4, M5>.join(getter: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>>
            Join7<M, M1, M2, M3, M4, M5, M6>.join(getter: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            M8: IModel<M8>>
            Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(getter: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            M8: IModel<M8>,
            M9: IModel<M9>>
            Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(getter: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>
}

interface FieldGetter<M: IModel<M>> : FieldJoiner<M> {
    //    fun <T : Any> select(field:RealModelField<M, T>)
    fun <T : Any> RealModelField<M, T>.select()

    infix fun <M1: IModel<M1>, T : Any> Many2OneField<M, M1>.select(getter: M1.() -> RealModelField<M1, T>): RealModelField<M1, T>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            T : Any>
            Join3<M, M1, M2>.select(getter: M2.() -> RealModelField<M2, T>)


    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            T : Any>
            Join4<M, M1, M2, M3>.select(getter: M3.() -> RealModelField<M3, T>)


    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            T : Any>
            Join5<M, M1, M2, M3, M4>.select(getter: M4.() -> RealModelField<M4, T>)

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            T : Any>
            Join6<M, M1, M2, M3, M4, M5>.select(getter: M5.() -> RealModelField<M5, T>)

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            T : Any>
            Join7<M, M1, M2, M3, M4, M5, M6>.select(getter: M6.() -> RealModelField<M6, T>)

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            T : Any>
            Join8<M, M1, M2, M3, M4, M5, M6, M7>.select(getter: M7.() -> RealModelField<M7, T>)

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            M8: IModel<M8>,
            T : Any>
            Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.select(getter: M8.() -> RealModelField<M8, T>)

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            M8: IModel<M8>,
            M9: IModel<M9>,
            T : Any>
            Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.select(getter: M9.() -> RealModelField<M9, T>)
}