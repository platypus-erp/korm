package org.platypus.ui.tree

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.model.field.impl.SimpleField
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.SearchQueryImpl
import org.platypus.ui.UIElement
import org.platypus.ui.UIElementAttribute
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.UIMenuAction
import org.platypus.ui.search.SearchViewDefinition

interface TreeViewBuilder<M : Model<M>> {
    val model: M
    var title: String?
    var colors: String?
    var enableTree: Boolean
    val widgets: List<TreeWidgetUI>

    /**
     * Add a simple field to the Tree view
     */
    fun field(field: RealModelField<M, *>,
              invisible: Boolean = false,
              readonly: Boolean = false,
              groups: Set<String> = emptySet(),
              placeHolder: String? = null,
              id: String? = null,
              label: String? = null,
              cssClass: String? = null,
              widget: String? = null,
              options: String? = null)

    /**
     * Add a field from a relation to the Tree view
     */
    fun <TM : Model<TM>, T : Any>
            field(field: ReferenceField<M, TM>,
                  invisible: Boolean = false,
                  readonly: Boolean = false,
                  groups: Set<String> = emptySet(),
                  placeHolder: String? = null,
                  id: String? = null,
                  label: String? = null,
                  cssClass: String? = null,
                  widget: String? = null,
                  options: String? = null,
                  fieldGet: TM.() -> RealModelField<TM, T>)

    fun button(field: RealModelField<*, Any>,
               id: String? = null,
               label: String? = null,
               icon: String? = null,
               widget: String? = null,
               groups: Set<String> = emptySet(),
               invisible: Boolean = false,
               cssClass: String? = null,
               options: String? = null)

    fun buttonAction(id: String? = null,
                     groups: Set<String> = emptySet(),
                     invisible: Boolean = false,
                     cssClass: String? = null,
                     icon: String? = null,
                     help: String? = null,
                     widget: String? = null,
                     label: String? = null,
                     attrs: Pair<UIElementAttribute, M.() -> Expression<Boolean>>? = null,
                     options: String? = null, act: MenuAction.() -> UIMenuAction<M>)

    fun build(uniqueName: String): TreeView
}


interface TreeViewBuilderExtends<M : Model<M>> : TreeViewBuilder<M> {

    fun <T : Any> find(field: SimpleField<M, T>)
}

internal class TreeViewBuilderImpl<M : Model<M>>(override val model: M) : TreeViewBuilderExtends<M> {
    override var title: String? = null
    private val _fields: MutableList<TreeWidgetUI> = ArrayList()
    override var enableTree: Boolean = false
    override var colors: String? = null
    lateinit var querySearch: SearchQueryImpl<M>
    var searchView: SearchViewDefinition<M>? = null

    override val widgets: List<TreeWidgetUI>
        get() = _fields

    override fun field(field: RealModelField<M, *>, invisible: Boolean, readonly: Boolean, groups: Set<String>, placeHolder: String?, id: String?, label: String?, cssClass: String?, widget: String?, options: String?) {
        _fields.add(TreeWidgetUI(field, label, invisible, true))
//        querySearch.addField(field)
    }

    override fun <TM : Model<TM>, T : Any> field(field: ReferenceField<M, TM>, invisible: Boolean, readonly: Boolean, groups: Set<String>, placeHolder: String?, id: String?, label: String?, cssClass: String?, widget: String?, options: String?, fieldGet: TM.() -> RealModelField<TM, T>) {
        val joinedField = field.target.fieldGet()
        _fields.add(TreeWidgetUI(joinedField, label, invisible, true))
//        querySearch.joinField(field)
//        querySearch.addField(joinedField)
    }

    override fun button(field: RealModelField<*, Any>, id: String?, label: String?, icon: String?, widget: String?, groups: Set<String>, invisible: Boolean, cssClass: String?, options: String?) {
        TODO("not implemented")
    }

    override fun buttonAction(id: String?, groups: Set<String>, invisible: Boolean, cssClass: String?, icon: String?, help: String?, widget: String?, label: String?, attrs: Pair<UIElementAttribute, M.() -> Expression<Boolean>>?, options: String?, act: MenuAction.() -> UIMenuAction<M>) {
        TODO("not implemented")
    }

    override fun <T : Any> find(field: SimpleField<M, T>) {
        TODO("not implemented")
    }

    override fun build(uniqueName: String): TreeView {
        return TreeViewImpl(uniqueName, _fields, "", searchView)
    }
}


class TreeViewBuilderExtend<M : Model<M>>(
        internal val model: M
) {
    var title: String? = null
    private val _fields: MutableList<TreeWidgetUI> = ArrayList()
    val fields: List<TreeWidgetUI>
        get() = _fields

    fun <T : Any> field(prop: ModelField<M, T>, invisible: Boolean = false, groups: Set<String> = emptySet()) {
        _fields.add(TreeWidgetUI(prop))
    }


}

private class TreeViewImpl(
        override val uniqueId: String,
        override val elements: List<UIElement>,
        override val css: String,
        override val searchView: SearchViewDefinition<*>?
) : TreeView



