package org.platypus.old.sql.ddl

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.database.ddl.DefaultDDLFieldCreator
import org.platypus.orm.database.ddl.DefaultDDLModelCreator
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.orm.sql.QueryBuilder
val fieldVisitor = object : DefaultDDLFieldCreator() {
    override fun identity(mod: IModelField<*, *>): String = mod.fieldName

    override fun identity(mod: IModel<*>): String = mod.tableName

    override fun String.inProperCase(): String = this
}
class ClassicModelCreateDDL {
    private val fieldVisitor = object : DefaultDDLFieldCreator() {
        override fun identity(mod: IModelField<*, *>): String = mod.fieldName

        override fun identity(mod: IModel<*>): String = mod.tableName

        override fun String.inProperCase(): String = this
    }
    val modelCreateDDL = object : DefaultDDLModelCreator(acceptIfNotExist = true, fieldVisitor = fieldVisitor) {
        override fun identity(mod: IModelField<*, *>): String = mod.fieldName

        override fun identity(mod: IModel<*>): String = mod.tableName

        override fun String.inProperCase(): String = this
    }

    val q = QueryBuilder()

    @AfterEach
    fun rearDown() {
        DummyModel.clear()
        DummyModel2.clear()
    }

    @Test
    fun noFieldClassicModel() {
        val ddl = DummyModel.accept(modelCreateDDL, DDL_MODE.DROP)
        assertEquals("CREATE TABLE IF NOT EXISTS dummy_model", ddl.struc)
    }

    @Test
    fun oneFieldClassicModel() {
//        DummyModel.string("field1") {
//            required = false
//        }
        val ddl = DummyModel.accept(modelCreateDDL, DDL_MODE.CREATE)
        assertEquals("CREATE TABLE IF NOT EXISTS dummy_model (field1 VARCHAR(50))", ddl.struc)
    }
}