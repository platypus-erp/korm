package org.platypus.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\b\u00a8\u0006("}, d2 = {"Lorg/platypus/config/PlatypusDataBaseConf;", "", "()V", "dbName", "", "getDbName", "()Ljava/lang/String;", "setDbName", "(Ljava/lang/String;)V", "driverDb", "getDriverDb", "setDriverDb", "insolationLevel", "", "getInsolationLevel", "()I", "setInsolationLevel", "(I)V", "noUpdateSchema", "", "getNoUpdateSchema", "()Z", "setNoUpdateSchema", "(Z)V", "passwordDb", "getPasswordDb", "setPasswordDb", "statementInterceptor", "", "Lorg/platypus/orm/sql/dml/statements/StatementInterceptor;", "getStatementInterceptor", "()Ljava/util/Set;", "setStatementInterceptor", "(Ljava/util/Set;)V", "urlDb", "getUrlDb", "setUrlDb", "userDb", "getUserDb", "setUserDb", "korm"})
public final class PlatypusDataBaseConf {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dbName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String urlDb;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverDb;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userDb;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passwordDb;
    private int insolationLevel;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<? extends org.platypus.orm.sql.dml.statements.StatementInterceptor> statementInterceptor;
    private boolean noUpdateSchema;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDbName() {
        return null;
    }
    
    public final void setDbName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrlDb() {
        return null;
    }
    
    public final void setUrlDb(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDriverDb() {
        return null;
    }
    
    public final void setDriverDb(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserDb() {
        return null;
    }
    
    public final void setUserDb(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPasswordDb() {
        return null;
    }
    
    public final void setPasswordDb(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getInsolationLevel() {
        return 0;
    }
    
    public final void setInsolationLevel(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.orm.sql.dml.statements.StatementInterceptor> getStatementInterceptor() {
        return null;
    }
    
    public final void setStatementInterceptor(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.dml.statements.StatementInterceptor> p0) {
    }
    
    public final boolean getNoUpdateSchema() {
        return false;
    }
    
    public final void setNoUpdateSchema(boolean p0) {
    }
    
    public PlatypusDataBaseConf() {
        super();
    }
}