package org.platypus.model

interface ModelVisitor<in PARAM, out RETURN> {

    fun visit(m: Model<*>, p: PARAM): RETURN
    fun visit(m: LinkModel<*, *>, p: PARAM): RETURN
    fun visit(m: MixinModel<*>, p: PARAM): RETURN
    fun visit(m: Alias<*>, p: PARAM): RETURN
}