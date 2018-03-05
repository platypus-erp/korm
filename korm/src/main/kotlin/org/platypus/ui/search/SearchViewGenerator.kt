package org.platypus.ui.search

import kotlinx.html.TagConsumer
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.model.Model
import org.platypus.ui.ViewApi

class SearchViewGenerator<M : Model<M>>(
        private val uniqueName: String,
        val model: M,
        private val def: SearchViewBuilder<M>) : ViewApi {


    override fun <O> render(consumer: TagConsumer<O>, env: ReadOnlyPlatypusEnvironment): O {
        TODO("not implemented")
    }
}