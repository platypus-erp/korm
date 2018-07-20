package org.platypus.annotation.processor

import org.korm.api.annotations.Model
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

@SupportedSourceVersion(SourceVersion.RELEASE_8)
class MainProcessor : AbstractProcessor(){

    override fun process(annotations: MutableSet<out TypeElement>, roundEnv: RoundEnvironment): Boolean {
        val annotatedElements = roundEnv.getElementsAnnotatedWith(Model::class.java)
        if (annotatedElements.isEmpty()) return false

        return true
    }

    override fun getSupportedAnnotationTypes(): Set<String> {
        return setOf(Model::class.java.canonicalName)
    }
}