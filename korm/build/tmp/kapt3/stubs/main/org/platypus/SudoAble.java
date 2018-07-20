package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/SudoAble;", "T", "", "sudo", "user", "Lorg/platypus/security/PlatypusUser;", "(Lorg/platypus/security/PlatypusUser;)Ljava/lang/Object;", "korm"})
public abstract interface SudoAble<T extends java.lang.Object> {
    
    public abstract T sudo(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}