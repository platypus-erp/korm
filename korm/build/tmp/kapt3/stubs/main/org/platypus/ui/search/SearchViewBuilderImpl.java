package org.platypus.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u008b\u0001\u0010\u0012\u001a\u00020\u0013\"\b\b\u0001\u0010\u0014*\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2%\u0010\u001f\u001a!\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0018\u00010 \u00a2\u0006\u0002\b#H\u0016J\u00c0\u0001\u0010\u0012\u001a\u00020\u0013\"\u000e\b\u0001\u0010$*\b\u0012\u0004\u0012\u0002H$0\u0002\"\b\b\u0002\u0010\u0014*\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H$0%2\u0006\u0010&\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2%\u0010\u001f\u001a!\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0018\u00010 \u00a2\u0006\u0002\b#2#\u0010\'\u001a\u001f\u0012\u0004\u0012\u0002H$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\u00140\u00160(\u00a2\u0006\u0002\b#H\u0016Jm\u0010)\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u001d\u0010)\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0(\u00a2\u0006\u0002\b#H\u0016J&\u0010+\u001a\u00020\u0013\"\b\b\u0001\u0010\u0014*\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00140\u0016H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006,"}, d2 = {"Lorg/platypus/ui/search/SearchViewBuilderImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/search/SearchViewBuilder;", "model", "(Lorg/platypus/model/Model;)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "build", "Lorg/platypus/ui/search/SearchView;", "uniqueName", "field", "", "T", "", "Lorg/platypus/model/field/impl/RealModelField;", "id", "label", "groups", "", "placeHolder", "cssClass", "widget", "options", "filterDomain", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/expression/Expression;", "", "Lkotlin/ExtensionFunctionType;", "TM", "Lorg/platypus/model/field/impl/ReferenceField;", "invisible", "fieldGet", "Lkotlin/Function1;", "filter", "help", "groupBy", "korm"})
public final class SearchViewBuilderImpl<M extends org.platypus.model.Model<M>> implements org.platypus.ui.search.SearchViewBuilder<M> {
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
    public <T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super M, ? super T, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> filterDomain) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>, T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> field, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super TM, ? super T, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> filterDomain, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.model.field.impl.RealModelField<TM, T>> fieldGet) {
    }
    
    @java.lang.Override()
    public void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    java.lang.String help, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> filter) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void groupBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.ui.search.SearchView build(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    public SearchViewBuilderImpl(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
}