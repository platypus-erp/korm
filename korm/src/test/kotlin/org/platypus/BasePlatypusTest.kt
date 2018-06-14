package org.platypus

import org.amshove.kluent.shouldBeNull
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.base.entities.UserData
import org.platypus.module.base.entities.users
import org.platypus.module.blog.BaseBlogModule
import org.platypus.module.data
import org.platypus.orm.sql.ddl.schema.SchemaCreator
import org.platypus.orm.sql.dml.StatementType
import org.platypus.security.PlatypusUser
import org.platypus.security.name

fun dropDb(module: ModuleBuilder) {
    Platypus.create {
        loadModule = module
        debug = true
        mode = ServerMode.TEST
        startServerWeb = false
        loadData = false
        web {
            autoStart = false
        }
        db {
            dbName = "platypus_test"
            noUpdateSchema = true
        }
    }.newEnv().use {
        SchemaCreator.create(it.internal).drop(ErpModule.models)
    }
}

fun Platypus.Companion.newTestBlog(action: EnvHolder.() -> Unit) = Platypus.Companion.newTest(BaseBlogModule).withNewEnv(action)

fun Platypus.Companion.newTest(module: ModuleBuilder): Platypus {
    return create {
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
}

private fun Platypus.withNewEnv(action: EnvHolder.() -> Unit) {
    val holder = EnvHolder(newEnv())
    holder.action()
    holder.env.close()
}

class EnvHolder(val env: PlatypusEnvironment) {

    fun assertNoDMLRunned() {
        env.internal.cr.stat.map[StatementType.SELECT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.INSERT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
    }

    fun assertNoDMLWriteRunned() {
        env.internal.cr.stat.map[StatementType.INSERT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
    }

    fun assertNoDDLRuned() {
        env.internal.cr.stat.map[StatementType.ALTER].shouldBeNull()
        env.internal.cr.stat.map[StatementType.GRANT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.OTHER].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DROP].shouldBeNull()
        env.internal.cr.stat.map[StatementType.CREATE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.TRUNCATE].shouldBeNull()
    }
}

val UserData.simpleUser
    get() = env.users["simple_user"]

val simpleUser = PlatypusUser("simple_user")

val dataUserModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    val simpleUser = simpleUser.addData {
        name = "SimpleUser"
    }
}