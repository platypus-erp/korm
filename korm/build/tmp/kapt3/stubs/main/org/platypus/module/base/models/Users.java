package org.platypus.module.base.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR<\u0010\u000e\u001a-\u0012\u0004\u0012\u00020\u0000\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R2\u0010\u0018\u001a#\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R#\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000 \u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"\u00a8\u0006("}, d2 = {"Lorg/platypus/module/base/models/Users;", "Lorg/platypus/model/Model;", "()V", "disconect", "Lorg/platypus/model/functions/one/ApiOneNoParamStacker;", "Lorg/platypus/model/functions/PublicApiReturn;", "Lorg/platypus/module/base/models/UserDisconnectReturn;", "getDisconect", "()Lorg/platypus/model/functions/one/ApiOneNoParamStacker;", "groups", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/module/base/models/GroupsData;", "getGroups", "()Lorg/platypus/model/field/impl/Many2ManyField;", "hasGroup", "Lorg/platypus/model/functions/one/ApiOneParamStacker;", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/entities/GroupData;", "Lkotlin/ParameterName;", "name", "group", "", "getHasGroup", "()Lorg/platypus/model/functions/one/ApiOneParamStacker;", "hasGroups", "Lorg/platypus/module/base/models/HasGroupsParam;", "param", "getHasGroups", "hashPassword", "", "getHashPassword", "locale", "Lorg/platypus/model/field/impl/StringField;", "getLocale", "()Lorg/platypus/model/field/impl/StringField;", "login", "Lorg/platypus/module/base/models/UserLoginSuccess;", "getLogin", "password", "getPassword", "korm"})
public final class Users extends org.platypus.model.Model<org.platypus.module.base.models.Users> {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Users> password = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.Many2ManyField<org.platypus.module.base.models.Users, org.platypus.module.base.models.GroupsData> groups = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Users> locale = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.functions.one.ApiOneParamStacker<org.platypus.module.base.models.Users, org.platypus.entity.Record<org.platypus.module.base.models.GroupsData>, java.lang.Boolean> hasGroup = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.functions.one.ApiOneParamStacker<org.platypus.module.base.models.Users, org.platypus.module.base.models.HasGroupsParam, java.lang.Boolean> hasGroups = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.functions.one.ApiOneNoParamStacker<org.platypus.module.base.models.Users, org.platypus.model.functions.PublicApiReturn<org.platypus.module.base.models.UserLoginSuccess>> login = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.functions.one.ApiOneNoParamStacker<org.platypus.module.base.models.Users, org.platypus.model.functions.PublicApiReturn<org.platypus.module.base.models.UserDisconnectReturn>> disconect = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.functions.one.ApiOneNoParamStacker<org.platypus.module.base.models.Users, java.lang.String> hashPassword = null;
    public static final org.platypus.module.base.models.Users INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Users> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.Many2ManyField<org.platypus.module.base.models.Users, org.platypus.module.base.models.GroupsData> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Users> getLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneParamStacker<org.platypus.module.base.models.Users, org.platypus.entity.Record<org.platypus.module.base.models.GroupsData>, java.lang.Boolean> getHasGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneParamStacker<org.platypus.module.base.models.Users, org.platypus.module.base.models.HasGroupsParam, java.lang.Boolean> getHasGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<org.platypus.module.base.models.Users, org.platypus.model.functions.PublicApiReturn<org.platypus.module.base.models.UserLoginSuccess>> getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<org.platypus.module.base.models.Users, org.platypus.model.functions.PublicApiReturn<org.platypus.module.base.models.UserDisconnectReturn>> getDisconect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<org.platypus.module.base.models.Users, java.lang.String> getHashPassword() {
        return null;
    }
    
    private Users() {
        super(null, null);
    }
}