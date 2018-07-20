package org.platypus.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH&J\u009b\u0001\u0010\u0010\u001a\u00020\u0011\"\b\b\u0001\u0010\u0012*\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00120\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\'\b\u0002\u0010\u001c\u001a!\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d\u00a2\u0006\u0002\b H&J\u00ce\u0001\u0010\u0010\u001a\u00020\u0011\"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0002\"\b\b\u0002\u0010\u0012*\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0\"2\b\b\u0002\u0010#\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\'\b\u0002\u0010\u001c\u001a!\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d\u00a2\u0006\u0002\b 2#\u0010$\u001a\u001f\u0012\u0004\u0012\u0002H!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u00120\u00130%\u00a2\u0006\u0002\b H&Jy\u0010&\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\'\u001a\u00020\b2\u001d\u0010&\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0%\u00a2\u0006\u0002\b H&J&\u0010(\u001a\u00020\u0011\"\b\b\u0001\u0010\u0012*\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00120\u0013H&R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006)"}, d2 = {"Lorg/platypus/ui/search/SearchViewBuilder;", "M", "Lorg/platypus/model/Model;", "", "model", "getModel", "()Lorg/platypus/model/Model;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "build", "Lorg/platypus/ui/search/SearchView;", "uniqueName", "field", "", "T", "Lorg/platypus/model/field/impl/RealModelField;", "id", "label", "groups", "", "placeHolder", "cssClass", "widget", "options", "filterDomain", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/expression/Expression;", "", "Lkotlin/ExtensionFunctionType;", "TM", "Lorg/platypus/model/field/impl/ReferenceField;", "invisible", "fieldGet", "Lkotlin/Function1;", "filter", "help", "groupBy", "korm"})
public abstract interface SearchViewBuilder<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getTitle();
    
    public abstract void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    /**
     * * Add a simple field to the Tree view
     */
    public abstract <T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super M, ? super T, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> filterDomain);
    
    /**
     * * Add a field from a relation to the Tree view
     */
    public abstract <TM extends org.platypus.model.Model<TM>, T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> field, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super TM, ? super T, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> filterDomain, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.model.field.impl.RealModelField<TM, T>> fieldGet);
    
    public abstract void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    java.lang.String help, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> filter);
    
    public abstract <T extends java.lang.Object>void groupBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.ui.search.SearchView build(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}