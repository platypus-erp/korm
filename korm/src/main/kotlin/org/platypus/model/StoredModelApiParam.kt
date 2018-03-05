package org.platypus.model

import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.ORDERBY_TYPE

//data class NameSearchParam(val value: String,
//                           val where: Expression<Boolean>? = null,
//                           val operator: (prop: AbstractKormStringProperty<*>, value: String) -> Op<Boolean> = { prop, value -> prop.ilike(value) },
//                           val limit: Int = 20)

data class ToJsonParam(
        val lazy: LazyLoadType = LazyLoadType.NONE,
        val pretty: Boolean = false
)

enum class LazyLoadType {
    NONE, CHILDREN_ONLY, LINK, FULL, CHILDREN_AND_LINK
}

data class SearchQueryParam<M : Model<M>>(
        val fields: MutableSet<ModelField<M, *>> = mutableSetOf(),
        val where: Expression<Boolean>? = null,
        val limit: Int = 0,
        val orderBy: MutableList<Pair<ModelField<M, *>, ORDERBY_TYPE>> = mutableListOf(),
        val offset: Int = 0
)

data class BatchUpdateParam<M : Model<M>>(
        var where: Expression<Boolean>,
        var vals: Map<ModelField<M, *>, Any>
)


val modelNameValidatorRegex = Regex("")