package org.platypus.ui.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00062#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\u0002\b\nH&\u00a8\u0006\u000b"}, d2 = {"Lorg/platypus/ui/form/FormViewExtendsPosition;", "M", "Lorg/platypus/model/Model;", "", "position", "", "Lorg/platypus/ui/FieldPosition;", "todo", "Lkotlin/Function2;", "Lorg/platypus/ui/form/FormViewBuilder;", "Lkotlin/ExtensionFunctionType;", "korm"})
public abstract interface FormViewExtendsPosition<M extends org.platypus.model.Model<M>> {
    
    public abstract void position(@org.jetbrains.annotations.NotNull()
    org.platypus.ui.FieldPosition position, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.form.FormViewBuilder<M>, ? super M, kotlin.Unit> todo);
}