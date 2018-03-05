package org.platypus.entity

import org.platypus.model.IModel
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

abstract class PlatypusSelection<M : IModel<M>>(val value: String, val label: String)

abstract class PlatypusSelectionCompanion<M : IModel<M>, KS : PlatypusSelection<M>>(
        klass: KClass<KS>,
        internal val factory: (v: String, l: String) -> KS
) {
    private val _selection = HashMap<String, String>()

    val default: KS
        get() = _default

    protected var _default: KS = factory("", "")

    operator fun String.getValue(receiver: PlatypusSelectionCompanion<M, KS>, property: KProperty<*>): KS {
        _selection[property.name] = this
        return factory(property.name, this)
    }

    fun getUnsafe(value: String?): KS? {
        if (value != null && value in _selection) {
            return factory(value, _selection[value]!!)
        }
        return null
    }
}