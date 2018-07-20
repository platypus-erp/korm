package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0086\u0002J\"\u0010\u000b\u001a\u00020\f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00052\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R,\u0010\u0003\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/model/ReferenceModel;", "", "()V", "privateReference", "", "Lorg/platypus/model/IModel;", "", "Lorg/platypus/model/field/api/ReferencedField;", "get", "", "model", "referencedBy", "", "referenceField", "korm"})
public final class ReferenceModel {
    private static final java.util.Map<org.platypus.model.IModel<?>, java.util.Set<org.platypus.model.field.api.ReferencedField<?, ?>>> privateReference = null;
    public static final org.platypus.model.ReferenceModel INSTANCE = null;
    
    public final void referencedBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> referenceField) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.api.ReferencedField<?, ?>> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model) {
        return null;
    }
    
    private ReferenceModel() {
        super();
    }
}