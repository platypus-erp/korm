package org.platypus.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/ui/ToViewApi;", "M", "Lorg/platypus/model/Model;", "", "model", "getModel", "()Lorg/platypus/model/Model;", "uniqueName", "", "getUniqueName", "()Ljava/lang/String;", "viewType", "Lorg/platypus/ui/ViewApiType;", "getViewType", "()Lorg/platypus/ui/ViewApiType;", "querySearch", "Lorg/platypus/orm/sql/query/SearchQuery;", "env", "Lorg/platypus/PlatypusEnvironment;", "param", "Lorg/platypus/web/SearchTreeParam;", "toViewApi", "Lorg/platypus/ui/ViewApi;", "korm"})
public abstract interface ToViewApi<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.ui.ViewApi toViewApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUniqueName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.ui.ViewApiType getViewType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> querySearch(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.web.SearchTreeParam param);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <M extends org.platypus.model.Model<M>>org.platypus.ui.ViewApiType getViewType(org.platypus.ui.ToViewApi<M> $this) {
            return null;
        }
    }
}