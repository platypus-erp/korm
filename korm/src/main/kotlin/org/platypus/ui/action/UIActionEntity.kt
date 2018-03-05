package org.platypus.ui.action

import com.beust.klaxon.JsonObject
import kotlinx.html.DIV
import kotlinx.html.TagConsumer
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.context.PlatypusContext
import org.platypus.model.Model
import org.platypus.orm.sql.expression.Expression
import org.platypus.ui.ToViewApi
import org.platypus.ui.UIRenderable
import org.platypus.ui.ViewType
import org.platypus.ui.tree.TreeViews

class UIMenuAction<M : Model<M>> private constructor(
        val model: M,
        val uuid: String,
        val name: String,
        val defaultView: ViewType,
        val viewMode: Set<ViewType>,
        val htmlNoContent: (DIV.() -> Unit)?,
        val help: String?,
        val views: Map<ViewType, ToViewApi<M>>,
        val groups: Set<String>,
        val domain: ((activeId: Int, activeIds: List<Int>, context: PlatypusContext) -> Expression<Boolean>)?,
        val context: ((activeId: Int, activeIds: List<Int>, context: PlatypusContext) -> PlatypusContext)?
) : UIRenderable {
    class Builder<M : Model<M>>(val model: M, val uuid: String) {

        var name: String = ""
        var defaultView: ViewType = TreeViews
        var viewMode: Set<ViewType> = setOf(TreeViews)
        var htmlNoContent: DIV.() -> Unit = {}
        var help: String? = null
        var views: Map<ViewType, ToViewApi<M>> = emptyMap()
        var groups: Set<String> = emptySet()
        var domain: ((activeId: Int, activeIds: List<Int>, context: PlatypusContext) -> Expression<Boolean>)? = null
        var context: ((activeId: Int, activeIds: List<Int>, context: PlatypusContext) -> PlatypusContext)? = null

        fun build(): UIMenuAction<M> = UIMenuAction(model, uuid, name, defaultView, viewMode, htmlNoContent, help, views, groups, domain, context)
    }

    fun getViews(type: ViewType): ToViewApi<M> {
        return views.getOrDefault(type, type.getDefaultView(model))
    }

    fun toJson() = JsonObject(mapOf("uuid" to uuid, "model" to model.tableName))


    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment): O {
        return ActionViewGenerator(uuid, this).render(consumer, env)
    }
}

