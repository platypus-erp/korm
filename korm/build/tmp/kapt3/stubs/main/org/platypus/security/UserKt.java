package org.platypus.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016\u001a\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\f\u0012\u0004\u0012\u00020\u00150\u0018j\u0002`\u0019\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\",\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"ROOT_USER", "Lorg/platypus/security/PlatypusUser;", "getROOT_USER", "()Lorg/platypus/security/PlatypusUser;", "value", "", "Lorg/platypus/security/PlatypusGroup;", "groups", "Lorg/platypus/security/PlatypusUserBuilderData;", "getGroups", "(Lorg/platypus/security/PlatypusUserBuilderData;)Ljava/util/Set;", "setGroups", "(Lorg/platypus/security/PlatypusUserBuilderData;Ljava/util/Set;)V", "", "name", "getName", "(Lorg/platypus/security/PlatypusUserBuilderData;)Ljava/lang/String;", "setName", "(Lorg/platypus/security/PlatypusUserBuilderData;Ljava/lang/String;)V", "toPlatypusUser", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Users;", "Lorg/platypus/module/base/entities/User;", "toSetPlatypusUser", "Lorg/platypus/bag/Bag;", "Lorg/platypus/module/base/entities/UserBag;", "korm"})
public final class UserKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.security.PlatypusUser ROOT_USER = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.security.PlatypusUser getROOT_USER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<org.platypus.security.PlatypusUser> toSetPlatypusUser(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.security.PlatypusUser toPlatypusUser(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<org.platypus.security.PlatypusGroup> getGroups(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUserBuilderData $receiver) {
        return null;
    }
    
    public static final void setGroups(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUserBuilderData $receiver, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.security.PlatypusGroup> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getName(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUserBuilderData $receiver) {
        return null;
    }
    
    public static final void setName(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUserBuilderData $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
}