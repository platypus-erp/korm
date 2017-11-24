package org.platypus.api.i18n

import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.KormProperty
import java.util.*
import kotlin.collections.HashMap

enum class I18NType {
    UI, FIELD, CODE
}

class PlatypusI18N(val locale: Locale) {
    private val ui = HashMap<String, String>()
    private val field = HashMap<String, String>()
    private val code = HashMap<String, String>()

    fun ui(defUi: UII18nValues.() -> Unit) {
        val tmp = UII18nValues()
        tmp.defUi()
        ui.putAll(tmp.values())
    }

    fun <SELF : BaseModel<SELF, RECIEVER>, RECIEVER : PlatypusEntity<RECIEVER, SELF>>
            model(model: SELF, def: I18nFieldValues<SELF, RECIEVER>.() -> Unit) {
        val tmp = I18nFieldValues<SELF, RECIEVER>()
        tmp.def()
        field.putAll(tmp.values())
    }

    fun code(defUi: CodeI18nValues.() -> Unit) {
        val tmp = CodeI18nValues()
        tmp.defUi()
        ui.putAll(tmp.values())
    }

    fun asTemplate(locale: Locale, def: PlatypusI18N.() -> Unit): PlatypusI18N {
        val i18n = PlatypusI18N(locale)
        i18n.def()
        return i18n
    }
}

interface I18nValues {
    fun values(): Map<String, String>
}

class UII18nValues : I18nValues {
    private val properties = HashMap<String, String>()
    override fun values(): Map<String, String> = properties


    infix fun String.asKeyOf(value: String) {
        properties[StringToi18nJ.convert(this)] = value
    }

    fun same(str: String) {
        properties[StringToi18nJ.convert(str)] = str
    }
}

class CodeI18nValues : I18nValues {
    private val properties = HashMap<String, String>()
    override fun values(): Map<String, String> = properties


    infix fun String.asKeyOf(value: String) {
        properties[StringToi18nJ.convert(this)] = value
    }

    fun same(str: String) {
        properties[StringToi18nJ.convert(str)] = str
    }
}

class I18nFieldValues<SELF : BaseModel<SELF, RECIEVER>, RECIEVER : PlatypusEntity<RECIEVER, SELF>> : I18nValues {
    private val properties = HashMap<String, String>()

    override fun values(): Map<String, String> = properties

    fun str(prop: KormProperty<*, *>, value: String) {
        properties[prop.model.modelName + "." + prop.name + ",name"] = value
    }

    fun label(prop: KormProperty<*, *>, value: String) {
        properties[prop.model.modelName + "." + prop.name + ",label"] = value
    }

    fun field(prop: KormProperty<SELF, *>) {
        str(prop, prop.name)
        label(prop, prop.slots.label ?: prop.name)
    }
}

fun baseTranslate(locale: Locale, def: PlatypusI18N.() -> Unit): PlatypusI18N {
    val i18n = PlatypusI18N(locale)
    i18n.def()
    return i18n
}