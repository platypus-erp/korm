package org.platypus.bag

import org.platypus.PlatypusEnvironment
import org.platypus.cache.modelID
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
import org.platypus.utils.filterNotNull
import java.util.stream.Collectors
import java.util.stream.Stream

class BagInMemory<M : Model<M>>(
        private var _ids: List<Int>,
        override val env: PlatypusEnvironment,
        override val model: M) : Bag<M> {
    override val ids: List<Int>
        get() = _ids
    override val loaded: Boolean = true

    private fun copy(ids:List<Int>):Bag<M> = BagInMemory(ids, env, model)

    override fun filter(predicate: (Record<M>) -> Boolean): Bag<M> = copy(ids.toStreamRecord().filter(predicate).toIds())

    override fun orderBy(column: ModelField<M, Any>, orderBy: ORDERBY_TYPE) = copy(_ids)

    override fun orderBy(vararg columns: Pair<ModelField<M, Any>, ORDERBY_TYPE>) = copy(_ids)

    override fun orderBy(columns: List<Pair<ModelField<M, Any>, ORDERBY_TYPE>>) = copy(_ids)

    override fun limit(limit: Int, offset: Int) = copy(_ids.toList().subList(limit * offset, limit * (offset + 1)))


    override fun addField(f: RealModelField<M, *>) = copy(_ids)

    override fun or() {
        TODO("not implemented")
    }

    override fun and() {
        TODO("not implemented")
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
        return BagInMemory(col, env, field.target)
    }

    override val size: Int
        get() = ids.size

    override fun contains(element: Record<M>): Boolean = element.id in ids

    override fun containsAll(elements: Collection<Record<M>>): Boolean = ids.containsAll(elements.map { it.id })

    override fun isEmpty(): Boolean = ids.isEmpty()

    override fun get(index: Int): Record<M> = RecordImpl(ids.toList()[index], env, model)

    override fun indexOf(element: Record<M>): Int = ids.indexOf(element.id)

    override fun lastIndexOf(element: Record<M>): Int = ids.lastIndexOf(element.id)

    override fun listIterator(): ListIterator<Record<M>> = ListIteratorInMemory(env, model, ids)

    override fun listIterator(index: Int): ListIterator<Record<M>> = ListIteratorInMemory(env, model, ids, index)

    override fun subList(fromIndex: Int, toIndex: Int): Bag<M> = BagInMemory(ids.subList(fromIndex, toIndex), env, model)

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
//    }

    override fun plus(other: Record<M>): Bag<M> = copy(ids + other.id)

    override fun plus(other: Bag<M>): Bag<M>  = copy(ids + other.ids)

    override fun minus(other: Record<M>): Bag<M>  = copy(ids - other.id)

    override fun minus(other: Bag<M>): Bag<M>  = copy(ids - other.ids)

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

    override fun deleteIf(filter: (Record<M>) -> Boolean): Bag<M> {
        val partition = partition(filter)
        model.delete.onMulti.call(partition.second.toBag())
        return copy(partition.first.map { it.id })
    }

    override fun delete(): Int {

        return model.delete.onMulti.call(this).values.firstOrNull()?.result ?: ids.size
    }

    private fun Stream<Record<M>>.toIds(): List<Int> = map(Record<M>::id).collect(Collectors.toList())

    private fun Collection<Int>.toStreamRecord(): Stream<Record<M>> = stream().map { RecordImpl(it, env, model) }
}