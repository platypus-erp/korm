package org.platypus.ui

import kotlinx.html.TagConsumer
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.model.Model
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.expression.Expression
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.UIMenuAction

class ButtonActBuilder<M : Model<M>>(
        val act: MenuAction.() -> UIMenuAction<M>
) {
    var id: String = ""
    var groups: Set<String> = emptySet()
    var invisible: Boolean = false
    var cssClass: String = ""
    var options: String = ""
    private val attributes: MutableMap<UIElementAttribute, Expression<Boolean>> = HashMap()

    fun attrs(v: Pair<UIElementAttribute, Expression<Boolean>>) {
        attributes[v.first] = v.second
    }

}

class ButtonFieldBuilder<M : Model<M>, T:Any>(
        val field: RealModelField<M, T>
) {
    var id: String = ""
    var groups: Set<String> = emptySet()
    var invisible: Boolean = false
    var cssClass: String = ""
    var options: String = ""
    private val attributes: MutableMap<UIElementAttribute, Expression<Boolean>> = HashMap()

    fun attrs(v: Pair<UIElementAttribute, Expression<Boolean>>) {
        attributes[v.first] = v.second
    }

}


class UIButton(
        override val label: String,
        override val fieldName: String
) : UIElement {

    override val componentNeeded: Set<UIComponent> = setOf()

    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment): O {
        TODO("not implemented")
    }
}

