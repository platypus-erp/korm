package org.platypus.visitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/visitor/ExpressionVisitorPredicate;", "PARAM", "Lorg/platypus/visitor/ExpressionVisitorDefault;", "", "Lorg/platypus/visitor/FieldVisitorDefault;", "default", "getDefault", "()Ljava/lang/Boolean;", "korm"})
public abstract interface ExpressionVisitorPredicate<PARAM extends java.lang.Object> extends org.platypus.visitor.ExpressionVisitorDefault<PARAM, java.lang.Boolean>, org.platypus.visitor.FieldVisitorDefault<PARAM, java.lang.Boolean> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.Boolean getDefault();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean getDefault(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.LiteralOp<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.NoOpConversion<?, ?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.NotOp<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.QueryParameter<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.PlusOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.MinusOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.MultiplyOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.DivideOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Count element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Date element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.CurrentDateTime element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Month element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.LowerCase<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.UpperCase<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Min<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Max<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Avg<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.StdDevPop<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.StdDevSamp<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.VarPop<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.VarSamp<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Sum<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Coalesce<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Trim element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.CaseWhenElse<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.GroupConcat element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.ExpressionAlias<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.ExpressionAliasOnly<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.IsNullOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.IsNotNullOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.BetweenOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.InList<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotInList<?> element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.EqOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NeqOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.LessOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.LessEqOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.GreaterEqOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.LikeOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.GreaterOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.ILikeOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotLikeOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.RegexpOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotRegexpOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.AndOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.OrOp element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.Exists element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotExists element, PARAM param) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.StringField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateTimeField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TimeField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BooleanField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TextField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DecimalField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.IntField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BinaryField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RevOne2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.PKModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.FieldAlias<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.SelectionField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.NameModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ExternalRefModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ArchivedModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateUID<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.ExpressionVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteUID<?> field, PARAM p) {
            return null;
        }
    }
}