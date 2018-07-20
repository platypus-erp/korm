package org.platypus.model;

import java.lang.System;

/**
 * * Contains all additional information for a specfic models
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/model/ModelSlots;", "", "help", "", "getHelp", "()Ljava/lang/String;", "label", "getLabel", "type", "Lorg/platypus/model/ModelType;", "getType", "()Lorg/platypus/model/ModelType;", "korm"})
public abstract interface ModelSlots {
    
    /**
     * * The display fieldName of the models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getLabel();
    
    /**
     * * A little help of what this models is used for
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getHelp();
    
    /**
     * * The type of the models
     *     * @see ModelType for more information
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.ModelType getType();
}