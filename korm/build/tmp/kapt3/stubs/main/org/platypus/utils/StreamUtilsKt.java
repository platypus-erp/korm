package org.platypus.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\u001aE\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00050\bH\u0086\b\u001a_\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u00060\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00050\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\bH\u0086\b\u001a^\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0005\"\u001c\b\u0002\u0010\f*\u0016\u0012\u0006\b\u0000\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000e0\r*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u000f\u001a\u0002H\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00050\bH\u0086\b\u00a2\u0006\u0002\u0010\u0010\u001ax\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\t\"\u001c\b\u0003\u0010\f*\u0016\u0012\u0006\b\u0000\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000e0\r*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u000f\u001a\u0002H\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00050\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\bH\u0086\b\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"filterNotNull", "Ljava/util/stream/Stream;", "T", "groupBySet", "", "K", "", "keySelector", "Lkotlin/Function1;", "V", "valueTransform", "groupByToSet", "M", "", "", "destination", "(Ljava/util/Set;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Ljava/util/Set;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "korm"})
public final class StreamUtilsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.stream.Stream<T> filterNotNull(@org.jetbrains.annotations.NotNull()
    java.util.stream.Stream<T> $receiver) {
        return null;
    }
    
    /**
     * * Groups elements of the original collection by the key returned by the given [keySelector] function
     * * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * *
     * * The returned map preserves the entry iteration order of the keys produced from the original collection.
     * *
     * * @sample samples.collections.Collections.Transformations.groupBy
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object>java.util.Map<K, java.util.Set<T>> groupBySet(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends K> keySelector) {
        return null;
    }
    
    /**
     * * Groups values returned by the [valueTransform] function applied to each element of the original collection
     * * by the key returned by the given [keySelector] function applied to the element
     * * and returns a map where each group key is associated with a list of corresponding values.
     * *
     * * The returned map preserves the entry iteration order of the keys produced from the original collection.
     * *
     * * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object, V extends java.lang.Object>java.util.Map<K, java.util.Set<V>> groupBySet(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends K> keySelector, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends V> valueTransform) {
        return null;
    }
    
    /**
     * * Groups elements of the original collection by the key returned by the given [keySelector] function
     * * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     * *
     * * @return The [destination] map.
     * *
     * * @sample samples.collections.Collections.Transformations.groupBy
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object, M extends java.util.Map<? super K, java.util.Set<T>>>M groupByToSet(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> $receiver, @org.jetbrains.annotations.NotNull()
    M destination, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends K> keySelector) {
        return null;
    }
    
    /**
     * * Groups values returned by the [valueTransform] function applied to each element of the original collection
     * * by the key returned by the given [keySelector] function applied to the element
     * * and puts to the [destination] map each group key associated with a list of corresponding values.
     * *
     * * @return The [destination] map.
     * *
     * * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object, V extends java.lang.Object, M extends java.util.Map<? super K, java.util.Set<V>>>M groupByToSet(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> $receiver, @org.jetbrains.annotations.NotNull()
    M destination, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends K> keySelector, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends V> valueTransform) {
        return null;
    }
}