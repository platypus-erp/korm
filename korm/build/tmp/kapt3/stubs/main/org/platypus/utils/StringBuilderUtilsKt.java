package org.platypus.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000d\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a?\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0006\u00a2\u0006\u0002\b\u0007H\u0086\b\u00a2\u0006\u0002\u0010\b\u001a<\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\b\u0010\r\u001a\u0004\u0018\u0001H\u000b\u00a2\u0006\u0002\u0010\u0012\u001a\'\u0010\u0013\u001a\u00020\n*\u00060\u0014j\u0002`\u00152\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018\u00a2\u0006\u0002\u0010\u0019\u001a&\u0010\u001a\u001a\n \u001b*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0018\u001a\u001c\u0010\u001d\u001a\u00020\n*\u00060\u0014j\u0002`\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e\u001a\u0016\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u0015\u001a\u001e\u0010 \u001a\u00020\u000f*\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000f\u001a\u001e\u0010$\u001a\u00020\u000f*\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000f\u001a\u0016\u0010%\u001a\n \u001b*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u0015\u001a\u0012\u0010&\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\'\u001a\u00020\u0018\u001a\f\u0010(\u001a\u00020)*\u00020\u0018H\u0002\u001a \u0010*\u001a\n \u001b*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u00152\b\b\u0002\u0010+\u001a\u00020,\u001a\u0012\u0010-\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\'\u001a\u00020\u0018\u001a \u0010.\u001a\n \u001b*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u00152\b\b\u0002\u0010/\u001a\u00020,\u001a\u0015\u00100\u001a\u00020\"*\u00020\"2\u0006\u0010/\u001a\u00020,H\u0086\u0002\u001a\n\u00101\u001a\u00020\u0018*\u00020\u0018\u001a\u001e\u00102\u001a\n \u001b*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u00152\u0006\u00102\u001a\u00020\u0018\u001a\u001a\u00103\u001a\u00020\u0018*\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0018\u00a8\u00064"}, d2 = {"withAutoClose", "R", "T", "Ljava/lang/AutoCloseable;", "receiver", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "addIf", "", "E", "", "element", "predicate", "", "(Ljava/util/Collection;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "addIfNotNull", "(Ljava/util/Collection;Ljava/lang/Object;)V", "append", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "values", "", "", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)V", "appendIf", "kotlin.jvm.PlatformType", "value", "appendValues", "", "comma", "containsOrFalse", "other", "", "ignoreCase", "containsOrTrue", "enter", "prefix", "s", "reader", "Ljava/io/StringReader;", "space", "nb", "", "suffix", "tab", "i", "times", "to_sneak_case", "token", "wrap", "korm"})
public final class StringBuilderUtilsKt {
    
    private static final java.io.StringReader reader(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    public static final java.lang.StringBuilder space(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, int nb) {
        return null;
    }
    
    public static final java.lang.StringBuilder token(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    public static final void appendValues(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> values) {
    }
    
    public static final void append(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String... values) {
    }
    
    public static final java.lang.StringBuilder comma(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver) {
        return null;
    }
    
    public static final java.lang.StringBuilder enter(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver) {
        return null;
    }
    
    public static final java.lang.StringBuilder appendIf(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, boolean predicate, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    public static final java.lang.StringBuilder tab(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, int i) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence times(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence $receiver, int i) {
        return null;
    }
    
    /**
     * * Calls the specified function [block] with the given [receiver] as its receiver and returns its result.
     */
    public static final <T extends java.lang.AutoCloseable, R extends java.lang.Object>R withAutoClose(@org.jetbrains.annotations.NotNull()
    T receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String suffix(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String prefix(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String wrap(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String to_sneak_case(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    public static final boolean containsOrFalse(@org.jetbrains.annotations.Nullable()
    java.lang.String $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence other, boolean ignoreCase) {
        return false;
    }
    
    public static final boolean containsOrTrue(@org.jetbrains.annotations.Nullable()
    java.lang.String $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence other, boolean ignoreCase) {
        return false;
    }
    
    public static final <E extends java.lang.Object>void addIfNotNull(@org.jetbrains.annotations.NotNull()
    java.util.Collection<E> $receiver, @org.jetbrains.annotations.Nullable()
    E element) {
    }
    
    public static final <E extends java.lang.Object>void addIf(@org.jetbrains.annotations.NotNull()
    java.util.Collection<E> $receiver, E element, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
    }
}