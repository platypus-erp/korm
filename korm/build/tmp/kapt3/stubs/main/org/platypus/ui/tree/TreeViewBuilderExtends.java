package org.platypus.ui.tree;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J&\u0010\u0004\u001a\u00020\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00060\tH&\u00a8\u0006\n"}, d2 = {"Lorg/platypus/ui/tree/TreeViewBuilderExtends;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/tree/TreeViewBuilder;", "find", "", "T", "", "field", "Lorg/platypus/model/field/impl/SimpleField;", "korm"})
public abstract interface TreeViewBuilderExtends<M extends org.platypus.model.Model<M>> extends org.platypus.ui.tree.TreeViewBuilder<M> {
    
    public abstract <T extends java.lang.Object>void find(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SimpleField<M, T> field);
}