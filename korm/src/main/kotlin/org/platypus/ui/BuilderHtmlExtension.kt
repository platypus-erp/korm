package org.platypus.ui

import kotlinx.html.*
import org.platypus.exceptions.RessourceNotFoundExecption
import org.platypus.utils.prefix
import kotlin.reflect.KClass


fun <R> TagConsumer<R>.tag(tagName: String, block: CUSTOM.() -> Unit = {}) {
    CUSTOM(tagName, this).visit(block)
}

class CUSTOM(tagName: String, consumer: TagConsumer<*>) : HTMLTag(tagName, consumer, emptyMap(), inlineTag = false, emptyTag = false), HtmlInlineTag {
}

class WebComponent<out O>(
        private val uuid: String, private val suffix: String = "",
        private val consumer: TagConsumer<O>) : TagConsumer<O> by consumer {

    private var scriptCalled: Boolean = false
    fun importsComponent(imports: WebComponentImports.() -> Unit) {
        val wci = WebComponentImports(consumer)
        wci.imports()
    }

    fun domModuleTemplate(template: WebComponentTemplate.() -> Unit) {
        WebComponentTemplate(consumer, uuid, suffix).visit(template)
    }


}

class WebComponentImports(private val consumer: TagConsumer<*>) {
    init {
        consumer.importComponent("polymer/polymer-element.html")
    }

    operator fun String.unaryPlus() {
        consumer.importComponent(this)
    }
}

class WebComponentTemplate(consumer: TagConsumer<*>,
                           private val uuid: String,
                           private val suffix: String = "") : HTMLTag("dom-module", consumer, mapOf("id" to "${uuid.toLowerCase()}-${suffix.toLowerCase()}"),
        inlineTag = false, emptyTag = false), HtmlInlineTag {

    fun script(classLoader: KClass<*>, scriptName: String) {
        val stream = classLoader.java.getResourceAsStream(scriptName)
                ?: throw RessourceNotFoundExecption(scriptName, classLoader)
        val value = (stream.bufferedReader().use { it.readText() } +
                "\nwindow.customElements.define(CLASS_NAME.is, CLASS_NAME);")
                .replace("CLASS_NAME", "${uuid.capitalize()}${suffix.capitalize()}")
                .replace("ELEMENT_NAME", "${uuid.toLowerCase()}-$suffix")
        script {
            unsafe {
                raw(value)
            }
        }
    }

}

/**
 * A media-independent link
 */
@HtmlTagMarker
fun <T, C : TagConsumer<T>> C.importComponent(nameSpace: String): T = LINK(attributesMapOf("href", "/components${nameSpace.prefix("/")}", "rel", "import"), this).visitAndFinalize(this, {})


fun <O> TagConsumer<O>.buildComponent(uuid: String,
                                      suffix: String = "",
                                      webcomponent: WebComponent<O>.() -> Unit): O {
    val component = WebComponent(uuid, suffix, this)
    component.webcomponent()
    return component.finalize()
}