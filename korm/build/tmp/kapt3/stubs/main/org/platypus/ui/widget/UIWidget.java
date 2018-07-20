package org.platypus.ui.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/platypus/ui/widget/UIWidget;", "M", "Lorg/platypus/model/Model;", "T", "", "Lorg/platypus/ui/UIRenderable;", "prop", "Lorg/platypus/model/field/api/ModelField;", "getProp", "()Lorg/platypus/model/field/api/ModelField;", "korm"})
public abstract interface UIWidget<M extends org.platypus.model.Model<M>, T extends java.lang.Object> extends org.platypus.ui.UIRenderable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.field.api.ModelField<M, T> getProp();
}