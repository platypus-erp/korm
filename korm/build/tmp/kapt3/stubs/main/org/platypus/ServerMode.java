package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/ServerMode;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "DEMO", "DEV", "PRODUCTION", "TEST", "Lorg/platypus/ServerMode$TEST;", "Lorg/platypus/ServerMode$DEMO;", "Lorg/platypus/ServerMode$DEV;", "Lorg/platypus/ServerMode$PRODUCTION;", "korm"})
public abstract class ServerMode {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    private ServerMode(java.lang.String name) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/platypus/ServerMode$TEST;", "Lorg/platypus/ServerMode;", "()V", "korm"})
    public static final class TEST extends org.platypus.ServerMode {
        public static final org.platypus.ServerMode.TEST INSTANCE = null;
        
        private TEST() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/platypus/ServerMode$DEMO;", "Lorg/platypus/ServerMode;", "()V", "korm"})
    public static final class DEMO extends org.platypus.ServerMode {
        public static final org.platypus.ServerMode.DEMO INSTANCE = null;
        
        private DEMO() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/platypus/ServerMode$DEV;", "Lorg/platypus/ServerMode;", "()V", "korm"})
    public static final class DEV extends org.platypus.ServerMode {
        public static final org.platypus.ServerMode.DEV INSTANCE = null;
        
        private DEV() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/platypus/ServerMode$PRODUCTION;", "Lorg/platypus/ServerMode;", "()V", "korm"})
    public static final class PRODUCTION extends org.platypus.ServerMode {
        public static final org.platypus.ServerMode.PRODUCTION INSTANCE = null;
        
        private PRODUCTION() {
            super(null);
        }
    }
}