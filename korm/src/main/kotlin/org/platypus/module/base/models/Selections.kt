package org.platypus.module.base.models

import org.platypus.entity.PlatypusSelection
import org.platypus.entity.PlatypusSelectionCompanion

class LanguageDirection(value: String, label: String) : PlatypusSelection<Languages>(value, label) {
    companion object : PlatypusSelectionCompanion<Languages, LanguageDirection>(LanguageDirection::class, { v, l -> LanguageDirection(v, l) }) {
        val ltr by "Left-to-Right"
        val rtl by "Right-to-Left"

        init {
            _default = ltr
        }
    }
}