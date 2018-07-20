package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\'\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0002*\f\u0012\u0004\u0012\u0002H\u0006\u0012\u0002\b\u00030\u0007H\u00a6\u0002\u00a8\u0006\b"}, d2 = {"Lorg/platypus/orm/sql/query/FieldUnaryPlus;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/orm/sql/query/FieldGetter;", "unaryPlus", "", "MM", "Lorg/platypus/model/field/impl/RealModelField;", "korm"})
public abstract interface FieldUnaryPlus<M extends org.platypus.model.Model<M>> extends org.platypus.orm.sql.query.FieldGetter<M> {
    
    public abstract <MM extends org.platypus.model.Model<MM>>void unaryPlus(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<MM, ?> $receiver);
}