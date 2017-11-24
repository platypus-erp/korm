package org.platypus.impl.korm.entity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.identifiants.emptyModelIds
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.identifiants.withId
import java.util.*
import java.util.function.Consumer


interface Bag<TE : Entity<TE, *>> : MutableCollection<TE> {
    fun values(): ModelIDS
    val env: PlatypusEnvironement

    fun filter(predicate: (TE) -> Boolean): Bag<TE>

    fun deleteIf(filter: (TE) -> Boolean): Int {
        TODO()
    }

    fun delete(): Int
}

abstract class AbstractBag<TE : Entity<TE, T>, T : BaseModel<T, TE>>(
        override val env: PlatypusEnvironement,
        protected val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<TE, T>
) : Bag<TE> {

    abstract fun addId(modelID: ModelID): Boolean
    abstract fun removeId(modelID: ModelID): Boolean
    protected abstract val model: BaseModel<T, TE>


    override val size
        get() = values().ids.size

    override fun contains(element: TE): Boolean {
        return element.id in values().ids
    }

    override fun containsAll(elements: Collection<TE>): Boolean = elements.all { contains(it) }

    override fun isEmpty(): Boolean = values().isEmpty()


    override fun iterator(): MutableIterator<TE> = BagIterator(values())

    override fun add(element: TE): Boolean = addId(model withId element.id)

    override fun addAll(elements: Collection<TE>): Boolean = elements.all { add(it) }

    override fun clear() = values().ids.clear()

    override fun remove(element: TE): Boolean = removeId(model withId element.id)

    override fun removeAll(elements: Collection<TE>): Boolean = elements.all { remove(it) }

    override fun retainAll(elements: Collection<TE>): Boolean = values().ids.retainAll(elements.map { it.id })

    private inner class BagIterator(ids: ModelIDS) : MutableIterator<TE> {
        private val iterator = ids.ids.iterator()
        private var currentId = -1L
        private val currentModel: BaseModel<*, *> = ids.model

        init {
            factory(env).loadInCache(ids)
        }

        operator override fun next(): TE {
            currentId = iterator.next()
            return factory(env)[currentId]
        }

        override fun hasNext(): Boolean {
            return iterator.hasNext()
        }

        override fun remove() {
            removeId(currentModel withId currentId)
            iterator.remove()
        }

        override fun forEachRemaining(action: Consumer<in TE>) {
            Objects.requireNonNull<Consumer<in TE>>(action)
            while (hasNext())
                action.accept(next())
        }
    }
}

class ArrayBag<ENTITY : Entity<ENTITY, MODEL>, MODEL : BaseModel<MODEL, ENTITY>>(
        env: PlatypusEnvironement,
        override val model: BaseModel<MODEL, ENTITY>,
        factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<ENTITY, MODEL>,
        private val modelIDS: ModelIDS
) : AbstractBag<ENTITY, MODEL>(env, factory) {
    override fun values(): ModelIDS = modelIDS
    override fun addId(modelID: ModelID): Boolean = modelIDS.ids.add(modelID.id)
    override fun removeId(modelID: ModelID): Boolean = modelIDS.ids.remove(modelID.id)

    override fun delete(): Int {
        return model.delete.multi!!.call(this).result

    }

    override fun filter(predicate: (ENTITY) -> Boolean): Bag<ENTITY> {
        val tmp = values().model.emptyModelIds()
        this.filter { predicate(it) }.forEach { tmp.ids.add(it.id) }
        return ArrayBag(env, model, factory, tmp)
    }
}


