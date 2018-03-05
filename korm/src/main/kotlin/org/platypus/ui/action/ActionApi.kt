package org.platypus.ui.action

import org.platypus.exceptions.ElementNotFound
import org.platypus.model.Model
import kotlin.reflect.KProperty

object MenuAction {
    private val actions: MutableMap<String, UIMenuAction<*>> = HashMap()

    operator fun get(key: String): UIMenuAction<*> = actions[key] ?: throw ElementNotFound("MenuAction", key)

    operator fun <M : Model<M>> AppActionDelegate<M>.getValue(p: MenuAction, k: KProperty<*>): UIMenuAction<M> {
        return actions.getOrPut(k.name, {
            val builder = UIMenuAction.Builder(this.model, k.name)
            this.function(builder)
            builder.build()
        }) as UIMenuAction<M>
    }
}

class AppActionDelegate<M : Model<M>>(val model: M, val function: UIMenuAction.Builder<M>.() -> Unit)

fun <M : Model<M>> M.newMenuAction(function: UIMenuAction.Builder<M>.() -> Unit): AppActionDelegate<M> = AppActionDelegate(this, function)
