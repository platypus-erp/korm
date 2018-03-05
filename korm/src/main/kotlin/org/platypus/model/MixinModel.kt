package org.platypus.model

abstract class MixinModel<M : Model<M>>(modelName: String) : Model<M>(modelName, ModelType.ABSTRACT_MODEL) {

    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)
}

enum class MixinType {
    EMBEDDED, OUTER
}