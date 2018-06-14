package org.platypus.old.module.reference.field

import org.amshove.kluent.`should be empty`
import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldBeNull
import org.junit.jupiter.api.Test
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.module.ModuleBuilder
import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.utils.containsOrFalse

private object M2OModel : Model<M2OModel>("test.m2m1") {

    val m2o = many2one("m2m1", O2MModel)
}

private val PlatypusEnvironment.m2oRepo: RecordRepository<M2OModel>
    get() = RecordRepositoryImpl<M2OModel>(this, M2OModel)

private var Record<M2OModel>.m2o by M2OModel.m2o

private object O2MModel : Model<O2MModel>("test.m2m2") {

    val o2m = one2many("m2m2", { M2OModel.m2o })
}

private val PlatypusEnvironment.o2mRepo: RecordRepository<O2MModel>
    get() = RecordRepositoryImpl(this, O2MModel)

private var Record<O2MModel>.o2m by O2MModel.o2m

private object many2OneModule : ModuleBuilder("restrictModule", {
    models {
        add(M2OModel)
        add(O2MModel)
    }
})

private val dataCascade = data(ModuleDataType.DEMO) {
    val em1 = env.m2oRepo.newData("em1") {
        name = "em1"
    }
    val em2 = env.o2mRepo.newData("em2") {
        name = "em2"
    }
    em1.m2o = em2
}

class AutoValueBetweenM2OandO2MField {

    @Test
    fun test1() {
        val env = Platypus.newTest(many2OneModule).newEnv()
        val m2oE = env.m2oRepo.newTmp {
            name = "em1"
        }
        val o2mE = env.o2mRepo.newTmp {
            name = "em2"
        }
        m2oE.m2o.shouldBeNull()
        o2mE.o2m.`should be empty`()
    }

    @Test
    fun test2() {
        val env = Platypus.newTest(many2OneModule).newEnv()
        val m2oE = env.m2oRepo.newTmp {
            name = "em1"
        }
        val o2mE = env.o2mRepo.newTmp {
            name = "em2"
        }
        m2oE.m2o = o2mE
        m2oE.m2o `should equal` o2mE
        o2mE.o2m.size `should equal` 1
    }

    @Test
    fun test3() {
        val env = Platypus.newTest(many2OneModule).newEnv()
        val m2oE = env.m2oRepo.newTmp {
            name = "em1"
        }
        val o2mE = env.o2mRepo.newTmp {
            name = "em2"
        }
        o2mE.o2m.toMutableBag().add(m2oE)
        m2oE.m2o `should equal` o2mE
        o2mE.o2m.size `should equal` 1
    }

    @Test
    fun test4() {
        val env = Platypus.newTest(many2OneModule).newEnv()
        val m2oE1 = env.m2oRepo.newTmp {
            name = "em1"
        }
        val m2oE2 = env.m2oRepo.newTmp {
            name = "em2"
        }
        val m2oE3 = env.m2oRepo.newTmp {
            name = "em3"
        }
        val o2mE = env.o2mRepo.newTmp {
            name = "em2"
        }
        o2mE.o2m = m2oE1 + m2oE2
        m2oE1.m2o `should equal` o2mE
        m2oE2.m2o `should equal` o2mE
        m2oE3.m2o.shouldBeNull()

        o2mE.o2m.size `should equal` 2

        m2oE3.m2o = o2mE

        o2mE.o2m.size `should equal` 3

        m2oE1.m2o = null

        o2mE.o2m.size `should equal` 2

        m2oE1.m2o.shouldBeNull()
        m2oE2.m2o `should equal` o2mE
        m2oE3.m2o `should equal` o2mE
    }

    @Test
    fun test5() {
        val env = Platypus.newTest(many2OneModule).newEnv()
        val m2oE1 = env.m2oRepo.newTmp {
            name = "em1"
        }
        val m2oE2 = env.m2oRepo.newTmp {
            name = "em2"
        }
        val m2oE3 = env.m2oRepo.newTmp {
            name = "e3"
        }
        val o2mE = env.o2mRepo.newTmp {
            name = "em2"
        }
        o2mE.o2m = m2oE1 + m2oE2 + m2oE3
        m2oE1.m2o `should equal` o2mE
        m2oE2.m2o `should equal` o2mE
        m2oE3.m2o `should equal` o2mE
        o2mE.o2m.size `should equal` 3

        val filtered = o2mE.o2m.filter { it.name.containsOrFalse("em") }

        filtered.size `should equal` 2

        m2oE3.name = "em3"

        filtered.size `should equal` 2
    }

    @Test
    fun test6() {
        val env = Platypus.newTest(many2OneModule).newEnv()
        val m2oE1 = env.m2oRepo.newTmp {
            name = "em1"
        }
        val m2oE2 = env.m2oRepo.newTmp {
            name = "em2"
        }
        val m2oE3 = env.m2oRepo.newTmp {
            name = "e3"
        }
        val o2mE = env.o2mRepo.newTmp {
            name = "em2"
        }
        o2mE.o2m = m2oE1 + m2oE2 + m2oE3
        m2oE1.m2o `should equal` o2mE
        m2oE2.m2o `should equal` o2mE
        m2oE3.m2o `should equal` o2mE
        o2mE.o2m.size `should equal` 3

        val filtered = o2mE.o2m.filter { it.name.containsOrFalse("em") }

        o2mE.o2m.removeAll(filtered)


        val set = HashSet<String>()
        set += "tt"

        o2mE.o2m.size `should equal` 1
        o2mE.o2m.first().name `should equal` "e3"
    }
}