package org.platypus.old.security.perm.delete

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
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.security.PlatypusGroup
import org.platypus.security.PlatypusUser
import org.platypus.security.name

val group1 = PlatypusGroup("group1")
val simple_user = PlatypusUser("simple_user")

private val dataUserModule = data(ModuleDataType.DEMO, UpdateDataType.ALWAYS) {
    val simpleGroup = group1.addData {
        name = "SimpleGroup"
    }
    val simpleUser = simple_user.addData {
        name = "Simple User"
    }

    val entity1 = env.entity1Repo.newData("entity1") {
        name = "EntityRule"
    }
}

object Group1 : GroupBuilder("group1") {

}

abstract class GroupBuilder(name: String)

private object Model1 : Model<Model1>("model1") {
    init {
        delete.addGroupsAccess(group1)
    }
}
private typealias  Entity1Repository = RecordRepository<Model1>

private val PlatypusEnvironment.entity1Repo: Entity1Repository
    get() = RecordRepositoryImpl(this, Model1)

private object CreateTestModule : ModuleBuilder("perm_read", {
    dependsOf(BaseModule)
    models {
        +Model1
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
        val env = tmpEnv.connect(simple_user)
        val error = assertThrows<PlatypusForbiddenActionGroup> {
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
        val env = tmpEnv.connect(simple_user)
        env.entity1Repo["entity1"].sudo().delete()
        val e = env.entity1Repo.search {
            where {
                it.name ilike "%enti%"
            }
        }
        e.isEmpty() `should equal` true
    }

}