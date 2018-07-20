package org.platypus.module.base.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u001f\u001a\u00020 *\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\"\u001a6\u0010#\u001a\u00020 *\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0016\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\"0$2\b\b\u0002\u0010%\u001a\u00020 \u001a\u0016\u0010&\u001a\u0004\u0018\u00010\r*\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u001a\u0014\u0010\'\u001a\u00020(*\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\"E\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\"=\u0010\u000e\u001a\u0004\u0018\u00010\r*\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\u0010\u0000\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\"=\u0010\u0015\u001a\u0004\u0018\u00010\r*\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\u0010\u0000\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012\"\u001f\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00050\u001aj\u0002`\u001b*\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e*\u0016\u0010)\"\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u0004*\u0016\u0010*\"\b\u0012\u0004\u0012\u00020\u00050\u00012\b\u0012\u0004\u0012\u00020\u00050\u0001*\u0016\u0010+\"\b\u0012\u0004\u0012\u00020\u00050,2\b\u0012\u0004\u0012\u00020\u00050,*\u0016\u0010-\"\b\u0012\u0004\u0012\u00020\u00050\u001a2\b\u0012\u0004\u0012\u00020\u00050\u001a\u00a8\u0006."}, d2 = {"<set-?>", "Lorg/platypus/bag/Bag;", "Lorg/platypus/module/base/models/GroupsData;", "groups", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Users;", "Lorg/platypus/module/base/entities/User;", "getGroups", "(Lorg/platypus/entity/Record;)Lorg/platypus/bag/Bag;", "setGroups", "(Lorg/platypus/entity/Record;Lorg/platypus/bag/Bag;)V", "groups$delegate", "Lorg/platypus/model/field/impl/Many2ManyField;", "", "locale", "getLocale", "(Lorg/platypus/entity/Record;)Ljava/lang/String;", "setLocale", "(Lorg/platypus/entity/Record;Ljava/lang/String;)V", "locale$delegate", "Lorg/platypus/model/field/impl/StringField;", "password", "getPassword", "setPassword", "password$delegate", "users", "Lorg/platypus/repository/RecordRepository;", "Lorg/platypus/module/base/entities/UserRepository;", "Lorg/platypus/PlatypusEnvironment;", "getUsers", "(Lorg/platypus/PlatypusEnvironment;)Lorg/platypus/repository/RecordRepository;", "hasGroup", "", "g", "Lorg/platypus/module/base/entities/GroupData;", "hasGroups", "", "all", "hashPassword", "login", "Lorg/platypus/module/base/models/UserLoginSuccess;", "User", "UserBag", "UserData", "Lorg/platypus/data/DataRef;", "UserRepository", "korm"})
public final class UserKt {
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField password$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField locale$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.Many2ManyField groups$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.repository.RecordRepository<org.platypus.module.base.models.Users> getUsers(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getPassword(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
    
    public static final void setPassword(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getLocale(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
    
    public static final void setLocale(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.bag.Bag<org.platypus.module.base.models.GroupsData> getGroups(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
    
    public static final void setGroups(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<org.platypus.module.base.models.GroupsData> p1) {
    }
    
    public static final boolean hasGroup(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.GroupsData> g) {
        return false;
    }
    
    public static final boolean hasGroups(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends org.platypus.entity.Record<org.platypus.module.base.models.GroupsData>> groups, boolean all) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.module.base.models.UserLoginSuccess login(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String hashPassword(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Users> $receiver) {
        return null;
    }
}