package org.platypus.bag

import org.platypus.PlatypusEnvironment
import org.platypus.cache.ModelID
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MultiReferencedField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.query.ORDERBY_TYPE
import org.platypus.repository.RecordRepositoryImpl
import java.util.*

abstract class AbstractBag<M : Model<M>>(
        override val env: PlatypusEnvironment,
        override val model: M
) : Bag<M> {

    protected open val _ids = ArrayList<Int>()
    override val ids: Collection<Int>
        get() = _ids

    abstract fun addId(modelId: ModelID): Boolean
    abstract fun removeId(modelId: ModelID): Boolean

    override fun orderBy(column: ModelField<M, Any>, orderBy: ORDERBY_TYPE): Bag<M> {
        TODO("not implemented")
    }

    override fun orderBy(vararg columns: Pair<ModelField<M, Any>, ORDERBY_TYPE>): Bag<M> {
        TODO("not implemented")
    }

    override fun orderBy(columns: List<Pair<ModelField<M, Any>, ORDERBY_TYPE>>): Bag<M> {
        TODO("not implemented")
    }

    override fun addField(f: RealModelField<M, *>): Bag<M> {
        TODO("not implemented")
    }

    override val size
        get() = _ids.size

    override fun contains(element: Record<M>): Boolean {
        return element.id in _ids
    }

    override fun containsAll(elements: Collection<Record<M>>): Boolean = elements.all { contains(it) }

    override fun isEmpty(): Boolean = _ids.isEmpty()

//    override fun clear() {
//        _ids.forEach { removeId(model of it) }
//    }

    override fun filter(predicate: (Record<M>) -> Boolean): Bag<M> {
        val filtredIds = ArrayList<Int>(this.ids.size)
        for (rec in this) {
            if (predicate(rec)) {
                filtredIds.add(rec.id)
            }
        }
        return createFiltredBag(filtredIds)
    }

//    override fun removeIf(predicate: (Record<M>) -> Boolean) {
//        for (rec in this) {
//            if (predicate(rec)) {
//                remove(rec)
//            }
//        }
//    }

    protected abstract fun createFiltredBag(filtredIds: Collection<Int>): Bag<M>

    override fun iterator(): MutableIterator<Record<M>> = IteratorInMemory(env, model, ids.toMutableList())

//    override fun add(element: Record<M>): Boolean = addId(element.model of element.id)
//
//    override fun addAll(elements: Collection<Record<M>>): Boolean = elements.all { add(it) }
//
//    override fun remove(element: Record<M>): Boolean = removeId(element.model of element.id)
//
//    override fun removeAll(elements: Collection<Record<M>>): Boolean = elements.all { remove(it) }
//
//    override fun retainAll(elements: Collection<Record<M>>): Boolean = _ids.retainAll(elements.map { it.id })

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bag<*>) return false
        if (ids != other.ids) return false
        if (model != other.model) return false
        return true
    }

    override fun hashCode(): Int {
        var result = _ids.hashCode()
        result = 31 * result + model.hashCode()
        return result
    }

    override fun toString(): String {
        return "${model.modelName}(${ids.joinToString(", ")})"
    }

    override fun plus(other: Record<M>): Bag<M> {
        return createFiltredBag(ids + other.id)
    }

    override fun minus(other: Record<M>): Bag<M> {
        return createFiltredBag(ids - other.id)
    }

    override fun plus(other: Bag<M>): Bag<M> {
        return createFiltredBag(ids + other.ids)
    }

    override fun minus(other: Bag<M>): Bag<M> {
        return createFiltredBag(ids - other.ids)
    }
    protected val repository
        get() = RecordRepositoryImpl(env, model)

    override val loaded: Boolean
        get() = TODO("not implemented")

    override fun limit(limit: Int, offset: Int): Bag<M> {
        TODO("not implemented")
    }

    override fun or() {
        TODO("not implemented")
    }

    override fun and() {
        TODO("not implemented")
    }

    override fun deleteIf(filter: (Record<M>) -> Boolean): Bag<M> {
        TODO("not implemented")
    }

    override fun delete(): Int {
        TODO("not implemented")
    }

    override fun <T : Any> mapped(field: SimpleModelField<M, T>): List<T> {
        TODO("not implemented")
    }

    override fun <MT : Model<MT>> mapped(field: ReferencedField<M, MT>): Bag<MT> {
        TODO("not implemented")
    }

    override fun <MT : Model<MT>> mapped(field: MultiReferencedField<M, MT>): Bag<MT> {
        TODO("not implemented")
    }
}