package org.platypus.ui.tree;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nH\u0016Jl\u0010.\u001a\u00020/2\u0010\u00100\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u000202012\b\u00103\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010\n2\b\u00106\u001a\u0004\u0018\u00010\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u00109\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\nH\u0016J\u00b0\u0001\u0010<\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u00109\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010\n2\b\u0010=\u001a\u0004\u0018\u00010\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u00010\n2+\u0010>\u001a\'\u0012\u0004\u0012\u00020@\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100B0A\u00a2\u0006\u0002\bC\u0018\u00010?2\b\u0010;\u001a\u0004\u0018\u00010\n2\u001d\u0010D\u001a\u0019\u0012\u0004\u0012\u00020E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000F0A\u00a2\u0006\u0002\bCH\u0016Jt\u00100\u001a\u00020/2\u0010\u00100\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003012\u0006\u00109\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n082\b\u0010H\u001a\u0004\u0018\u00010\n2\b\u00103\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u0010:\u001a\u0004\u0018\u00010\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\nH\u0016J\u00b5\u0001\u00100\u001a\u00020/\"\u000e\b\u0001\u0010I*\b\u0012\u0004\u0012\u0002HI0\u0002\"\b\b\u0002\u0010J*\u0002022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HI0K2\u0006\u00109\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n082\b\u0010H\u001a\u0004\u0018\u00010\n2\b\u00103\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u0010:\u001a\u0004\u0018\u00010\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\n2#\u0010L\u001a\u001f\u0012\u0004\u0012\u0002HI\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002HI\u0012\u0004\u0012\u0002HJ010A\u00a2\u0006\u0002\bCH\u0016J&\u0010M\u001a\u00020/\"\b\b\u0001\u0010J*\u0002022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HJ0NH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020\b0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u00a8\u0006O"}, d2 = {"Lorg/platypus/ui/tree/TreeViewBuilderImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/tree/TreeViewBuilderExtends;", "model", "(Lorg/platypus/model/Model;)V", "_fields", "", "Lorg/platypus/ui/tree/TreeWidgetUI;", "colors", "", "getColors", "()Ljava/lang/String;", "setColors", "(Ljava/lang/String;)V", "enableTree", "", "getEnableTree", "()Z", "setEnableTree", "(Z)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "querySearch", "Lorg/platypus/orm/sql/query/SearchQueryImpl;", "getQuerySearch", "()Lorg/platypus/orm/sql/query/SearchQueryImpl;", "setQuerySearch", "(Lorg/platypus/orm/sql/query/SearchQueryImpl;)V", "searchView", "Lorg/platypus/ui/search/SearchViewDefinition;", "getSearchView", "()Lorg/platypus/ui/search/SearchViewDefinition;", "setSearchView", "(Lorg/platypus/ui/search/SearchViewDefinition;)V", "title", "getTitle", "setTitle", "widgets", "", "getWidgets", "()Ljava/util/List;", "build", "Lorg/platypus/ui/tree/TreeView;", "uniqueName", "button", "", "field", "Lorg/platypus/model/field/impl/RealModelField;", "", "id", "label", "icon", "widget", "groups", "", "invisible", "cssClass", "options", "buttonAction", "help", "attrs", "Lkotlin/Pair;", "Lorg/platypus/ui/UIElementAttribute;", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "Lkotlin/ExtensionFunctionType;", "act", "Lorg/platypus/ui/action/MenuAction;", "Lorg/platypus/ui/action/UIMenuAction;", "readonly", "placeHolder", "TM", "T", "Lorg/platypus/model/field/impl/ReferenceField;", "fieldGet", "find", "Lorg/platypus/model/field/impl/SimpleField;", "korm"})
public final class TreeViewBuilderImpl<M extends org.platypus.model.Model<M>> implements org.platypus.ui.tree.TreeViewBuilderExtends<M> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private final java.util.List<org.platypus.ui.tree.TreeWidgetUI> _fields = null;
    private boolean enableTree;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String colors;
    @org.jetbrains.annotations.NotNull()
    public org.platypus.orm.sql.query.SearchQueryImpl<M> querySearch;
    @org.jetbrains.annotations.Nullable()
    private org.platypus.ui.search.SearchViewDefinition<M> searchView;
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
    public boolean getEnableTree() {
        return false;
    }
    
    @java.lang.Override()
    public void setEnableTree(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getColors() {
        return null;
    }
    
    @java.lang.Override()
    public void setColors(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.SearchQueryImpl<M> getQuerySearch() {
        return null;
    }
    
    public final void setQuerySearch(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQueryImpl<M> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.ui.search.SearchViewDefinition<M> getSearchView() {
        return null;
    }
    
    public final void setSearchView(@org.jetbrains.annotations.Nullable()
    org.platypus.ui.search.SearchViewDefinition<M> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.ui.tree.TreeWidgetUI> getWidgets() {
        return null;
    }
    
    @java.lang.Override()
    public void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?> field, boolean invisible, boolean readonly, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.lang.String placeHolder, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.Nullable()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>, T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> field, boolean invisible, boolean readonly, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.lang.String placeHolder, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.Nullable()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.model.field.impl.RealModelField<TM, T>> fieldGet) {
    }
    
    @java.lang.Override()
    public void button(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<?, java.lang.Object> field, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String options) {
    }
    
    @java.lang.Override()
    public void buttonAction(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.lang.String help, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<org.platypus.ui.UIElementAttribute, ? extends kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>>> attrs, @org.jetbrains.annotations.Nullable()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void find(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SimpleField<M, T> field) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.ui.tree.TreeView build(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    public TreeViewBuilderImpl(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
}