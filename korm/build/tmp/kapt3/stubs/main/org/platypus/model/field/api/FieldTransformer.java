package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/model/field/api/FieldTransformer;", "T", "Lorg/platypus/orm/Sqlable;", "transform", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface FieldTransformer<T extends java.lang.Object> extends org.platypus.orm.Sqlable {
    
    public abstract T transform(T value);
}