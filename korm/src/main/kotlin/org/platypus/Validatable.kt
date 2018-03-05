package org.platypus

interface Validatable<T> {
    fun validate(value: T): Set<String>
}

interface ValidatableNullable<in T> {
    fun validateNullable(value: T): Set<String>
}