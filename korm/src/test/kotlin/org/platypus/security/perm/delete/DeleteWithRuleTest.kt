package org.platypus.security.perm.delete

import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.exceptions.PlatypusForbiddenActionRule
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

private object Model1Rule : Model<Model1Rule>("model1") {
    init {
        delete.addGroups { group1.toBag() }
    }
}


private typealias  Entity1Rule = Record<Model1Rule>
private typealias  Entity1RuleRepository = RecordRepository<Model1Rule>
private typealias  Entity1RuleBag = Bag<Model1Rule>
private typealias  Entity1RuleData = DataRef<Model1Rule>

private val PlatypusEnvironment.entity1Repo: Entity1RuleRepository
    get() = RecordRepositoryImpl(this, Model1Rule)

private object CreateTestRuleModule : ModuleBuilder("perm_read", {
    dependsOf { setOf(BaseModule) }
    models {
        add(Model1Rule) {
            security {
                rule("rule1") {
                    delete = true
                    rule = {
                        it.name ilike "%enti%"
                    }
                }
            }
        }
    }
    datas {
        add(dataUserModule)
    }
})

class DeleteWithRuleTest {

    @Test
    fun deleteAsAdmin() {
        val platypus = Platypus.newTest(CreateTestRuleModule)
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
        val platypus = Platypus.newTest(CreateTestRuleModule)
        val tmpEnv = platypus.newEnv()
        val env = tmpEnv.connect(tmpEnv.users["simple_user"])
        val error = assertThrows<PlatypusForbiddenActionRule> {
            env.entity1Repo["entity1"].delete()
        }
        error.rule.uniqueId `should equal` "rule1"
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
        val platypus = Platypus.newTest(CreateTestRuleModule)
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