package org.platypus

import org.junit.jupiter.api.Test
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.data
import org.platypus.module.base.entities.UserData
import org.platypus.module.base.entities.users
import org.platypus.struct.BlogModule

fun Platypus.Companion.newTest(module: ModuleBuilder): Platypus = create {
    loadModule = module
    debug = true
    mode = ServerMode.TEST
    startServerWeb = false
    loadData = true
    web {
        autoStart = true
    }
    db {
        dbName = "platypus_test"
    }
}
val UserData.simpleUser
    get() = env.users["simple_user"]

val dataUserModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    val simpleUser = env.users.newData("simple_user") {
        name = "SimpleUser"
    }
}
class TEst1 {

    @Test
    fun test1() {
        val platypus = Platypus.create({
            loadModule = BlogModule
            db {
                dbName = "platypus-test"
            }
        })
    }
}