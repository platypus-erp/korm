package org.platypus.sql.dml.predicate

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.platypus.model.field.api.type.BooleanSqlFieldType
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.and
import org.platypus.orm.sql.expression.DefaultSqlExpressionVisitor
import org.platypus.orm.sql.expression.QueryParameter
import org.platypus.orm.sql.literal
import org.platypus.orm.sql.or
import org.platypus.orm.sql.predicate.*
import org.platypus.struct.UserMokModel

class TestPredicateSql {
    val expressionVisitor = object : DefaultSqlExpressionVisitor {
        override fun String.quotedIfNeeded(): String = this

    }

    @Test
    fun testEq() {
        val qb = QueryBuilder()
        val stmt = EqOp(true.literal(), 1.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true = 1", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id eq 1).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id = 1", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testNeq() {
        val qb = QueryBuilder()
        val stmt = NeqOp(true.literal(), 1.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true <> 1", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id neq 1).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id <> 1", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testIsNull() {
        val qb = QueryBuilder()
        val stmt = IsNullOp(true.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true IS NULL", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb2 = QueryBuilder()
        val stmt2 = (true.literal().isNull()).accept(expressionVisitor, qb2)
        Assertions.assertEquals(stmt, stmt2)
        Assertions.assertTrue(qb2.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id.isNull()).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id IS NULL", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testIsNotNull() {
        val qb = QueryBuilder()
        val stmt = IsNotNullOp(true.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true IS NOT NULL", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb2 = QueryBuilder()
        val stmt2 = (true.literal().isNotNull()).accept(expressionVisitor, qb2)
        Assertions.assertEquals(stmt, stmt2)
        Assertions.assertTrue(qb2.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id.isNotNull()).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id IS NOT NULL", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testIn() {
        val qb = QueryBuilder()
        val stmt = InList(UserMokModel.id, listOf(1, 2, 3)).accept(expressionVisitor, qb)
        Assertions.assertEquals("id IN (1, 2, 3)", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb2 = QueryBuilder()
        val stmt2 = (UserMokModel.id.inList(listOf(1, 2, 3))).accept(expressionVisitor, qb2)
        Assertions.assertEquals("id IN (1, 2, 3)", stmt2)
        Assertions.assertTrue(qb2.args.isEmpty())


        val qb3 = QueryBuilder(true)
        val stmt3 = (UserMokModel.id.inList(listOf(1, 2, 3))).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id IN (?, ?, ?)", stmt3)
        Assertions.assertFalse(qb3.args.isEmpty())
        Assertions.assertEquals(3, qb3.args.size)
        Assertions.assertEquals(1, qb3.args[0].second)
        Assertions.assertEquals(2, qb3.args[1].second)
        Assertions.assertEquals(3, qb3.args[2].second)

    }

    @Test
    fun testNotIn() {
        val qb = QueryBuilder()
        val stmt = NotInList(UserMokModel.id, listOf(1, 2, 3)).accept(expressionVisitor, qb)
        Assertions.assertEquals("id NOT IN (1, 2, 3)", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb2 = QueryBuilder()
        val stmt2 = (UserMokModel.id.notInList(listOf(1, 2, 3))).accept(expressionVisitor, qb2)
        Assertions.assertEquals("id NOT IN (1, 2, 3)", stmt2)
        Assertions.assertTrue(qb2.args.isEmpty())


        val qb3 = QueryBuilder(true)
        val stmt3 = (UserMokModel.id.notInList(listOf(1, 2, 3))).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id NOT IN (?, ?, ?)", stmt3)
        Assertions.assertFalse(qb3.args.isEmpty())
        Assertions.assertEquals(3, qb3.args.size)
        Assertions.assertEquals(1, qb3.args[0].second)
        Assertions.assertEquals(2, qb3.args[1].second)
        Assertions.assertEquals(3, qb3.args[2].second)
    }

    @Test
    fun testBetween() {
        val qb = QueryBuilder()
        val stmt = BetweenOp(UserMokModel.id, 1.literal(), 5.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("id BETWEEN 1 AND 5", stmt)
        Assertions.assertTrue(qb.args.isEmpty())
    }

    @Test
    fun testGreeter() {
        val qb = QueryBuilder()
        val stmt = GreaterOp(true.literal(), 1.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true > 1", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id.greater(1)).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id > 1", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testLess() {
        val qb = QueryBuilder()
        val stmt = LessOp(true.literal(), 1.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true < 1", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id.less(1)).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id < 1", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testGreeterEq() {
        val qb = QueryBuilder()
        val stmt = GreaterEqOp(true.literal(), 1.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true >= 1", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id.greaterEq(1)).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id >= 1", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testLessEq() {
        val qb = QueryBuilder()
        val stmt = LessEqOp(true.literal(), 1.literal()).accept(expressionVisitor, qb)
        Assertions.assertEquals("true <= 1", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb3 = QueryBuilder()
        val stmt3 = (UserMokModel.id.lessEq(1)).accept(expressionVisitor, qb3)
        Assertions.assertEquals("id <= 1", stmt3)
        Assertions.assertTrue(qb3.args.isEmpty())
    }

    @Test
    fun testIsNullOrEqFalse() {
        val qb = QueryBuilder()
        val stmt = OrOp(IsNullOp(UserMokModel.age), EqOp(UserMokModel.email2, false.literal()))
                .accept(expressionVisitor, qb)
        Assertions.assertEquals("(age IS NULL OR email2 = false)", stmt)
        Assertions.assertTrue(qb.args.isEmpty())
    }

    @Test
    fun testIsNullOrEqFalsePrepared() {
        val qb = QueryBuilder(true)
        val stmt = OrOp(IsNullOp(UserMokModel.age), EqOp(UserMokModel.email2,
                QueryParameter(BooleanSqlFieldType(), false)))
                .accept(expressionVisitor, qb)
        Assertions.assertEquals("(age IS NULL OR email2 = ?)", stmt)
        Assertions.assertFalse(qb.args.isEmpty())
        Assertions.assertEquals(false, qb.args[0].second)
    }

    @Test
    fun testInList_Or_IsNullAndIsLessEq() {
        val predicate = UserMokModel.age.inList(listOf(1, 2, 3))
                .or(UserMokModel.age.isNull() and UserMokModel.age.lessEq(12))
        val qb = QueryBuilder()
        val stmt = predicate.accept(expressionVisitor, qb)
        Assertions.assertEquals("(age IN (1, 2, 3) OR age IS NULL AND age <= 12)", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb2 = QueryBuilder(true)
        val stmt2 = predicate.accept(expressionVisitor, qb2)
        Assertions.assertEquals("(age IN (?, ?, ?) OR age IS NULL AND age <= ?)", stmt2)
        Assertions.assertFalse(qb2.args.isEmpty())
        Assertions.assertEquals(4, qb2.args.size)
        Assertions.assertEquals(1, qb2.args[0].second)
        Assertions.assertEquals(2, qb2.args[1].second)
        Assertions.assertEquals(3, qb2.args[2].second)
        Assertions.assertEquals(12, qb2.args[3].second)
    }

    @Test
    fun testInListOrIsNull_And_IsLessEq() {
        val predicate = UserMokModel.age.inList(listOf(1, 2, 3))
                .or(UserMokModel.age.isNull()) and UserMokModel.age.lessEq(12)
        val qb = QueryBuilder()
        val stmt = predicate.accept(expressionVisitor, qb)
        Assertions.assertEquals("(age IN (1, 2, 3) OR age IS NULL) AND age <= 12", stmt)
        Assertions.assertTrue(qb.args.isEmpty())

        val qb2 = QueryBuilder(true)
        val stmt2 = predicate.accept(expressionVisitor, qb2)
        Assertions.assertEquals("(age IN (?, ?, ?) OR age IS NULL) AND age <= ?", stmt2)
        Assertions.assertFalse(qb2.args.isEmpty())
        Assertions.assertEquals(4, qb2.args.size)
        Assertions.assertEquals(1, qb2.args[0].second)
        Assertions.assertEquals(2, qb2.args[1].second)
        Assertions.assertEquals(3, qb2.args[2].second)
        Assertions.assertEquals(12, qb2.args[3].second)
    }
}