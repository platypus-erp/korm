package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR-\u0010\n\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007`\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lorg/platypus/module/ActionHolder;", "M", "Lorg/platypus/model/Model;", "", "()V", "actions", "", "Lorg/platypus/ui/action/UIMenuAction;", "getActions", "()Ljava/util/Set;", "datas", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getDatas", "()Ljava/util/HashSet;", "add", "", "view", "korm"})
public final class ActionHolder<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<org.platypus.ui.action.UIMenuAction<M>> datas = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<org.platypus.ui.action.UIMenuAction<M>> getDatas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.ui.action.UIMenuAction<M>> getActions() {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    org.platypus.ui.action.UIMenuAction<M> view) {
    }
    
    public ActionHolder() {
        super();
    }
}