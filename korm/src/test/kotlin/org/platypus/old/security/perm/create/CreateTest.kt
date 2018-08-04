package org.platypus.old.security.perm.create

import org.amshove.kluent.`should equal`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.assertThrows
import org.platypus.PlatypusEnvironment
import org.platypus.exceptions.PlatypusForbiddenActionGroup
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.base.BaseModule
import org.platypus.module.data
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.security.PlatypusGroup
import org.platypus.security.PlatypusUser
import org.platypus.security.groups
import org.platypus.security.name
import org.platypus.test.inNewTestEnvironement
import java.time.LocalDate

val Group1 = PlatypusGroup("group1")
val simpleUser = PlatypusUser("simple_user")

val dataUserModule = data(ModuleDataType.DEMO, UpdateDataType.ALWAYS) {
    Group1.addData {
        name = "SimpleGroup"
    }
    simpleUser.addData {
        name = "Simple User"
        groups += Group1
    }
}

private object Model1 : Model<Model1>("model1")

private typealias  Entity1Repository = RecordRepository<Model1>

private val PlatypusEnvironment.entity1Repo: Entity1Repository
    get() = RecordRepositoryImpl(this, Model1)

private object CreateTestModule : ModuleBuilder("perm_create", {
    dependsOf(BaseModule)
    models {
        Model1 config {
            security {
                newSecurityGroup("create_group") {
                    create = true
                    groups += Group1
                }
            }
        }
    }
    datas {
        add(dataUserModule)
    }
})

object CreateGroup : Spek({
    given("An Test environment") {
        CreateTestModule.inNewTestEnvironement {
            on("Creating as Admin user") {
                val e = entity1Repo.new {
                    name = "EntityRule"
                }
                it("Should no error raise") {
                    e.createDate!!.toLocalDate() `should equal` LocalDate.now()
                    e.createUid `should equal` envUser
                    e.writeUid `should equal` envUser
                }
            }
            on("Creating as Simple User") {
                with(connect(simpleUser)) {
                    it("Should raise an error") {
                        val error = assertThrows<PlatypusForbiddenActionGroup> {
                            val e = entity1Repo.new {
                                name = "EntityRule"
                            }
                        }
                        error.methodName `should equal` Model1.create.methodName
                    }
                }
            }
            on("Creating as simple user With sudo Admin") {
                val e = sudo().entity1Repo.new {
                    name = "EntityRule"
                }
                it("Should propely initialized") {
                    e.createUid `should equal` envUser
                    e.writeUid `should equal` envUser
                }
            }
            on("Creating as admin with sudo Simple User") {
                it("Should raise an error") {
                    val error = assertThrows<PlatypusForbiddenActionGroup> {
                        val e = sudo(simpleUser).entity1Repo.new {
                            name = "EntityRule"
                        }
                    }
                    error.methodName `should equal` Model1.create.methodName
                }
            }
        }
    }
})