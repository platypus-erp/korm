package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder

interface SearchQuerySelectPart<M : Model<M>> : FieldGetter<M>, StatementPart {
}

class SearchQuerySelectPartImpl<M : Model<M>>(
        private val model: M,
        private val count: Boolean = false,
        private val distinct: Boolean = false
) : SearchQuerySelectPart<M> {

    val fromSelect :MutableSet<RealModelField<*,*>> = HashSet()
    val selectJoin = HashMap<JoinStatementPart, MutableSet<RealModelField<*,*>>>()
    val joins = LinkedHashSet<JoinStatementPart>()


    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>> Many2OneField<M, M1>.join(field: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2> {
        return Join3(Join2(this), this.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>> Join3<M, M1, M2>.join(field: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3> {
        return Join4(this, this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>> Join4<M, M1, M2, M3>.join(field: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4> {
        return Join5(this, this.field.target.field()).also { joins.add(it) }
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>> Join5<M, M1, M2, M3, M4>.join(field: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5> {
        return Join6(this, this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>> Join6<M, M1, M2, M3, M4, M5>.join(field: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6> {
        return Join7(this, this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>> Join7<M, M1, M2, M3, M4, M5, M6>.join(field: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7> {
        return Join8(this, this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>> Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(field: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8> {
        return Join9(this, this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(field: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9> {
        return Join10(this, this.field.target.field())
    }

    override fun <T : Any> RealModelField<M, T>.select() {
        fromSelect.add(this)
    }

    override fun <M1 : Model<M1>, T : Any> Many2OneField<M, M1>.select(field: M1.() -> RealModelField<M1, T>):RealModelField<M1, T> {
        return Join2(this).mergeSelect(this.target.field())
    }

    private fun <M1 : Model<M1>, T : Any> JoinStatementPart.mergeSelect(field: RealModelField<M1, T>): RealModelField<M1, T> {
        val selectPart = selectJoin[this] ?: mutableSetOf()
        selectPart.add(field)
        selectJoin[this] = selectPart
        return field
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, T : Any> Join3<M, M1, M2>.select(field: M2.() -> RealModelField<M2, T>):RealModelField<M2, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, T : Any> Join4<M, M1, M2, M3>.select(field: M3.() -> RealModelField<M3, T>):RealModelField<M3, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, T : Any> Join5<M, M1, M2, M3, M4>.select(field: M4.() -> RealModelField<M4, T>):RealModelField<M4, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, T : Any> Join6<M, M1, M2, M3, M4, M5>.select(field: M5.() -> RealModelField<M5, T>):RealModelField<M5, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, T : Any> Join7<M, M1, M2, M3, M4, M5, M6>.select(field: M6.() -> RealModelField<M6, T>):RealModelField<M6, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, T : Any> Join8<M, M1, M2, M3, M4, M5, M6, M7>.select(field: M7.() -> RealModelField<M7, T>):RealModelField<M7, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, T : Any> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.select(field: M8.() -> RealModelField<M8, T>):RealModelField<M8, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>, T : Any> Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.select(field: M9.() -> RealModelField<M9, T>):RealModelField<M9, T> {
        return this.mergeSelect(this.field.target.field())
    }
}