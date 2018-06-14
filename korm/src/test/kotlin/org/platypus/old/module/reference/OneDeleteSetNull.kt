package org.platypus.old.module.reference

import org.amshove.kluent.`should be null`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.orm.ReferenceOption
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

private object Model3s : Model<Model3s>("test.model3") {

    val m2oModel4 = many2one("m2oModel4", Model4s) {
        onDelete = ReferenceOption.SET_NULL
    }
}

private val PlatypusEnvironment.model3Repo: RecordRepository<Model3s>
    get() = RecordRepositoryImpl(this, Model3s)

private var Record<Model3s>.m2oModel4 by Model3s.m2oModel4

private object Model4s : Model<Model4s>("test.model4")

private val PlatypusEnvironment.model4Repo: RecordRepository<Model4s>
    get() = RecordRepositoryImpl(this, Model4s)


private object onSetNullModule: ModuleBuilder("onSetNullModule",{
    models {
        +Model3s
        +Model4s
    }
})

private val dataSetNull = data(ModuleDataType.DEMO) {
    val em1 = env.model3Repo.newData("em1") {
        name = "em1"
    }
    val em2 = env.model4Repo.newData("em2") {
        name = "em2"
    }
    em1.m2oModel4 = em2
}

class OneDeleteSetNullSpeck : Spek({
    describe("ON delete a record referenced with a RESTRICT Many2One thenthe cache should  do the job") {
        given("A fake module With all data in cache") {
            val env = Platypus.newTest(onSetNullModule).newEnv()
            dataSetNull.loadData(env)
            on("Delete 'em1'") {
                env.model4Repo["em2"].delete()
                it("'em1'.m2oModel4 should be null") {
                    env.model3Repo["em1"].m2oModel4.`should be null`()
                }
            }
        }
    }
})