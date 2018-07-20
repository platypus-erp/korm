package org.platypus.model.functions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0004\b\u0002\u0010\u0005*\u0004\b\u0003\u0010\u00062\u00020\u0007J\u001d\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0002H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/model/functions/ApiOneParam;", "RT", "Lorg/platypus/Environmentable;", "M", "Lorg/platypus/model/IModel;", "P", "R", "", "call", "r", "param", "(Lorg/platypus/Environmentable;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface ApiOneParam<RT extends org.platypus.Environmentable, M extends org.platypus.model.IModel<M>, P extends java.lang.Object, R extends java.lang.Object> {
    
    public abstract R call(@org.jetbrains.annotations.NotNull()
    RT r, P param);
}