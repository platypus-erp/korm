package org.platypus.visitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00c0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00192\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030$2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030%2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\'2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020(2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030)2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030*2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030+2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020,2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030-2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030.2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030/2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u0003002\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003012\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u0002022\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003032\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003042\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u0003052\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0005\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003062\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u0003072\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u0003082\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u0003092\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030:2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020;2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030<2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030=2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020?2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020@2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020A2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020B2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020C2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020D2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020E2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030F2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020G2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020H2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020I2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020J2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020K2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020L2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020M2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030N2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020O2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020P2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020Q2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020R2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006S"}, d2 = {"Lorg/platypus/visitor/CanonicalNameExpression;", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "", "", "()V", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/FieldAlias;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/PKModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "element", "Lorg/platypus/orm/sql/expression/Avg;", "param", "Lorg/platypus/orm/sql/expression/CaseWhenElse;", "Lorg/platypus/orm/sql/expression/Coalesce;", "Lorg/platypus/orm/sql/expression/Count;", "Lorg/platypus/orm/sql/expression/CurrentDateTime;", "Lorg/platypus/orm/sql/expression/Date;", "Lorg/platypus/orm/sql/expression/DivideOp;", "Lorg/platypus/orm/sql/expression/ExpressionAlias;", "Lorg/platypus/orm/sql/expression/ExpressionAliasOnly;", "Lorg/platypus/orm/sql/expression/GroupConcat;", "Lorg/platypus/orm/sql/expression/LiteralOp;", "Lorg/platypus/orm/sql/expression/LowerCase;", "Lorg/platypus/orm/sql/expression/Max;", "Lorg/platypus/orm/sql/expression/Min;", "Lorg/platypus/orm/sql/expression/MinusOp;", "Lorg/platypus/orm/sql/expression/Month;", "Lorg/platypus/orm/sql/expression/MultiplyOp;", "Lorg/platypus/orm/sql/expression/NoOpConversion;", "Lorg/platypus/orm/sql/expression/NotOp;", "Lorg/platypus/orm/sql/expression/PlusOp;", "Lorg/platypus/orm/sql/expression/QueryParameter;", "Lorg/platypus/orm/sql/expression/StdDevPop;", "Lorg/platypus/orm/sql/expression/StdDevSamp;", "Lorg/platypus/orm/sql/expression/Sum;", "Lorg/platypus/orm/sql/expression/Trim;", "Lorg/platypus/orm/sql/expression/UpperCase;", "Lorg/platypus/orm/sql/expression/VarPop;", "Lorg/platypus/orm/sql/expression/VarSamp;", "Lorg/platypus/orm/sql/predicate/AndOp;", "Lorg/platypus/orm/sql/predicate/BetweenOp;", "Lorg/platypus/orm/sql/predicate/EqOp;", "Lorg/platypus/orm/sql/predicate/Exists;", "Lorg/platypus/orm/sql/predicate/GreaterEqOp;", "Lorg/platypus/orm/sql/predicate/GreaterOp;", "Lorg/platypus/orm/sql/predicate/ILikeOp;", "Lorg/platypus/orm/sql/predicate/InList;", "Lorg/platypus/orm/sql/predicate/IsNotNullOp;", "Lorg/platypus/orm/sql/predicate/IsNullOp;", "Lorg/platypus/orm/sql/predicate/LessEqOp;", "Lorg/platypus/orm/sql/predicate/LessOp;", "Lorg/platypus/orm/sql/predicate/LikeOp;", "Lorg/platypus/orm/sql/predicate/NeqOp;", "Lorg/platypus/orm/sql/predicate/NotExists;", "Lorg/platypus/orm/sql/predicate/NotInList;", "Lorg/platypus/orm/sql/predicate/NotLikeOp;", "Lorg/platypus/orm/sql/predicate/NotRegexpOp;", "Lorg/platypus/orm/sql/predicate/OrOp;", "Lorg/platypus/orm/sql/predicate/RegexpOp;", "korm"})
public final class CanonicalNameExpression implements org.platypus.orm.sql.expression.ExpressionVisitor<java.lang.Object, java.lang.String> {
    public static final org.platypus.visitor.CanonicalNameExpression INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.LiteralOp<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.NoOpConversion<?, ?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.QueryParameter<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.PlusOp<?, ?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.MinusOp<?, ?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.MultiplyOp<?, ?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.DivideOp<?, ?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Count element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Date element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.CurrentDateTime element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Month element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.LowerCase<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.UpperCase<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Min<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Max<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Avg<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.StdDevPop<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.StdDevSamp<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.VarPop<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.VarSamp<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Sum<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Coalesce<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Trim element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.CaseWhenElse<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.GroupConcat element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.IsNullOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.IsNotNullOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.BetweenOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.InList<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotInList<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.EqOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NeqOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LessOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LessEqOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.GreaterEqOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.LikeOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.GreaterOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.ILikeOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotLikeOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.RegexpOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotRegexpOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.AndOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.OrOp element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.Exists element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.predicate.NotExists element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.NotOp<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionAlias<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionAliasOnly<?> element, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    private CanonicalNameExpression() {
        super();
    }
}