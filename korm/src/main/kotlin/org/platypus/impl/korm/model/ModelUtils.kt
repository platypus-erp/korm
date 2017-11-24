package org.platypus.impl.korm.model

fun determineNameM2M(model1: BaseModel<*, *>, model2: BaseModel<*, *>):String{
    return listOf(model1,model2).map { it.modelName }.sorted().joinToString("_", postfix = "_rel")
}