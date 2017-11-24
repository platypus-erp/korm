package org.platypus.impl.korm.model.property.api

/**
 * This interface is use to validate a property befoe an UPDATE or an INSERT inside the database provider
 */
interface PropertyValidator<KOTLIN_TYPE> {
    /**
     * This method validate a value and return a set of error if the value is not valid.
     * This method should never throw any kind of exception
     * [value] can be null
     * @return a set of error msg
     */
    fun validate(value: KOTLIN_TYPE?): Set<String>
}