package org.platypus.ui

import kotlinx.html.TagConsumer
import org.platypus.PlatypusEnvironment
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.model.Model
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.web.SearchTreeParam


@DslMarker
annotation class PlatypusNodeMarker

const val PREFIX_COMPONENT = "platypus"

interface UIRenderable {

    /**
     * Render an UI element in a FreeMarker string domModule
     */
    fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment): O
}

/**
 * The Base Api interface to convert a PlatypusView in a [FreeMarker](https://freemarker.apache.org/) String domModule
 */
interface ViewApi : UIRenderable {

}

interface ViewType {
    val name: String
    fun <M : Model<M>> getDefaultView(model: M): ToViewApi<M>
}


interface PlatypusUiRenderEngine {}


//fun buildComponent(htmlContent: TagConsumer<TimedResult<StringBuilder>>.() -> Unit): TimedResult<StringBuilder> {
//    val appender = StringBuilder().appendHTML().measureTime()
//    appender.link("/src/shared-styles.html", "import")
//    appender.htmlContent()
//    return appender.finalize()
//}


interface UIElement : UIRenderable {
    val label: String
    val fieldName: String
    val componentNeeded: Set<UIComponent>
}

interface SearchableView {
    val searchView: ToViewApi<*>?
}

interface ToViewApi<M : Model<M>> {
    fun toViewApi(): ViewApi
    val uniqueName: String
    val viewType: ViewApiType
        get() = ViewApiType.PRIMARY
    val model: M
    fun querySearch(env: PlatypusEnvironment, param: SearchTreeParam): SearchQuery<M>
}

enum class ViewApiType {
    PRIMARY, SECONDARY
}

interface UIComponent {
    val nameSpace: String
}