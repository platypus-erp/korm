package org.platypus.ui.tree;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ)\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0001\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lorg/platypus/ui/tree/TreeViewGenerator;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/ViewApi;", "uniqueName", "", "model", "def", "Lorg/platypus/ui/tree/TreeViewBuilder;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lorg/platypus/ui/tree/TreeViewBuilder;)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "view", "Lorg/platypus/ui/tree/TreeView;", "getView", "()Lorg/platypus/ui/tree/TreeView;", "view$delegate", "Lkotlin/Lazy;", "render", "O", "consumer", "Lkotlinx/html/TagConsumer;", "env", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "(Lkotlinx/html/TagConsumer;Lorg/platypus/ReadOnlyPlatypusEnvironment;)Ljava/lang/Object;", "korm"})
public final class TreeViewGenerator<M extends org.platypus.model.Model<M>> implements org.platypus.ui.ViewApi {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy view$delegate = null;
    private final java.lang.String uniqueName = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    private final org.platypus.ui.tree.TreeViewBuilder<M> def = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.ui.tree.TreeView getView() {
        return null;
    }
    
    @java.lang.Override()
    public <O extends java.lang.Object>O render(@org.jetbrains.annotations.NotNull()
    kotlinx.html.TagConsumer<? extends O> consumer, @org.jetbrains.annotations.NotNull()
    org.platypus.ReadOnlyPlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getModel() {
        return null;
    }
    
    public TreeViewGenerator(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    org.platypus.ui.tree.TreeViewBuilder<M> def) {
        super();
    }
}