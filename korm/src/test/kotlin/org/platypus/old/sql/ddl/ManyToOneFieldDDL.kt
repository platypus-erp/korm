package org.platypus.old.sql.ddl

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.impl.Many2OneField
import org.platypus.orm.ReferenceOption
import org.platypus.orm.database.vendors.DDL_MODE

class ManyToOneFieldDDL {

    @Test
    fun testSimpleManyToOne() {
        val field = Many2OneField("field1", DummyModel, DummyModel2, FieldSlotsImpl(), ReferenceOption.NO_ACTION, null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        Assertions.assertEquals("field1 INTEGER", ddl.fieldDef)
        Assertions.assertEquals("ALTER TABLE dummy_model ALTER COLUMN field1 ADD CONSTRAINT dummy_model2_fk REFERENCES dummy_model2", ddl.constraint.first())
    }

    @Test
    fun testSimpleManyToOneRequired() {
        val field = Many2OneField("field1", DummyModel, DummyModel2, FieldSlotsImpl(required = true), ReferenceOption.NO_ACTION, null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        Assertions.assertEquals("field1 INTEGER NOT NULL", ddl.fieldDef)
        Assertions.assertEquals("ALTER TABLE dummy_model ALTER COLUMN field1 ADD CONSTRAINT dummy_model2_fk REFERENCES dummy_model2", ddl.constraint.first())
    }

    @Test
    fun testSimpleManyToOneOneDeleteSetNull() {
        val field = Many2OneField("field1", DummyModel, DummyModel2, FieldSlotsImpl(), ReferenceOption.SET_NULL, null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        Assertions.assertEquals("field1 INTEGER", ddl.fieldDef)
        Assertions.assertEquals("ALTER TABLE dummy_model ALTER COLUMN field1 ADD CONSTRAINT dummy_model2_fk REFERENCES dummy_model2 ON DELETE SET NULL", ddl.constraint.first())
    }

    @Test
    fun testSimpleManyToOneOneDeleteCascade() {
        val field = Many2OneField("field1", DummyModel, DummyModel2, FieldSlotsImpl(), ReferenceOption.CASCADE, null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        Assertions.assertEquals("field1 INTEGER", ddl.fieldDef)
        Assertions.assertEquals("ALTER TABLE dummy_model ALTER COLUMN field1 ADD CONSTRAINT dummy_model2_fk REFERENCES dummy_model2 ON DELETE CASCADE", ddl.constraint.first())
    }

    @Test
    fun testSimpleManyToOneOneDeleteRestrict() {
        val field = Many2OneField("field1", DummyModel, DummyModel2, FieldSlotsImpl(), ReferenceOption.RESTRICT, null)
        val ddl = field.accept(fieldVisitor, DDL_MODE.CREATE)
        Assertions.assertEquals("field1 INTEGER", ddl.fieldDef)
        Assertions.assertEquals("ALTER TABLE dummy_model ALTER COLUMN field1 ADD CONSTRAINT dummy_model2_fk REFERENCES dummy_model2 ON DELETE RESTRICT", ddl.constraint.first())
    }
}