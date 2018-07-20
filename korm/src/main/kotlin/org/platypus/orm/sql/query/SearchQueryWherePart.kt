package org.platypus.orm.sql.query

import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.field.impl.Many2OneField
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.expression.Expression

interface SearchQueryWherePart<M : IModel<M>> : FieldJoiner<M> {

    infix fun <M1: IModel<M1>, T : Any> Many2OneField<M, M1>.predicate(getter: M1.() -> Expression<T>): Expression<T>

    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            T : Any>
            Join3<M, M1, M2>.predicate(getter: M2.() -> Expression<T>): Expression<T>


    infix fun <
            M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            T : Any>
            Join4<M, M1, M2, M3>.predicate(getter: M3.() -> Expression<T>): Expression<T>


    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            T : Any>
            Join5<M, M1, M2, M3, M4>.predicate(getter: M4.() -> Expression<T>): Expression<T>

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            T : Any>
            Join6<M, M1, M2, M3, M4, M5>.predicate(getter: M5.() -> Expression<T>): Expression<T>

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            T : Any>
            Join7<M, M1, M2, M3, M4, M5, M6>.predicate(getter: M6.() -> Expression<T>): Expression<T>

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            T : Any>
            Join8<M, M1, M2, M3, M4, M5, M6, M7>.predicate(getter: M7.() -> Expression<T>): Expression<T>

    fun <M1: IModel<M1>,
            M2: IModel<M2>,
            M3: IModel<M3>,
            M4: IModel<M4>,
            M5: IModel<M5>,
            M6: IModel<M6>,
            M7: IModel<M7>,
            M8: IModel<M8>,
            T : Any>
            Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.predicate(getter: M8.() -> Expression<T>): Expression<T>

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
            Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.predicate(getter: M9.() -> Expression<T>): Expression<T>
}

class SearchQueryWherePartImpl<M : IModel<M>>(
        private val model: M,
        private val from: Alias<M>,
        private var currentColumnSet: ColumnSet = from
) : SearchQueryWherePart<M> {

    override fun <M1: IModel<M1>, T : Any> Many2OneField<M, M1>.predicate(getter: M1.() -> Expression<T>): Expression<T> {
        val join = this.createJoin()
        val expr = join.field.target.getter()
        currentColumnSet = join.queryJoin(currentColumnSet)
        return expr
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, T : Any> Join3<M, M1, M2>.predicate(getter: M2.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, T : Any> Join4<M, M1, M2, M3>.predicate(getter: M3.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, T : Any> Join5<M, M1, M2, M3, M4>.predicate(getter: M4.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, T : Any> Join6<M, M1, M2, M3, M4, M5>.predicate(getter: M5.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, T : Any> Join7<M, M1, M2, M3, M4, M5, M6>.predicate(getter: M6.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, T : Any> Join8<M, M1, M2, M3, M4, M5, M6, M7>.predicate(getter: M7.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, T : Any> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.predicate(getter: M8.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, M9: IModel<M9>, T : Any> Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.predicate(getter: M9.() -> Expression<T>): Expression<T> {
        currentColumnSet = this.queryJoin(currentColumnSet)
        return field.target.getter()
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>> Many2OneField<M, M1>.join(getter: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2> {
        val join = createJoin()
        val f = this.target.getter()
        val fAlias = Alias(f.target, join.alias.alias + "_" + f.fieldName)
        return Join3(join, f, fAlias)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>> Join3<M, M1, M2>.join(getter: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3> {
        val f = this.field.target.getter()
        return this.join4(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>> Join4<M, M1, M2, M3>.join(getter: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4> {
        val f = this.field.target.getter()
        return this.join5(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>> Join5<M, M1, M2, M3, M4>.join(getter: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5> {
        val f = this.field.target.getter()
        return this.join6(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>> Join6<M, M1, M2, M3, M4, M5>.join(getter: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6> {
        val f = this.field.target.getter()
        return this.join7(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>> Join7<M, M1, M2, M3, M4, M5, M6>.join(getter: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7> {
        val f = this.field.target.getter()
        return this.join8(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>> Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(getter: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8> {
        val f = this.field.target.getter()
        return this.join9(f)
    }

    override fun <M1: IModel<M1>, M2: IModel<M2>, M3: IModel<M3>, M4: IModel<M4>, M5: IModel<M5>, M6: IModel<M6>, M7: IModel<M7>, M8: IModel<M8>, M9: IModel<M9>> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(getter: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9> {
        val f = this.field.target.getter()
        return this.join10(f)
    }

    private fun <M1: IModel<M1>> Many2OneField<M, M1>.createJoin(): Join2<M, M1> {
        return Join2(from, this, Alias(this.target, this.fieldName))
    }

}