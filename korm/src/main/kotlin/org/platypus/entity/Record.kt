package org.platypus.entity

import org.platypus.ContextAble
import org.platypus.Environmentable
import org.platypus.SudoAble
import org.platypus.model.IModel

interface Record<M : IModel<M>> : SudoAble<Record<M>>, ImutableRecord<M>, ContextAble<Record<M>>, MutableRecordDelegate<M>, Environmentable {

    //    TODO To remove ?
    override var name: String?
    override val archived: Boolean

    val api: PrivateApi<M>

    /**
     * Remove the entity of the database
     * put the [internalState] to [EntityState.DELETED]
     */
    fun delete()

    operator fun set(fieldName:String, value:Any?)
}

class PrivateApi<M : IModel<M>>(val rec:Record<M>)