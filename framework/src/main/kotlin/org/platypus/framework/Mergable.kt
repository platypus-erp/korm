package org.platypus

interface Mergable<M : Mergable<M>> {

    /**
     * Merge two object of the same type
     * The return object object can be [this] or a new instance
     * see the doc of the impl to be sure
     */
    fun merge(other: M): M
}