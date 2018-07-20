package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/model/ModelVisitor;", "PARAM", "RETURN", "", "visit", "m", "Lorg/platypus/model/Alias;", "p", "(Lorg/platypus/model/Alias;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/LinkModel;", "(Lorg/platypus/model/LinkModel;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/MixinModel;", "(Lorg/platypus/model/MixinModel;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/Model;", "(Lorg/platypus/model/Model;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface ModelVisitor<PARAM extends java.lang.Object, RETURN extends java.lang.Object> {
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> m, PARAM p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> m, PARAM p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.MixinModel<?> m, PARAM p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<?> m, PARAM p);
}