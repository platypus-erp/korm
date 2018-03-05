package org.platypus.test

import org.amshove.kluent.shouldBeNull
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.newTest
import org.platypus.orm.sql.ddl.schema.SchemaCreator
import org.platypus.orm.sql.dml.StatementType
import org.platypus.struct.*

class EnvHolder(val env: PlatypusEnvironment) {

    fun assertNoDMLRunned() {
        env.internal.cr.stat.map[StatementType.SELECT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.INSERT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
    }

    fun assertNoDDLRuned() {
        env.internal.cr.stat.map[StatementType.ALTER].shouldBeNull()
        env.internal.cr.stat.map[StatementType.GRANT].shouldBeNull()
        env.internal.cr.stat.map[StatementType.OTHER].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DROP].shouldBeNull()
        env.internal.cr.stat.map[StatementType.CREATE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.TRUNCATE].shouldBeNull()
    }
}


fun Platypus.withNewEnv(action: EnvHolder.() -> Unit) {
    val holder = EnvHolder(newEnv())
    holder.action()
    holder.env.close()
}

fun Platypus.Companion.newTest(): Platypus = newTest(BlogModule)



fun Platypus.Companion.createAndFlushData() {
    val tmpEnv = newTest().newEnv()
    createData(tmpEnv)
    tmpEnv.flush()
    tmpEnv.close()
}

fun dropDb() {
    val platypus = Platypus.newTest()
    val env = platypus.newEnv()
    SchemaCreator.create(env.internal).drop(platypus.conf.loadModule.module.getModule().models().toList())
    env.close()
}

val dataBlogPost = data(ModuleDataType.DEMO) {
    createData(env)
}

fun createData(env: PlatypusEnvironment): DataTest {
    val janeProfile = env.profileRepo.new {
        age = 23
        money = 12345.toBigDecimal()
//                    street = "165 5th Avenue"
//                    city = "New York"
//                    zip = "0305"
        country = "USA"
    }
    val post1 = env.blogPostRepo.new {
        title = "1st Post"
        content = "Content of first post"
    }
    val post2 = env.blogPostRepo.new {
        title = "2nd Post"
        content = "Content of second post"
    }

    val postsbag = post1 + post2

    janeProfile.bestPost = post1

    val userJane = env.userMokRepo.new {
        name = "Jane Smith"
        email = "jane.smith@example.com"
        profile = janeProfile
        posts = postsbag
        nums = 2
    }

    val tag1 = env.tagRepo.new {
        name = "Tendings"
    }
    val tag2 = env.tagRepo.new {
        name = "Books"
    }
    val tag3 = env.tagRepo.new {
        name = "Jane 's"
    }

    post1.tags = tag1 + tag3
    val mutableTags = post2.tags.toMutableBag()
    mutableTags.clear()
    mutableTags.addAll(tag2 + tag3)

    return DataTest(userJane, janeProfile, post1, post2, tag1, tag2, tag3)
}

data class DataTest(val userJane: UserMok, val janeProfile: Profile,
                    val post1: BlogPost, val post2: BlogPost,
                    val tag1: PostTag, val tag2: PostTag, val tag3: PostTag)