package org.platypus.module.base.models;

import java.lang.System;

/**
 * * This model don't have a generated entity but an hand coded one to fit to some feature the platypus framework need
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/module/base/models/GroupsData;", "Lorg/platypus/model/Model;", "()V", "users", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/module/base/models/Users;", "getUsers", "()Lorg/platypus/model/field/impl/Many2ManyField;", "korm"})
public final class GroupsData extends org.platypus.model.Model<org.platypus.module.base.models.GroupsData> {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.Many2ManyField<org.platypus.module.base.models.GroupsData, org.platypus.module.base.models.Users> users = null;
    public static final org.platypus.module.base.models.GroupsData INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.Many2ManyField<org.platypus.module.base.models.GroupsData, org.platypus.module.base.models.Users> getUsers() {
        return null;
    }
    
    private GroupsData() {
        super(null, null);
    }
}