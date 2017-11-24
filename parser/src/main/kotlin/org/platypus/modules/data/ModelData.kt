package org.platypus.modules.data

import com.squareup.kotlinpoet.asClassName
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.PlatypusModel

val model = BaseModel::class.asClassName()
val modelNamed = ModelNamed::class.asClassName()
val annotationModel = PlatypusModel::class.simpleName
val mapName = mapOf(
        BaseModel::class.simpleName to model,
        ModelNamed::class.simpleName to modelNamed
)