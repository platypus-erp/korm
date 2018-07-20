package org.platypus.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B$\u0012\u001d\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\u0002\u0010\tJ \u0010(\u001a\u00020)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0+R(\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b\'\u0010\u0016\u00a8\u0006,"}, d2 = {"Lorg/platypus/ui/ButtonActBuilder;", "M", "Lorg/platypus/model/Model;", "", "act", "Lkotlin/Function1;", "Lorg/platypus/ui/action/MenuAction;", "Lorg/platypus/ui/action/UIMenuAction;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getAct", "()Lkotlin/jvm/functions/Function1;", "attributes", "", "Lorg/platypus/ui/UIElementAttribute;", "Lorg/platypus/orm/sql/expression/Expression;", "", "cssClass", "", "getCssClass", "()Ljava/lang/String;", "setCssClass", "(Ljava/lang/String;)V", "groups", "", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "id", "getId", "setId", "invisible", "getInvisible", "()Z", "setInvisible", "(Z)V", "options", "getOptions", "setOptions", "attrs", "", "v", "Lkotlin/Pair;", "korm"})
public final class ButtonActBuilder<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> groups;
    private boolean invisible;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cssClass;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String options;
    private final java.util.Map<org.platypus.ui.UIElementAttribute, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> attributes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> p0) {
    }
    
    public final boolean getInvisible() {
        return false;
    }
    
    public final void setInvisible(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCssClass() {
        return null;
    }
    
    public final void setCssClass(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void attrs(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.ui.UIElementAttribute, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> getAct() {
        return null;
    }
    
    public ButtonActBuilder(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act) {
        super();
    }
}