package org.platypus.ui.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lorg/platypus/ui/form/FormViewApi;", "Lorg/platypus/ui/ViewApi;", "model", "Lorg/platypus/model/Model;", "view", "Lorg/platypus/ui/form/FormViewBuilder;", "(Lorg/platypus/model/Model;Lorg/platypus/ui/form/FormViewBuilder;)V", "css", "", "getCss", "()Ljava/lang/String;", "imports", "", "getImports", "()Ljava/util/Set;", "getModel", "()Lorg/platypus/model/Model;", "getView", "()Lorg/platypus/ui/form/FormViewBuilder;", "render", "O", "consumer", "Lkotlinx/html/TagConsumer;", "env", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "(Lkotlinx/html/TagConsumer;Lorg/platypus/ReadOnlyPlatypusEnvironment;)Ljava/lang/Object;", "renderWidget", "", "engine", "Lorg/platypus/ui/PlatypusUiRenderEngine;", "korm"})
public final class FormViewApi implements org.platypus.ui.ViewApi {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> imports = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Model<?> model = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.ui.form.FormViewBuilder<?> view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getImports() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCss() {
        return null;
    }
    
    private final void renderWidget(org.platypus.ui.PlatypusUiRenderEngine engine) {
    }
    
    @java.lang.Override()
    public <O extends java.lang.Object>O render(@org.jetbrains.annotations.NotNull()
    kotlinx.html.TagConsumer<? extends O> consumer, @org.jetbrains.annotations.NotNull()
    org.platypus.ReadOnlyPlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Model<?> getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.ui.form.FormViewBuilder<?> getView() {
        return null;
    }
    
    public FormViewApi(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> model, @org.jetbrains.annotations.NotNull()
    org.platypus.ui.form.FormViewBuilder<?> view) {
        super();
    }
}