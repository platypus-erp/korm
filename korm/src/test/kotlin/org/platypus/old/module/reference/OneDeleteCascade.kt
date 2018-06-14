package org.platypus.old.module.reference

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.orm.ReferenceOption
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.utils.EntityNotFoundByRef

private object Model5s : Model<Model5s>("test.model5") {

    val m2oModel6 = many2one("m2oModel6", Model6s) {
        onDelete = ReferenceOption.CASCADE
    }
}

private val PlatypusEnvironment.model5Repo: Model5Repo
    get() = RecordRepositoryImpl(this, Model5s)


private typealias Model5 = Record<Model5s>
private typealias Model5Bag = Bag<Model5s>
private typealias Model5Repo = RecordRepository<Model5s>

private var Model5.m2oModel6 by Model5s.m2oModel6

private object Model6s : Model<Model6s>("test.model6")

private val PlatypusEnvironment.model6Repo: Model6Repo
    get() = RecordRepositoryImpl(this, Model6s)

private typealias Model6 = Record<Model6s>
private typealias Model6Bag = Bag<Model6s>
private typealias Model6Repo = RecordRepository<Model6s>



private object onCascadeModule : ModuleBuilder("restrictModule", {
    models {
        +Model5s
        +Model6s
    }
})

private val dataCascade = data(ModuleDataType.DEMO) {
    val em1 = env.model5Repo.newData("em1") {
        name = "em1"
    }
    val em2 = env.model6Repo.newData("em2") {
        name = "em2"
    }
    em1.m2oModel6 = em2
}

class OneDeleteCascadeSpeck : Spek({
    describe("ON delete a record referenced with a RESTRICT Many2One then the cache should  do the job") {
        given("A fake module With all data in cache") {
            val env = Platypus.newTest(onCascadeModule).newEnv()
            dataCascade.loadData(env)
            on("Delete 'em1'") {
                env.model6Repo["em2"].delete()
                it("'em1' should be deleted") {
                    assertThrows<EntityNotFoundByRef> { env.model5Repo["em1"] }
                }
            }
        }
    }
})