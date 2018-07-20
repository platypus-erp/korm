package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J3\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002#\u0010\u0005\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\b\tH&\u00a8\u0006\n"}, d2 = {"Lorg/platypus/orm/sql/query/SearchQueryV2;", "M", "Lorg/platypus/model/Model;", "", "select", "slice", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/query/SearchQuerySelectPart;", "", "Lkotlin/ExtensionFunctionType;", "korm"})
public abstract interface SearchQueryV2<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryV2<M> select(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuerySelectPart<M>, ? super M, kotlin.Unit> slice);
}