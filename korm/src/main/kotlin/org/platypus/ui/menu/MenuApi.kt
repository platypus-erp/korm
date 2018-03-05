package org.platypus.ui.menu

import kotlin.reflect.KProperty


object AppMenus {
    private val menus: MutableMap<String, UIMenu> = HashMap()

    operator fun AppMenuDelegate.getValue(p: AppMenus, k: KProperty<*>): UIMenu {
        return menus.getOrPut(k.name) {
            val builder = UIMenu.Builder(k.name)
            this.function(builder)
            builder.build()
        }
    }
}

fun newMenu(function: UIMenu.Builder.() -> Unit): AppMenuDelegate = AppMenuDelegate(function)

class AppMenuDelegate(val function: UIMenu.Builder.() -> Unit)



