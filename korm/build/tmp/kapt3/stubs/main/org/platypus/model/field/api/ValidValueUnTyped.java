package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/model/field/api/ValidValueUnTyped;", "", "validateNullable", "", "", "value", "korm"})
public abstract interface ValidValueUnTyped {
    
    /**
     * * Check if the value is value, and return a set of possible error
     *     * This method doesn't throw any [Exception]
     *     * @see ValidatableValueThrow if you want to throw errors
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> validateNullable(@org.jetbrains.annotations.Nullable()
    java.lang.Object value);
}