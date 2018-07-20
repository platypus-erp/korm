package org.platypus.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lorg/platypus/security/PlatypusGroup;", "", "externalRef", "", "(Ljava/lang/String;)V", "getExternalRef", "()Ljava/lang/String;", "internalUsers", "", "Lorg/platypus/security/PlatypusUser;", "getInternalUsers$korm", "()Ljava/util/Set;", "setInternalUsers$korm", "(Ljava/util/Set;)V", "users", "getUsers", "getData", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/GroupsData;", "Lorg/platypus/module/base/entities/GroupData;", "env", "Lorg/platypus/PlatypusEnvironment;", "korm"})
public final class PlatypusGroup {
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<org.platypus.security.PlatypusUser> internalUsers;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String externalRef = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.entity.Record<org.platypus.module.base.models.GroupsData> getData(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.security.PlatypusUser> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.security.PlatypusUser> getInternalUsers$korm() {
        return null;
    }
    
    public final void setInternalUsers$korm(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.security.PlatypusUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExternalRef() {
        return null;
    }
    
    public PlatypusGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String externalRef) {
        super();
    }
}