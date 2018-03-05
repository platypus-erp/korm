package org.platypus.ui.widget

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.ui.UIRenderable

interface UIWidget<M : Model<M>, T : Any> : UIRenderable {
    val prop: ModelField<M, T>
}