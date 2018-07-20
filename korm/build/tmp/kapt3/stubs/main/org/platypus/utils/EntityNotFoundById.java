package org.platypus.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/utils/EntityNotFoundById;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "id", "", "modelName", "", "(ILjava/lang/String;)V", "getId", "()I", "getModelName", "()Ljava/lang/String;", "korm"})
public final class EntityNotFoundById extends java.lang.RuntimeException {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String modelName = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModelName() {
        return null;
    }
    
    public EntityNotFoundById(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String modelName) {
        super();
    }
}