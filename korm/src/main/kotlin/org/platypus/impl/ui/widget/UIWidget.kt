package org.platypus.impl.ui.widget

import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.AbstractKormStringProperty
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.ui.PlatypusUiRenderEngine
import org.platypus.impl.ui.UIRenderable
import org.platypus.impl.ui.ViewType
import org.platypus.impl.ui.tree.TreeViewType
import org.platypus.impl.ui.tree.TreeWidgetUI

interface UIWidget<M : BaseModel<M, *>, T> : UIRenderable {
    val prop: KormProperty<M, T>

    fun imports(type: ViewType): Set<String>
}


class StringPropertyWidget<M : BaseModel<M, *>>(
    override val prop: AbstractKormStringProperty<M>,
    override val sort: Boolean
) : TreeWidgetUI<M, String> {

    override fun imports(type: ViewType) = when {
        type == TreeViewType -> setOf(
            "vaadin-grid/vaadin-grid-column.html",
            "vaadin-grid/vaadin-grid-sorter.html"
        )
        else -> emptySet()
    }

    override fun render(type: ViewType, engine: PlatypusUiRenderEngine) = when {
        type == TreeViewType -> renderTreeView()
        else -> ""
    }

    private fun renderTreeView(): String {
        return """|<vaadin-grid-column width="9em" resizable>
                  |  <template class="header">
                  |      <vaadin-grid-sorter path="${prop.name}">{{localize(${prop.slots.label})}}</vaadin-grid-sorter>
                  |  </template>
                  |  <template>[[item.${prop.name}]]</template>
                  |</vaadin-grid-column>""".trimMargin()
    }
}