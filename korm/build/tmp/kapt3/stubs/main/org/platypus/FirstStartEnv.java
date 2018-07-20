package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0012H\u0016J+\u0010-\u001a\b\u0012\u0004\u0012\u0002H.0\u001a\"\u000e\b\u0000\u0010.*\b\u0012\u0004\u0012\u0002H.0/2\u0006\u00100\u001a\u0002H.H\u0016\u00a2\u0006\u0002\u00101J\b\u00102\u001a\u00020*H\u0016J\u0014\u00102\u001a\u00020*2\n\u00100\u001a\u0006\u0012\u0002\b\u00030/H\u0016J+\u00103\u001a\b\u0012\u0004\u0012\u0002H.04\"\u000e\b\u0000\u0010.*\b\u0012\u0004\u0012\u0002H.0/2\u0006\u00100\u001a\u0002H.H\u0016\u00a2\u0006\u0002\u00105J\u0010\u00106\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0012H\u0016J)\u00107\u001a\u00020\u00012\u001a\u00108\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030:09\"\u0006\u0012\u0002\b\u00030:H\u0016\u00a2\u0006\u0002\u0010;R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\u0004\u0018\u0001`\u001cX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0014\u0010%\u001a\u00020&X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006<"}, d2 = {"Lorg/platypus/FirstStartEnv;", "Lorg/platypus/PlatypusEnvironment;", "conf", "Lorg/platypus/config/PlatypusConf;", "newTransaction", "Lorg/platypus/orm/transaction/TransactionApi;", "(Lorg/platypus/config/PlatypusConf;Lorg/platypus/orm/transaction/TransactionApi;)V", "getConf", "()Lorg/platypus/config/PlatypusConf;", "context", "Lorg/platypus/context/PlatypusContext;", "getContext", "()Lorg/platypus/context/PlatypusContext;", "debug", "", "getDebug", "()Z", "envUser", "Lorg/platypus/security/PlatypusUser;", "getEnvUser", "()Lorg/platypus/security/PlatypusUser;", "internal", "Lorg/platypus/PlatypusEnvironmentInternal;", "getInternal", "()Lorg/platypus/PlatypusEnvironmentInternal;", "lang", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Languages;", "Lorg/platypus/module/base/entities/Language;", "getLang", "()Lorg/platypus/entity/Record;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "sudoUser", "getSudoUser", "timezone", "Ljava/time/ZoneId;", "getTimezone", "()Ljava/time/ZoneId;", "close", "", "connect", "user", "emptyRecordOf", "M", "Lorg/platypus/model/Model;", "model", "(Lorg/platypus/model/Model;)Lorg/platypus/entity/Record;", "flush", "repoOf", "Lorg/platypus/repository/RecordRepository;", "(Lorg/platypus/model/Model;)Lorg/platypus/repository/RecordRepository;", "sudo", "withContext", "vals", "", "Lorg/platypus/context/ContextKey$Value;", "([Lorg/platypus/context/ContextKey$Value;)Lorg/platypus/PlatypusEnvironment;", "korm"})
final class FirstStartEnv implements org.platypus.PlatypusEnvironment {
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.entity.Record<org.platypus.module.base.models.Languages> lang = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.ZoneId timezone = null;
    private final boolean debug = false;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironmentInternal internal = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.context.PlatypusContext context = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.config.PlatypusConf conf = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironmentInternal getInternal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.context.PlatypusContext getContext() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment connect(@org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.config.PlatypusConf getConf() {
        return null;
    }
    
    public FirstStartEnv(@org.jetbrains.annotations.NotNull()
    org.platypus.config.PlatypusConf conf, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi newTransaction) {
        super();
    }
}