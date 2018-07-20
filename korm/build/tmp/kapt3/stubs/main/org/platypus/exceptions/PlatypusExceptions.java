package org.platypus.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lorg/platypus/exceptions/PlatypusExceptions;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "msg", "", "(Ljava/lang/String;)V", "Lorg/platypus/exceptions/ValidationError;", "Lorg/platypus/exceptions/ElementNotFound;", "Lorg/platypus/exceptions/PlatypusForbiddenActionGroup;", "Lorg/platypus/exceptions/PlatypusForbiddenActionRule;", "korm"})
public abstract class PlatypusExceptions extends java.lang.RuntimeException {
    
    private PlatypusExceptions(java.lang.String msg) {
        super();
    }
}