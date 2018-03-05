package org.platypus.model.field.api

import org.platypus.PlatypusEnvironment
import org.platypus.UIWidget
import org.platypus.orm.OrmConstraint

interface FieldSlots<KOTLIN_TYPE> {
    val label: String?
    val copy: Boolean
    val help: String?
    val defaultValueFun: ((env: PlatypusEnvironment) -> KOTLIN_TYPE?)
    val unique: Boolean
    val index: Boolean
    val groups: Set<String>
    val widget: UIWidget?
    val constraint: Set<OrmConstraint<KOTLIN_TYPE>>
    val transformer: Set<FieldTransformer<KOTLIN_TYPE>>
    val readonly: Boolean
    val required: Boolean
    val store: Boolean
}

data class FieldSlotsImpl<KOTLIN_TYPE>
(
        override var label: String? = null,
        override var copy: Boolean = true,
        override var help: String? = null,
        private val default: KOTLIN_TYPE? = null,
        override var defaultValueFun: ((env: PlatypusEnvironment) -> KOTLIN_TYPE?) = { default },
        override var unique: Boolean = false,
        override var index: Boolean = false,
        override var groups: Set<String> = emptySet(),
        override var widget: UIWidget? = null,
        override var transformer: MutableSet<FieldTransformer<KOTLIN_TYPE>> = HashSet(),
        override var constraint: MutableSet<OrmConstraint<KOTLIN_TYPE>> = HashSet(),
        override var readonly: Boolean = false,
        override var required: Boolean = false,
        override var store: Boolean = true
) : FieldSlots<KOTLIN_TYPE> {

    internal fun merge(other: MutableFieldSlots<KOTLIN_TYPE>): FieldSlots<KOTLIN_TYPE> {
        return FieldSlotsImpl(
                label = other.label ?: this.label,
                copy = other.copy ?: this.copy,
                help = other.help ?: this.help,
                defaultValueFun = other.defaultValueFun ?: this.defaultValueFun,
                unique = other.unique ?: this.unique,
                index = other.index ?: this.index,
                groups = this.groups + other.groups,
                widget = other.widget ?: this.widget,
                transformer = (other.transformer + this.transformer).toMutableSet(),
                constraint = (other.constraint + this.constraint).toMutableSet(),
                readonly = other.readonly ?: this.readonly,
                required = other.required ?: this.required,
                store = other.store ?: this.store
        )
    }


}

interface MutableFieldSlots<KOTLIN_TYPE> {
    var label: String?
    var help: String?
    var copy: Boolean?
    var defaultValueFun: ((env: PlatypusEnvironment) -> KOTLIN_TYPE)?
    var default: KOTLIN_TYPE?
    var unique: Boolean?
    var index: Boolean?
    val groups: Set<String>
    var widget: UIWidget?
    var constraint: MutableSet<OrmConstraint<KOTLIN_TYPE>>
    var transformer: MutableSet<FieldTransformer<KOTLIN_TYPE>>
    var readonly: Boolean?
    var required: Boolean?
    var store: Boolean?

    fun toSlots(): FieldSlotsImpl<KOTLIN_TYPE>
}

class MutableFieldSlotsImpl<KOTLIN_TYPE>(
        override var label: String? = null,
        override var help: String? = null,
        override var copy: Boolean? = null,
        override var defaultValueFun: ((env: PlatypusEnvironment) -> KOTLIN_TYPE)? = null,
        override var default: KOTLIN_TYPE? = null,
        override var unique: Boolean? = null,
        override var index: Boolean? = null,
        override var groups: Set<String> = emptySet(),
        override var widget: UIWidget? = null,
        override var constraint: MutableSet<OrmConstraint<KOTLIN_TYPE>> = HashSet(),
        override var transformer: MutableSet<FieldTransformer<KOTLIN_TYPE>> = HashSet(),
        override var readonly: Boolean? = null,
        override var required: Boolean? = null,
        override var store: Boolean? = null
) : MutableFieldSlots<KOTLIN_TYPE> {

    override fun toSlots(): FieldSlotsImpl<KOTLIN_TYPE> {
        return FieldSlotsImpl(
                label = label,
                copy = copy ?: true,
                help = help,
                defaultValueFun = defaultValueFun ?: { default },
                unique = unique ?: false,
                index = index ?: false,
                groups = groups,
                widget = widget,
                transformer = transformer,
                constraint = constraint,
                readonly = readonly ?: false,
                required = required ?: false,
                store = store ?: true
        )
    }


}
