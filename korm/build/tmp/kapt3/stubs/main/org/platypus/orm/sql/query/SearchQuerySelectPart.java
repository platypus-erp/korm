package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0005R0\u0010\u0006\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\t0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/platypus/orm/sql/query/SearchQuerySelectPart;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/orm/sql/query/FieldGetter;", "Lorg/platypus/orm/sql/dml/FieldSet;", "Lorg/platypus/TypedCloneable;", "sliceByModel", "", "Lorg/platypus/model/IModel;", "", "Lorg/platypus/model/field/api/IModelField;", "getSliceByModel", "()Ljava/util/Map;", "korm"})
public abstract interface SearchQuerySelectPart<M extends org.platypus.model.Model<M>> extends org.platypus.orm.sql.query.FieldGetter<M>, org.platypus.orm.sql.dml.FieldSet, org.platypus.TypedCloneable<org.platypus.orm.sql.query.SearchQuerySelectPart<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<org.platypus.model.IModel<?>, java.util.Set<org.platypus.model.field.api.IModelField<?, ?>>> getSliceByModel();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>>java.lang.Object clone(org.platypus.orm.sql.query.SearchQuerySelectPart<M> $this) {
            return null;
        }
    }
}