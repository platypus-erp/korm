package org.platypus.bag;

import java.lang.System;

@org.platypus.INeedToDocumentThis()
@org.platypus.INeedToTestThis()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\u00020\u0005J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017J\b\u0010\u001a\u001a\u00020\bH\'J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u000e0\u001dH\'J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u000e0\u001dH\'J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\bH\'J2\u0010!\u001a\b\u0012\u0004\u0012\u0002H\"0\u0000\"\u000e\b\u0001\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00022\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\"0$H&J2\u0010!\u001a\b\u0012\u0004\u0012\u0002H\"0\u0000\"\u000e\b\u0001\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00022\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\"0%H&J,\u0010!\u001a\b\u0012\u0004\u0012\u0002H&0\u0003\"\b\b\u0001\u0010&*\u00020\'2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H&0(H&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u00a6\u0002J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00a6\u0002J\b\u0010+\u001a\u00020\u0018H\'JW\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002B\u0010-\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\'00\u0012\u0004\u0012\u0002010/0.\"\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\'00\u0012\u0004\u0012\u0002010/H\'\u00a2\u0006\u0002\u00102J4\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002$\u0010-\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\'00\u0012\u0004\u0012\u0002010/0\u0003H\'J,\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\'002\b\b\u0002\u0010,\u001a\u000201H\'J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u00a6\u0002J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00a6\u0002R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00065"}, d2 = {"Lorg/platypus/bag/Bag;", "M", "Lorg/platypus/model/Model;", "", "Lorg/platypus/entity/Record;", "Lorg/platypus/Environmentable;", "ids", "", "", "ids$annotations", "()V", "getIds", "()Ljava/util/Collection;", "loaded", "", "getLoaded", "()Z", "model", "getModel", "()Lorg/platypus/model/Model;", "addField", "f", "Lorg/platypus/model/field/impl/RealModelField;", "and", "", "clone", "delete", "deleteIf", "filter", "Lkotlin/Function1;", "predicate", "limit", "offset", "mapped", "MT", "field", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "T", "", "Lorg/platypus/model/field/api/SimpleModelField;", "minus", "other", "or", "orderBy", "columns", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "([Lkotlin/Pair;)Lorg/platypus/bag/Bag;", "column", "plus", "korm"})
@org.platypus.LazyLoaded()
public abstract interface Bag<M extends org.platypus.model.Model<M>> extends java.util.List<org.platypus.entity.Record<M>>, org.platypus.Environmentable, kotlin.jvm.internal.markers.KMappedMarker {
    
    /**
     * * The ids of the element containing by the Bag
     *     * The ids can be empty if this is an empty Bag or if the [loaded] is false
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Collection<java.lang.Integer> getIds();
    
    /**
     * * The model of the Bag
     */
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    /**
     * *  True if the Bag has been loaded in the cache
     */
    public abstract boolean getLoaded();
    
    /**
     * * filter the current record and return the result in a new Bag
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.ExecuteAutoLoad()
    public abstract org.platypus.bag.Bag<M> filter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, java.lang.Boolean> predicate);
    
    /**
     * * Change the order of the Bag internally
     *     * If the Bag is [loaded] then the order is only executed in memory equivalent to the [sort] functuon
     *     * Otherwise the odrer clause is change to ORDER BY [column] [orderBy] an will be executed in the load
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.MutateSelf()
    public abstract org.platypus.bag.Bag<M> orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, java.lang.Object> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy);
    
    /**
     * * Change the order of the Bag internally
     *     * If the Bag is [loaded] then the order is only executed in memory equivalent to the [sort] functuon
     *     * Otherwise the odrer clause is change to ORDER BY [column] [orderBy], * nb [columns] an will be executed in the load
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.MutateSelf()
    public abstract org.platypus.bag.Bag<M> orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<M, java.lang.Object>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns);
    
    /**
     * * Change the order of the Bag internally
     *     * If the Bag is [loaded] then the order is only executed in memory equivalent to the [sort] functuon
     *     * Otherwise the odrer clause is change to ORDER BY [column] [orderBy], * nb [columns] an will be executed in the load
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.MutateSelf()
    public abstract org.platypus.bag.Bag<M> orderBy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<M, java.lang.Object>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns);
    
    /**
     * * Limit the number of record loaded by this bag
     *     * If the Bag is [loaded] then the [limit] and [offset] is only executed in memory equivalent to the [List.subList] functuon
     *     * Otherwise the limit, offset clause is added or changed in the internal Query
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.MutateSelf()
    public abstract org.platypus.bag.Bag<M> limit(int limit, int offset);
    
    /**
     * * Add a field to load, because bag can load only a subset of field if needed.
     *     * If durring the iteration of the bag a un loaded field is called then a query is executed to load all the unloaded field
     *     * To use carefully
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.MutateSelf()
    public abstract org.platypus.bag.Bag<M> addField(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?> f);
    
    /**
     * * Add a OR in the internal query
     */
    @org.platypus.MutateSelf()
    public abstract void or();
    
    /**
     * * Add a AND in the internal query
     */
    @org.platypus.MutateSelf()
    public abstract void and();
    
    @org.jetbrains.annotations.NotNull()
    @org.platypus.ExecuteAutoLoad()
    public abstract org.platypus.bag.Bag<M> deleteIf(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, java.lang.Boolean> filter);
    
    /**
     * * Delete all this bag from the persistence layer
     *     *
     *     * @return the number of deleted record
     */
    @org.platypus.MutateSelf()
    public abstract int delete();
    
    /**
     * * Create a new bag with the current bag + [other]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> other);
    
    /**
     * * Create a new bag with the current bag + [other]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<M> other);
    
    /**
     * * Create a new bag with the current bag - [other]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> other);
    
    /**
     * * Create a new bag with the current bag - [other]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<M> other);
    
    /**
     * * Make a clone of this bag
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.IShouldRefractorThis(why = "don\'tknow if usefull")
    public abstract org.platypus.bag.Bag<M> clone();
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>java.util.List<T> mapped(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<M, T> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <MT extends org.platypus.model.Model<MT>>org.platypus.bag.Bag<MT> mapped(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<M, MT> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <MT extends org.platypus.model.Model<MT>>org.platypus.bag.Bag<MT> mapped(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<M, MT> field);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.platypus.ExecuteAutoLoad()
        public static void ids$annotations() {
        }
        
        /**
         * * Make a clone of this bag
         */
        @org.jetbrains.annotations.NotNull()
        @org.platypus.IShouldRefractorThis(why = "don\'tknow if usefull")
        public static <M extends org.platypus.model.Model<M>>org.platypus.bag.Bag<M> clone(org.platypus.bag.Bag<M> $this) {
            return null;
        }
    }
}