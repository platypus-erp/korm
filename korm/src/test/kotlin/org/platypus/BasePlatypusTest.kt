package org.platypus

import org.amshove.kluent.shouldBeNull
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
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

fun org.platypus.v2.env.Platypus.Companion.newTestBlog(action: EnvHolder.() -> Unit) = org.platypus.v2.env.Platypus.Companion.newTest(BaseBlogModule).withNewEnv(action)
fun org.platypus.v2.env.Platypus.Companion.newTestBlogEnv() = org.platypus.v2.env.Platypus.Companion.newTest(BaseBlogModule).newEnv()

fun org.platypus.v2.env.Platypus.Companion.newTest(module: ModuleBuilder): org.platypus.v2.env.Platypus {
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

private fun org.platypus.v2.env.Platypus.withNewEnv(action: EnvHolder.() -> Unit) {
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

val simpleUser = PlatypusUser("simple_user")

val dataUserModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    val simpleUser = simpleUser.addData {
        name = "SimpleUser"
    }
}