package org.platypus.impl.korm.old.model.property

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.api.config.PlatypusConf
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.model.property.KormIntegerProperty
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.model.property.KormStringProperty
import org.platypus.impl.korm.model.property.slots.KormSlotImpl
import org.platypus.impl.korm.sql.Database
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.intLiteral
import org.platypus.impl.korm.sql.stringLiteral
import org.platypus.impl.korm.sql.transactions.TransactionManager

object TestModel1 : BaseModel<TestModel1, TestEntity1>("test.1")

class TestEntity1(env: PlatypusEnvironement) : PlatypusEntity<TestEntity1, TestModel1>(0, env, TestModel1, { e -> e.Test1 })

val PlatypusEnvironement.Test1: EmptyEntity<TestEntity1, TestModel1>
    get() = EmptyEntity(this, TestModel1, { _, env -> TestEntity1(env) })


object TestModel2 : BaseModel<TestModel2, TestEntity2>("test.2")
class TestEntity2(env: PlatypusEnvironement) : PlatypusEntity<TestEntity2, TestModel2>(0, env, TestModel2, { e -> e.Test2 })

val PlatypusEnvironement.Test2: EmptyEntity<TestEntity2, TestModel2>
    get() = EmptyEntity(this, TestModel2, { _, env -> TestEntity2(env) })


class TestSlot {

    lateinit var ctx: Transaction
    @Before
    fun before() {
        val conf = PlatypusConf()
        Database.connect(conf.urlDb, conf.driverDb, conf.userDb, conf.passwordDb)
        ctx = TransactionManager.currentOrNew()
    }

    @After
    fun after() {
        ctx.rollback()
    }

    private fun <T> TestModel1.assertStmt(expected: String, prop: KormProperty<TestModel1, T>) {
        prop.createColumn(this.internalTable)
        val stmt = prop.column.descriptionDdl()
        assert(stmt.split(" ").containsAll(expected.split(" "))) {
            " the stmt \"$stmt\" don't contains all the word of ${expected.split(" ")}"
        }
    }

    private fun <T> TestModel2.assertStmt(expected: String, prop: KormProperty<TestModel1, T>) {
        prop.createColumn(this.internalTable)
        val stmt = prop.column.descriptionDdl()
        assert(stmt.split(" ").containsAll(expected.split(" "))) {
            " the stmt \"$stmt\" don't contains all the word of ${expected.split(" ")}"
        }
    }

    @Test
    fun testString() {
        val prop = KormStringProperty(TestModel1, KormSlotImpl("col1", ModelColumnType.STRING))
        TestModel1.assertStmt("col1 VARCHAR(255) NULL", prop)
        prop.slots.required = true
        TestModel1.assertStmt("NOT NULL", prop)
        prop.slots.length = 25
        TestModel1.assertStmt("VARCHAR(25)", prop)
        prop.slots.length = null
        prop.slots.maxSize = 12
        TestModel1.assertStmt("VARCHAR(12)", prop)
        prop.slots.length = 25
        TestModel1.assertStmt("VARCHAR(25)", prop)
        prop.slots.defaultValue = stringLiteral("DEF")
        TestModel1.assertStmt("DEFAULT 'DEF'", prop)
    }

    @Test
    fun testInteger() {
        val prop = KormIntegerProperty(TestModel1, KormSlotImpl("col1", ModelColumnType.INTEGER))
        TestModel1.assertStmt("col1 INT NULL", prop)
        prop.slots.required = true
        TestModel1.assertStmt("NOT NULL", prop)
        prop.slots.defaultValue = intLiteral(6)
        TestModel1.assertStmt("DEFAULT 6", prop)
    }
}