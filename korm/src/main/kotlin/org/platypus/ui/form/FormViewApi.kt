package org.platypus.ui.form

import kotlinx.html.TagConsumer
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.model.Model
import org.platypus.ui.PlatypusUiRenderEngine
import org.platypus.ui.ViewApi

class FormViewApi(val model: Model<*>, val view: FormViewBuilder<*>) : ViewApi {

    val imports: Set<String> = emptySet()

    val css: String
        get() = ""

    private fun renderWidget(engine: PlatypusUiRenderEngine) {
//        for (f in view.fields) {
//            f.render(TreeViewType, engine)
//        }
    }

    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment): O {
        TODO("not implemented")
    }
}