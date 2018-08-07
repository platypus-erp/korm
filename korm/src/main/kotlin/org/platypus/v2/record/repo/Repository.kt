package org.platypus.v2.record.repo

import org.platypus.ContextAble
import org.platypus.Environmentable
import org.platypus.SudoAble
import org.platypus.model.Model
import org.platypus.repository.RecordRepository

/**
 * A Repository is the class used to access to the persitence layer
 * You can add method to the Repository of a Model by using [ModelFunction.empty](api.empty)
 */
interface RecordRepository<M : Model<M>> : Environmentable, SudoAble<RecordRepository<M>>, ContextAble<RecordRepository<M>> {

}