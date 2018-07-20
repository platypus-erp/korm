package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0002\b\u0010J-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0002\b\u0010J-\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0002\b\u0010J-\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0002\b\u0010R\u0013\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/platypus/module/ModelSecurityHolder;", "M", "Lorg/platypus/model/Model;", "", "model", "(Lorg/platypus/model/Model;)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "extendRule", "", "name", "", "ruleDef", "Lkotlin/Function1;", "Lorg/platypus/security/ModelRuleBuilder;", "Lkotlin/ExtensionFunctionType;", "extendSecurityGroup", "Lorg/platypus/security/ModelGroupBuilder;", "newRule", "newSecurityGroup", "korm"})
public final class ModelSecurityHolder<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    public final void newRule(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.security.ModelRuleBuilder<M>, kotlin.Unit> ruleDef) {
    }
    
    public final void extendRule(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.security.ModelRuleBuilder<M>, kotlin.Unit> ruleDef) {
    }
    
    public final void newSecurityGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.security.ModelGroupBuilder<M>, kotlin.Unit> ruleDef) {
    }
    
    public final void extendSecurityGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.security.ModelGroupBuilder<M>, kotlin.Unit> ruleDef) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getModel() {
        return null;
    }
    
    public ModelSecurityHolder(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
}