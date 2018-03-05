package org.platypus.ui.tree

import kotlinx.html.TagConsumer
import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.link
import kotlinx.html.style
import kotlinx.html.unsafe
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.model.Model
import org.platypus.ui.ViewApi
import org.platypus.ui.buildComponent
import org.platypus.ui.tag
import java.util.stream.Collectors.toSet


class TreeViewGenerator<M : Model<M>>(
        private val uniqueName: String,
        val model: M,
        private val def: TreeViewBuilder<M>) : ViewApi {

    val view: TreeView by lazy { def.build(uniqueName) }

    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment) = consumer.buildComponent(uniqueName, "tree") {
        importsComponent {
            +"/app-layout/app-toolbar/app-toolbar.html"
            +"/iron-ajax/iron-ajax.html"
            +"/iron-icons/iron-icons.html"
            +"/vaadin-grid/vaadin-grid.html"
            +"/vaadin-grid/vaadin-grid-selection-column.html"
            +"vaadin-grid/vaadin-grid-sorter.html"
            +"vaadin-grid/vaadin-grid-column.html"
            +"/vaadin-material-theme/vaadin-grid.html"

            for (imports in view.elements.stream().flatMap { it.componentNeeded.stream() }.collect(toSet())) {
                +imports.nameSpace
            }
            link("/live/search-view.html", rel = "import")
        }
        domModuleTemplate {
            tag("template") {
                style {
                    attributes["include"] = "shared-styles"
                    unsafe {
                        raw("""
                            |:host {
                            |  display: block;
                            |  padding: 10px;
                            |}""".trimMargin())
                        raw(view.css)
                    }
                }
                tag("search-view"){
                    attributes["model"] = model.tableName
                    attributes["act-name"] = uniqueName
                    attributes["data"] = "{{data}}"
                }
                div {
                    tag("vaadin-grid") {
                        attributes["items"] = "[[data.result]]"
                        attributes["column-reordering-allowed"] = true.toString()
                        attributes["multi-sort"] = true.toString()

                        tag("vaadin-grid-selection-column") {
                            attributes["frozen"] = true.toString()
                        }
                        tag("vaadin-grid-column") {
                            attributes["width"] = "50px"
                            attributes["flex-grow"] = 0.toString()
                            tag("template") {
                                classes += "header"
                                +"#"
                            }
                            tag("template") {
                                +"[[index]]"
                            }
                        }
                        for (element in view.elements) {
                            tag("vaadin-grid-column") {
                                attributes["width"] = "9em"
                                attributes["resizable"] = true.toString()
                                tag("template") {
                                    classes += "header"
                                    tag("vaadin-grid-sorter") {
                                        attributes["path"] = element.fieldName
                                        text(element.label)
                                    }
                                }
                                tag("template") {
                                    text("[[item.${element.fieldName}]]")
                                }
                                tag("template") {
                                    classes += "footer"
                                    tag("vaadin-grid-sorter") {
                                        attributes["path"] = element.fieldName
                                        text(element.label)
                                    }
                                }
                            }

                        }
                    }
                }
            }
            script(this@TreeViewGenerator::class, "tree.js")
        }
    }


}