package org.platypus.old.module.reference

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.orm.ReferenceOption
import org.platypus.orm.exceptions.OnDeleteRestrictError
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

private object Model1s : Model<Model1s>("test.model1") {

    val m2oModel2 = many2one("m2oModel2", Model2s) {
        onDelete = ReferenceOption.RESTRICT
    }
}

private val PlatypusEnvironment.model1Repo: RecordRepository<Model1s>
    get() = RecordRepositoryImpl(this, Model1s)

private var Record<Model1s>.m2oModel2 by Model1s.m2oModel2

private object Model2s : Model<Model2s>("test.model2")

private val PlatypusEnvironment.model2Repo: RecordRepository<Model2s>
    get() = RecordRepositoryImpl(this, Model2s)


private object onRestrictModule : ModuleBuilder("restrictModule", {
    models {
        +Model1s
        +Model2s
    }
})

val data = data(ModuleDataType.DEMO) {
    val em1 = env.model1Repo.newData("em1") {
        name = "em1"
    }
    val em2 = env.model2Repo.newData("em2") {
        name = "em2"
    }
    em1.m2oModel2 = em2
}

class OneDeleteRestrictFailSpeck : Spek({
    describe("ON delete a record referenced with a RESTRICT Many2One thenthe cache should  do the job") {
        given("A fake module With all data in cache") {
            val env = Platypus.newTest(onRestrictModule).newEnv()
            data.loadData(env)
            on("Delete 'em1'") {
                it("Should Raise an error") {
                    assertThrows<OnDeleteRestrictError> { env.model2Repo["em2"].delete() }
                }
            }
        }
    }
})

class OneDeleteRestrictNoFailSpeck : Spek({
    describe("ON delete a record referenced with a RESTRICT Many2One thenthe cache should  do the job") {
        given("A fake module With all data in cache") {
            val env = Platypus.newTest(onRestrictModule).newEnv()
            data.loadData(env)
            on("Delete 'em1'") {
                env.model1Repo["em1"].delete()
                it("Possible to delete 'em2' without exceptions") {
                    env.model2Repo["em2"].delete()
                }
            }
        }
    }
})