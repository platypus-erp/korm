package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&J\u0014\u0010\r\u001a\u00020\t2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/PlatypusEnvironment;", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "Lorg/platypus/SudoAble;", "Lorg/platypus/ContextAble;", "internal", "Lorg/platypus/PlatypusEnvironmentInternal;", "getInternal", "()Lorg/platypus/PlatypusEnvironmentInternal;", "close", "", "connect", "user", "Lorg/platypus/security/PlatypusUser;", "flush", "model", "Lorg/platypus/model/Model;", "korm"})
public abstract interface PlatypusEnvironment extends org.platypus.ReadOnlyPlatypusEnvironment, org.platypus.SudoAble<org.platypus.PlatypusEnvironment>, org.platypus.ContextAble<org.platypus.PlatypusEnvironment> {
    
    /**
     * * Store all the altered and new data to the DataBase
     */
    public abstract void flush();
    
    /**
     * * Store all the altered and new data to the DataBase for this model
     */
    public abstract void flush(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> model);
    
    /**
     * * After the call you can't call [flush]
     */
    @java.lang.Override()
    public abstract void close();
    
    /**
     * * Return a new Environement with [envUser] = [user]
     *     * [sudoUser] is reset
     *     * [context] is a copy of the current
     *     * [lang] = [user].language
     *     * [timezone] = [user].zoneId
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.PlatypusEnvironment connect(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.PlatypusEnvironmentInternal getInternal();
}