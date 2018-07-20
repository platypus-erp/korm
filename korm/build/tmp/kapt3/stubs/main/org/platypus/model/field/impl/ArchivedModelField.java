package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J5\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0016\u001a\u0002H\u0013H\u0016\u00a2\u0006\u0002\u0010\u0017J5\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00120\u00192\u0006\u0010\u001a\u001a\u0002H\u0018H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dR$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lorg/platypus/model/field/impl/ArchivedModelField;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/RealModelField;", "", "model", "(Lorg/platypus/model/Model;)V", "<set-?>", "store", "getStore", "()Z", "setStore", "(Z)V", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "disable", "", "enable", "korm"})
public final class ArchivedModelField<M extends org.platypus.model.Model<M>> extends org.platypus.model.field.impl.RealModelField<M, java.lang.Boolean> {
    private boolean store;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.type.SqlFieldType type = null;
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    private void setStore(boolean p0) {
    }
    
    public final void enable() {
    }
    
    public final void disable() {
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
    
    public ArchivedModelField(@org.jetbrains.annotations.NotNull()
    M model) {
        super(null, null, null);
    }
}