package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 L2\u00020\u0001:\u0001LB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0003H\u0016J+\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u001d\"\u000e\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H0012\u0006\u00102\u001a\u0002H0H\u0016\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u00020,H\u0016J\u0014\u00104\u001a\u00020,2\n\u00102\u001a\u0006\u0012\u0002\b\u000301H\u0016J\b\u00105\u001a\u00020,H\u0002J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J6\u00109\u001a\u00020,2 \u0010:\u001a\u001c\u0012\u0004\u0012\u00020<\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030>0=0;2\n\u00102\u001a\u0006\u0012\u0002\b\u00030?H\u0002J\u0012\u0010@\u001a\u0006\u0012\u0002\b\u0003012\u0006\u0010A\u001a\u00020BJ+\u0010C\u001a\b\u0012\u0004\u0012\u0002H00D\"\u000e\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H0012\u0006\u00102\u001a\u0002H0H\u0016\u00a2\u0006\u0002\u0010EJ\u0010\u0010F\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0003H\u0016J)\u0010G\u001a\u00020\u00012\u001a\u0010H\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030J0I\"\u0006\u0012\u0002\b\u00030JH\u0016\u00a2\u0006\u0002\u0010KR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0014\u0010\'\u001a\u00020(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u00a8\u0006M"}, d2 = {"Lorg/platypus/BaseEnvironment;", "Lorg/platypus/PlatypusEnvironment;", "envUser", "Lorg/platypus/security/PlatypusUser;", "sudoUser", "conf", "Lorg/platypus/config/PlatypusConf;", "context", "Lorg/platypus/context/PlatypusContext;", "internal", "Lorg/platypus/PlatypusEnvironmentInternal;", "(Lorg/platypus/security/PlatypusUser;Lorg/platypus/security/PlatypusUser;Lorg/platypus/config/PlatypusConf;Lorg/platypus/context/PlatypusContext;Lorg/platypus/PlatypusEnvironmentInternal;)V", "cache", "Lorg/platypus/cache/PlatypusCache;", "getCache", "()Lorg/platypus/cache/PlatypusCache;", "getConf", "()Lorg/platypus/config/PlatypusConf;", "getContext", "()Lorg/platypus/context/PlatypusContext;", "debug", "", "getDebug", "()Z", "getEnvUser", "()Lorg/platypus/security/PlatypusUser;", "getInternal", "()Lorg/platypus/PlatypusEnvironmentInternal;", "lang", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Languages;", "Lorg/platypus/module/base/entities/Language;", "getLang", "()Lorg/platypus/entity/Record;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "getSudoUser", "timezone", "Ljava/time/ZoneId;", "getTimezone", "()Ljava/time/ZoneId;", "close", "", "connect", "user", "emptyRecordOf", "M", "Lorg/platypus/model/Model;", "model", "(Lorg/platypus/model/Model;)Lorg/platypus/entity/Record;", "flush", "flushCache", "flushInsert", "toinsert", "Lorg/platypus/cache/ModelID;", "flushUpdate", "toUpdate", "", "", "", "Lorg/platypus/model/field/api/IModelField;", "Lorg/platypus/model/IModel;", "models", "name", "", "repoOf", "Lorg/platypus/repository/RecordRepository;", "(Lorg/platypus/model/Model;)Lorg/platypus/repository/RecordRepository;", "sudo", "withContext", "vals", "", "Lorg/platypus/context/ContextKey$Value;", "([Lorg/platypus/context/ContextKey$Value;)Lorg/platypus/PlatypusEnvironment;", "Companion", "korm"})
public final class BaseEnvironment implements org.platypus.PlatypusEnvironment {
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.entity.Record<org.platypus.module.base.models.Languages> lang = null;
    private final boolean debug = false;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.security.PlatypusUser envUser = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.security.PlatypusUser sudoUser = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.config.PlatypusConf conf = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.context.PlatypusContext context = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironmentInternal internal = null;
    public static final org.platypus.BaseEnvironment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment connect(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.entity.Record<org.platypus.module.base.models.Languages> getLang() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.time.ZoneId getTimezone() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getDebug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    private final org.platypus.cache.PlatypusCache getCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Model<?> models(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <M extends org.platypus.model.Model<M>>org.platypus.repository.RecordRepository<M> repoOf(@org.jetbrains.annotations.NotNull()
    M model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> emptyRecordOf(@org.jetbrains.annotations.NotNull()
    M model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment withContext(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey.Value<?>... vals) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment sudo(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user) {
        return null;
    }
    
    @java.lang.Override()
    public void flush() {
    }
    
    @java.lang.Override()
    public void flush(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> model) {
    }
    
    private final void flushCache() {
    }
    
    private final void flushUpdate(java.util.Map<java.lang.Integer, ? extends java.util.Set<? extends org.platypus.model.field.api.IModelField<?, ?>>> toUpdate, org.platypus.model.IModel<?> model) {
    }
    
    private final void flushInsert(org.platypus.cache.ModelID toinsert) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.security.PlatypusUser getEnvUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.security.PlatypusUser getSudoUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.config.PlatypusConf getConf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.context.PlatypusContext getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironmentInternal getInternal() {
        return null;
    }
    
    public BaseEnvironment(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser envUser, @org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser sudoUser, @org.jetbrains.annotations.NotNull()
    org.platypus.config.PlatypusConf conf, @org.jetbrains.annotations.NotNull()
    org.platypus.context.PlatypusContext context, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironmentInternal internal) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lorg/platypus/BaseEnvironment$Companion;", "", "()V", "create", "Lorg/platypus/BaseEnvironment;", "user", "Lorg/platypus/security/PlatypusUser;", "conf", "Lorg/platypus/config/PlatypusConf;", "context", "Lorg/platypus/context/PlatypusContext;", "newTransaction", "Lorg/platypus/orm/transaction/TransactionApi;", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.BaseEnvironment create(@org.jetbrains.annotations.Nullable()
        org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.NotNull()
        org.platypus.config.PlatypusConf conf, @org.jetbrains.annotations.NotNull()
        org.platypus.context.PlatypusContext context, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.transaction.TransactionApi newTransaction) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}