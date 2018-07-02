package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.cache.PlatypusCache
import org.platypus.model.Alias
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.PKModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.utils.enter
import org.platypus.utils.space
import org.platypus.utils.token
import java.sql.ResultSet

interface SearchQuerySelectPart<M : Model<M>> : FieldGetter<M>, StatementPart {
}

class SearchQuerySelectPartImpl<M : Model<M>>(
        private val model: M,
        private val count: Boolean = false,
        private val distinct: Boolean = false
) : SearchQuerySelectPart<M> {

    val slice: MutableSet<IModelField<*, *>> = HashSet()
    val selectJoin = HashMap<JoinStatementPart<*>, MutableSet<IModelField<*, *>>>()
    val joins = LinkedHashSet<JoinStatementPart<*>>()
    val from = Alias(model, "from_table")
    var currentColumnSet: ColumnSet = from

    init {
        slice.add(from[model.id])
    }

    val mapColumnToPutInCache = HashMap<String, IModelField<*, *>>()
    val mapPKToPutInCache = HashMap<String, PKModelField<*>>()

    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        token("SELECT")
        enter()
        var selectCounter = 0
        for ((j, fields) in selectJoin) {
            for (field in fields) {
                val colName = "col_$selectCounter"
                space(2)
                append(j.alias)
                append(".")
                append(dialect.identity(field))
                space()
                token("AS")
                append(colName)
                token(",")
                enter()
                selectCounter++
                if (builder.prepared) {
                    mapColumnToPutInCache[colName] = field
                    if (field is PKModelField) {
                        mapPKToPutInCache[colName] = field
                    }
                }
            }
        }
//        val iterator = fromSelect.iterator()
//        do {
//            space(2)
//            append("from_table")
//            append(".")
//            append(dialect.identity(iterator.next()))
//            space()
//            token("AS")
//            append("col_$selectCounter")
//            if (iterator.hasNext()) {
//                token(",")
//                enter()
//                selectCounter++
//            }
//        } while (iterator.hasNext())
        enter()
        token("FROM")
        token(dialect.identity(model))
        token("AS")
        token("from_table")
        enter()
        LinkedHashSet(selectJoin.keys.flatMap { it.decompose(dialect) }).joinTo(this, separator = "\n")
    }

    fun putInCache(cache: PlatypusCache, result: ResultSet) {
//        result.metaData.
//        while (result.next())
//            for ()
    }

    fun toQuery(env: PlatypusEnvironment): Query {
        for (j in selectJoin.keys) {
            j.createJoin()
        }
    }


    override fun <M1 : Model<M1>, M2 : Model<M2>> Many2OneField<M, M1>.join(field: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2> {
        slice.add(from[this])
        val alias = Alias(this.target, this.fieldName)
        val j = Join2(this, alias)
        val f = this.target.field()
        slice.add(alias[f])
        slice.add(alias[this.target.id])


        val fAlias = Alias(f.target, j.alias.alias + "_" + f.fieldName)
        return Join3(j, f, fAlias)
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>> Join3<M, M1, M2>.join(field: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3> {
        val f = this.field.target.field()
        val alias = Alias(f.model, this.alias.alias + "_" + f.fieldName)
        slice.add(alias[f.model.id])
        slice.add(this.aliasModel[f])
        return Join4(this, this.field.target.field(), alias)
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>> Join4<M, M1, M2, M3>.join(field: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4> {
        this.select(field)
        return Join5(this, this.field.target.field()).also {
            val selectPart = selectJoin[it] ?: mutableSetOf()
            selectPart.add(it.field.model.id)
            selectJoin[it] = selectPart
        }
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>> Join5<M, M1, M2, M3, M4>.join(field: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5> {
        this.select(field)
        return Join6(this, this.field.target.field()).also {
            val selectPart = selectJoin[it] ?: mutableSetOf()
            selectPart.add(it.field.model.id)
            selectJoin[it] = selectPart
        }
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>> Join6<M, M1, M2, M3, M4, M5>.join(field: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6> {
        this.select(field)
        return Join7(this, this.field.target.field()).also {
            val selectPart = selectJoin[this] ?: mutableSetOf()
            selectPart.add(this.field.model.id)
            selectJoin[this] = selectPart

        }
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>> Join7<M, M1, M2, M3, M4, M5, M6>.join(field: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7> {
        this.select(field)
        return Join8(this, this.field.target.field()).also {
            val selectPart = selectJoin[this] ?: mutableSetOf()
            selectPart.add(this.field.model.id)
            selectJoin[this] = selectPart

        }
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>> Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(field: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8> {
        this.select(field)
        return Join9(this, this.field.target.field()).also {
            val selectPart = selectJoin[this] ?: mutableSetOf()
            selectPart.add(this.field.model.id)
            selectJoin[this] = selectPart

        }
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(field: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9> {
        this.select(field)
        return Join10(this, this.field.target.field()).also {
            val selectPart = selectJoin[this] ?: mutableSetOf()
            selectPart.add(this.field.model.id)
            selectJoin[this] = selectPart

        }
    }

    override fun <T : Any> RealModelField<M, T>.select() {
        slice.add(this)
    }

    private fun <M1 : Model<M1>, T : Any> JoinStatementPart<M1>.mergeSelect(field: RealModelField<M1, T>): RealModelField<M1, T> {
        val selectPart = selectJoin[this] ?: mutableSetOf()
        selectPart.add(field)
        selectJoin[this] = selectPart
        return field
    }

    override fun <M1 : Model<M1>, T : Any> Many2OneField<M, M1>.select(field: M1.() -> RealModelField<M1, T>): RealModelField<M1, T> {
        return Join2(this).mergeSelect(this.target.field())
    }

    fun <M1 : Model<M1>, T : Any> Join2<M, M1>.select(field: M1.() -> RealModelField<M1, T>): RealModelField<M1, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, T : Any> Join3<M, M1, M2>.select(field: M2.() -> RealModelField<M2, T>): RealModelField<M2, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, T : Any> Join4<M, M1, M2, M3>.select(field: M3.() -> RealModelField<M3, T>): RealModelField<M3, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, T : Any> Join5<M, M1, M2, M3, M4>.select(field: M4.() -> RealModelField<M4, T>): RealModelField<M4, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, T : Any> Join6<M, M1, M2, M3, M4, M5>.select(field: M5.() -> RealModelField<M5, T>): RealModelField<M5, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, T : Any> Join7<M, M1, M2, M3, M4, M5, M6>.select(field: M6.() -> RealModelField<M6, T>): RealModelField<M6, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, T : Any> Join8<M, M1, M2, M3, M4, M5, M6, M7>.select(field: M7.() -> RealModelField<M7, T>): RealModelField<M7, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, T : Any> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.select(field: M8.() -> RealModelField<M8, T>): RealModelField<M8, T> {
        return this.mergeSelect(this.field.target.field())
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>, T : Any> Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.select(field: M9.() -> RealModelField<M9, T>): RealModelField<M9, T> {
        return this.mergeSelect(this.field.target.field())
    }
}