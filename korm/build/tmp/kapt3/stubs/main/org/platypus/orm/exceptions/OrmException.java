package org.platypus.orm.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/platypus/orm/exceptions/OrmException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "env", "Lorg/platypus/PlatypusEnvironment;", "cause", "", "(Ljava/lang/String;Lorg/platypus/PlatypusEnvironment;Ljava/lang/Throwable;)V", "korm"})
public abstract class OrmException extends java.lang.RuntimeException {
    
    public OrmException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super();
    }
}