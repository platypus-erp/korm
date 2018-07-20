package org.platypus.ui.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J&\u0010\u0004\u001a\u00020\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00060\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/ui/form/FormViewBuilderExtend;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/ui/form/FormViewBuilder;", "find", "", "T", "", "field", "Lorg/platypus/model/field/impl/SimpleField;", "findById", "Lorg/platypus/ui/form/FormViewExtendsPosition;", "id", "", "korm"})
public abstract interface FormViewBuilderExtend<M extends org.platypus.model.Model<M>> extends org.platypus.ui.form.FormViewBuilder<M> {
    
    public abstract <T extends java.lang.Object>void find(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SimpleField<M, T> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.ui.form.FormViewExtendsPosition<M> findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>void find(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.SimpleField<M, T> field) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static <M extends org.platypus.model.Model<M>>org.platypus.ui.form.FormViewExtendsPosition<M> findById(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void buttonBox(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void unaryPlus(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String $receiver) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void sheet(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void h1(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void h2(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void h3(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void h4(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void h5(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void h6(org.platypus.ui.form.FormViewBuilderExtend<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void notebook(org.platypus.ui.form.FormViewBuilderExtend<M> $this, int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void page(org.platypus.ui.form.FormViewBuilderExtend<M> $this, int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void header(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void button(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RealModelField<?, ?> field, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.lang.String icon, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String options) {
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>void buttonAction(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
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
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>void fieldButton(org.platypus.ui.form.FormViewBuilderExtend<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RealModelField<M, T> field, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.ButtonFieldBuilder<M, T>, kotlin.Unit> function) {
        }
    }
}