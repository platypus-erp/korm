package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.cache.of
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.sql.and
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.JoinType
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.or


fun <M : Model<M>> PlatypusEnvironment.buildSelect(model: M, builer: SearchQuery<M>.(M) -> Unit): Query {
    val smb = SearchQueryImpl(model, this)
    smb.builer(model)
    return smb.buildQuery(this)
}

interface FieldGetter{
    fun <MM:Model<MM>, TM:Model<TM>, F:IModelField<TM, T>, T:Any> Many2OneField<MM, TM>.get(getter : TM.() -> F):F
}

interface FieldUnaryPlus:FieldGetter {
    operator fun <MM:Model<MM>> RealModelField<MM, *>.unaryPlus()

}

class FieldGetterImpl : FieldGetter{
    override fun <MM : Model<MM>, TM : Model<TM>, F : IModelField<TM, T>, T : Any> Many2OneField<MM, TM>.get(getter: TM.() -> F): F {
        TODO("not implemented")
    }
}

class FieldUniryPlusImpl : FieldUnaryPlus{
    override fun <MM : Model<MM>, TM : Model<TM>, F : IModelField<TM, T>, T : Any> Many2OneField<MM, TM>.get(getter: TM.() -> F): F {
        TODO("not implemented")
    }

    override fun <MM : Model<MM>> RealModelField<MM, *>.unaryPlus() {
        TODO("not implemented")
    }
}
interface SearchQuery<M : Model<M>> {
    val currentPredicate: (M) -> Expression<Boolean>?
    fun adjustSelect(slice : FieldUnaryPlus.(M) -> Unit): SearchQuery<M>

    fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): SearchQuery<M>
    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): SearchQuery<M>
    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQuery<M>
    fun limit(limit: Int, offset: Int = 0): SearchQuery<M>
    fun where(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQuery<M>
    fun or(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQuery<M>
    fun and(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQuery<M>
    fun execute(): List<Int>
    fun copy(): SearchQuery<M>
}

internal class SearchQueryImpl<M : Model<M>>(
        private val model: M,
        val env: PlatypusEnvironment,
        private val expr: Set<IModelField<M, *>> = model.storeFields,
        private val predicate: Expression<Boolean>? = null,
        private val joins: LinkedHashMap<ReferenceField<*, *>, JoinType> = LinkedHashMap(),
        private val offset: Int = 0,
        private val limit: Int = -1,
        private val _orderByColumns: MutableList<Pair<Expression<*>, ORDERBY_TYPE>> = mutableListOf()
) : SearchQuery<M> {

    override val currentPredicate: (M) -> Expression<Boolean>?
        get() = { m -> predicate }

    internal fun buildQuery(env: PlatypusEnvironment): Query {
        var colSet: ColumnSet = model
        for ((f, j) in joins) {
            colSet = colSet.join(f.target, j, f, f.target.id)
        }
        val q = Query(env, colSet.slice(expr), predicate)
        if (this.limit > 0) {
            q.limit(this.limit, this.offset)
        }
        q.orderBy()
        return q
    }

    override fun adjustSelect(slice: FieldUnaryPlus.(M) -> Unit): SearchQuery<M> {
        TODO("not implemented")
    }

    override fun execute(): List<Int> {
        val res = ArrayList<Int>()
        val query = buildQuery(env)
        for (row in query) {
            val id = row.get(model.id)
            res.add(id)
            env.internal.cache.store(model of id, expr, row)
        }
        return res
    }

    override fun copy(): SearchQuery<M> {
        TODO("not implemented")
    }

    override fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE): SearchQuery<M> = orderBy(column to orderBy)


    override fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>) = orderBy(columns.toList())

    override fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                predicate,
                joins,
                offset,
                limit,
                _orderByColumns.toMutableList().apply {
                    addAll(columns)
                }
        )
    }

    override fun limit(limit: Int, offset: Int): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                predicate,
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }

    fun <M1 : Model<M1>, M2 : Model<M2>> ReferenceField<M1, M2>.join(joinType: JoinType? = null): M2 {
        joinField(this, joinType)
        return this.target
    }

    fun joinField(field: ReferenceField<*, *>, joinType: JoinType? = null) {
        TODO()
//        val jType = joinType ?: if (field.required) {
//            JoinType.INNER
//        } else {
//            JoinType.LEFT
//        }
//        joins[field] = jType
//        expr.add(field.target.id)
//        expr.add(field)
    }

    override fun or(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                if (this.predicate != null) {
                    this.predicate!!.or(FieldUniryPlusImpl().predicate(model))
                } else {
                    this.predicate
                },
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun and(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                if (this.predicate != null) {
                    this.predicate!!.and(FieldUniryPlusImpl().predicate(model))
                } else {
                    this.predicate
                },
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun where(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                FieldUniryPlusImpl().predicate(model),
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }


    fun merge(other: SearchQueryImpl<M>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr.toMutableSet().apply {
                    addAll(other.expr)
                },
                when {
                    predicate != null && other.predicate != null -> predicate!! and other.predicate!!
                    predicate == null -> other.predicate
                    else -> predicate
                },
                LinkedHashMap(joins).apply {
                    putAll(other.joins)
                },
                other.offset,
                other.limit,
                _orderByColumns.toMutableList().apply {
                    addAll(other._orderByColumns)
                }
        )
    }


}