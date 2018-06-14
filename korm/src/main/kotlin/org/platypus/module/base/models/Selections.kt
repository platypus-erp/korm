package org.platypus.module.base.models

import org.platypus.entity.Selection
import org.platypus.module.base.models.LanguageDirection.getValue


object LanguageDirection : Selection<LanguageDirection>()

val LanguageDirection.ltr by "Left-to-Right"
val LanguageDirection.rtl by "Right-to-Left"
