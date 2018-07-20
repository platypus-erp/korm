package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00050\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006BT\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001f\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0012\u00a2\u0006\u0002\u0010\u0013RV\u0010\u0015\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00122\u001f\u0010\u0014\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0012@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r@TX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lorg/platypus/model/field/impl/ReferenceField;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/model/field/impl/RealModelField;", "Lorg/platypus/entity/Record;", "Lorg/platypus/model/field/api/ReferencedField;", "model", "name", "", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "defaultOnDelete", "Lorg/platypus/orm/ReferenceOption;", "defaultDomain", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "", "Lkotlin/ExtensionFunctionType;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/model/field/api/FieldSlotsImpl;Lorg/platypus/orm/ReferenceOption;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "domain", "getDomain", "()Lkotlin/jvm/functions/Function1;", "setDomain", "(Lkotlin/jvm/functions/Function1;)V", "onDelete", "getOnDelete", "()Lorg/platypus/orm/ReferenceOption;", "setOnDelete", "(Lorg/platypus/orm/ReferenceOption;)V", "korm"})
public abstract class ReferenceField<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.model.field.impl.RealModelField<M, org.platypus.entity.Record<TM>> implements org.platypus.model.field.api.ReferencedField<M, TM> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.orm.ReferenceOption onDelete;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<TM, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
        return null;
    }
    
    protected final void setDomain(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.ReferenceOption getOnDelete() {
        return null;
    }
    
    protected void setOnDelete(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.ReferenceOption p0) {
    }
    
    public ReferenceField(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<org.platypus.entity.Record<TM>> slots, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.ReferenceOption defaultOnDelete, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> defaultDomain) {
        super(null, null, null);
    }
}