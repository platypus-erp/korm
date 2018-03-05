package org.platypus.visitor

interface FieldVisitorPredicate<PARAM> : FieldVisitorDefault<PARAM, Boolean> {
    override val default: Boolean
        get() = false
}
