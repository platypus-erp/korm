package org.platypus.ui.tree;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H&J|\u0010\u001e\u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\'2\b\b\u0002\u0010(\u001a\u00020\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005H&J\u00c4\u0001\u0010+\u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\'2\b\b\u0002\u0010(\u001a\u00020\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052-\b\u0002\u0010-\u001a\'\u0012\u0004\u0012\u00020/\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0100\u00a2\u0006\u0002\b2\u0018\u00010.2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\u001d\u00103\u001a\u0019\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000500\u00a2\u0006\u0002\b2H&J\u0086\u0001\u0010 \u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030!2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\'2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005H&J\u00c7\u0001\u0010 \u001a\u00020\u001f\"\u000e\b\u0001\u00108*\b\u0012\u0004\u0012\u0002H80\u0002\"\b\b\u0002\u00109*\u00020\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H80:2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\'2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052#\u0010;\u001a\u001f\u0012\u0004\u0012\u0002H8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90!00\u00a2\u0006\u0002\b2H&R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006<"}, d2 = {"Lorg/platypus/ui/tree/TreeViewBuilder;", "M", "Lorg/platypus/model/Model;", "", "colors", "", "getColors", "()Ljava/lang/String;", "setColors", "(Ljava/lang/String;)V", "enableTree", "", "getEnableTree", "()Z", "setEnableTree", "(Z)V", "model", "getModel", "()Lorg/platypus/model/Model;", "title", "getTitle", "setTitle", "widgets", "", "Lorg/platypus/ui/tree/TreeWidgetUI;", "getWidgets", "()Ljava/util/List;", "build", "Lorg/platypus/ui/tree/TreeView;", "uniqueName", "button", "", "field", "Lorg/platypus/model/field/impl/RealModelField;", "id", "label", "icon", "widget", "groups", "", "invisible", "cssClass", "options", "buttonAction", "help", "attrs", "Lkotlin/Pair;", "Lorg/platypus/ui/UIElementAttribute;", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "Lkotlin/ExtensionFunctionType;", "act", "Lorg/platypus/ui/action/MenuAction;", "Lorg/platypus/ui/action/UIMenuAction;", "readonly", "placeHolder", "TM", "T", "Lorg/platypus/model/field/impl/ReferenceField;", "fieldGet", "korm"})
public abstract interface TreeViewBuilder<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getTitle();
    
    public abstract void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getColors();
    
    public abstract void setColors(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract boolean getEnableTree();
    
    public abstract void setEnableTree(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.platypus.ui.tree.TreeWidgetUI> getWidgets();
    
    /**
     * * Add a simple field to the Tree view
     */
    public abstract void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?> field, boolean invisible, boolean readonly, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.lang.String placeHolder, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.Nullable()
    java.lang.String options);
    
    /**
     * * Add a field from a relation to the Tree view
     */
    public abstract <TM extends org.platypus.model.Model<TM>, T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> field, boolean invisible, boolean readonly, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.lang.String placeHolder, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.Nullable()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.model.field.impl.RealModelField<TM, T>> fieldGet);
    
    public abstract void button(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<?, java.lang.Object> field, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String options);
    
    public abstract void buttonAction(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.Nullable()
    java.lang.String cssClass, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.lang.String help, @org.jetbrains.annotations.Nullable()
    java.lang.String widget, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<org.platypus.ui.UIElementAttribute, ? extends kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>>> attrs, @org.jetbrains.annotations.Nullable()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.ui.tree.TreeView build(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}