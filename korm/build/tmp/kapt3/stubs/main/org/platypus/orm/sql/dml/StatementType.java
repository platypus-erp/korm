package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/platypus/orm/sql/dml/StatementType;", "", "group", "Lorg/platypus/orm/sql/dml/StatementGroup;", "(Ljava/lang/String;ILorg/platypus/orm/sql/dml/StatementGroup;)V", "getGroup", "()Lorg/platypus/orm/sql/dml/StatementGroup;", "INSERT", "UPDATE", "DELETE", "SELECT", "CREATE", "ALTER", "TRUNCATE", "DROP", "GRANT", "OTHER", "korm"})
public enum StatementType {
    /*public static final*/ INSERT /* = new INSERT(null) */,
    /*public static final*/ UPDATE /* = new UPDATE(null) */,
    /*public static final*/ DELETE /* = new DELETE(null) */,
    /*public static final*/ SELECT /* = new SELECT(null) */,
    /*public static final*/ CREATE /* = new CREATE(null) */,
    /*public static final*/ ALTER /* = new ALTER(null) */,
    /*public static final*/ TRUNCATE /* = new TRUNCATE(null) */,
    /*public static final*/ DROP /* = new DROP(null) */,
    /*public static final*/ GRANT /* = new GRANT(null) */,
    /*public static final*/ OTHER /* = new OTHER(null) */;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.StatementGroup group = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.StatementGroup getGroup() {
        return null;
    }
    
    StatementType(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementGroup group) {
    }
}