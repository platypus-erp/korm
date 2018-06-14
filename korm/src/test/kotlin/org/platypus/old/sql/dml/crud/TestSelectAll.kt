package org.platypus.old.sql.dml.crud

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.platypus.Platypus
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.literal
import org.platypus.orm.sql.select
import org.platypus.module.blog.UserMokModel

class TestSelectAll {

    @Test
    fun selectAllFieldUser() {
        val platypus = Platypus.create({})
        val env = platypus.newFakeEnv()
        val q = UserMokModel.select(env) { true.literal() eq true.literal() }
        val stmt = q.prepareSQL(QueryBuilder(true))
        println(stmt)
        Assertions.assertTrue(stmt.startsWith("SELECT", true))
        Assertions.assertTrue(UserMokModel.lastPost.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.status.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.id.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.isPremium.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.decoratedName.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.isStaff.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.email.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.email2.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.password.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.size.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.isActive.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.age.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.nums.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.resume.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.profile.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.posts.fieldName !in stmt)
        Assertions.assertTrue(stmt.contains("FROM ${UserMokModel.tableName}", true))
        Assertions.assertTrue(stmt.contains("WHERE", true))
        Assertions.assertTrue(stmt.contains("true = true", true))
    }

    @Test
    fun selectAllFieldUserNoWhere() {
        val platypus = Platypus.create({})
        val env = platypus.newFakeEnv()
        val q = UserMokModel.select(env)
        val stmt = q.prepareSQL(QueryBuilder(true))
        println(stmt)
        Assertions.assertTrue(stmt.startsWith("SELECT", true))
        Assertions.assertTrue(UserMokModel.lastPost.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.status.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.id.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.isPremium.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.decoratedName.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.isStaff.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.email.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.email2.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.password.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.size.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.isActive.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.age.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.nums.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.resume.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.profile.fieldName in stmt)
        Assertions.assertTrue(UserMokModel.posts.fieldName !in stmt)
        Assertions.assertTrue(stmt.contains("FROM ${UserMokModel.tableName}", true))
        Assertions.assertFalse(stmt.contains("WHERE", true))
    }

    @Test
    fun selectIdWhereIdSup10() {
        val platypus = Platypus.create({})
        val env = platypus.newFakeEnv()
        val q = UserMokModel.slice(UserMokModel.id).select(env) {
            UserMokModel.id.greater(10)
        }
        val qb = QueryBuilder(true)
        val stmt = q.prepareSQL(qb)
        assertEquals("SELECT id FROM test_user WHERE id > ?", stmt)
        assertTrue(qb.args.isNotEmpty())
        assertEquals(10, qb.args.first().second)
        println(stmt)
    }
}