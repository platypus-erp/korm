package org.platypus.ui.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001?B\u00b2\u0002\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u00a2\u0006\u0002\b\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012Y\u0010\u0016\u001aU\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00180\u001b\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u0017\u0012S\u0010\u001e\u001aO\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00180\u001b\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017\u00a2\u0006\u0002\u0010!J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u00105\u001a\u00020\tJ)\u00106\u001a\u0002H7\"\u0004\b\u0001\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H7092\u0006\u0010:\u001a\u00020;H\u0016\u00a2\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020>R^\u0010\u001e\u001aO\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00180\u001b\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%Rd\u0010\u0016\u001aU\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00180\u001b\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R$\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u00a2\u0006\u0002\b\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010(R#\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104\u00a8\u0006@"}, d2 = {"Lorg/platypus/ui/action/UIMenuAction;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/UIRenderable;", "model", "uuid", "", "name", "defaultView", "Lorg/platypus/ui/ViewType;", "viewMode", "", "htmlNoContent", "Lkotlin/Function1;", "Lkotlinx/html/DIV;", "", "Lkotlin/ExtensionFunctionType;", "help", "views", "", "Lorg/platypus/ui/ToViewApi;", "groups", "domain", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "activeId", "", "activeIds", "Lorg/platypus/context/PlatypusContext;", "context", "Lorg/platypus/orm/sql/expression/Expression;", "", "(Lorg/platypus/model/Model;Ljava/lang/String;Ljava/lang/String;Lorg/platypus/ui/ViewType;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "getContext", "()Lkotlin/jvm/functions/Function3;", "getDefaultView", "()Lorg/platypus/ui/ViewType;", "getDomain", "getGroups", "()Ljava/util/Set;", "getHelp", "()Ljava/lang/String;", "getHtmlNoContent", "()Lkotlin/jvm/functions/Function1;", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "getName", "getUuid", "getViewMode", "getViews", "()Ljava/util/Map;", "type", "render", "O", "consumer", "Lkotlinx/html/TagConsumer;", "env", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "(Lkotlinx/html/TagConsumer;Lorg/platypus/ReadOnlyPlatypusEnvironment;)Ljava/lang/Object;", "toJson", "Lcom/beust/klaxon/JsonObject;", "Builder", "korm"})
public final class UIMenuAction<M extends org.platypus.model.Model<M>> implements org.platypus.ui.UIRenderable {
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uuid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.ui.ViewType defaultView = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.ui.ViewType> viewMode = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<kotlinx.html.DIV, kotlin.Unit> htmlNoContent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String help = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<org.platypus.ui.ViewType, org.platypus.ui.ToViewApi<M>> views = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> groups = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function3<java.lang.Integer, java.util.List<java.lang.Integer>, org.platypus.context.PlatypusContext, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function3<java.lang.Integer, java.util.List<java.lang.Integer>, org.platypus.context.PlatypusContext, org.platypus.context.PlatypusContext> context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.ui.ToViewApi<M> getViews(@org.jetbrains.annotations.NotNull()
    org.platypus.ui.ViewType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.beust.klaxon.JsonObject toJson() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.ui.ViewType getDefaultView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.ui.ViewType> getViewMode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<kotlinx.html.DIV, kotlin.Unit> getHtmlNoContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHelp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.ui.ViewType, org.platypus.ui.ToViewApi<M>> getViews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.Integer, java.util.List<java.lang.Integer>, org.platypus.context.PlatypusContext, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.Integer, java.util.List<java.lang.Integer>, org.platypus.context.PlatypusContext, org.platypus.context.PlatypusContext> getContext() {
        return null;
    }
    
    private UIMenuAction(M model, java.lang.String uuid, java.lang.String name, org.platypus.ui.ViewType defaultView, java.util.Set<? extends org.platypus.ui.ViewType> viewMode, kotlin.jvm.functions.Function1<? super kotlinx.html.DIV, kotlin.Unit> htmlNoContent, java.lang.String help, java.util.Map<org.platypus.ui.ViewType, ? extends org.platypus.ui.ToViewApi<M>> views, java.util.Set<java.lang.String> groups, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, ? super org.platypus.context.PlatypusContext, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, ? super org.platypus.context.PlatypusContext, org.platypus.context.PlatypusContext> context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010ERg\u0010\b\u001aO\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRm\u0010\u001b\u001aU\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R+\u0010+\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,\u00a2\u0006\u0002\b/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010(R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010#\"\u0004\b<\u0010%R,\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010?0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C\u00a8\u0006F"}, d2 = {"Lorg/platypus/ui/action/UIMenuAction$Builder;", "M", "Lorg/platypus/model/Model;", "", "model", "uuid", "", "(Lorg/platypus/model/Model;Ljava/lang/String;)V", "context", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "activeId", "", "activeIds", "Lorg/platypus/context/PlatypusContext;", "getContext", "()Lkotlin/jvm/functions/Function3;", "setContext", "(Lkotlin/jvm/functions/Function3;)V", "defaultView", "Lorg/platypus/ui/ViewType;", "getDefaultView", "()Lorg/platypus/ui/ViewType;", "setDefaultView", "(Lorg/platypus/ui/ViewType;)V", "domain", "Lorg/platypus/orm/sql/expression/Expression;", "", "getDomain", "setDomain", "groups", "", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "help", "getHelp", "()Ljava/lang/String;", "setHelp", "(Ljava/lang/String;)V", "htmlNoContent", "Lkotlin/Function1;", "Lkotlinx/html/DIV;", "", "Lkotlin/ExtensionFunctionType;", "getHtmlNoContent", "()Lkotlin/jvm/functions/Function1;", "setHtmlNoContent", "(Lkotlin/jvm/functions/Function1;)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "getName", "setName", "getUuid", "viewMode", "getViewMode", "setViewMode", "views", "", "Lorg/platypus/ui/ToViewApi;", "getViews", "()Ljava/util/Map;", "setViews", "(Ljava/util/Map;)V", "build", "Lorg/platypus/ui/action/UIMenuAction;", "korm"})
    public static final class Builder<M extends org.platypus.model.Model<M>> {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.NotNull()
        private org.platypus.ui.ViewType defaultView;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<? extends org.platypus.ui.ViewType> viewMode;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function1<? super kotlinx.html.DIV, kotlin.Unit> htmlNoContent;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String help;
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<org.platypus.ui.ViewType, ? extends org.platypus.ui.ToViewApi<M>> views;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<java.lang.String> groups;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, ? super org.platypus.context.PlatypusContext, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, ? super org.platypus.context.PlatypusContext, org.platypus.context.PlatypusContext> context;
        @org.jetbrains.annotations.NotNull()
        private final M model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String uuid = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.ui.ViewType getDefaultView() {
            return null;
        }
        
        public final void setDefaultView(@org.jetbrains.annotations.NotNull()
        org.platypus.ui.ViewType p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.platypus.ui.ViewType> getViewMode() {
            return null;
        }
        
        public final void setViewMode(@org.jetbrains.annotations.NotNull()
        java.util.Set<? extends org.platypus.ui.ViewType> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<kotlinx.html.DIV, kotlin.Unit> getHtmlNoContent() {
            return null;
        }
        
        public final void setHtmlNoContent(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super kotlinx.html.DIV, kotlin.Unit> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHelp() {
            return null;
        }
        
        public final void setHelp(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<org.platypus.ui.ViewType, org.platypus.ui.ToViewApi<M>> getViews() {
            return null;
        }
        
        public final void setViews(@org.jetbrains.annotations.NotNull()
        java.util.Map<org.platypus.ui.ViewType, ? extends org.platypus.ui.ToViewApi<M>> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getGroups() {
            return null;
        }
        
        public final void setGroups(@org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function3<java.lang.Integer, java.util.List<java.lang.Integer>, org.platypus.context.PlatypusContext, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
            return null;
        }
        
        public final void setDomain(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, ? super org.platypus.context.PlatypusContext, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function3<java.lang.Integer, java.util.List<java.lang.Integer>, org.platypus.context.PlatypusContext, org.platypus.context.PlatypusContext> getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, ? super org.platypus.context.PlatypusContext, org.platypus.context.PlatypusContext> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.ui.action.UIMenuAction<M> build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final M getModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUuid() {
            return null;
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        M model, @org.jetbrains.annotations.NotNull()
        java.lang.String uuid) {
            super();
        }
    }
}