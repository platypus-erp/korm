package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J5\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00150\u00182\u0006\u0010\u0019\u001a\u0002H\u0016H\u0016\u00a2\u0006\u0002\u0010\u001aJ5\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u00150\u001c2\u0006\u0010\u001d\u001a\u0002H\u001bH\u0016\u00a2\u0006\u0002\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lorg/platypus/model/field/impl/CreateUID;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/ReferenceField;", "Lorg/platypus/module/base/models/Users;", "model", "(Lorg/platypus/model/Model;)V", "store", "", "getStore", "()Z", "target", "getTarget", "()Lorg/platypus/module/base/models/Users;", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "type$delegate", "Lkotlin/Lazy;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class CreateUID<M extends org.platypus.model.Model<M>> extends org.platypus.model.field.impl.ReferenceField<M, org.platypus.module.base.models.Users> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy type$delegate = null;
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.module.base.models.Users getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
        return null;
    }
    
    @java.lang.Override()
    public <PARAM_TYPE extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super PARAM_TYPE, ? extends RETURN> visitor, PARAM_TYPE p) {
        return null;
    }
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    public CreateUID(@org.jetbrains.annotations.NotNull()
    M model) {
        super(null, null, null, null, null);
    }
}