package org.platypus.orm.sql.query

import org.platypus.TypedCloneable
import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.FieldAlias
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.FieldSet
import org.platypus.orm.sql.expression.Expression
import org.platypus.utils.groupBySet

interface SearchQuerySelectPart<M : IModel<M>> : FieldGetter<M>, FieldSet, TypedCloneable<SearchQuerySelectPart<M>>{
    val sliceByModel: Map<IModel<*>, Set<IModelField<*, *>>>
}

class SearchQuerySelectPartImpl<M : IModel<M>> internal constructor(
        private val model: M,
        private val count: Boolean = false,
        private val distinct: Boolean = false,
        val slice: MutableSet<IModelField<*, *>>,
        val from: Alias<M>,
        var currentColumnSet: ColumnSet = from
) : SearchQuerySelectPart<M> {


    constructor(model: M, count: Boolean = false, distinct: Boolean = false) : this(model, count, distinct, HashSet(), Alias(model, "from_table"))

    fun addToSlice(f: FieldAlias<*, *>) {
        slice.add(f)
    }

    override val sliceByModel: Map<IModel<*>, Set<IModelField<*, *>>>
        get() = slice.groupBySet { it.model }

    init {
        slice.add(from[model.id])
    }

    override fun typedClone(): SearchQuerySelectPart<M> {
        return SearchQuerySelectPartImpl(model, count, distinct, slice, from, currentColumnSet)
    }

    override val fieldsExpression: Set<Expression<*>>
        get() = slice
    override val source: ColumnSet
        get() = currentColumnSet

    override fun <T : Any> RealModelField<M, T>.select() {
        addToSlice(from[this])
    }

    override fun <M1 : IModel<M1>, T : Any> Many2OneField<M, M1>.select(getter: M1.() -> RealModelField<M1, T>): RealModelField<M1, T> {
        val join = this.createJoin()
        addToSlice(from[this])
        val field = join.field.target.getter()
        addToSlice(join.alias[field])
//        TEST IF not already in join
        currentColumnSet = join.queryJoin(currentColumnSet)
        return field
    }

    override fun <M1 : IModel<M1>, M2: IModel<M2>, T : Any> Join3<M, M1, M2>.select(getter: M2.() -> RealModelField<M2, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, T : Any> Join4<M, M1, M2, M3>.select(getter: M3.() -> RealModelField<M3, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, T : Any> Join5<M, M1, M2, M3, M4>.select(getter: M4.() -> RealModelField<M4, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, T : Any> Join6<M, M1, M2, M3, M4, M5>.select(getter: M5.() -> RealModelField<M5, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, T : Any> Join7<M, M1, M2, M3, M4, M5, M6>.select(getter: M6.() -> RealModelField<M6, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, T : Any> Join8<M, M1, M2, M3, M4, M5, M6, M7>.select(getter: M7.() -> RealModelField<M7, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, T : Any> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.select(getter: M8.() -> RealModelField<M8, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, M9: IModel<M9>, T : Any> Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.select(getter: M9.() -> RealModelField<M9, T>) {
        currentColumnSet = this.queryJoin(currentColumnSet)
        val field = this.field.target.getter()
        addToSlice(this.alias[field])
        addToSlice(this.alias[field.model.id])
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>> Many2OneField<M, M1>.join(getter: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2> {
        val join = createJoin()
        addToSlice(from[this])
        val f = this.target.getter()
        addToSlice(join.alias[f])
        addToSlice(join.alias[this.target.id])
        val fAlias = Alias(f.target, join.alias.alias + "_" + f.fieldName)
        return Join3(join, f, fAlias)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>> Join3<M, M1, M2>.join(getter: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join4(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>> Join4<M, M1, M2, M3>.join(getter: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join5(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>> Join5<M, M1, M2, M3, M4>.join(getter: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join6(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>> Join6<M, M1, M2, M3, M4, M5>.join(getter: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join7(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>> Join7<M, M1, M2, M3, M4, M5, M6>.join(getter: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join8(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>> Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(getter: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join9(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, M9: IModel<M9>> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(getter: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9> {
        val f = this.field.target.getter()
        addToSlice(this.alias[f])
        addToSlice(this.alias[this.field.target.id])
        return this.join10(f)
    }

    private fun <M1: IModel<M1>> Many2OneField<M, M1>.createJoin(): Join2<M, M1> {
        return Join2(from, this, Alias(this.target, this.fieldName))
    }


}