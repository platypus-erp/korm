package org.platypus.model.field.n

import org.platypus.PlatypusEnvironment
import org.platypus.UIWidget
import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.field.api.FieldTransformer
import org.platypus.model.field.api.IModelField
import org.platypus.orm.OrmConstraint
import org.platypus.orm.ReferenceOption

class Many2OneFieldImpl<M : IModel<M>, MT : IModel<MT>>(
        override val fieldName: String,
        override val model: M,
        override val target: MT) : Many2OneField<M, MT> {

    override fun compareTo(other: IModelField<*, *>): Int {
        TODO("not implemented")
    }

    override val revertOne2Many: One2ManyField<MT, M>
        get() = TODO("not implemented")
    override var domain: Boolean = false
        private set
    override var referenceOption: ReferenceOption = ReferenceOption.SET_NULL
        private set
    override var loadType: Boolean = false
        private set
    override var label: String? = null
        private set
    override var copy: Boolean = false
        private set
    override var index: Boolean = false
        private set
    override var help: String? = null
        private set
    override var defaultValueFun: ((env: PlatypusEnvironment) -> Record<MT>?) = { null }
        private set
    override var unique: Boolean = false
        private set
    override var groups: Set<String> = emptySet()
        private set
    override var widget: UIWidget? = null
        private set
    override var constraint: Set<OrmConstraint<Record<MT>>> = emptySet()
        private set
    override var transformer: Set<FieldTransformer<Record<MT>>> = emptySet()
        private set
    override var readonly: Boolean = false
        private set
    override var required: Boolean = false
        private set
    override var store: Boolean = true
        private set

    class Builder<M : IModel<M>, MT : IModel<MT>> (val model: M, val fieldName: String, override val target: MT) : Many2OneField.Builder<M, MT> {

        override var domain: Boolean? = null
        override var referenceOption: ReferenceOption? = null
        override var loadType: Boolean? = null
        override var index: Boolean? = null
        override var label: String? = null
        override var help: String? = null
        override var copy: Boolean? = null
        override var defaultValueFun: ((env: PlatypusEnvironment) -> Record<MT>)? = null
        override var unique: Boolean? = null
        override val groups: Set<String> = emptySet()
        override var widget: UIWidget? = null
        override var constraint: MutableSet<OrmConstraint<Record<MT>>> = mutableSetOf()
        override var transformer: MutableSet<FieldTransformer<Record<MT>>> = mutableSetOf()
        override var readonly: Boolean? = null
        override var required: Boolean? = null
        override var store: Boolean? = null


        override fun build(): Many2OneField<M, MT> {
            return Many2OneFieldImpl(fieldName, model, target).apply {
                domain = this@Builder.domain ?: domain
                referenceOption = this@Builder.referenceOption ?: referenceOption
                loadType = this@Builder.loadType ?: loadType
                index = this@Builder.index ?: index
                label = this@Builder.label ?: label
                copy = this@Builder.copy ?: copy
                help = this@Builder.help ?: help
                defaultValueFun = this@Builder.defaultValueFun ?: defaultValueFun
                unique = this@Builder.unique ?: unique
                groups += this@Builder.groups
                widget = this@Builder.widget ?: widget
                constraint += this@Builder.constraint
                transformer += this@Builder.transformer
                readonly = this@Builder.readonly ?: readonly
                required = this@Builder.required ?: required
                store = this@Builder.store ?: store
            }
        }
    }
}




