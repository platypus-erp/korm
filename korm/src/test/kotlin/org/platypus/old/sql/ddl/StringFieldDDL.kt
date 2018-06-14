package org.platypus.old.sql.ddl

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.impl.StringField
import org.platypus.orm.OrmConstraint
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.orm.sql.QueryBuilder


class StringFieldDDL {

    private class Constraint1(private val fName: String) : OrmConstraint<String> {
        override val name = "${fName}_constraint1"

        override fun toSQL(query: QueryBuilder) = buildString {
            append(fName).append(" != ").append("\"TOTO\"")
        }

        override fun validate(value: String): Set<String> {
            TODO("not implemented")
        }
    }

    @Test
    fun testStringFieldRequiredNoSlots() {
        val field = StringField("field1", DummyModel, FieldSlotsImpl(), null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        assertEquals("field1 VARCHAR(50)", ddl.fieldDef)
    }

    @Test
    fun testStringFieldRequired() {
        val field = StringField("field1", DummyModel, FieldSlotsImpl(required = true), null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        assertEquals("field1 VARCHAR(50) NOT NULL", ddl.fieldDef)
    }

    @Test
    fun testStringFieldRequiredLenght() {
        val field = StringField("field1", DummyModel, FieldSlotsImpl(required = true), 12)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        assertEquals("field1 VARCHAR(12) NOT NULL", ddl.fieldDef)
    }

    @Test
    fun testStringFieldUnique() {
        val slots = FieldSlotsImpl<String>()
        slots.unique = true
        val field = StringField("field1", DummyModel, slots, 12)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        assertEquals("field1 VARCHAR(12) NOT NULL CONSTRAINT field1_uniq UNIQUE", ddl.fieldDef)
    }

    @Test
    fun testStringWithOneCheckConstraint() {
        val slots = FieldSlotsImpl<String>(required = true)
        slots.constraint.add(Constraint1("field1"))
        val field = StringField("field1", DummyModel, slots, 12)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        assertEquals("field1 VARCHAR(12) NOT NULL CONSTRAINT field1_constraint1 CHECK(field1 != \"TOTO\")", ddl.fieldDef)
        assertEquals(1, field.constraint.size)
    }

    @Test
    fun testStringWithTwoCheckConstraint() {
        val slots = FieldSlotsImpl<String>()
        slots.constraint.add(Constraint1("field1"))
        slots.constraint.add(Constraint1("field1"))
        val field = StringField("field1", DummyModel, slots, 12)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        assertEquals("field1 VARCHAR(12) NOT NULL", ddl.fieldDef)
        assertEquals(2, field.constraint.size)
    }

}
