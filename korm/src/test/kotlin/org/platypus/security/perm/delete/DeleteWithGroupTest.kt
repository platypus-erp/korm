package org.platypus.security.perm.delete

import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.exceptions.PlatypusForbiddenAction
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.base.BaseModule
import org.platypus.module.base.entities.GroupData
import org.platypus.module.base.entities.groupsRepo
import org.platypus.module.base.entities.users
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

private val GroupData.group1
    get() = env.groupsRepo["group1"]

private val dataUserModule = data(ModuleDataType.DEMO, UpdateDataType.ALWAYS) {
    val simpleGroup = env.groupsRepo.newData("group1") {
        name = "SimpleGroup"
    }
    val simpleUser = env.users.newData("simple_user") {
        name = "Simple User"
    }

    val entity1 = env.entity1Repo.newData("entity1") {
        name = "EntityRule"
    }
}

private object Model1 : Model<Model1>("model1") {
    init {
        delete.addGroups { group1.toBag() }
    }
}
private typealias  Entity1Repository = RecordRepository<Model1>

private val PlatypusEnvironment.entity1Repo: Entity1Repository
    get() = RecordRepositoryImpl(this, Model1)

private object CreateTestModule : ModuleBuilder("perm_read", {
    dependsOf { setOf(BaseModule) }
    models {
        add(Model1)
    }
    datas {
        add(dataUserModule)
    }
})

class DeleteWithGroupTest {

    @Test
    fun deleteAsAdmin() {
        val platypus = Platypus.newTest(CreateTestModule)
        val env = platypus.newEnv()
        env.entity1Repo["entity1"].delete()
        val e = env.entity1Repo.search {
            where {
                it.name ilike "%enti%"
            }
        }
        e.isEmpty() `should equal` true
    }

    @Test
    fun deleteAsSimpleUser() {
        val platypus = Platypus.newTest(CreateTestModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        val error = assertThrows<PlatypusForbiddenAction> {
            env.entity1Repo["entity1"].delete()
        }
        error.methodName `should equal` Model1.delete.methodName
        val e = env.entity1Repo.search {
            where {
                it.name ilike "%enti%"
            }
        }
        e.size `should equal` 1
        e.first().name `should equal` "EntityRule"
    }

    @Test
    fun deleteAsSimpleUserSudoAdmin() {
        val platypus = Platypus.newTest(CreateTestModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        env.entity1Repo["entity1"].sudo().delete()
        val e = env.entity1Repo.search {
            where {
                it.name ilike "%enti%"
            }
        }
        e.isEmpty() `should equal` true
    }

}