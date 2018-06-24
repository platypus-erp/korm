package org.platypus.bag

import org.platypus.entity.RecordImpl
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.query.ORDERBY_TYPE

internal class RecordComparator<M : Model<M>>(val columns: List<Pair<ModelField<M, Any>, ORDERBY_TYPE>>) : Comparator<RecordImpl<M>> {
    override fun compare(o1: RecordImpl<M>?, o2: RecordImpl<M>?): Int {
        var result = 0
        for ((column, orderBy) in columns) {
            val res = when {
                o1 != null && o2 == null -> 1
                o1 == null && o2 == null -> 0
                o1 == null && o2 != null -> -1
                else -> column.compare(o1!![column]!!, o2!![column]!!)
            }
            result += if (orderBy == ORDERBY_TYPE.DESC) {
                res * -1
            } else {
                res
            }
        }
        return result
    }
}