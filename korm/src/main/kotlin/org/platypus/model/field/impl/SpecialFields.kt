package org.platypus.model.field.impl

import org.platypus.model.ModelType

val needPkField = setOf(
        ModelType.CLASSIC_MODEL,
        ModelType.RECURSIVE_MODEL,
        ModelType.MODEL_STORED_VIEW,
        ModelType.LINK_MODEL,
        ModelType.MODEL_VIEW)

val needCommonField = setOf(ModelType.CLASSIC_MODEL, ModelType.RECURSIVE_MODEL)

