package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/platypus/model/field/api/ValidatableType;", "", "validate", "", "", "korm"})
public abstract interface ValidatableType {
    
    /**
     * * Check if the the current instance is valid, and return a set of possible error
     *     * This method doesn't throw any [Exception]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> validate();
}