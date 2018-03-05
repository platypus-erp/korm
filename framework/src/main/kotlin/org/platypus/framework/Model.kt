package org.platypus.framework

interface Model<M:Model<M, E>, E : Entity<E>> {
    val modelName: String
}