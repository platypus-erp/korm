package org.platypus.ui.search

import kotlinx.html.TagConsumer
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.UIWidget
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.ui.ToViewApi
import org.platypus.ui.UIComponent
import org.platypus.ui.UIElement
import org.platypus.ui.ViewApiType
import org.platypus.ui.ViewType
import kotlin.reflect.KProperty

interface SearchView {
    val uniqueId: String
    val elements: List<UIElement>
    val css: String
    val model: Model<*>
}

object SearchViews : ViewType {
    override val name = "search"
    private val map = HashMap<String, SearchViewDefinition<*>>()

    operator fun get(key: String): ToViewApi<*>? = map[key]

    operator fun <M : Model<M>>
            SearchViewDelegate<M>.getValue(thisRef: SearchViews, k: KProperty<*>): SearchViewDefinition<M> {
        return thisRef.map.getOrPut(k.name, { SearchViewDefinition(k.name, this.model, this.function) }) as SearchViewDefinition<M>
    }

    override fun <M : Model<M>> getDefaultView(model: M): ToViewApi<M> {
        println("get view ${model.modelName}")
        return map.values.firstOrNull { it.viewType == ViewApiType.PRIMARY && it.model == model } as ToViewApi<M>?
                ?: SearchViewDefinition("default-${model.tableName}-$name", model, {
                    it.storeFields
                            .filter { it is RealModelField<M, *> }
                            .map { it as RealModelField<M, *> }
                            .forEach { field(it) }
                })
    }
}


class SearchPropertyElement(
        val prop: ModelField<*, *>,
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