package org.platypus.ui.form

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.ui.ToViewApi
import org.platypus.ui.ViewApi
import org.platypus.ui.ViewType
import org.platypus.web.SearchTreeParam
import kotlin.reflect.KProperty

object ModelFormViews : ViewType {
    operator fun <M : Model<M>>
            FormViewDelegate<M>.getValue(p: ModelFormViews, k: KProperty<*>): FormViewDefinition<M> {
        TODO("not implemented")
    }

    operator fun <M : Model<M>>
            FormViewDelegateExtend<M>.getValue(p: ModelFormViews, k: KProperty<*>): FormViewBuilder<M> {
        TODO("not implemented")
    }

    override val name: String = "from"

    override fun <M : Model<M>> getDefaultView(model: M): ToViewApi<M> {
        TODO("not implemented")
    }
}

class FormViewDefinition<M : Model<M>>(
        override val uniqueName: String,
        override val model: M,
        private val def: FormViewBuilder<M>.(M) -> Unit
) : ToViewApi<M> {
    override fun toViewApi(): ViewApi {
        TODO("not implemented")
    }

    override fun querySearch(env: PlatypusEnvironment, param: SearchTreeParam): SearchQuery<M> {
        TODO("not implemented")
    }
}

fun <M : Model<M>>
        FormViewBuilderExtend<M>.extend(function: FormViewBuilderExtend<M>.(M) -> Unit): FormViewDelegateExtend<M> {
    return FormViewDelegateExtend(this.model, function)

}

fun <M : Model<M>> FormViewBuilder<M>.extend(function: FormViewBuilderExtend<M>.(M) -> Unit): FormViewDelegateExtend<M> {
    return FormViewDelegateExtend(this.model, function)

}


fun <M : Model<M>> M.newForm(function: FormViewBuilder<M>.(M) -> Unit): FormViewDelegate<M> {
    return FormViewDelegate(this, function)
}

class FormViewDelegate<M : Model<M>>(val model: M, val function: FormViewBuilder<M>.(M) -> Unit)
class FormViewDelegateExtend<M : Model<M>>(val model: M, val function: FormViewBuilderExtend<M>.(M) -> Unit)