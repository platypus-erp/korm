package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.sql.and
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.JoinType
import org.platypus.orm.sql.expression.Expression


fun <M : Model<M>> PlatypusEnvironment.buildSelect(model: M, builer: SmartQueryBuilder<M>.(M) -> Unit): Query {
    val smb = SmartQueryBuilder(model)
    smb.builer(model)
    return smb.buildQuery(this)
}

class SmartQueryBuilder<M : Model<M>>(private val model: M) {
    private val expr: MutableSet<Expression<*>> = HashSet()
    private var predicate: Expression<Boolean>? = null
    private val joins = LinkedHashMap<ReferenceField<*, *>, JoinType>()
    private var offset: Int = 0
    private var limit: Int = 80
    private var _orderByColumns: MutableList<Pair<Expression<*>, ORDERBY_TYPE>> = mutableListOf()

    init {
        expr.add(model.id)
    }

    fun buildQuery(env: PlatypusEnvironment): Query {
        var colSet: ColumnSet = model
        for ((f, j) in joins) {
            colSet = colSet.join(f.target, j, f, f.target.id)
        }
        val q = Query(env, colSet.slice(expr), predicate)
        q.limit(this.limit, this.offset)
        q.orderBy()
        return q
    }

    fun orderBy(column: Expression<*>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): SmartQueryBuilder<M> {
        _orderByColumns.add(column to orderBy)
        return this
    }

    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): SmartQueryBuilder<M> = orderBy(columns.toList())

    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SmartQueryBuilder<M> {
        for (pair in columns) {
            _orderByColumns.add(pair)
        }
        return this
    }

    fun limit(limit: Int, offset: Int = 0): SmartQueryBuilder<M> {
        this.limit = limit
        this.offset = offset
        return this
    }

    fun <M1 : Model<M1>, M2 : Model<M2>> ReferenceField<M1, M2>.join(joinType: JoinType? = null): M2 {
        joinField(this, joinType)
        return this.target
    }

    fun joinField(field: ReferenceField<*, *>, joinType: JoinType? = null) {
        val jType = joinType ?: if (field.required) {
            JoinType.INNER
        } else {
            JoinType.LEFT
        }
        joins[field] = jType
        expr.add(field.target.id)
        expr.add(field)
    }

    operator fun RealModelField<*, *>.unaryPlus() {
        addField(this)
    }

    fun addField(f: RealModelField<*, *>) {
        expr.add(f)
    }

    fun where(predicate: () -> Expression<Boolean>) {
        this.predicate = predicate()
    }

    fun merge(other: SmartQueryBuilder<M>): SmartQueryBuilder<M> {
        expr.addAll(this.expr)
        predicate = when {
            predicate == null -> other.predicate
            predicate != null && other.predicate != null -> predicate!! and other.predicate!!
            else -> predicate
        }
        joins.putAll(other.joins)
        limit = other.limit
        offset = other.offset
        _orderByColumns.addAll(other._orderByColumns)
        return this
    }


}