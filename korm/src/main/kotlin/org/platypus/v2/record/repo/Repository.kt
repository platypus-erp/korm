package org.platypus.v2.record.repo

import org.platypus.ContextAble
import org.platypus.Environmentable
import org.platypus.SudoAble
import org.platypus.v2.model.BaseModel
import org.platypus.v2.record.bag.Bag

/**
 * A Repository is the class used to access to the persitence layer
 * You can add method to the Repository of a Model by using [ModelFunction.empty](api.empty)
 */
interface RecordRepository<M : BaseModel<M>> : Environmentable, SudoAble<RecordRepository<M>>, ContextAble<RecordRepository<M>> {


    fun search(): Bag<M>
}