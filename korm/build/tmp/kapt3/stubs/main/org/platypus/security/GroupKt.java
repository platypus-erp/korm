package org.platypus.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\f*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\",\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\"4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"ROOT_GROUP", "Lorg/platypus/security/PlatypusGroup;", "getROOT_GROUP", "()Lorg/platypus/security/PlatypusGroup;", "value", "", "name", "Lorg/platypus/security/PlatypusGroupBuilderData;", "getName", "(Lorg/platypus/security/PlatypusGroupBuilderData;)Ljava/lang/String;", "setName", "(Lorg/platypus/security/PlatypusGroupBuilderData;Ljava/lang/String;)V", "", "Lorg/platypus/security/PlatypusUser;", "users", "getUsers", "(Lorg/platypus/security/PlatypusGroupBuilderData;)Ljava/util/Set;", "setUsers", "(Lorg/platypus/security/PlatypusGroupBuilderData;Ljava/util/Set;)V", "toSetPlatypusGroup", "Lorg/platypus/bag/Bag;", "Lorg/platypus/module/base/models/GroupsData;", "Lorg/platypus/module/base/entities/GroupDataBag;", "korm"})
public final class GroupKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.security.PlatypusGroup ROOT_GROUP = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.security.PlatypusGroup getROOT_GROUP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<org.platypus.security.PlatypusGroup> toSetPlatypusGroup(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<org.platypus.module.base.models.GroupsData> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<org.platypus.security.PlatypusUser> getUsers(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroupBuilderData $receiver) {
        return null;
    }
    
    public static final void setUsers(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroupBuilderData $receiver, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.security.PlatypusUser> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getName(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroupBuilderData $receiver) {
        return null;
    }
    
    public static final void setName(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroupBuilderData $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
}