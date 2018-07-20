package org.platypus.orm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/orm/ReferenceOption;", "", "Lorg/platypus/orm/Sqlable;", "(Ljava/lang/String;I)V", "RESTRICT", "CASCADE", "SET_NULL", "NO_ACTION", "korm"})
public enum ReferenceOption implements org.platypus.orm.Sqlable {
    /*public static final*/ RESTRICT /* = new @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/ReferenceOption$RESTRICT;", "Lorg/platypus/orm/ReferenceOption;", "(Ljava/lang/String;I)V", "toSQL", "", "query", "Lorg/platypus/orm/sql/QueryBuilder;", "korm"}) RESTRICT(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toSQL(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.QueryBuilder query) {
            return null;
        }
        
        RESTRICT() {
            super();
        }
    } */,
    /*public static final*/ CASCADE /* = new @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/ReferenceOption$CASCADE;", "Lorg/platypus/orm/ReferenceOption;", "(Ljava/lang/String;I)V", "toSQL", "", "query", "Lorg/platypus/orm/sql/QueryBuilder;", "korm"}) CASCADE(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toSQL(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.QueryBuilder query) {
            return null;
        }
        
        CASCADE() {
            super();
        }
    } */,
    /*public static final*/ SET_NULL /* = new @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/ReferenceOption$SET_NULL;", "Lorg/platypus/orm/ReferenceOption;", "(Ljava/lang/String;I)V", "toSQL", "", "query", "Lorg/platypus/orm/sql/QueryBuilder;", "korm"}) SET_NULL(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toSQL(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.QueryBuilder query) {
            return null;
        }
        
        SET_NULL() {
            super();
        }
    } */,
    /*public static final*/ NO_ACTION /* = new @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/ReferenceOption$NO_ACTION;", "Lorg/platypus/orm/ReferenceOption;", "(Ljava/lang/String;I)V", "toSQL", "", "query", "Lorg/platypus/orm/sql/QueryBuilder;", "korm"}) NO_ACTION(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toSQL(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.QueryBuilder query) {
            return null;
        }
        
        NO_ACTION() {
            super();
        }
    } */;
    
    ReferenceOption() {
    }
}