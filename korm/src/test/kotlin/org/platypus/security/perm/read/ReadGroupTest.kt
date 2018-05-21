package org.platypus.security.perm.read

import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.exceptions.PlatypusForbiddenActionGroup
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

val GroupData.group1
    get() = env.groupsRepo["group1"]

val dataUserModule = data(ModuleDataType.DEMO, UpdateDataType.ALWAYS) {
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
        otherSearch.addGroups { group1.toBag() }
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

class CreateTest {

    @Test
    fun readAsAdmin() {
        val platypus = Platypus.newTest(CreateTestModule)
        val env = platypus.newEnv()
        val e = env.entity1Repo.search {
            where {
                it.name ilike "%enti%"
            }
        }
        e.size `should equal` 1
        e.first().name `should equal` "EntityRule"
    }

    @Test
    fun readAsSimpleUser() {
        val platypus = Platypus.newTest(CreateTestModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        val error = assertThrows<PlatypusForbiddenActionGroup> {
            env.entity1Repo.search {
                where {
                    it.name ilike "%enti%"
                }
            }
        }
        error.methodName `should equal` Model1.otherSearch.methodName
    }

    @Test
    fun readAsSimpleUserSudoAdmin() {
        val platypus = Platypus.newTest(CreateTestModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        val e = env.entity1Repo.sudo().search {
            where {
                it.name ilike "%enti%"
            }
        }
        e.size `should equal` 1
        e.first().name `should equal` "EntityRule"
    }

}