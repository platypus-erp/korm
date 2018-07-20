package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0014\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0018\u001a\u00020\u0007J(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J(\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016R0\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/model/ModelMetaDataImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/ModelMetaData;", "()V", "allGroups", "", "", "Lorg/platypus/security/ModelGroup;", "Lorg/platypus/utils/MutableStringKeyMap;", "allRules", "Lorg/platypus/security/ModelRule;", "addRule", "", "rule", "addSecurity", "security", "deleteRule", "Lorg/platypus/orm/sql/expression/Expression;", "", "user", "Lorg/platypus/security/PlatypusUser;", "expr", "getRule", "name", "readRule", "updateRule", "korm"})
public final class ModelMetaDataImpl<M extends org.platypus.model.Model<M>> implements org.platypus.model.ModelMetaData<M> {
    private final java.util.Map<java.lang.String, org.platypus.security.ModelRule<M>> allRules = null;
    private final java.util.Map<java.lang.String, org.platypus.security.ModelGroup<M>> allGroups = null;
    
    public final void addSecurity(@org.jetbrains.annotations.NotNull()
    org.platypus.security.ModelGroup<M> security) {
    }
    
    public final void addRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.ModelRule<M> rule) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.security.ModelRule<M> getRule(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.orm.sql.expression.Expression<java.lang.Boolean> deleteRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> expr) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.orm.sql.expression.Expression<java.lang.Boolean> updateRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> expr) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.orm.sql.expression.Expression<java.lang.Boolean> readRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> expr) {
        return null;
    }
    
    public ModelMetaDataImpl() {
        super();
    }
}