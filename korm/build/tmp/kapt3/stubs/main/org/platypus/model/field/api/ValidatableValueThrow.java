package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/model/field/api/ValidatableValueThrow;", "TYPE", "", "validateAndThrow", "", "value", "(Ljava/lang/Object;)V", "korm"})
public abstract interface ValidatableValueThrow<TYPE extends java.lang.Object> {
    
    /**
     * * Check if the value is value, and throw a [ValidateException]
     *     * This method doesn't throw any [Exception]
     *     * @see ValidatableValue if you don't want to throw errors
     */
    public abstract void validateAndThrow(@org.jetbrains.annotations.Nullable()
    TYPE value);
}