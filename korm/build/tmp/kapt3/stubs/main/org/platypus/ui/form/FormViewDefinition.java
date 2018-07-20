package org.platypus.ui.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B:\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000b\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R+\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lorg/platypus/ui/form/FormViewDefinition;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/ToViewApi;", "uniqueName", "", "model", "def", "Lkotlin/Function2;", "Lorg/platypus/ui/form/FormViewBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function2;)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "getUniqueName", "()Ljava/lang/String;", "querySearch", "Lorg/platypus/orm/sql/query/SearchQuery;", "env", "Lorg/platypus/PlatypusEnvironment;", "param", "Lorg/platypus/web/SearchTreeParam;", "toViewApi", "Lorg/platypus/ui/ViewApi;", "korm"})
public final class FormViewDefinition<M extends org.platypus.model.Model<M>> implements org.platypus.ui.ToViewApi<M> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uniqueName = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    private final kotlin.jvm.functions.Function2<org.platypus.ui.form.FormViewBuilder<M>, M, kotlin.Unit> def = null;
    
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
    
    public FormViewDefinition(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.form.FormViewBuilder<M>, ? super M, kotlin.Unit> def) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.ui.ViewApiType getViewType() {
        return null;
    }
}