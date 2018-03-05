package org.platypus.ui.form

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SimpleField
import org.platypus.orm.sql.expression.Expression
import org.platypus.ui.ButtonFieldBuilder
import org.platypus.ui.FieldPosition
import org.platypus.ui.UIElementAttribute
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.UIMenuAction
import org.platypus.ui.tree.TreeViewBuilder
import org.platypus.ui.tree.TreeViews

interface FormViewBuilder<M : Model<M>> {
    val model: M
    var title: String?

    fun group(col: Int = 0,
              label: String = "",
              invisible: Boolean = false,
              groups: Set<String> = emptySet(),
              placeHolder: String = "",
              id: String = "",
              cssClass: String = "",
              widget: String = "",
              options: String = "", function: FormViewBuilder<M>.() -> Unit)

    fun div(invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = "", function: FormViewBuilder<M>.() -> Unit)

    fun buttonBox(invisible: Boolean = false,
                  groups: Set<String> = emptySet(),
                  placeHolder: String = "",
                  widget: String = "",
                  cssClass: String = "",
                  options: String = "", function: FormViewBuilder<M>.() -> Unit) =
            div(invisible = invisible,
                    groups = groups,
                    widget = widget,
                    options = options,
                    id = "button_box",
                    cssClass = "oe_button_box$cssClass", function = function)

    fun p(invisible: Boolean = false,
          groups: Set<String> = emptySet(),
          placeHolder: String = "",
          id: String = "",
          cssClass: String = "",
          widget: String = "",
          options: String = "", function: FormViewBuilder<M>.() -> Unit)


    fun a(invisible: Boolean = false,
          groups: Set<String> = emptySet(),
          href: String = "",
          id: String = "",
          cssClass: String = "",
          widget: String = "",
          options: String = "")

    operator fun String.unaryPlus() {

    }

    fun ModelField<M, *>.label(label: String = "", invisible: Boolean = false,
                                  groups: Set<String> = emptySet(),
                                  placeHolder: String = "",
                                  id: String = "",
                                  cssClass: String = "",
                                  widget: String = "",
                                  options: String = "")

    fun label(label: String = "", invisible: Boolean = false,
              groups: Set<String> = emptySet(),
              placeHolder: String = "",
              id: String = "",
              cssClass: String = "",
              widget: String = "",
              options: String = "")

    fun includeForm(functionGetter: (ModelFormViews) -> FormViewBuilder<M>)

    fun <TM : Model<TM>> ReferenceField<M, TM>.includeForm(functionGetter: ModelFormViews.() -> FormViewDefinition<TM>)

    fun <TM : Model<TM>> One2ManyField<M, TM>.includeTree(functionGetter: TreeViews.() -> TreeViewBuilder<TM>)

    fun <TM : Model<TM>> Many2ManyField<M, TM>.includeTree(functionGetter: TreeViews.() -> TreeViewBuilder<TM>)


    fun <T : Any> field(field: RealModelField<M, T>,
                        invisible: Boolean = false,
                        readonly: Boolean = false,
                        groups: Set<String> = emptySet(),
                        placeHolder: String = "",
                        id: String = "",
                        cssClass: String = "",
                        widget: String = "",
                        options: String = "")

    fun <TM : Model<TM>>
            One2ManyField<M, TM>.fieldTree(
            invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = "",
            function: TreeViewBuilder<TM>.(TM) -> Unit
    )

    fun <TM : Model<TM>>
            One2ManyField<M, TM>.field(
            invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = ""
    )

    fun <TM : Model<TM>>
            Many2ManyField<M, TM>.fieldTree(
            invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = "",
            function: TreeViewBuilder<TM>.(TM) -> Unit
    )

    fun <TM : Model<TM>>
            Many2ManyField<M, TM>.field(
            invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = ""
    )

    fun <TM : Model<TM>>
            RevOne2OneField<M, TM>.field(
            invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = ""
    )

