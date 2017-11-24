package org.platypus.impl.korm.model.property.api

import org.junit.Assert
import org.junit.Test
import java.util.*

class LocaleDbConverter : PropertyDbConverter<Locale, String> {
    override fun toKotlin(value: String?): Locale? {
        return value?.let {
            val countSep = value.count { it == '_' }
            return when (countSep) {
                1 -> {
                    val (contry, lang) = value.split("_")
                    Locale(contry, lang)
                }
                2 -> {
                    val (contry, lang, other) = value.split("_")
                    Locale(contry, lang, other)
                }
                else -> Locale(value)
            }

        }
    }

    override fun toSql(value: Locale?): String? {
        return value?.let {
            value.toString()
        }
    }
}

class TestDbConverter {

    @Test
    fun testNullValue() {
        val conv = LocaleDbConverter()
        Assert.assertNull(conv.toKotlin(null))
        Assert.assertNull(conv.toSql(null))
    }

    @Test
    fun testfrFRValue() {
        val conv = LocaleDbConverter()
        Assert.assertNull(conv.toKotlin("fr_FR"))
        Assert.assertNull(conv.toSql(Locale.FRANCE))
    }

    @Test
    fun testNotValidValue() {
        val conv = LocaleDbConverter()
        Assert.assertNull(conv.toKotlin("not a valid Value"))
        Assert.assertNull(conv.toSql(Locale("not", "a valid", "value")))
    }
}