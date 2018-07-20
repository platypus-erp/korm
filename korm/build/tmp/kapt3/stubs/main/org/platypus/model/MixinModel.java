package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J=\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0001\u0010\b*\u00020\t\"\b\b\u0002\u0010\u0007*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00070\u000b2\u0006\u0010\f\u001a\u0002H\bH\u0016\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/model/MixinModel;", "M", "Lorg/platypus/model/Model;", "modelName", "", "(Ljava/lang/String;)V", "accept", "RETURN", "PARAM", "", "visitor", "Lorg/platypus/model/ModelVisitor;", "p", "(Lorg/platypus/model/ModelVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract class MixinModel<M extends org.platypus.model.Model<M>> extends org.platypus.model.Model<M> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super PARAM, ? extends RETURN> visitor, @org.jetbrains.annotations.NotNull()
    PARAM p) {
        return null;
    }
    
    public MixinModel(@org.jetbrains.annotations.NotNull()
    java.lang.String modelName) {
        super(null, null);
    }
}