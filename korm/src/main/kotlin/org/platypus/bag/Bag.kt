package org.platypus.bag

import org.platypus.Environmentable
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.repository.RecordRepositoryImpl

fun <M : Model<M>> bagOf(vararg entities: Record<M>): Bag<M> {
    return RecordRepositoryImpl(entities.first().env, entities.first().model).bagOf(entities.map { it.id })
}

interface Bag<M : Model<M>> : MutableCollection<Record<M>>, Environmentable {
    val ids: Collection<Int>
    val model: M

    fun filter(predicate: (Record<M>) -> Boolean): Bag<M>
    fun removeIf(predicate: (Record<M>) -> Boolean)


    fun deleteIf(filter: (Record<M>) -> Boolean): Int {
        TODO()
    }

    fun delete(): Int {
        TODO()
    }

    /**
     * Return a Mutable Bag of the current Bag
     * @see MutableBag
     */
    fun toMutableBag(): MutableBag<M>

    operator fun plus(other: Record<M>): Bag<M>
    operator fun plus(other: Bag<M>): Bag<M>

    operator fun minus(other: Record<M>): Bag<M>
    operator fun minus(other: Bag<M>): Bag<M>

    fun clone(): Bag<M> = this

//    fun nameGet(): List<String> {
//        return model.nameGet.multi?.call(this)?.results?.values?.toList() ?: emptyList()
//    }
}