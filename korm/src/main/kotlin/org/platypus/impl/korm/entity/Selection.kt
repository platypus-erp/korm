package org.platypus.impl.korm.entity

import org.platypus.impl.korm.model.BaseModel
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

abstract class PlatypusSelection<SELF : BaseModel<SELF, RECEIVER>, RECEIVER : PlatypusEntity<RECEIVER, SELF>>(val value: String, val label: String)

abstract class PlatypusSelectionCompanion<SELF : BaseModel<SELF, RECEIVER>, RECEIVER : PlatypusEntity<RECEIVER, SELF>, KS : PlatypusSelection<SELF, RECEIVER>>(
    klass: KClass<KS>,
    internal val factory: (v: String, l: String) -> KS
) {
    private val _selection = HashMap<String, String>()

    val default: KS
        get() = _default

    protected var _default: KS = factory("", "")

    operator fun String.getValue(receiver: PlatypusSelectionCompanion<SELF, RECEIVER, KS>, property: KProperty<*>): KS {
        _selection[property.name] = this
        return factory(property.name, this)
    }

    fun getUnsafe(value: String?): KS {
        if (value != null && value in _selection) {
            return factory(value, _selection[value]!!)
        }
        return default
    }
}