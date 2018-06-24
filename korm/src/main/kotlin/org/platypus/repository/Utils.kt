package org.platypus.repository

import org.platypus.cache.ModelID
import org.platypus.cache.modelID
import org.platypus.cache.of
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.module.base.models.Users
import java.time.LocalDateTime

/**
 * Update or create a Record with the [init] values
 *
 * if the [id] is null the a new record is created et the [init] is applyed on it
 * if the [id] not null then the corresponding record is update with the [init] values
 * if the [id] don't exist in the cache then a new record is created,
 * if you want to update the corresponding database record then call [PlatypusEntity.store] on it
 *
 * @param id the optianal id of the record
 * @param init the function applyed on the record
 */
internal fun <M : Model<M>> RecordRepository<M>.newTmpWithId(
        useDefault: Boolean,
        forceMagicField: Boolean = true,
        init: Record<M>.() -> Unit
): Record<M> {
    val prototype: Record<M> = if (useDefault) {
        model.newTemporaryWithDefault.call(this)
    } else {
        model.newTemporary.call(this)
    }
    prototype.init()
    if (forceMagicField) {
        env.internal.cache.forceSet(prototype.modelID, model.createDate, LocalDateTime.now())
        env.internal.cache.forceSet(prototype.modelID, model.createUid, Users of env.envUser.getData(env).id)
    }
    return prototype
}

/**
 * Create a fake record inside the cache and a fake id if needed
 * if the [id] is not null et not fake the the cache is not altered
 */
private fun <M : Model<M>> RecordRepository<M>.createFakeRecord(model: M, id: Int? = null): ModelID {
    return env.internal.cache.createFakeRecordIfNeeded(model, id)
}