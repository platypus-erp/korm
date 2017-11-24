package org.platypus.impl.korm.model.property.impl

import org.platypus.impl.korm.model.Model
import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.model.property.api.DDLProperty
import org.platypus.impl.korm.model.property.api.PlatypusProperty
import org.platypus.impl.korm.model.property.slots.KormSlot

class StringProperty(override val model: Model, override val name: String, override val slots: KormSlot<String>) : PlatypusProperty<String, String> {
    override val type = ModelColumnType.STRING

    override fun createStatement(provider: PersitenceProvider): DDLProperty {
        val mainDDL = buildString {
            append(provider.ddlUtils.identity(this@StringProperty))
            append(" ")
            val length = slots.length ?: provider.defaultType.defaultVarcharLength
            append(when (length) {
                in 1..255 -> "VARCHAR($length)"
                else -> provider.defaultType.textType()
            })
            //TODO take care of [slots.default] before [slots.defaultValue]
            val dbDefaultValue = slots.defaultValue
            if (dbDefaultValue != null) {
                if (provider.dialect.isAllowedAsColumnDefault(dbDefaultValue)) {
                    val expressionSQL = provider.defaultType.processForDefaultValue(dbDefaultValue)
                    append(" DEFAULT $expressionSQL")
                }
            }
            if (slots.required) {
                append(" NOT NULL")
            } else {
                append(" NULL")
            }
        }
        return DDLProperty(mainDDL, emptyList())
    }

    override fun modifyStatement(provider: PersitenceProvider): DDLProperty {
        return DDLProperty("", emptyList())
    }

    override fun dropStatement(provider: PersitenceProvider): DDLProperty {
        return DDLProperty("", emptyList())
    }

    override fun toKotlin(value: String?): String? {
        return value
    }

    override fun toSql(value: String?): String? {
        return value
    }

    override fun validate(value: String?): Set<String> {
        return emptySet()
    }
}