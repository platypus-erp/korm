package org.platypus.module.base.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001f\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"E\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\f\u0012\u0004\u0012\u00020\u00020\u000bj\u0002`\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010*\u0016\u0010\u0013\"\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0012\u0004\u0012\u00020\u00020\u000b*\u0016\u0010\u0014\"\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0012\u0004\u0012\u00020\u00020\b*\u0016\u0010\u0015\"\b\u0012\u0004\u0012\u00020\u00020\u00162\b\u0012\u0004\u0012\u00020\u00020\u0016*\u0016\u0010\u0017\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0018"}, d2 = {"groupDataRepo", "Lorg/platypus/repository/RecordRepository;", "Lorg/platypus/module/base/models/GroupsData;", "Lorg/platypus/module/base/entities/GroupDataRepository;", "Lorg/platypus/PlatypusEnvironment;", "getGroupDataRepo", "(Lorg/platypus/PlatypusEnvironment;)Lorg/platypus/repository/RecordRepository;", "<set-?>", "Lorg/platypus/bag/Bag;", "Lorg/platypus/module/base/models/Users;", "user", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/entities/GroupData;", "getUser", "(Lorg/platypus/entity/Record;)Lorg/platypus/bag/Bag;", "setUser", "(Lorg/platypus/entity/Record;Lorg/platypus/bag/Bag;)V", "user$delegate", "Lorg/platypus/model/field/impl/Many2ManyField;", "GroupData", "GroupDataBag", "GroupDataData", "Lorg/platypus/data/DataRef;", "GroupDataRepository", "korm"})
public final class GroupDataEntityKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.Many2ManyField user$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.repository.RecordRepository<org.platypus.module.base.models.GroupsData> getGroupDataRepo(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.bag.Bag<org.platypus.module.base.models.Users> getUser(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.GroupsData> $receiver) {
        return null;
    }
    
    public static final void setUser(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.GroupsData> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<org.platypus.module.base.models.Users> p1) {
    }
}