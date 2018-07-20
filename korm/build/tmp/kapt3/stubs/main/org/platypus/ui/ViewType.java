package org.platypus.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\n\u001a\u0002H\bH&\u00a2\u0006\u0002\u0010\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\f"}, d2 = {"Lorg/platypus/ui/ViewType;", "", "name", "", "getName", "()Ljava/lang/String;", "getDefaultView", "Lorg/platypus/ui/ToViewApi;", "M", "Lorg/platypus/model/Model;", "model", "(Lorg/platypus/model/Model;)Lorg/platypus/ui/ToViewApi;", "korm"})
public abstract interface ViewType {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract <M extends org.platypus.model.Model<M>>org.platypus.ui.ToViewApi<M> getDefaultView(@org.jetbrains.annotations.NotNull()
    M model);
}