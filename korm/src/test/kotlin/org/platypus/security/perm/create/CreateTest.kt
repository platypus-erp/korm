package org.platypus.security.perm.create

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
import java.time.LocalDate

val GroupData.group1
    get() = env.groupsRepo["group1"]

val dataUserModule = data(ModuleDataType.DEMO, UpdateDataType.ALWAYS) {
    val simpleGroup = env.groupsRepo.newData("group1") {
        name = "SimpleGroup"
    }
    val simpleUser = env.users.newData("simple_user") {
        name = "Simple User"
    }
}

private object Model1 : Model<Model1>("model1"){
    init {
        create.addGroups { group1.toBag() }
    }
}

private typealias  Entity1Repository = RecordRepository<Model1>

private val PlatypusEnvironment.entity1Repo: Entity1Repository
    get() = RecordRepositoryImpl(this, Model1)

private object CreateTestModule : ModuleBuilder("perm_create", {
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
    fun CreateAsAdmin() {
        val platypus = Platypus.newTest(CreateTestModule)
        val env = platypus.newEnv()
        val e = env.entity1Repo.new {
            name = "EntityRule"
        }
        e.createDate!!.toLocalDate() `should equal` LocalDate.now()
        e.createUid `should equal` env.envUser
        e.writeUid `should equal` env.envUser
    }

    @Test
    fun CreateAsSimpleUser() {
        val platypus = Platypus.newTest(CreateTestModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        val error  =assertThrows<PlatypusForbiddenAction> {
            val e = env.entity1Repo.new {
                name = "EntityRule"
            }
        }
        error.methodName `should equal` Model1.create.methodName
    }

    @Test
    fun CreateAsSimpleUserSudoAdmin() {
        val platypus = Platypus.newTest(CreateTestModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        val e = env.sudo().entity1Repo.new {
            name = "EntityRule"
        }
        e.createUid `should equal` env.envUser
        e.writeUid `should equal` env.envUser
    }

}