package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J5\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00170\u001a2\u0006\u0010\u001b\u001a\u0002H\u0018H\u0016\u00a2\u0006\u0002\u0010\u001cJ5\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0001\u0010\u001d\"\u0004\b\u0002\u0010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u00170\u001e2\u0006\u0010\u001f\u001a\u0002H\u001dH\u0016\u00a2\u0006\u0002\u0010 R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lorg/platypus/model/field/impl/ExternalRefModelField;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/RealModelField;", "", "model", "(Lorg/platypus/model/Model;)V", "<set-?>", "", "length", "getLength", "()I", "setLength", "(I)V", "store", "", "getStore", "()Z", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class ExternalRefModelField<M extends org.platypus.model.Model<M>> extends org.platypus.model.field.impl.RealModelField<M, java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.type.SqlFieldType type = null;
    private int length;
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
        return null;
    }
    
    public final int getLength() {
        return 0;
    }
    
    private final void setLength(int p0) {
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
    
    public ExternalRefModelField(@org.jetbrains.annotations.NotNull()
    M model) {
        super(null, null, null);
    }
}