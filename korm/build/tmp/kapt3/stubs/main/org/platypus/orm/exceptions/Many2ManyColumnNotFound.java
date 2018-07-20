package org.platypus.orm.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/orm/exceptions/Many2ManyColumnNotFound;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "model", "Lorg/platypus/model/IModel;", "target", "Lorg/platypus/model/Model;", "(Lorg/platypus/model/IModel;Lorg/platypus/model/Model;)V", "korm"})
public final class Many2ManyColumnNotFound extends java.lang.RuntimeException {
    
    public Many2ManyColumnNotFound(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> target) {
        super();
    }
}