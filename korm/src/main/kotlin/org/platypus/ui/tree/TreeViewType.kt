package org.platypus.ui.tree

import kotlinx.html.TagConsumer
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.UIWidget
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.ui.SearchableView
import org.platypus.ui.ToViewApi
import org.platypus.ui.UIComponent
import org.platypus.ui.UIElement
import org.platypus.ui.ViewApiType
import org.platypus.ui.ViewType
import kotlin.reflect.KProperty

interface TreeView : SearchableView {
    val uniqueId: String
    val elements: List<UIElement>
    val css: String
}


object TreeViews : ViewType {
    private val map = HashMap<String, TreeViewDefinition<*>>()

    operator fun get(key: String): ToViewApi<*>? = map[key]


    operator fun <M : Model<M>>
            TreeViewDelegate<M>.getValue(thisRef: TreeViews, k: KProperty<*>): TreeViewDefinition<M> {
        return thisRef.map.getOrPut(k.name, { TreeViewDefinition(k.name, this.model, this.function) }) as TreeViewDefinition<M>
    }

    operator fun <M : Model<M>>
            TreeViewDelegateExtend<M>.getValue(thisRef: TreeViews, k: KProperty<*>): TreeViewDefinition<M> {
        TODO("not implemented")
    }

    override val name: String = "tree"

    override fun <M : Model<M>> getDefaultView(model: M): ToViewApi<M> {
        println("get view ${model.modelName}")
        return map.values.firstOrNull { it.viewType == ViewApiType.PRIMARY && it.model == model } as ToViewApi<M>?
                ?: TreeViewDefinition("default-${model.tableName}-$name", model, {
                    it.storeFields
                            .filter { it is RealModelField<M, *> }
                            .map { it as RealModelField<M, *> }
                            .forEach { field(it) }
                })
    }
}


class TreeWidgetUI(
        private val prop: ModelField<*, *>,
        private val customeLabel: String? = null,
        private val invisible: Boolean = false,
        private val rendered: Boolean = false
) : UIWidget, UIElement {
    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment): O {
        TODO("not implemented")
    }

    override val label: String
        get() = customeLabel ?: prop.label ?: prop.fieldName.capitalize()
    override val fieldName: String
        get() = prop.fieldName
    override val componentNeeded: Set<UIComponent>
        get() = emptySet()
}