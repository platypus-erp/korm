package org.platypus.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/exceptions/PlatypusForbiddenActionRule;", "Lorg/platypus/exceptions/PlatypusExceptions;", "rule", "Lorg/platypus/security/ModelRule;", "(Lorg/platypus/security/ModelRule;)V", "getRule", "()Lorg/platypus/security/ModelRule;", "korm"})
public final class PlatypusForbiddenActionRule extends org.platypus.exceptions.PlatypusExceptions {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.security.ModelRule<?> rule = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.security.ModelRule<?> getRule() {
        return null;
    }
    
    public PlatypusForbiddenActionRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.ModelRule<?> rule) {
    }
}