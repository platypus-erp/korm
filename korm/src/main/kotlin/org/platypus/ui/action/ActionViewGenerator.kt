package org.platypus.ui.action

import kotlinx.html.TagConsumer
import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.id
import kotlinx.html.link
import kotlinx.html.style
import kotlinx.html.title
import kotlinx.html.unsafe
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.model.Model
import org.platypus.ui.ViewApi
import org.platypus.ui.buildComponent
import org.platypus.ui.tag

class ActionViewGenerator<M : Model<M>>(
        private val uuid: String,
        private val actions: UIMenuAction<M>) : ViewApi {

    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment) = consumer.buildComponent(uuid, "action") {
        importsComponent {
            +"iron-icons/iron-icons.html"
            +"iron-icons/image-icons.html"
            +"iron-icons/editor-icons.html"
            for (type in actions.viewMode) {
                val v = type.getDefaultView(actions.model)
                link("/${actions.model.tableName}/views/${v.uniqueName}", rel = "import")
            }
        }
        domModuleTemplate {
            tag("template") {
                style {
                    attributes["include"] = "shared-styles"
                    unsafe {
                        raw("""
                            |:host {
                            |    display: block;
                            |
                            |    padding: 10px;
                            |}
                            |
                            |#pageTypeSelector.hided > .btn-type, #pageTypeSelector.hided > .btn-type-hide, #pageTypeSelector.showed > .btn-type-show {
                            |    display: none;
                            |}""".trimMargin())
                    }
                }
                tag("app-toolbar") {
                    id = "actionToolbar"
                    div {
                        id = "pageTypeSelector"
                        classes += "hided"
                        for (type in actions.viewMode) {
//                            TODO call render on type
                            tag("paper-icon-button") {
                                classes += "btn-type"
                                id = "type${type.name.capitalize()}"
                                attributes["on-click"] = "type_${type.name}_clk"
//                                TODO get the icon in the view Type
                                attributes["icon"] = "editor:format-list-bulleted"
                                title = "${type.name.capitalize()} View"
                            }
                        }
                        tag("paper-icon-button") {
                            id = "buttonShowType"
                            classes = setOf("btn-type-show")
                            attributes["on-click"] = "showType"
                            attributes["icon"] = "icons:chevron-right"
                        }
                        tag("paper-icon-button") {
                            id = "buttonHideType"
                            classes = setOf("btn-type-hide")
                            attributes["on-click"] = "hideType"
                            attributes["icon"] = "icons:chevron-left"
                        }
                    }
                    div {
                        attributes["main-title"] = "true"
                        +actions.name
                    }
                }
                tag("iron-pages") {
                    attributes["selected"] = "[[pageType]]"
                    attributes["attr-for-selected"] = "view-type"
                    attributes["fallback-selection"] = actions.defaultView.name
                    attributes["role"] = "main"
                    for (type in actions.viewMode) {
                        val v = type.getDefaultView(actions.model)
                        tag("${v.uniqueName}-${type.name}".toLowerCase()) {
                            attributes["name"] = v.uniqueName
                            attributes["view-type"] = type.name
                        }
                    }
                }
            }
            script(this@ActionViewGenerator::class, "action.js")
        }
    }
}