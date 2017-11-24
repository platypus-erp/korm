package org.platypus.impl.module

import org.platypus.Platypus
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.memory.EmptyMemoryEntity
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.identifiants.withId


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

    fun loadData(env: PlatypusEnvironement) {
        ModuleData(env, type, noUpdate, version).data()
    }

}


class ModuleData(val env: PlatypusEnvironement,
                 private val type: ModuleDataType,
                 private val noUpdate: UpdateDataType,
                 private val version: String) {

    fun <T : PlatypusEntity<T, M>, M : BaseModel<M, T>> EmptyEntity<T, M>.newData(ref: String, init: T.() -> Unit): T {
        val e = this.byRefOrNull(ref)
        val versionData = version.replace(".", "").toInt()
        if (e == null) {
            env.logger.log("$ref -> Create ")
            val r = this.create(true, init)
            env.cr.cache[r.model withId r.id, r.model.externalRef] = ref
            env.cr.cache[r.model withId r.id, r.model.internalVersion] = versionData
            return r
        } else {
            env.logger.log("$ref -> Update $noUpdate")
            when (noUpdate) {
                UpdateDataType.ALWAYS -> {
                    e.init()
                }
                UpdateDataType.ONLY_NO_CHANGE -> TODO()
                UpdateDataType.VERSION_CHECK -> {
                    if (e.internalVersion < versionData) {
                        e.init()
                    }
                }
                else -> {
                    env.logger.log("$ref -> Nothing to do");
                }
            }
        }
        return e
    }

    fun <T : PlatypusEntity<T, M>, M : BaseModel<M, T>> EmptyMemoryEntity<T, M>.newData(ref: String, init: T.() -> Unit): T {
        val r = this.byRefOrNull(ref)
        val versionData = version.replace(".", "").toInt()
        return if(r != null){
            r.init()
            r
        } else {
            val res = this.create(init)
            Platypus.memoryCache()[res.modelID, res.model.externalRef] = ref
            Platypus.memoryCache()[res.modelID, res.model.internalVersion] = versionData
            res
        }
    }


}