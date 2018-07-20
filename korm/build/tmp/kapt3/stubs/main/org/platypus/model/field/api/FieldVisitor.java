package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0018J%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001eJ%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010 J%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030!2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\"J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010$J%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010&J%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\'2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010(J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010*J%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030+2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010,J%\u0010\u0004\u001a\u00028\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030-2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010.J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00100J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u0003012\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00102J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u0003032\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00104J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u0003052\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00106J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u0003072\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00108\u00a8\u00069"}, d2 = {"Lorg/platypus/model/field/api/FieldVisitor;", "PARAM_TYPE", "RETURN", "", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "(Lorg/platypus/model/field/impl/ArchivedModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/BinaryField;", "(Lorg/platypus/model/field/impl/BinaryField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/BooleanField;", "(Lorg/platypus/model/field/impl/BooleanField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "(Lorg/platypus/model/field/impl/CreateDateModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/CreateUID;", "(Lorg/platypus/model/field/impl/CreateUID;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/DateField;", "(Lorg/platypus/model/field/impl/DateField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/DateTimeField;", "(Lorg/platypus/model/field/impl/DateTimeField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/DecimalField;", "(Lorg/platypus/model/field/impl/DecimalField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "(Lorg/platypus/model/field/impl/ExternalRefModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/FieldAlias;", "(Lorg/platypus/model/field/impl/FieldAlias;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/IntField;", "(Lorg/platypus/model/field/impl/IntField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/Many2ManyField;", "(Lorg/platypus/model/field/impl/Many2ManyField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/Many2OneField;", "(Lorg/platypus/model/field/impl/Many2OneField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "(Lorg/platypus/model/field/impl/Many2OneFieldLink;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/NameModelField;", "(Lorg/platypus/model/field/impl/NameModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/One2ManyField;", "(Lorg/platypus/model/field/impl/One2ManyField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/One2OneField;", "(Lorg/platypus/model/field/impl/One2OneField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/PKModelField;", "(Lorg/platypus/model/field/impl/PKModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "(Lorg/platypus/model/field/impl/RevOne2OneField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/SelectionField;", "(Lorg/platypus/model/field/impl/SelectionField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/StringField;", "(Lorg/platypus/model/field/impl/StringField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/TextField;", "(Lorg/platypus/model/field/impl/TextField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/TimeField;", "(Lorg/platypus/model/field/impl/TimeField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "(Lorg/platypus/model/field/impl/WriteDateModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/WriteUID;", "(Lorg/platypus/model/field/impl/WriteUID;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface FieldVisitor<PARAM_TYPE extends java.lang.Object, RETURN extends java.lang.Object> {
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, PARAM_TYPE p);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, PARAM_TYPE p);
}