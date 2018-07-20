package org.platypus.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/ui/SearchableView;", "", "searchView", "Lorg/platypus/ui/ToViewApi;", "getSearchView", "()Lorg/platypus/ui/ToViewApi;", "korm"})
public abstract interface SearchableView {
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.ui.ToViewApi<?> getSearchView();
}