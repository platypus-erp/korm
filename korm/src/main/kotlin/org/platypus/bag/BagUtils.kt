package org.platypus.bag

import org.platypus.entity.Record
import org.platypus.entity.env
import org.platypus.entity.ids
import org.platypus.entity.model
import org.platypus.model.Model
import org.platypus.repository.RecordRepositoryImpl

fun <M : Model<M>> bagOf(vararg entities: Record<M>): Bag<M> {
    return RecordRepositoryImpl(entities.first().env, entities.first().model).byIds(entities.map { it.id })
}

fun <M : Model<M>> Iterable<Record<M>>.toBag(): Bag<M> {
    return if (this is Bag<*>) {
        this as Bag<M>
    } else {
        ArrayBag(this.env, this.model, this.ids)
    }
}