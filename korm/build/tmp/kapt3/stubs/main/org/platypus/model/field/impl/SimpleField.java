package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B#\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/model/field/impl/SimpleField;", "M", "Lorg/platypus/model/Model;", "T", "", "Lorg/platypus/model/field/impl/RealModelField;", "model", "name", "", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/model/field/api/FieldSlotsImpl;)V", "korm"})
public abstract class SimpleField<M extends org.platypus.model.Model<M>, T extends java.lang.Object> extends org.platypus.model.field.impl.RealModelField<M, T> {
    
    public SimpleField(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<T> slots) {
        super(null, null, null);
    }
}