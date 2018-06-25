package org.platypus.bag

import org.platypus.PlatypusEnvironment
import org.platypus.cache.ModelID
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField

class ArrayBag<M : Model<M>>(env: PlatypusEnvironment, override val model: M, ids: Collection<Int>) : AbstractBag<M>(env, model) {


    override val _ids = ArrayList(ids)

    override fun addId(modelId: ModelID): Boolean = _ids.add(modelId.id)

    override fun removeId(modelId: ModelID): Boolean = _ids.remove(modelId.id)

//    override fun clear() {
//        _ids.clear()
//    }

    override fun get(index: Int): Record<M> {
        TODO("not implemented")
    }

    override fun indexOf(element: Record<M>): Int {
        TODO("not implemented")
    }

    override fun lastIndexOf(element: Record<M>): Int {
        TODO("not implemented")
    }

    override fun listIterator(): ListIterator<Record<M>> {
        TODO("not implemented")
    }

    override fun listIterator(index: Int): ListIterator<Record<M>> {
        TODO("not implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Record<M>> {
        TODO("not implemented")
    }

    override fun <T : Any> mapped(field: SimpleModelField<M, T>): List<T> {
        TODO("not implemented")
    }

    override fun <MT : Model<MT>> mapped(field: ReferencedField<M, MT>): Bag<MT> {
        TODO("not implemented")
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<M> {
        return ArrayBag(env, model, filtredIds)
    }


}