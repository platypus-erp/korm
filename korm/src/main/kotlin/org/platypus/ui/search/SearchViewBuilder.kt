package org.platypus.ui.search

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.sql.expression.Expression
import org.platypus.ui.UIElement
import org.platypus.ui.tree.TreeWidgetUI

interface SearchViewBuilder<M : Model<M>> {
    val model: M
    var title: String?

    /**
     * Add a simple field to the Tree view
     */
    fun <T : Any> field(field: RealModelField<M, T>,
                  id: String = "",
                  label: String = field.label ?: field.fieldName,
                  groups: Set<String> = field.groups,
                  placeHolder: String = field.fieldName + " ...",
                  cssClass: String = "",
                  widget: String = "",
                  options: String = "",
                  filterDomain: (M.(T) -> Expression<Boolean>)? = null)

    /**
     * Add a field from a relation to the Tree view
     */
    fun <TM : Model<TM>, T : Any>
            field(field: ReferenceField<M, TM>,
                  invisible: Boolean = false,
                  id: String,
                  groups: Set<String> = emptySet(),
                  placeHolder: String = "",
                  cssClass: String = "",
                  widget: String = "",
                  options: String = "",
                  filterDomain: (TM.(T) -> Expression<Boolean>)? = null,
                  fieldGet: TM.() -> RealModelField<TM, T>)

    fun filter(label: String,
               id: String,
               groups: Set<String> = emptySet(),
               placeHolder: String = "",
               cssClass: String = "",
               widget: String = "",
               options: String = "",
               help: String = "",
               filter: M.() -> Expression<Boolean>)

    fun <T: Any> groupBy(field: RealModelField<M, T>)

    fun build(uniqueName: String): SearchView
}

class SearchViewBuilderImpl<M : Model<M>>(
        override val model: M
) : SearchViewBuilder<M> {
    override var title: String? = null


    override fun <T :Any> field(field: RealModelField<M, T>,
                           id: String,
                           label: String,
                           groups: Set<String>,
                           placeHolder: String,
                           cssClass: String,
                           widget: String,
                           options: String,
                           filterDomain: (M.(T) -> Expression<Boolean>)?) {
    }


    override fun <TM : Model<TM>, T: Any> field(field: ReferenceField<M, TM>, invisible: Boolean, id: String, groups: Set<String>, placeHolder: String, cssClass: String, widget: String, options: String, filterDomain: (TM.(T) -> Expression<Boolean>)?, fieldGet: TM.() -> RealModelField<TM, T>) {
        TODO("not implemented")
    }

    override fun filter(label: String,
                        id: String,
                        groups: Set<String>,
                        placeHolder: String,
                        cssClass: String,
                        widget: String,
                        options: String,
                        help: String,
                        filter: M.() -> Expression<Boolean>) {
        TODO("not implemented")
    }

    override fun <T: Any> groupBy(field: RealModelField<M, T>) {
        TODO("not implemented")
    }

    override fun build(uniqueName: String): SearchView {
        TODO("not implemented")
    }
}

class SearchViewBuilderExtend<M : Model<M>>(
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

private class SearchViewImpl(
        override val uniqueId: String,
        override val elements: List<UIElement>,
        override val css: String,
        override val model: Model<*>
) : SearchView