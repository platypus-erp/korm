package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0\u0013\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0$2\u0006\u0010%\u001a\u0002H#H&\u00a2\u0006\u0002\u0010&J+\u0010\'\u001a\b\u0012\u0004\u0012\u0002H#0(\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0$2\u0006\u0010%\u001a\u0002H#H&\u00a2\u0006\u0002\u0010)R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0012\u0010\u001e\u001a\u00020\u001fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!\u00a8\u0006*"}, d2 = {"Lorg/platypus/ReadOnlyPlatypusEnvironment;", "Ljava/lang/AutoCloseable;", "conf", "Lorg/platypus/config/PlatypusConf;", "getConf", "()Lorg/platypus/config/PlatypusConf;", "context", "Lorg/platypus/context/PlatypusContext;", "getContext", "()Lorg/platypus/context/PlatypusContext;", "debug", "", "getDebug", "()Z", "envUser", "Lorg/platypus/security/PlatypusUser;", "getEnvUser", "()Lorg/platypus/security/PlatypusUser;", "lang", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Languages;", "Lorg/platypus/module/base/entities/Language;", "getLang", "()Lorg/platypus/entity/Record;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "sudoUser", "getSudoUser", "timezone", "Ljava/time/ZoneId;", "getTimezone", "()Ljava/time/ZoneId;", "emptyRecordOf", "M", "Lorg/platypus/model/Model;", "model", "(Lorg/platypus/model/Model;)Lorg/platypus/entity/Record;", "repoOf", "Lorg/platypus/repository/RecordRepository;", "(Lorg/platypus/model/Model;)Lorg/platypus/repository/RecordRepository;", "korm"})
public abstract interface ReadOnlyPlatypusEnvironment extends java.lang.AutoCloseable {
    
    /**
     * * Return the value passed to the configuration
     *     * @see org.platypus.api.config.PlatypusConf.debug
     */
    public abstract boolean getDebug();
    
    /**
     * * The configuration of the server
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.config.PlatypusConf getConf();
    
    /**
     * * The current context of the environement
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.context.PlatypusContext getContext();
    
    /**
     * * The current user who trigger the current action
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.security.PlatypusUser getEnvUser();
    
    /**
     * * The sudo user work like in Unix, GNU/Linux Os.
     *     * If [sudoUser] and [envUser] are not the same the [sudoUser] is used to check the access
     *     * if the [envUser] don't have the minimal grant to perform the wanted action
     *     *
     *     * [sudoUser] return the current sudo user or the same value of the [envUser] property
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.security.PlatypusUser getSudoUser();
    
    /**
     * * The language of the current User
     *     * If the [sudoUser] is set the language don't change
     */
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.entity.Record<org.platypus.module.base.models.Languages> getLang();
    
    /**
     * * The timezone of the current User
     *     * If the [sudoUser] is set the timezone don't change
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.time.ZoneId getTimezone();
    
    /**
     * * A generic logger if you wan't to log somethings is the application log
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.slf4j.Logger getLogger();
    
    @org.jetbrains.annotations.NotNull()
    public abstract <M extends org.platypus.model.Model<M>>org.platypus.repository.RecordRepository<M> repoOf(@org.jetbrains.annotations.NotNull()
    M model);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> emptyRecordOf(@org.jetbrains.annotations.NotNull()
    M model);
}