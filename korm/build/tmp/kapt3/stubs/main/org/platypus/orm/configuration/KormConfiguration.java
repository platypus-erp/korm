package org.platypus.orm.configuration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005\u00a8\u0006\u0014"}, d2 = {"Lorg/platypus/orm/configuration/KormConfiguration;", "", "dialectName", "", "getDialectName", "()Ljava/lang/String;", "driver", "getDriver", "onOpenConnection", "Lkotlin/Function1;", "Ljava/sql/Connection;", "", "getOnOpenConnection", "()Lkotlin/jvm/functions/Function1;", "password", "getPassword", "url", "getUrl", "user", "getUser", "korm"})
public abstract interface KormConfiguration {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getDialectName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDriver();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPassword();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<java.sql.Connection, kotlin.Unit> getOnOpenConnection();
}