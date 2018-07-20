package org.platypus.model.functions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 %*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001%BE\u0012\b\b\u0002\u0010\u0003\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0015\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0003JT\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006&"}, d2 = {"Lorg/platypus/model/functions/PublicApiReturn;", "RETURN", "", "result", "results", "", "", "warnings", "", "Lorg/platypus/model/functions/UIWarnings;", "success", "Lorg/platypus/model/functions/UISuccess;", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getResults", "()Ljava/util/Map;", "getSuccess", "()Ljava/util/Set;", "getWarnings", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)Lorg/platypus/model/functions/PublicApiReturn;", "equals", "", "other", "hashCode", "toJson", "Lcom/beust/klaxon/JsonObject;", "env", "Lorg/platypus/PlatypusEnvironment;", "toString", "", "Companion", "korm"})
public final class PublicApiReturn<RETURN extends java.lang.Object> {
    private final RETURN result = null;
    
    /**
     * * The result for each id of the function
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, RETURN> results = null;
    
    /**
     * * A fieldSet of warning to display on the UI
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.model.functions.UIWarnings> warnings = null;
    
    /**
     * * A fieldSet of success to display on the UI
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.model.functions.UISuccess> success = null;
    public static final org.platypus.model.functions.PublicApiReturn.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.beust.klaxon.JsonObject toJson(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    public final RETURN getResult() {
        return null;
    }
    
    /**
     * * The result for each id of the function
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, RETURN> getResults() {
        return null;
    }
    
    /**
     * * A fieldSet of warning to display on the UI
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.functions.UIWarnings> getWarnings() {
        return null;
    }
    
    /**
     * * A fieldSet of success to display on the UI
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.functions.UISuccess> getSuccess() {
        return null;
    }
    
    public PublicApiReturn(RETURN result, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends RETURN> results, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.functions.UIWarnings> warnings, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.functions.UISuccess> success) {
        super();
    }
    
    public PublicApiReturn() {
        super();
    }
    
    public final RETURN component1() {
        return null;
    }
    
    /**
     * * The result for each id of the function
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, RETURN> component2() {
        return null;
    }
    
    /**
     * * A fieldSet of warning to display on the UI
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.functions.UIWarnings> component3() {
        return null;
    }
    
    /**
     * * A fieldSet of success to display on the UI
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.functions.UISuccess> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.PublicApiReturn<RETURN> copy(RETURN result, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends RETURN> results, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.functions.UIWarnings> warnings, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.functions.UISuccess> success) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/model/functions/PublicApiReturn$Companion;", "", "()V", "empty", "Lorg/platypus/model/functions/PublicApiReturn;", "T", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>org.platypus.model.functions.PublicApiReturn<T> empty() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}