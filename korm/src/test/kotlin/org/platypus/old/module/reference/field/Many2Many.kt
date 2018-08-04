package org.platypus.old.module.reference.field

import org.amshove.kluent.`should be empty`
import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.jupiter.api.Test
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.model.ModelMany2Many.getValue
import org.platypus.model.many2manyLink
import org.platypus.module.ModuleBuilder
import org.platypus.newTest
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.utils.containsOrFalse

private val ModelMany2Many.linkTest by M2M1Model many2manyLink M2M2Model

private object M2M1Model : Model<M2M1Model>("test.m2m1") {

    val m2o = many2many("m2m1", { linkTest })
}

private val PlatypusEnvironment.m2m1Repo: RecordRepository<M2M1Model>
    get() = RecordRepositoryImpl(this, M2M1Model)

private var Record<M2M1Model>.m2m1 by M2M1Model.m2o

private object M2M2Model : Model<M2M2Model>("test.m2m2") {

    val o2m = many2manyR("m2m2", { linkTest })
}

private val PlatypusEnvironment.m2m2Repo: RecordRepository<M2M2Model>
    get() = RecordRepositoryImpl(this, M2M2Model)

private var Record<M2M2Model>.m2m2 by M2M2Model.o2m

private object many2manyModule : ModuleBuilder("restrictModule", {
    models {
        +M2M1Model
        +M2M2Model
    }
})


class AutoValueBetweenM2M1andM2M2Field {

    @Test
    fun test1() {
        val env = Platypus.newTest(many2manyModule).newEnv()
        val m2m1E = env.m2m1Repo.newTmp {
            name = "em1"
        }
        val m2m2E = env.m2m2Repo.newTmp {
            name = "em2"
        }
        m2m1E.m2m1.`should be empty`()
        m2m2E.m2m2.`should be empty`()
    }

    @Test
    fun test2() {
        val env = Platypus.newTest(many2manyModule).newEnv()
        val m2m1E = env.m2m1Repo.newTmp {
            name = "em1"
        }
        val m2m2E = env.m2m2Repo.newTmp {
            name = "em2"
        }
        m2m1E.m2m1 += m2m2E

        m2m1E.m2m1.shouldNotBeEmpty()
        m2m1E.m2m1.size `should equal` 1
        m2m1E.m2m1.first() `should equal` m2m2E


        m2m2E.m2m2.shouldNotBeEmpty()
        m2m2E.m2m2.size `should equal` 1
        m2m2E.m2m2.first() `should equal` m2m1E
    }

    @Test
    fun test3() {
        val env = Platypus.newTest(many2manyModule).newEnv()
        val m2m1E = env.m2m1Repo.newTmp {
            name = "em1"
        }
        val m2m2E = env.m2m2Repo.newTmp {
            name = "em2"
        }
        m2m2E.m2m2 += m2m1E
        m2m2E.m2m2.size `should equal` 1
        m2m1E.m2m1.size `should equal` 1
        m2m1E.m2m1.first() `should equal` m2m2E
    }

    @Test
    fun test4() {
        val env = Platypus.newTest(many2manyModule).newEnv()
        val m2m1E1 = env.m2m1Repo.newTmp {
            name = "em1"
        }
        val m2m1E2 = env.m2m1Repo.newTmp {
            name = "em2"
        }
        val m2m1E3 = env.m2m1Repo.newTmp {
            name = "em3"
        }
        val m2m2E = env.m2m2Repo.newTmp {
            name = "em2"
        }
        m2m2E.m2m2 = m2m1E1 + m2m1E2
        m2m1E1.m2m1.first() `should equal` m2m2E
        m2m1E2.m2m1.first() `should equal` m2m2E
        m2m1E3.m2m1.shouldBeEmpty()

        m2m2E.m2m2.size `should equal` 2

        m2m1E3.m2m1 = m2m2E.toBag()

        m2m2E.m2m2.size `should equal` 3

//        m2m1E1.m2m1.toMutableBag().clear()

        m2m2E.m2m2.size `should equal` 2

        m2m1E1.m2m1.shouldBeEmpty()
        m2m1E2.m2m1.first() `should equal` m2m2E
        m2m1E3.m2m1.first() `should equal` m2m2E
    }


    @Test
    fun test5() {
        val env = Platypus.newTest(many2manyModule).newEnv()
        val m2m1E1 = env.m2m1Repo.newTmp {
            name = "em1"
        }
        val m2m1E2 = env.m2m1Repo.newTmp {
            name = "em2"
        }
        val m2m1E3 = env.m2m1Repo.newTmp {
            name = "e3"
        }
        val m2m2E = env.m2m2Repo.newTmp {
            name = "em2"
        }
        m2m2E.m2m2 = m2m1E1 + m2m1E2 + m2m1E3
        m2m1E1.m2m1.first() `should equal` m2m2E
        m2m1E2.m2m1.first() `should equal` m2m2E
        m2m1E3.m2m1.first() `should equal` m2m2E
        m2m2E.m2m2.size `should equal` 3

        val filtered = m2m2E.m2m2.filter { it.name.containsOrFalse("em") }

        filtered.size `should equal` 2

        m2m1E3.name = "em3"

        filtered.size `should equal` 2
    }

    @Test
    fun test6() {
        val env = Platypus.newTest(many2manyModule).newEnv()
        val m2m1E1 = env.m2m1Repo.newTmp {
            name = "em1"
        }
        val m2m1E2 = env.m2m1Repo.newTmp {
            name = "em2"
        }
        val m2m1E3 = env.m2m1Repo.newTmp {
            name = "e3"
        }
        val m2m2E = env.m2m2Repo.newTmp {
            name = "em2"
        }
        m2m2E.m2m2 = m2m1E1 + m2m1E2 + m2m1E3
        m2m1E1.m2m1 `should equal` m2m2E.toBag()
        m2m1E2.m2m1 `should equal` m2m2E.toBag()
        m2m1E3.m2m1 `should equal` m2m2E.toBag()
        m2m2E.m2m2.size `should equal` 3

        val filtered = m2m2E.m2m2.filter { it.name.containsOrFalse("em") }

//        m2m2E.m2m2.removeIf { it.name.containsOrFalse("em") }

        m2m2E.m2m2.size `should equal` 1
        m2m2E.m2m2.first().name `should equal` "e3"
    }
}