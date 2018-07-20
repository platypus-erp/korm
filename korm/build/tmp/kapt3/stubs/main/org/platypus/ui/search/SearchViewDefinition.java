package org.platypus.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B:\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000b\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J2\u0010 \u001a\u0006\u0012\u0002\b\u00030!*\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002J\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'*\u00020\"H\u0000\u00a2\u0006\u0002\b)J&\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030-\u0012\u0004\u0012\u00020.0,0+*\u00020\u001dH\u0002R!\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006/"}, d2 = {"Lorg/platypus/ui/search/SearchViewDefinition;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/ToViewApi;", "uniqueName", "", "model", "def", "Lkotlin/Function2;", "Lorg/platypus/ui/search/SearchViewBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function2;)V", "builder", "Lorg/platypus/ui/search/SearchViewBuilderImpl;", "getBuilder", "()Lorg/platypus/ui/search/SearchViewBuilderImpl;", "builder$delegate", "Lkotlin/Lazy;", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "getUniqueName", "()Ljava/lang/String;", "querySearch", "Lorg/platypus/orm/sql/query/SearchQuery;", "env", "Lorg/platypus/PlatypusEnvironment;", "param", "Lorg/platypus/web/SearchTreeParam;", "toViewApi", "Lorg/platypus/ui/ViewApi;", "getRightValue", "Lorg/platypus/orm/sql/expression/LiteralOp;", "Lcom/beust/klaxon/JsonObject;", "valueName", "prefix", "suffix", "jsonFilterToPredicate", "Lorg/platypus/orm/sql/expression/Expression;", "", "jsonFilterToPredicate$korm", "splitOrderBy", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "korm"})
public final class SearchViewDefinition<M extends org.platypus.model.Model<M>> implements org.platypus.ui.ToViewApi<M> {
    private final kotlin.Lazy builder$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uniqueName = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    private final kotlin.jvm.functions.Function2<org.platypus.ui.search.SearchViewBuilder<M>, M, kotlin.Unit> def = null;
    
    private final org.platypus.ui.search.SearchViewBuilderImpl<M> getBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.ui.ViewApi toViewApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> querySearch(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.web.SearchTreeParam param) {
        return null;
    }
    
    private final java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<?, ?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> splitOrderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.web.SearchTreeParam $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> jsonFilterToPredicate$korm(@org.jetbrains.annotations.NotNull()
    com.beust.klaxon.JsonObject $receiver) {
        return null;
    }
    
    private final org.platypus.orm.sql.expression.LiteralOp<?> getRightValue(@org.jetbrains.annotations.NotNull()
    com.beust.klaxon.JsonObject $receiver, java.lang.String valueName, java.lang.String prefix, java.lang.String suffix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUniqueName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    public SearchViewDefinition(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.search.SearchViewBuilder<M>, ? super M, kotlin.Unit> def) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.ui.ViewApiType getViewType() {
        return null;
    }
}