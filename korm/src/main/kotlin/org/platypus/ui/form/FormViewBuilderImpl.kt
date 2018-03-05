package org.platypus.ui.form

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.ui.tree.TreeViewBuilder
import org.platypus.ui.tree.TreeViews

class FormViewBuilderImpl<M : Model<M>>(override val model: M) : FormViewBuilder<M> {
    override var title: String? = null

    override fun group(col: Int, label: String, invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String, function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    override fun div(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String, function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    override fun p(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String, function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    override fun a(invisible: Boolean, groups: Set<String>, href: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun ModelField<M, *>.label(label: String, invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun label(label: String, invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun includeForm(functionGetter: (ModelFormViews) -> FormViewBuilder<M>) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> ReferenceField<M, TM>.includeForm(functionGetter: ModelFormViews.() -> FormViewDefinition<TM>) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2ManyField<M, TM>.includeTree(functionGetter: TreeViews.() -> TreeViewBuilder<TM>) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2ManyField<M, TM>.includeTree(functionGetter: TreeViews.() -> TreeViewBuilder<TM>) {
        TODO("not implemented")
    }

    override fun <T : Any> field(field: RealModelField<M, T>, invisible: Boolean, readonly: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2ManyField<M, TM>.fieldTree(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String, function: TreeViewBuilder<TM>.(TM) -> Unit) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2ManyField<M, TM>.field(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2ManyField<M, TM>.fieldTree(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String, function: TreeViewBuilder<TM>.(TM) -> Unit) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2ManyField<M, TM>.field(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> RevOne2OneField<M, TM>.field(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>, T : Any> ReferenceField<M, TM>.field(invisible: Boolean, groups: Set<String>, placeHolder: String, id: String, cssClass: String, widget: String, options: String, fieldGet: TM.() -> ModelField<TM, T>) {
        TODO("not implemented")
    }
}