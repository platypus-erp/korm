package org.platypus.i18n

import org.platypus.entity.Selection
import org.platypus.entity.SelectionValue
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import java.util.*
import kotlin.collections.HashMap

enum class I18NType {
    UI, FIELD, CODE
}

class PlatypusI18N(val locale: Locale) {
    private val ui = HashMap<String, String>()
    private val field = HashMap<String, String>()
    private val selection = HashMap<String, String>()
    private val code = HashMap<String, String>()

    fun ui(defUi: UII18nValues.() -> Unit) {
        val tmp = UII18nValues()
        tmp.defUi()
        ui.putAll(tmp.values())
    }

    fun <SELF : Model<SELF>>
            model(model: SELF, def: I18nFieldValues<SELF>.() -> Unit = {}) {
        val tmp = I18nFieldValues<SELF>()
        model.fields.forEach { tmp.field(it) }
        tmp.def()
        field.putAll(tmp.values())
    }

    fun <KS : Selection<KS>> selection(selectioknHolder: KS, def: I18nSelectionValue<KS>.() -> Unit) {
        val tmp = I18nSelectionValue<KS>()
        tmp.def()
        selection.putAll(tmp.values())
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

class I18nFieldValues<M : Model<M>> : I18nValues {
    private val properties = HashMap<String, String>()

    override fun values(): Map<String, String> = properties

    fun str(prop: IModelField<M, *>, value: String) {
        properties[prop.model.modelName + "." + prop.fieldName + ",name"] = value
    }

    fun label(prop: IModelField<M, *>, value: String) {
        properties[prop.model.modelName + "." + prop.fieldName + ",label"] = value
    }

    /**
     * Same as calling [str] and [label] with the field value
     */
    fun field(prop: IModelField<M, *>) {
        str(prop, prop.fieldName)
        label(prop, prop.label ?: prop.fieldName)
    }
}

class I18nSelectionValue<KS : Selection<KS>> : I18nValues {
    private val properties = HashMap<String, String>()
    fun add(value: SelectionValue<KS>) {
        properties[value.value] = value.value
        properties["${value.value}_label"] = value.label
    }

    override fun values(): Map<String, String> = properties

}

fun baseTranslate(locale: Locale, def: PlatypusI18N.() -> Unit): PlatypusI18N {
    val i18n = PlatypusI18N(locale)
    i18n.def()
    return i18n
}