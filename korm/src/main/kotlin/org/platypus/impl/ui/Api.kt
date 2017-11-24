package org.platypus.impl.ui

import org.platypus.impl.korm.model.BaseModel


@DslMarker
annotation class PlatypusNodeMarker

interface UIRenderable{
    /**
     * Render an UI element in a FreeMarker string template
     */
    fun render(type:ViewType, engine: PlatypusUiRenderEngine): String
}

/**
 * The Base Api interface to convert a PlatypusView in a [FreeMarker](https://freemarker.apache.org/) String template
 */
interface ViewApi :UIRenderable{

    val name:String
        get() = type.name
    val type: ViewType
    val model:BaseModel<*,*>
    fun getTemplateName():String
}

interface ViewType {
    val name: String
}


interface PlatypusUiRenderEngine {

}