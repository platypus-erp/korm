package org.platypus.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\u001b\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u00c6\u0003Jm\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u00c6\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R#\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006*"}, d2 = {"Lorg/platypus/security/ModelRule;", "M", "Lorg/platypus/model/Model;", "", "uniqueId", "", "name", "read", "", "write", "delete", "groups", "", "Lorg/platypus/security/PlatypusGroup;", "rule", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/Set;Lkotlin/jvm/functions/Function1;)V", "getDelete", "()Z", "getGroups", "()Ljava/util/Set;", "getName", "()Ljava/lang/String;", "getRead", "getRule", "()Lkotlin/jvm/functions/Function1;", "getUniqueId", "getWrite", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "korm"})
public final class ModelRule<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uniqueId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final boolean read = false;
    private final boolean write = false;
    private final boolean delete = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.security.PlatypusGroup> groups = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<M, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> rule = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getRead() {
        return false;
    }
    
    public final boolean getWrite() {
        return false;
    }
    
    public final boolean getDelete() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.security.PlatypusGroup> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<M, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getRule() {
        return null;
    }
    
    public ModelRule(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean read, boolean write, boolean delete, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.security.PlatypusGroup> groups, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> rule) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.security.PlatypusGroup> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<M, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.security.ModelRule<M> copy(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean read, boolean write, boolean delete, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.security.PlatypusGroup> groups, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> rule) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}