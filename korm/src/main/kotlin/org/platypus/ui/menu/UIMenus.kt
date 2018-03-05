package org.platypus.ui.menu

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import org.platypus.ui.action.UIMenuAction

class UIMenu private constructor(val uuid: String,
                                 val name: String,
                                 val parent: UIMenu?,
                                 val sequence: Int,
                                 val icon: String?,
                                 val action: UIMenuAction<*>?,
                                 val groups: Set<String>
) {
    class Builder(val uuid: String) {
        var name: String = ""
        var parent: UIMenu? = null
        var sequence: Int = 100
        var icon: String? = null
        var action: UIMenuAction<*>? = null
        var groups: Set<String> = emptySet()

        fun build(): UIMenu = UIMenu(uuid, name, parent, sequence, icon, action, groups)
    }

    private val mutableChildren = ArrayList<UIMenu>()

    val children: List<UIMenu>
        get() = mutableChildren

    init {
        println("Menu ${parent?.name ?: ""}/$name")
        parent?.mutableChildren?.add(this)
    }

    fun toJson(): JsonObject = JsonObject(mapOf(
            "uuid" to uuid,
            "name" to name,
            "sequence" to sequence,
            "icon" to icon,
            "action" to action?.toJson(),
            "groups" to JsonArray(groups.toList()),
            "children" to JsonArray(children.map { it.toJson() })
    ))
}


