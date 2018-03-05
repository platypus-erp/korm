package org.platypus.sql.query.smart

import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test
import org.platypus.Platypus
import org.platypus.applyPrecision
import org.platypus.orm.sql.dml.StatementType
import org.platypus.struct.age
import org.platypus.struct.email
import org.platypus.struct.money
import org.platypus.struct.profile
import org.platypus.struct.userMokRepo
import org.platypus.test.newTest

class SimpleSmartQuery {

    @Test
    fun testBuildSelectCache(){
        val platypus = Platypus.newTest()
        val env = platypus.newFakeEnv()
        val users = env.userMokRepo.search {
            +it.profile.join().age
            +it.profile.join().money
            +it.email
            +it.name

            where {
                (it.profile.join().age eq 23)
            }
        }
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val user = users.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        user.email `should equal` "jane.smith@example.com"
        user.name `should equal` "Jane Smith"
        user.profile?.age `should equal` 23
        user.profile?.money `should equal` 12345.0000.toBigDecimal().applyPrecision()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        println(user.externalRef)
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 2
        println(user.profile?.externalRef)
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
    }


}
