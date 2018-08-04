package org.platypus.model.field.api

import org.platypus.PlatypusEnvironment
import org.platypus.UIWidget
import org.platypus.orm.OrmConstraint

interface IndexableField{
    val index: Boolean

    interface Mutable{
        var index: Boolean?
    }
}
interface FieldSlots<KOTLIN_TYPE> {
    val label: String?
    val copy: Boolean
    val help: String?
    val defaultValueFun: ((env: PlatypusEnvironment) -> KOTLIN_TYPE?)
    val unique: Boolean
    val groups: Set<String>
    val widget: UIWidget?
    val constraint: Set<OrmConstraint<KOTLIN_TYPE>>
    val transformer: Set<FieldTransformer<KOTLIN_TYPE>>
    val readonly: Boolean
    val required: Boolean
    val store: Boolean
}

interface MutableFieldSlots<KOTLIN_TYPE> {
    var label: String?
    var help: String?
    var copy: Boolean?
    var defaultValueFun: ((env: PlatypusEnvironment) -> KOTLIN_TYPE)?
    var unique: Boolean?
    val groups: Set<String>
    var widget: UIWidget?
    var constraint: MutableSet<OrmConstraint<KOTLIN_TYPE>>
    var transformer: MutableSet<FieldTransformer<KOTLIN_TYPE>>
    var readonly: Boolean?
    var required: Boolean?
    var store: Boolean?
}
