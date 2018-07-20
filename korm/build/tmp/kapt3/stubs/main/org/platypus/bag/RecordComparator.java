package org.platypus.bag;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004`\u0005B+\u0012$\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u00a2\u0006\u0002\u0010\fJ(\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016R/\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/bag/RecordComparator;", "M", "Lorg/platypus/model/Model;", "Ljava/util/Comparator;", "Lorg/platypus/entity/RecordImpl;", "Lkotlin/Comparator;", "columns", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "(Ljava/util/List;)V", "getColumns", "()Ljava/util/List;", "compare", "", "o1", "o2", "korm"})
public final class RecordComparator<M extends org.platypus.model.Model<M>> implements java.util.Comparator<org.platypus.entity.RecordImpl<M>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, java.lang.Object>, org.platypus.orm.sql.query.ORDERBY_TYPE>> columns = null;
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.Nullable()
    org.platypus.entity.RecordImpl<M> o1, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.RecordImpl<M> o2) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, java.lang.Object>, org.platypus.orm.sql.query.ORDERBY_TYPE>> getColumns() {
        return null;
    }
    
    public RecordComparator(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<M, java.lang.Object>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns) {
        super();
    }
}