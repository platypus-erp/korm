package org.platypus.model.functions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0006\b\u0002\u0010\u0005 \u00012\u00020\u0006J\u0015\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/platypus/model/functions/ApiNoParam;", "RT", "Lorg/platypus/Environmentable;", "M", "Lorg/platypus/model/IModel;", "R", "", "call", "r", "(Lorg/platypus/Environmentable;)Ljava/lang/Object;", "korm"})
public abstract interface ApiNoParam<RT extends org.platypus.Environmentable, M extends org.platypus.model.IModel<M>, R extends java.lang.Object> {
    
    public abstract R call(@org.jetbrains.annotations.NotNull()
    RT r);
}