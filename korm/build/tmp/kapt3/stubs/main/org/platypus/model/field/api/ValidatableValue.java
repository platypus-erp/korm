package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002J\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/model/field/api/ValidatableValue;", "TYPE", "", "validateNullable", "", "", "value", "(Ljava/lang/Object;)Ljava/util/Set;", "korm"})
public abstract interface ValidatableValue<TYPE extends java.lang.Object> {
    
    /**
     * * Check if the value is value, and return a set of possible error
     *     * This method doesn't throw any [Exception]
     *     * @see ValidatableValueThrow if you want to throw errors
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> validateNullable(@org.jetbrains.annotations.Nullable()
    TYPE value);
}