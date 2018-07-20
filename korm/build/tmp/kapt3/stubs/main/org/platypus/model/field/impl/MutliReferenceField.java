package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00050\u0004BJ\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\n\u0012\u001f\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u00a2\u0006\u0002\b\u000f\u00a2\u0006\u0002\u0010\u0010RV\u0010\u0012\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u00a2\u0006\u0002\b\u000f2\u001f\u0010\u0011\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u00a2\u0006\u0002\b\u000f@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/model/field/impl/MutliReferenceField;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/model/field/impl/RealModelField;", "Lorg/platypus/bag/Bag;", "model", "name", "", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "defaultDomain", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "", "Lkotlin/ExtensionFunctionType;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/model/field/api/FieldSlotsImpl;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "domain", "getDomain", "()Lkotlin/jvm/functions/Function1;", "setDomain", "(Lkotlin/jvm/functions/Function1;)V", "korm"})
public abstract class MutliReferenceField<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.model.field.impl.RealModelField<M, org.platypus.bag.Bag<TM>> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<TM, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
        return null;
    }
    
    protected final void setDomain(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> p0) {
    }
    
    public MutliReferenceField(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<org.platypus.bag.Bag<TM>> slots, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> defaultDomain) {
        super(null, null, null);
    }
}