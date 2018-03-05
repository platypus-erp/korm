package org.platypus.apimodel

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.base.BaseModule
import org.platypus.newTest
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

private object Model1 : Model<Model1>("model1") {
    init {
        update.addExtend { entity1, fieldsWrited ->
            if (entity1.model.name in fieldsWrited) {
                entity1.name = "TOTO"
            }
            entity1.callSuper(fieldsWrited)
        }
    }
}

private typealias Entity1 = Record<Model1>
private typealias Entity1Repository = RecordRepository<Model1>
private val PlatypusEnvironment.entity1Repo: Entity1Repository
    get() = RecordRepositoryImpl(this, Model1)

private object CreateTestModule : ModuleBuilder("perm_create", {
    dependsOf { setOf(BaseModule) }
    models {
        add(Model1)
    }
})

class TestUpdate {

    @Test
    fun testUpdate() {
        val platypus = Platypus.newTest(CreateTestModule)
        val env = platypus.newEnv()
        val e = env.entity1Repo.new {
            name = "EntityRule"
        }
        assertThrows<IllegalStateException> {
            e.name = "TITI"
        }
    }
}