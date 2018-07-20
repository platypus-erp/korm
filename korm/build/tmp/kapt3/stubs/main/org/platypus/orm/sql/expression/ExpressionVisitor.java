package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0019J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001bJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001fJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010!J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010#J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010%J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\'J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010)J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010+J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010-J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030.2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010/J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00101J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00103J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00105J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003062\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00107J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u0002082\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00109J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030:2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010;J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010=J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030>2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010?\u00a8\u0006@"}, d2 = {"Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "PARAM", "RETURN", "Lorg/platypus/orm/sql/predicate/PredicateVisitor;", "Lorg/platypus/model/field/api/FieldVisitor;", "visit", "element", "Lorg/platypus/orm/sql/expression/Avg;", "param", "(Lorg/platypus/orm/sql/expression/Avg;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/CaseWhenElse;", "(Lorg/platypus/orm/sql/expression/CaseWhenElse;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Coalesce;", "(Lorg/platypus/orm/sql/expression/Coalesce;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Count;", "(Lorg/platypus/orm/sql/expression/Count;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/CurrentDateTime;", "(Lorg/platypus/orm/sql/expression/CurrentDateTime;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Date;", "(Lorg/platypus/orm/sql/expression/Date;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/DivideOp;", "(Lorg/platypus/orm/sql/expression/DivideOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/ExpressionAlias;", "(Lorg/platypus/orm/sql/expression/ExpressionAlias;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/ExpressionAliasOnly;", "(Lorg/platypus/orm/sql/expression/ExpressionAliasOnly;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/GroupConcat;", "(Lorg/platypus/orm/sql/expression/GroupConcat;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/LiteralOp;", "(Lorg/platypus/orm/sql/expression/LiteralOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/LowerCase;", "(Lorg/platypus/orm/sql/expression/LowerCase;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Max;", "(Lorg/platypus/orm/sql/expression/Max;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Min;", "(Lorg/platypus/orm/sql/expression/Min;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/MinusOp;", "(Lorg/platypus/orm/sql/expression/MinusOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Month;", "(Lorg/platypus/orm/sql/expression/Month;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/MultiplyOp;", "(Lorg/platypus/orm/sql/expression/MultiplyOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/NoOpConversion;", "(Lorg/platypus/orm/sql/expression/NoOpConversion;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/NotOp;", "(Lorg/platypus/orm/sql/expression/NotOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/PlusOp;", "(Lorg/platypus/orm/sql/expression/PlusOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/QueryParameter;", "(Lorg/platypus/orm/sql/expression/QueryParameter;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/StdDevPop;", "(Lorg/platypus/orm/sql/expression/StdDevPop;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/StdDevSamp;", "(Lorg/platypus/orm/sql/expression/StdDevSamp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Sum;", "(Lorg/platypus/orm/sql/expression/Sum;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Trim;", "(Lorg/platypus/orm/sql/expression/Trim;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/UpperCase;", "(Lorg/platypus/orm/sql/expression/UpperCase;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/VarPop;", "(Lorg/platypus/orm/sql/expression/VarPop;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/VarSamp;", "(Lorg/platypus/orm/sql/expression/VarSamp;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface ExpressionVisitor<PARAM extends java.lang.Object, RETURN extends java.lang.Object> extends org.platypus.orm.sql.predicate.PredicateVisitor<PARAM, RETURN>, org.platypus.model.field.api.FieldVisitor<PARAM, RETURN> {
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.LiteralOp<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.NoOpConversion<?, ?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.NotOp<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.QueryParameter<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.PlusOp<?, ?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.MinusOp<?, ?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.MultiplyOp<?, ?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.DivideOp<?, ?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Count element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Date element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.CurrentDateTime element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Month element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.LowerCase<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.UpperCase<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Min<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Max<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Avg<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.StdDevPop<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.StdDevSamp<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.VarPop<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.VarSamp<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Sum<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Coalesce<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Trim element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.CaseWhenElse<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.GroupConcat element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionAlias<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionAliasOnly<?> element, PARAM param);
}