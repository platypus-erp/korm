package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J \u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J \u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\u000b"}, d2 = {"Lorg/platypus/EnvironementFactory;", "", "newEnv", "Lorg/platypus/PlatypusEnvironment;", "user", "Lorg/platypus/security/PlatypusUser;", "ctx", "Lorg/platypus/context/PlatypusContext;", "newFakeEnv", "newReadOnlyEnv", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "korm"})
public abstract interface EnvironementFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.PlatypusEnvironment newEnv(@org.jetbrains.annotations.Nullable()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.context.PlatypusContext ctx);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.ReadOnlyPlatypusEnvironment newReadOnlyEnv(@org.jetbrains.annotations.Nullable()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.context.PlatypusContext ctx);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.PlatypusEnvironment newFakeEnv(@org.jetbrains.annotations.Nullable()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.context.PlatypusContext ctx);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}