    fun <TM : Model<TM>, T : Any>
            ReferenceField<M, TM>.field(
            invisible: Boolean = false,
            groups: Set<String> = emptySet(),
            placeHolder: String = "",
            id: String = "",
            cssClass: String = "",
            widget: String = "",
            options: String = "",
            fieldGet: TM.() -> ModelField<TM, T>)

    fun sheet(invisible: Boolean = false,
              groups: Set<String> = emptySet(),
              placeHolder: String = "",
              id: String = "",
              cssClass: String = "",
              widget: String = "",
              options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun h1(invisible: Boolean = false,
           groups: Set<String> = emptySet(),
           placeHolder: String = "",
           id: String = "",
           cssClass: String = "",
           widget: String = "",
           options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun h2(invisible: Boolean = false,
           groups: Set<String> = emptySet(),
           placeHolder: String = "",
           id: String = "",
           cssClass: String = "",
           widget: String = "",
           options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun h3(invisible: Boolean = false,
           groups: Set<String> = emptySet(),
           placeHolder: String = "",
           cssClass: String = "",
           id: String = "",
           widget: String = "",
           options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun h4(invisible: Boolean = false,
           groups: Set<String> = emptySet(),
           placeHolder: String = "",
           id: String = "",
           cssClass: String = "",
           widget: String = "",
           options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun h5(invisible: Boolean = false,
           groups: Set<String> = emptySet(),
           placeHolder: String = "",
           id: String = "",
           cssClass: String = "",
           widget: String = "",
           options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun h6(invisible: Boolean = false,
           groups: Set<String> = emptySet(),
           placeHolder: String = "",
           id: String = "",
           cssClass: String = "",
           widget: String = "",
           options: String = "", function: FormViewBuilder<M>.() -> Unit) {
        TODO("not implemented")
    }

    fun notebook(colSpan: Int = 0, invisible: Boolean = false,
                 groups: Set<String> = emptySet(),
                 placeHolder: String = "",
                 id: String = "",
                 cssClass: String = "",
                 widget: String = "",
                 options: String = "", function: FormViewBuilder<M>.() -> Unit) {

    }

    fun page(colSpan: Int = 0, invisible: Boolean = false,
             groups: Set<String> = emptySet(),
             placeHolder: String = "",
             id: String = "",
             cssClass: String = "",
             widget: String = "",
             options: String = "", function: FormViewBuilder<M>.() -> Unit) {

    }

    fun header(id: String = "",
               groups: Set<String> = emptySet(),
               invisible: Boolean = false,
               cssClass: String = "",
               options: String = "",
               function: FormViewBuilder<M>.() -> Unit) {

    }

    fun button(field: RealModelField<*, *>,
               id: String = "",
               label: String = "",
               icon: String = "",
               widget: String = "",
               groups: Set<String> = emptySet(),
               invisible: Boolean = false,
               cssClass: String = "",
               options: String = "") {

    }

    fun buttonAction(id: String = "",
                     groups: Set<String> = emptySet(),
                     invisible: Boolean = false,
                     cssClass: String = "",
                     icon: String = "",
                     widget: String = "",
                     label: String = "",
                     attrs: Pair<UIElementAttribute, M.() -> Expression<Boolean>>? = null,
                     options: String = "", act: MenuAction.() -> UIMenuAction<M>) {

    }

    fun <T : Any> fieldButton(field: RealModelField<M, T>, function: ButtonFieldBuilder<M, T>.() -> Unit) {

    }
}

interface FormViewBuilderExtend<M : Model<M>> : FormViewBuilder<M> {

    fun <T : Any> find(field: SimpleField<M, T>) {

    }

    fun findById(id: String): FormViewExtendsPosition<M> {
        TODO()
    }
}

interface FormViewExtendsPosition<M : Model<M>> {
    fun position(position: FieldPosition, todo: FormViewBuilder<M>.(M) -> Unit)
}