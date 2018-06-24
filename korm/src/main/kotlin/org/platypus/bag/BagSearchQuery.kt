package org.platypus.bag

import org.platypus.PlatypusEnvironment
import org.platypus.cache.modelID
import org.platypus.cache.of
import org.platypus.cache.toModelIDS
import org.platypus.entity.Record
import org.platypus.entity.RecordImpl
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MultiReferencedField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.query.ORDERBY_TYPE
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.utils.filterNotNull
import java.util.stream.Collectors
import java.util.stream.Stream

class BagSearchQuery<M : Model<M>> private constructor(
        private val query: SearchQuery<M>?,
        private var _ids: List<Int>,
        override val env: PlatypusEnvironment,
        override val model: M) : Bag<M> {

    constructor(loader: SearchQuery<M>, env: PlatypusEnvironment, model: M) : this(loader, emptyList(), env, model)
    constructor(_ids: List<Int>, env: PlatypusEnvironment, model: M) : this(null, _ids, env, model)

    override val ids: Collection<Int>
        get() {
            loadQuery()
            return _ids
        }
    override var loaded: Boolean = false

    private fun loadQuery() {
        if (query != null && !loaded) {
            _ids = query.execute()
            loaded = true
        }
    }

    private fun inMemory(ids:Collection<Int>):Bag<M> = BagInMemory(ids, env, model)

//    override fun orderBy(column: ModelField<M, Any>, orderBy: ORDERBY_TYPE) {
//        orderBy(column to orderBy)
//    }
//
//    override fun orderBy(vararg columns: Pair<ModelField<M, Any>, ORDERBY_TYPE>) {
//        orderBy(columns.toList())
//    }
//
//    override fun orderBy(columns: List<Pair<ModelField<M, Any>, ORDERBY_TYPE>>) {
//        if (loaded) {
//            TODO("Create a generic comparator")
////            val comp = RecordComparator(columns)
////            _ids = ids.toStreamRecord()
////                    .sorted(comp)
////                    .toIds()
//        } else {
//            query?.orderBy(columns)
//        }
//    }

//    override fun limit(limit: Int, offset: Int) {
//        if (loaded) {
//            _ids = _ids.toList().subList(limit * offset, limit * (offset + 1))
//        } else {
//            query?.limit(limit, offset)
//        }
//    }
//
//    override fun addField(f: RealModelField<M, *>) {
//        query?.addField(f)
//    }

    override fun plus(other: Record<M>): Bag<M> {
        return BagSearchQuery(ids + other.id, env, model)
    }

    override fun plus(other: Bag<M>): Bag<M> {
        return BagSearchQuery(ids + other.ids, env, model)
    }

    override fun minus(other: Record<M>): Bag<M> {
        return BagSearchQuery(ids - other.id, env, model)
    }

    override fun minus(other: Bag<M>): Bag<M> {
        return BagSearchQuery(ids - other.ids, env, model)
    }

    override fun <T : Any> mapped(field: SimpleModelField<M, T>): List<T> {
        return this.stream()
                .map { env.internal.cache[it.modelID, field].second }
                .filter { it != null }
                .map { it as T }
                .collect(Collectors.toList())
    }

    override fun <MT : Model<MT>> mapped(field: ReferencedField<M, MT>): Bag<MT> {
        return BagSearchQuery(this.stream()
                .map { env.internal.cache[it.modelID, field].second }
                .filterNotNull()
                .collect(Collectors.toList()).toModelIDS().ids, env, field.target)
    }

    override fun <MT : Model<MT>> mapped(field: MultiReferencedField<M, MT>): Bag<MT> {
        val col = this.stream()
                .map { env.internal.cache[it.modelID, field].second }
                .filterNotNull()
                .flatMap { it.ids.stream() }
                .collect(Collectors.toList())
        return BagSearchQuery(col, env, field.target)
    }

    override val size: Int
        get() = ids.size

    override fun contains(element: Record<M>): Boolean = element.id in ids

    override fun containsAll(elements: Collection<Record<M>>): Boolean = ids.containsAll(elements.map { it.id })

    override fun isEmpty(): Boolean = ids.isEmpty()

//    override fun add(element: Record<M>): Boolean {
//        val tmpIds = ids.toMutableList()
//        val res = tmpIds.add(element.id)
//        _ids = tmpIds
//        return res
//    }
//
//    override fun addAll(elements: Collection<Record<M>>): Boolean {
//        val tmpIds = ids.toMutableList()
//        val res = tmpIds.addAll(elements.map { it.id })
//        _ids = tmpIds
//        return res
//    }
//
//    override fun clear() {
//        _ids = emptyList()
//        loaded = false
//    }

    override fun iterator(): MutableIterator<Record<M>> = IteratorInMemory(env, model, ids.toMutableList())

//    override fun remove(element: Record<M>): Boolean {
//        val tmpIds = ids.toMutableList()
//        val res = tmpIds.remove(element.id)
//        _ids = tmpIds
//        return res
//    }
//
//    override fun removeAll(elements: Collection<Record<M>>): Boolean {
//        val tmpIds = ids.toMutableList()
//        val res = tmpIds.removeAll(elements.map { it.id })
//        _ids = tmpIds
//        return res
//    }
//
//    override fun retainAll(elements: Collection<Record<M>>): Boolean {
//        val tmpIds = ids.toMutableList()
//        val res = tmpIds.retainAll(elements.map { it.id })
//        _ids = tmpIds
//        return res
//    }

//    override fun deleteIf(filter: (Record<M>) -> Boolean): Int {
//        return filter { filter(it) }.delete()
//    }

    override fun delete(): Int {
        env.internal.cache.remove(model of ids.toList())
        return model.delete.onMulti.call(this).values.firstOrNull()?.result ?: ids.size
    }

    override fun filter(predicate: (Record<M>) -> Boolean): Bag<M> {
        return BagSearchQuery(
                ids.toStreamRecord()
                        .filter(predicate)
                        .toIds(),
                env,
                model)
    }

    private fun Stream<Record<M>>.toIds(): List<Int> = map(Record<M>::id).collect(Collectors.toList())

    private fun Collection<Int>.toStreamRecord(): Stream<Record<M>> = stream().map { RecordImpl(it, env, model) }

//    override fun removeIf(predicate: (Record<M>) -> Boolean) {
//        _ids -= ids.toStreamRecord().filter(predicate).toIds()
//    }

    override fun orderBy(column: ModelField<M, Any>, orderBy: ORDERBY_TYPE): Bag<M> {
        TODO("not implemented")
    }

    override fun orderBy(vararg columns: Pair<ModelField<M, Any>, ORDERBY_TYPE>): Bag<M> {
        TODO("not implemented")
    }

    override fun orderBy(columns: List<Pair<ModelField<M, Any>, ORDERBY_TYPE>>): Bag<M> {
        TODO("not implemented")
    }

    override fun limit(limit: Int, offset: Int): Bag<M> {
        TODO("not implemented")
    }

    override fun addField(f: RealModelField<M, *>): Bag<M> {
        TODO("not implemented")
    }

    override fun deleteIf(filter: (Record<M>) -> Boolean): Bag<M> {
        TODO("not implemented")
    }

    override fun or() {
        TODO("not implemented")
    }

    override fun and() {
        TODO("not implemented")
    }
}