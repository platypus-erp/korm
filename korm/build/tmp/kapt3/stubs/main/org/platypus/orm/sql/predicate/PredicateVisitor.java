package org.platypus.orm.sql.predicate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0010J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0016J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0018J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001aJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001cJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010 J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020!2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\"J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020#2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010$J!\u0010\u0004\u001a\u00028\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010&J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\'2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010(J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010*J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020+2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010,J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020-2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010.\u00a8\u0006/"}, d2 = {"Lorg/platypus/orm/sql/predicate/PredicateVisitor;", "PARAM", "RETURN", "", "visit", "element", "Lorg/platypus/orm/sql/predicate/AndOp;", "param", "(Lorg/platypus/orm/sql/predicate/AndOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/BetweenOp;", "(Lorg/platypus/orm/sql/predicate/BetweenOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/EqOp;", "(Lorg/platypus/orm/sql/predicate/EqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/Exists;", "(Lorg/platypus/orm/sql/predicate/Exists;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/GreaterEqOp;", "(Lorg/platypus/orm/sql/predicate/GreaterEqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/GreaterOp;", "(Lorg/platypus/orm/sql/predicate/GreaterOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/ILikeOp;", "(Lorg/platypus/orm/sql/predicate/ILikeOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/InList;", "(Lorg/platypus/orm/sql/predicate/InList;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/IsNotNullOp;", "(Lorg/platypus/orm/sql/predicate/IsNotNullOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/IsNullOp;", "(Lorg/platypus/orm/sql/predicate/IsNullOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/LessEqOp;", "(Lorg/platypus/orm/sql/predicate/LessEqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/LessOp;", "(Lorg/platypus/orm/sql/predicate/LessOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/LikeOp;", "(Lorg/platypus/orm/sql/predicate/LikeOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NeqOp;", "(Lorg/platypus/orm/sql/predicate/NeqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotExists;", "(Lorg/platypus/orm/sql/predicate/NotExists;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotInList;", "(Lorg/platypus/orm/sql/predicate/NotInList;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotLikeOp;", "(Lorg/platypus/orm/sql/predicate/NotLikeOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotRegexpOp;", "(Lorg/platypus/orm/sql/predicate/NotRegexpOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/OrOp;", "(Lorg/platypus/orm/sql/predicate/OrOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/RegexpOp;", "(Lorg/platypus/orm/sql/predicate/RegexpOp;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface PredicateVisitor<PARAM extends java.lang.Object, RETURN extends java.lang.Object> {
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.IsNullOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.IsNotNullOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.BetweenOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.InList<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotInList<?> element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.EqOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NeqOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LessOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LessEqOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.GreaterEqOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LikeOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.GreaterOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.ILikeOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotLikeOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.RegexpOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotRegexpOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.AndOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.OrOp element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.Exists element, PARAM param);
    
    public abstract RETURN visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotExists element, PARAM param);
}