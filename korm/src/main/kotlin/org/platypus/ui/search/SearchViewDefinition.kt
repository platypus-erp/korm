package org.platypus.ui.search

import com.beust.klaxon.JsonObject
import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.LiteralOp
import org.platypus.orm.sql.literal
import org.platypus.orm.sql.predicate.AndOp
import org.platypus.orm.sql.predicate.OrOp
import org.platypus.orm.sql.query.ORDERBY_TYPE
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.orm.sql.query.SearchQueryImpl
import org.platypus.ui.ToViewApi
import org.platypus.ui.ViewApi
import org.platypus.utils.prefix
import org.platypus.utils.suffix
import org.platypus.utils.toJson
import org.platypus.web.SearchTreeParam

class SearchViewDefinition<M : Model<M>>(
        override val uniqueName: String,
        override val model: M,
        private val def: SearchViewBuilder<M>.(M) -> Unit) : ToViewApi<M> {

    private val builder: SearchViewBuilderImpl<M> by lazy {
        val b = SearchViewBuilderImpl(model)
        b.def(model)
        b
    }

    override fun toViewApi(): ViewApi {
        return SearchViewGenerator(uniqueName, model, builder)
    }

    override fun querySearch(env: PlatypusEnvironment, param: SearchTreeParam): SearchQuery<M> {
        val query = SearchQueryImpl(model, env)
        val predicate = param.filter.toJson().jsonFilterToPredicate()
        if (predicate != null) {
            query.where { predicate }
        }
        query.limit(param.limit, param.page)
        query.orderBy(param.splitOrderBy())
        return query
    }

    private fun SearchTreeParam.splitOrderBy(): List<Pair<ModelField<*,  *>, ORDERBY_TYPE>> {
        if (this.orderby.isEmpty()) {
            return emptyList()
        }
        val props = builder.build(uniqueName).elements.filter { it is SearchPropertyElement }.map { it as SearchPropertyElement }
        val mapPropName: Map<String, SearchPropertyElement> = props.map { it.prop.fieldName to it }.toMap()
        val res = ArrayList<Pair<ModelField<*, *>, ORDERBY_TYPE>>(this.orderby.size)
        for (e in this.orderby) {
            if (e.startsWith("+")) {
                res.add(mapPropName[e.removePrefix("+")]!!.prop to ORDERBY_TYPE.ASC)
            }
            if (e.startsWith("-")) {
                res.add(mapPropName[e.removePrefix("-")]!!.prop to ORDERBY_TYPE.DESC)
            }
        }
        return res
    }

    internal fun JsonObject.jsonFilterToPredicate(): Expression<Boolean>? {
        if (isEmpty()) {
            return null
        }
        val left = obj("left")!!
        val right = obj("right")!!
        val op = string("op")!!
        val props = builder.build(uniqueName).elements.filter { it is SearchPropertyElement }.map { it as SearchPropertyElement }
        val mapPropName: Map<String, SearchPropertyElement> = props.map { it.prop.fieldName to it }.toMap()
        val expr: Expression<Boolean> = when (op) {
            "and" -> {
                AndOp(left.jsonFilterToPredicate()!!, right.jsonFilterToPredicate()!!)
            }
            "or" -> {
                OrOp(left.jsonFilterToPredicate()!!, right.jsonFilterToPredicate()!!)
            }
//            "=" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                EqOp(f, right.getRightValue())
//            }
//            "!=" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                NeqOp(f, right.getRightValue())
//            }
//            "<" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                LessOp(f, right.getRightValue())
//            }
//            "<=" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                LessEqOp(f, right.getRightValue())
//            }
//            ">" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                GreaterOp(f, right.getRightValue())
//            }
//            ">=" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                GreaterEqOp(f, right.getRightValue())
//            }
//            "like" -> {
//                val f = mapPropName[left.string("field")]!!.prop as ModelField<M, String, String>
//                val caseSensitive = right.boolean("caseSensitive") ?: false
//                if (caseSensitive) {
//                    LikeOp(f, right.getRightValue("%", "%"))
//                } else {
//                    ILikeOp(f, right.getRightValue("%", "%"))
//                }
//            }
//            "!like" -> {
//                val f = mapPropName[left.string("field")]!!.prop as ModelField<M, String, String>
//                val caseSensitive = right.boolean("caseSensitive") ?: false
//                if (caseSensitive) {
//                    NotOp(LikeOp(f, right.getRightValue("%", "%")))
//                } else {
//                    NotOp(ILikeOp(f, right.getRightValue("%", "%")))
//                }
//            }
//            "start" -> {
//                val f = mapPropName[left.string("field")]!!.prop as ModelField<M, String, String>
//                val caseSensitive = right.boolean("caseSensitive") ?: false
//                if (caseSensitive) {
//                    LikeOp(f, right.getRightValue(suffix = "%"))
//                } else {
//                    ILikeOp(f, right.getRightValue(suffix = "%"))
//                }
//            }
//            "!start" -> {
//                val f = mapPropName[left.string("field")]!!.prop as ModelField<M, String, String>
//                val caseSensitive = right.boolean("caseSensitive") ?: false
//                if (caseSensitive) {
//                    NotOp(LikeOp(f, right.getRightValue(suffix = "%")))
//                } else {
//                    NotOp(ILikeOp(f, right.getRightValue(suffix = "%")))
//                }
//            }
//            "end" -> {
//                val f = mapPropName[left.string("field")]!!.prop as ModelField<M, String, String>
//                val caseSensitive = right.boolean("caseSensitive") ?: false
//                if (caseSensitive) {
//                    LikeOp(f, right.getRightValue(prefix = "%"))
//                } else {
//                    ILikeOp(f, right.getRightValue(prefix = "%"))
//                }
//            }
//            "!end" -> {
//                val f = mapPropName[left.string("field")]!!.prop as ModelField<M, String, String>
//                val caseSensitive = right.boolean("caseSensitive") ?: false
//                if (caseSensitive) {
//                    NotOp(LikeOp(f, right.getRightValue(prefix = "%")))
//                } else {
//                    NotOp(ILikeOp(f, right.getRightValue(prefix = "%")))
//                }
//            }
//            "null" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                IsNullOp(f)
//            }
//            "!null" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                IsNotNullOp(f)
//            }
//            "between" -> {
//                val f = mapPropName[left.string("field")]!!.prop
//                BetweenOp(f, right.getRightValue(valueName = "valueFrom"), right.getRightValue(valueName = "valueTo"))
//            }
            "filterID" -> {
                TODO("Find the filter in the search view and returning it")

            }
            else -> throw IllegalStateException("Can't decode Json ${toJsonString()}")

        }

        return expr
    }

    private fun JsonObject.getRightValue(valueName: String = "value", prefix: String? = null, suffix: String? = null): LiteralOp<*> {
        return when (valueName) {
            in keys -> {
                val valueObj = obj("value")!!
                when (valueObj.string("type")!!) {
                    "str" -> valueObj.string("val")!!
                            .prefix(prefix ?: "").suffix(suffix ?: "").literal()
                    "int" -> valueObj.int("val")!!.literal()
                    "decimal" -> valueObj.string("val")!!.toBigDecimal().literal()
                    "date" -> valueObj.string("val")!!.literal()
                    "datetime" -> valueObj.string("val")!!.literal()
                    "time" -> valueObj.string("val")!!.literal()
                    "dataRef" -> valueObj.int("val")!!.literal()
                    else -> throw IllegalStateException("Can't decode Json ${valueObj.toJsonString()}")
                }
            }
            else -> throw IllegalStateException("Can't decode Json ${this.toJsonString()}")
        }
    }


}



