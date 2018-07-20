package org.platypus.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J>\u0010\u0016\u001a\u00020\u0017\"\b\b\u0001\u0010\u0018*\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00028\u0000X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lorg/platypus/ui/search/SearchViewBuilderExtend;", "M", "Lorg/platypus/model/Model;", "", "model", "(Lorg/platypus/model/Model;)V", "_fields", "", "Lorg/platypus/ui/tree/TreeWidgetUI;", "fields", "", "getFields", "()Ljava/util/List;", "getModel$korm", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "field", "", "T", "prop", "Lorg/platypus/model/field/api/ModelField;", "invisible", "", "groups", "", "korm"})
public final class SearchViewBuilderExtend<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private final java.util.List<org.platypus.ui.tree.TreeWidgetUI> _fields = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.platypus.ui.tree.TreeWidgetUI> getFields() {
        return null;
    }
    
    public final <T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, T> prop, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getModel$korm() {
        return null;
    }
    
    public SearchViewBuilderExtend(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
}