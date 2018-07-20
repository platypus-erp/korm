package org.platypus.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005\u00a8\u0006\u0011"}, d2 = {"Lorg/platypus/ui/search/SearchView;", "", "css", "", "getCss", "()Ljava/lang/String;", "elements", "", "Lorg/platypus/ui/UIElement;", "getElements", "()Ljava/util/List;", "model", "Lorg/platypus/model/Model;", "getModel", "()Lorg/platypus/model/Model;", "uniqueId", "getUniqueId", "korm"})
public abstract interface SearchView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUniqueId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.platypus.ui.UIElement> getElements();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCss();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.Model<?> getModel();
}