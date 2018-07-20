package org.platypus.visitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00b8\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0019J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001fJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010!J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010#J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010%J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\'J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010)J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010+J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010-J%\u0010\u0005\u001a\u00028\u00012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030.2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010/J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00101J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00103J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00105J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u0003062\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00107J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u0002082\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00109J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030:2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010;J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010=J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030>2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010?J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020@2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010AJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020B2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010CJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020D2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010EJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020F2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010GJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010IJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020J2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010KJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020L2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010MJ!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030N2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010OJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020P2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010QJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020R2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010SJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020T2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010UJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020V2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010WJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020X2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010YJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020Z2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010[J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\\2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010]J!\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030^2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010_J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020`2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010aJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020b2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010cJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020d2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010eJ\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020f2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010g\u00a8\u0006h"}, d2 = {"Lorg/platypus/visitor/ExpressionVisitorDefault;", "PARAM", "DEFAULT", "Lorg/platypus/visitor/FieldVisitorDefault;", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "visit", "element", "Lorg/platypus/orm/sql/expression/Avg;", "param", "(Lorg/platypus/orm/sql/expression/Avg;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/CaseWhenElse;", "(Lorg/platypus/orm/sql/expression/CaseWhenElse;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Coalesce;", "(Lorg/platypus/orm/sql/expression/Coalesce;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Count;", "(Lorg/platypus/orm/sql/expression/Count;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/CurrentDateTime;", "(Lorg/platypus/orm/sql/expression/CurrentDateTime;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Date;", "(Lorg/platypus/orm/sql/expression/Date;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/DivideOp;", "(Lorg/platypus/orm/sql/expression/DivideOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/ExpressionAlias;", "(Lorg/platypus/orm/sql/expression/ExpressionAlias;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/ExpressionAliasOnly;", "(Lorg/platypus/orm/sql/expression/ExpressionAliasOnly;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/GroupConcat;", "(Lorg/platypus/orm/sql/expression/GroupConcat;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/LiteralOp;", "(Lorg/platypus/orm/sql/expression/LiteralOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/LowerCase;", "(Lorg/platypus/orm/sql/expression/LowerCase;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Max;", "(Lorg/platypus/orm/sql/expression/Max;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Min;", "(Lorg/platypus/orm/sql/expression/Min;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/MinusOp;", "(Lorg/platypus/orm/sql/expression/MinusOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Month;", "(Lorg/platypus/orm/sql/expression/Month;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/MultiplyOp;", "(Lorg/platypus/orm/sql/expression/MultiplyOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/NoOpConversion;", "(Lorg/platypus/orm/sql/expression/NoOpConversion;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/NotOp;", "(Lorg/platypus/orm/sql/expression/NotOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/PlusOp;", "(Lorg/platypus/orm/sql/expression/PlusOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/QueryParameter;", "(Lorg/platypus/orm/sql/expression/QueryParameter;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/StdDevPop;", "(Lorg/platypus/orm/sql/expression/StdDevPop;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/StdDevSamp;", "(Lorg/platypus/orm/sql/expression/StdDevSamp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Sum;", "(Lorg/platypus/orm/sql/expression/Sum;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/Trim;", "(Lorg/platypus/orm/sql/expression/Trim;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/UpperCase;", "(Lorg/platypus/orm/sql/expression/UpperCase;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/VarPop;", "(Lorg/platypus/orm/sql/expression/VarPop;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/expression/VarSamp;", "(Lorg/platypus/orm/sql/expression/VarSamp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/AndOp;", "(Lorg/platypus/orm/sql/predicate/AndOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/BetweenOp;", "(Lorg/platypus/orm/sql/predicate/BetweenOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/EqOp;", "(Lorg/platypus/orm/sql/predicate/EqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/Exists;", "(Lorg/platypus/orm/sql/predicate/Exists;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/GreaterEqOp;", "(Lorg/platypus/orm/sql/predicate/GreaterEqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/GreaterOp;", "(Lorg/platypus/orm/sql/predicate/GreaterOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/ILikeOp;", "(Lorg/platypus/orm/sql/predicate/ILikeOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/InList;", "(Lorg/platypus/orm/sql/predicate/InList;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/IsNotNullOp;", "(Lorg/platypus/orm/sql/predicate/IsNotNullOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/IsNullOp;", "(Lorg/platypus/orm/sql/predicate/IsNullOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/LessEqOp;", "(Lorg/platypus/orm/sql/predicate/LessEqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/LessOp;", "(Lorg/platypus/orm/sql/predicate/LessOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/LikeOp;", "(Lorg/platypus/orm/sql/predicate/LikeOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NeqOp;", "(Lorg/platypus/orm/sql/predicate/NeqOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotExists;", "(Lorg/platypus/orm/sql/predicate/NotExists;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotInList;", "(Lorg/platypus/orm/sql/predicate/NotInList;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotLikeOp;", "(Lorg/platypus/orm/sql/predicate/NotLikeOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/NotRegexpOp;", "(Lorg/platypus/orm/sql/predicate/NotRegexpOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/OrOp;", "(Lorg/platypus/orm/sql/predicate/OrOp;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/predicate/RegexpOp;", "(Lorg/platypus/orm/sql/predicate/RegexpOp;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface ExpressionVisitorDefault<PARAM extends java.lang.Object, DEFAULT extends java.lang.Object> extends org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT>, org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, DEFAULT> {
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.LiteralOp<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.NoOpConversion<?, ?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.NotOp<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.QueryParameter<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.PlusOp<?, ?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.MinusOp<?, ?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.MultiplyOp<?, ?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.DivideOp<?, ?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Count element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Date element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.CurrentDateTime element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Month element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.LowerCase<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.UpperCase<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Min<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Max<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Avg<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.StdDevPop<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.StdDevSamp<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.VarPop<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.VarSamp<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Sum<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Coalesce<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Trim element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.CaseWhenElse<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.GroupConcat element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionAlias<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionAliasOnly<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.IsNullOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.IsNotNullOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.BetweenOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.InList<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotInList<?> element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.EqOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NeqOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LessOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LessEqOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.GreaterEqOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LikeOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.GreaterOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.ILikeOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotLikeOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.RegexpOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotRegexpOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.AndOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.OrOp element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.Exists element, PARAM param);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotExists element, PARAM param);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.LiteralOp<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.NoOpConversion<?, ?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.NotOp<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.QueryParameter<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.PlusOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.MinusOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.MultiplyOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.DivideOp<?, ?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Count element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Date element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.CurrentDateTime element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Month element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.LowerCase<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.UpperCase<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Min<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Max<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Avg<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.StdDevPop<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.StdDevSamp<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.VarPop<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.VarSamp<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Sum<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Coalesce<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Trim element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.CaseWhenElse<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.GroupConcat element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.ExpressionAlias<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.ExpressionAliasOnly<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.IsNullOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.IsNotNullOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.BetweenOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.InList<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotInList<?> element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.EqOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NeqOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.LessOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.LessEqOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.GreaterEqOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.LikeOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.GreaterOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.ILikeOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotLikeOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.RegexpOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotRegexpOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.AndOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.OrOp element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.Exists element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.predicate.NotExists element, PARAM param) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.StringField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateTimeField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TimeField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BooleanField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TextField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DecimalField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.IntField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BinaryField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RevOne2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.PKModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.FieldAlias<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.SelectionField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.NameModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ExternalRefModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ArchivedModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateUID<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.ExpressionVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteUID<?> field, PARAM p) {
            return null;
        }
    }
}