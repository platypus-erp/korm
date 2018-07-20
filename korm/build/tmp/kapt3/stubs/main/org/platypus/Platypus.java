package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u001d\u001a\u00020\u001eH\u0000\u00a2\u0006\u0002\b\u001fJ\b\u0010 \u001a\u00020\u001eH\u0002J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000fH\u0002J\r\u0010#\u001a\u00020$H\u0000\u00a2\u0006\u0002\b%J\b\u0010&\u001a\u00020\u001eH\u0002J\u0016\u0010\'\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0)H\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u000fH\u0002J\u001c\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010$H\u0016J\u001c\u00100\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010$H\u0016J\u001c\u00101\u001a\u0002022\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010$H\u0016J\u0006\u00103\u001a\u00020\u001eJ\u001a\u00104\u001a\u00020\u001e*\u00020,2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0)H\u0002R\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\b\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00066"}, d2 = {"Lorg/platypus/Platypus;", "Lorg/platypus/EnvironementFactory;", "conf", "Lorg/platypus/config/PlatypusConf;", "(Lorg/platypus/config/PlatypusConf;)V", "LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER$1", "getConf", "()Lorg/platypus/config/PlatypusConf;", "db", "Lorg/platypus/orm/transaction/SqlTransactionFactory;", "loadedModule", "", "Lorg/platypus/module/PlatypusModuleInfo;", "loadedModuleData", "locales", "", "Ljava/util/Locale;", "[Ljava/util/Locale;", "memoryCache", "Lorg/platypus/cache/PlatypusCache;", "server", "Lio/ktor/server/engine/ApplicationEngine;", "trMode", "Lorg/platypus/orm/transaction/TransactionMode;", "getTrMode", "()Lorg/platypus/orm/transaction/TransactionMode;", "connect", "", "connect$korm", "createOrUpdateDatabase", "init", "module", "initContext", "Lorg/platypus/context/PlatypusContext;", "initContext$korm", "loadBase", "loadDepends", "dependsModule", "", "loadModule", "newEnv", "Lorg/platypus/PlatypusEnvironment;", "user", "Lorg/platypus/security/PlatypusUser;", "ctx", "newFakeEnv", "newReadOnlyEnv", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "start", "loadData", "Companion", "korm"})
public final class Platypus implements org.platypus.EnvironementFactory {
    private final org.slf4j.Logger LOGGER$1 = null;
    private final org.platypus.orm.transaction.SqlTransactionFactory db = null;
    private final java.util.Set<org.platypus.module.PlatypusModuleInfo> loadedModule = null;
    private final java.util.Set<org.platypus.module.PlatypusModuleInfo> loadedModuleData = null;
    private final org.platypus.cache.PlatypusCache memoryCache = null;
    private io.ktor.server.engine.ApplicationEngine server;
    private final java.util.Locale[] locales = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.transaction.TransactionMode trMode = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.config.PlatypusConf conf = null;
    private static final org.slf4j.Logger LOGGER = null;
    private static final java.util.Map<java.util.Locale, org.platypus.i18n.PlatypusI18N> i18nMap = null;
    public static final org.platypus.Platypus.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.transaction.TransactionMode getTrMode() {
        return null;
    }
    
    private final org.platypus.Platypus init(org.platypus.module.PlatypusModuleInfo module) {
        return null;
    }
    
    private final void createOrUpdateDatabase() {
    }
    
    public final void start() {
    }
    
    public final void connect$korm() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.context.PlatypusContext initContext$korm() {
        return null;
    }
    
    private final void loadDepends(java.util.Set<? extends org.platypus.module.PlatypusModuleInfo> dependsModule) {
    }
    
    private final void loadModule(org.platypus.module.PlatypusModuleInfo module) {
    }
    
    private final void loadData(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver, java.util.Set<? extends org.platypus.module.PlatypusModuleInfo> dependsModule) {
    }
    
    private final void loadBase() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment newEnv(@org.jetbrains.annotations.Nullable()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.context.PlatypusContext ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.ReadOnlyPlatypusEnvironment newReadOnlyEnv(@org.jetbrains.annotations.Nullable()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.context.PlatypusContext ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment newFakeEnv(@org.jetbrains.annotations.Nullable()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.context.PlatypusContext ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.config.PlatypusConf getConf() {
        return null;
    }
    
    private Platypus(org.platypus.config.PlatypusConf conf) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\b\u0010J\'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\b\u0010R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/platypus/Platypus$Companion;", "", "()V", "LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "i18nMap", "", "Ljava/util/Locale;", "Lorg/platypus/i18n/PlatypusI18N;", "create", "Lorg/platypus/Platypus;", "init", "Lkotlin/Function1;", "Lorg/platypus/config/PlatypusConf$Companion;", "", "Lkotlin/ExtensionFunctionType;", "i18nDef", "local", "def", "korm"})
    public static final class Companion {
        
        public final void i18nDef(@org.jetbrains.annotations.NotNull()
        java.util.Locale local, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.i18n.PlatypusI18N, kotlin.Unit> def) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.Platypus create(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.config.PlatypusConf.Companion, kotlin.Unit> init) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}