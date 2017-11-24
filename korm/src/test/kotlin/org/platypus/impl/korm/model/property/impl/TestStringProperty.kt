package org.platypus.impl.korm.model.property.impl

import org.junit.Assert
import org.junit.Test
import org.platypus.impl.korm.model.Model
import org.platypus.impl.korm.model.property.slots.KormSlotImpl

class TestStringProperty {
    val fakeModel = object : Model {
        override val modelName = "fake_model"
    }

    @Test
    fun testConverter() {
        val property1 = StringProperty(fakeModel, "prop1", KormSlotImpl())
        Assert.assertNull(property1.toKotlin(null))
        Assert.assertNull(property1.toSql(null))
        val value1 = "value1"
        Assert.assertEquals(value1, property1.toSql(value1))
        Assert.assertEquals(value1, property1.toKotlin(value1))
    }

    @Test
    fun testDDLCreate() {
        val property1 = StringProperty(fakeModel, "prop1", KormSlotImpl())
        val stmt = property1.createStatement()
        println(stmt)
    }

}