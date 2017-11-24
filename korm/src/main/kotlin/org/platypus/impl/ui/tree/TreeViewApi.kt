package org.platypus.impl.ui.tree

import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.KormNameProperty
import org.platypus.impl.korm.model.property.KormStringProperty
import org.platypus.impl.ui.PlatypusUiRenderEngine
import org.platypus.impl.ui.ViewApi
import org.platypus.impl.ui.ViewType
import org.platypus.impl.ui.widget.StringPropertyWidget
import org.platypus.impl.ui.widget.UIWidget
import java.util.*


object TreeViewType : ViewType {
    override val name = "tree"
}

interface TreeWidgetUI<M : BaseModel<M, *>, T> : UIWidget<M, T> {
    val sort: Boolean
}

class TreeViewApi(
    override val model: BaseModel<*, *>,
    val view: TreeView<*, *>
) : ViewApi {

    override fun render(viewType: ViewType, engine: PlatypusUiRenderEngine): String {
        return ""
    }

    val imports: Set<String> = view.fields.flatMap { it.imports(TreeViewType) }.toSet()

    val css: String
        get() = ""

    private fun renderWidget(engine: PlatypusUiRenderEngine) {
        for (f in view.fields) {
            f.render(TreeViewType, engine)
        }
    }

    override fun getTemplateName(): String = "tree.ftlh"

    override val type: ViewType = TreeViewType
}

fun <SELF : BaseModel<SELF, RECIEVER>, RECIEVER : PlatypusEntity<RECIEVER, SELF>>
    tree(model: BaseModel<SELF, RECIEVER>, def: TreeView<SELF, RECIEVER>.() -> Unit): TreeViewApi {
    val view = TreeView(model)
    view.def()
    return TreeViewApi(model, view)
}

class TreeView<SELF : BaseModel<SELF, RECIEVER>, RECIEVER : PlatypusEntity<RECIEVER, SELF>>(
    private val model: BaseModel<SELF, RECIEVER>
) {
    private val _fields: MutableList<TreeWidgetUI<*, *>> = ArrayList()
    val fields: List<TreeWidgetUI<*, *>>
        get() = _fields

    fun field(prop: KormStringProperty<SELF>, sort: Boolean = false, widget: TreeWidgetUI<SELF, String>? = null) {
        val __widget = widget ?: StringPropertyWidget(prop, sort)
        _fields.add(__widget)
    }

    fun field(prop: KormNameProperty<SELF>, sort: Boolean = false, widget: TreeWidgetUI<SELF, String>? = null) {
        val __widget = widget ?: StringPropertyWidget(prop, sort)
        _fields.add(__widget)
    }
}