package org.platypus.bag

import org.platypus.PlatypusEnvironment
import org.platypus.cache.ModelID
import org.platypus.cache.of
import org.platypus.entity.Record
import org.platypus.entity.RecordImpl
import org.platypus.model.Model
import org.platypus.repository.RecordRepositoryImpl
import java.util.*
import java.util.function.Consumer

abstract class AbstractBag<M : Model<M>>(
        override val env: PlatypusEnvironment,
        override val model: M
) : MutableBag<M> {


    override fun toMutableBag(): MutableBag<M> {
        return this
    }

    protected open val _ids = ArrayList<Int>()
    override val ids: Collection<Int>
        get() = _ids

    abstract fun addId(modelId: ModelID): Boolean
    abstract fun removeId(modelId: ModelID): Boolean


    override val size
        get() = _ids.size

    override fun contains(element: Record<M>): Boolean {
        return element.id in _ids
    }

    override fun containsAll(elements: Collection<Record<M>>): Boolean = elements.all { contains(it) }

    override fun isEmpty(): Boolean = _ids.isEmpty()

    override fun clear() {
        _ids.forEach { removeId(model of it) }
    }

    override fun filter(predicate: (Record<M>) -> Boolean): Bag<M> {
        val filtredIds = ArrayList<Int>(this.ids.size)
        for (rec in this) {
            if (predicate(rec)) {
                filtredIds.add(rec.id)
            }
        }
        return createFiltredBag(filtredIds)
    }

    override fun removeIf(predicate: (Record<M>) -> Boolean) {
        for (rec in this) {
            if (predicate(rec)) {
                remove(rec)
            }
        }
    }

    protected abstract fun createFiltredBag(filtredIds: Collection<Int>): Bag<M>

    override fun iterator(): MutableIterator<Record<M>> = BagIterator(ids.toMutableList())

    override fun add(element: Record<M>): Boolean = addId(element.model of element.id)

    override fun addAll(elements: Collection<Record<M>>): Boolean = elements.all { add(it) }

    override fun remove(element: Record<M>): Boolean = removeId(element.model of element.id)

    override fun removeAll(elements: Collection<Record<M>>): Boolean = elements.all { remove(it) }

    override fun retainAll(elements: Collection<Record<M>>): Boolean = _ids.retainAll(elements.map { it.id })

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
        add(other)
        return clone()
    }

    override fun minus(other: Record<M>): Bag<M> {
        remove(other)
        return clone()
    }

    override fun plus(other: Bag<M>): Bag<M> {
        addAll(other)
        return clone()
    }

    override fun minus(other: Bag<M>): Bag<M> {
        removeAll(other)
        return clone()
    }
    protected val repository
        get() = RecordRepositoryImpl(env, model)

    private inner class BagIterator(ids: MutableCollection<Int>) : MutableIterator<Record<M>> {
        private val iterator = ids.iterator()
        private var currentId = -1

        init {
            repository.browse(ids)
        }

        operator override fun next(): Record<M> {
            currentId = iterator.next()
            return RecordImpl(currentId, env, model)
        }

        override fun hasNext(): Boolean {
            return iterator.hasNext()
        }

        override fun remove() {
            removeId(model of currentId)
            iterator.remove()
        }

        override fun forEachRemaining(action: Consumer<in Record<M>>) {
            Objects.requireNonNull<Consumer<in Record<M>>>(action)
            while (hasNext())
                action.accept(next())
        }
    }
}