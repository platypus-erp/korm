package org.platypus.module

import org.platypus.PlatypusEnvironment
import org.platypus.cache.of
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.repository.RecordRepository


enum class ModuleDataType {
    DEMO, REAL
}

enum class UpdateDataType {
    ALWAYS, NEVER, ONLY_NO_CHANGE, VERSION_CHECK
}

fun data(type: ModuleDataType, noUpdate: UpdateDataType = UpdateDataType.ALWAYS, version: String = "0", data: ModuleData.() -> Unit): ModuleDataHolder {
    return ModuleDataHolder(type, noUpdate, version, data)
}

class ModuleDataHolder(val type: ModuleDataType, val noUpdate: UpdateDataType, val version: String, val data: ModuleData.() -> Unit) {

    fun loadData(env: PlatypusEnvironment) {
        ModuleData(env, type, noUpdate, version).data()
    }

}


class ModuleData(val env: PlatypusEnvironment,
                 private val type: ModuleDataType,
                 private val noUpdate: UpdateDataType,
                 private val version: String) {

    fun <M : Model<M>> RecordRepository<M>.newData(ref: String, init: Record<M>.() -> Unit): Record<M> {
        val e = this.byRefOrNull(ref)
        val versionData = version.replace(".", "").toInt()
        if (e == null) {
            env.logger.info("$ref -> Create ")
            val r = this.new(true, init)
            env.internal.cache[r.model of r.id, r.model.externalRef] = ref
            return r
        } else {
            env.logger.info("$ref -> Update $noUpdate")
            when (noUpdate) {
                UpdateDataType.ALWAYS -> {
                    e.init()
                }
                UpdateDataType.ONLY_NO_CHANGE -> TODO()
                UpdateDataType.VERSION_CHECK -> {
//                    if (e.internalVersion ?: 0 < versionData) {
//                        e.init()
//                    }
                }
                else -> {
                    env.logger.info("$ref -> Nothing to do");
                }
            }
        }
        return e
    }


}