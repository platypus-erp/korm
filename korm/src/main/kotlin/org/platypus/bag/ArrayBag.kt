package org.platypus.bag

import org.platypus.PlatypusEnvironment
import org.platypus.cache.ModelID
import org.platypus.model.Model

class ArrayBag<M : Model<M>>(env: PlatypusEnvironment, override val model: M, ids: Collection<Int>) : AbstractBag<M>(env, model) {


    override val _ids = ArrayList(ids)

    override fun addId(modelId: ModelID): Boolean = _ids.add(modelId.id)

    override fun removeId(modelId: ModelID): Boolean = _ids.remove(modelId.id)

    override fun clear() {
        _ids.clear()
    }

    override fun toMutableBag(): MutableBag<M> {
        return ArrayBag(env, model, _ids)
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<M> {
        return ArrayBag(env, model, filtredIds)
    }


}