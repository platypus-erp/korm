package org.platypus.orm

interface OrmConstraintable {
    val contraints: Set<OrmConstraint<*>>
}