package org.platypus.ui.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005JF\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016Je\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u001d\u0010\u001c\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00100\u001d\u00a2\u0006\u0002\b\u001eH\u0016Jl\u0010\u001f\u001a\u00020\u0010\"\b\b\u0001\u0010 *\u00020!2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H 0\"2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016Ju\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u001d\u0010\u001c\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00100\u001d\u00a2\u0006\u0002\b\u001eH\u0016J\"\u0010(\u001a\u00020\u00102\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001dH\u0016JN\u0010\'\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016Je\u0010+\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u001d\u0010\u001c\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00100\u001d\u00a2\u0006\u0002\b\u001eH\u0016Jf\u0010\u001f\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0-2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016Jf\u0010\u001f\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0.2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0095\u0001\u0010\u001f\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002\"\b\b\u0002\u0010 *\u00020!*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0/2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2#\u00100\u001a\u001f\u0012\u0004\u0012\u0002H,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H 010\u001d\u00a2\u0006\u0002\b\u001eH\u0016Jf\u0010\u001f\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,022\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u008b\u0001\u00103\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0-2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2#\u0010\u001c\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H,05\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020\u001004\u00a2\u0006\u0002\b\u001eH\u0016J\u008b\u0001\u00103\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0.2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2#\u0010\u001c\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H,05\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020\u001004\u00a2\u0006\u0002\b\u001eH\u0016JG\u0010(\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0/2\u001d\u0010)\u001a\u0019\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u0002H,060\u001d\u00a2\u0006\u0002\b\u001eH\u0016JG\u00107\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0-2\u001d\u0010)\u001a\u0019\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u0002H,050\u001d\u00a2\u0006\u0002\b\u001eH\u0016JG\u00107\u001a\u00020\u0010\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H,0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0.2\u001d\u0010)\u001a\u0019\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u0002H,050\u001d\u00a2\u0006\u0002\b\u001eH\u0016J\\\u0010\'\u001a\u00020\u0010*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003012\u0006\u0010\'\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u00069"}, d2 = {"Lorg/platypus/ui/form/FormViewBuilderImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/form/FormViewBuilder;", "model", "(Lorg/platypus/model/Model;)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "a", "", "invisible", "", "groups", "", "href", "id", "cssClass", "widget", "options", "div", "placeHolder", "function", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "field", "T", "", "Lorg/platypus/model/field/impl/RealModelField;", "readonly", "group", "col", "", "label", "includeForm", "functionGetter", "Lorg/platypus/ui/form/ModelFormViews;", "p", "TM", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/ReferenceField;", "fieldGet", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "fieldTree", "Lkotlin/Function2;", "Lorg/platypus/ui/tree/TreeViewBuilder;", "Lorg/platypus/ui/form/FormViewDefinition;", "includeTree", "Lorg/platypus/ui/tree/TreeViews;", "korm"})
public final class FormViewBuilderImpl<M extends org.platypus.model.Model<M>> implements org.platypus.ui.form.FormViewBuilder<M> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void group(int col, @org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    @java.lang.Override()
    public void div(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    @java.lang.Override()
    public void p(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    @java.lang.Override()
    public void a(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String href, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public void label(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, ?> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public void label(@org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public void includeForm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.ModelFormViews, ? extends org.platypus.ui.form.FormViewBuilder<M>> functionGetter) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void includeForm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.ModelFormViews, org.platypus.ui.form.FormViewDefinition<TM>> functionGetter) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void includeTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.tree.TreeViews, ? extends org.platypus.ui.tree.TreeViewBuilder<TM>> functionGetter) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void includeTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.tree.TreeViews, ? extends org.platypus.ui.tree.TreeViewBuilder<TM>> functionGetter) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field, boolean invisible, boolean readonly, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void fieldTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.tree.TreeViewBuilder<TM>, ? super TM, kotlin.Unit> function) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void fieldTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.tree.TreeViewBuilder<TM>, ? super TM, kotlin.Unit> function) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>, T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.model.field.api.ModelField<TM, T>> fieldGet) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    public FormViewBuilderImpl(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    public void buttonBox(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void unaryPlus(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
    }
    
    public void sheet(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void h1(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void h2(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void h3(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void h4(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void h5(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void h6(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void notebook(int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void page(int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void header(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
    }
    
    public void button(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<?, ?> field, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String options) {
    }
    
    public void buttonAction(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<org.platypus.ui.UIElementAttribute, ? extends kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>>> attrs, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act) {
    }
    
    public <T extends java.lang.Object>void fieldButton(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.ButtonFieldBuilder<M, T>, kotlin.Unit> function) {
    }
}