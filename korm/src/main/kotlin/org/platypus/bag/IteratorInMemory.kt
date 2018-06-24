package org.platypus.bag

import org.platypus.Environmentable
import org.platypus.PlatypusEnvironment
import org.platypus.cache.CacheState
import org.platypus.cache.of
import org.platypus.entity.Record
import org.platypus.entity.RecordImpl
import org.platypus.model.Model
import org.platypus.orm.sql.expression.inList
import org.platypus.orm.sql.query.SearchQueryImpl
import java.util.*
import java.util.function.Consumer

class IteratorInMemory<M : Model<M>>(override val env: PlatypusEnvironment, val model: M, ids: MutableCollection<Int>) : MutableIterator<Record<M>>, Environmentable {
    private val iterator: MutableIterator<Int> = ids.iterator()

    init {
        val missingIdsInCache = ids.filter { env.internal.cache.state(model.of(it)) != CacheState.FETCHED }
        if (missingIdsInCache.isNotEmpty()) {
            SearchQueryImpl(
                    model,
                    env,
                    predicate = model.id inList missingIdsInCache
            ).execute()
        }
    }

    override operator fun next(): Record<M> {
        return RecordImpl(iterator.next(), env, model)
    }

    override fun hasNext(): Boolean {
        return iterator.hasNext()
    }

    override fun remove() {
        iterator.remove()
    }

    override fun forEachRemaining(action: Consumer<in Record<M>>) {
        Objects.requireNonNull<Consumer<in Record<M>>>(action)
        while (hasNext())
            action.accept(next())
    }
}

class ListIteratorInMemory<M : Model<M>>(override val env: PlatypusEnvironment, val model: M, ids: List<Int>, index:Int = 0) : ListIterator<Record<M>>, Environmentable {
    private val iterator: ListIterator<Int> = ids.listIterator(index)

    init {
        val missingIdsInCache = ids.filter { env.internal.cache.state(model.of(it)) != CacheState.FETCHED }
        if (missingIdsInCache.isNotEmpty()) {
            SearchQueryImpl(
                    model,
                    env,
                    predicate = model.id inList missingIdsInCache
            ).execute()
        }
    }

    override operator fun next(): Record<M> = RecordImpl(iterator.next(), env, model)

    override fun hasNext(): Boolean = iterator.hasNext()

    override fun hasPrevious(): Boolean = iterator.hasPrevious()

    override fun nextIndex(): Int = iterator.nextIndex()

    override fun previous(): Record<M> = RecordImpl(iterator.previous(), env, model)

    override fun previousIndex(): Int = iterator.previousIndex()

    override fun forEachRemaining(action: Consumer<in Record<M>>) {
        Objects.requireNonNull<Consumer<in Record<M>>>(action)
        while (hasNext())
            action.accept(next())
    }
}