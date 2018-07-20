package org.platypus.orm.sql.ddl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\r"}, d2 = {"Lorg/platypus/orm/sql/ddl/IndiceVisitor;", "Lorg/platypus/model/ModelVisitor;", "Lorg/platypus/orm/PersistenceDialect;", "", "Lorg/platypus/orm/sql/Index;", "()V", "visit", "m", "Lorg/platypus/model/Alias;", "p", "Lorg/platypus/model/LinkModel;", "Lorg/platypus/model/MixinModel;", "Lorg/platypus/model/Model;", "korm"})
public final class IndiceVisitor implements org.platypus.model.ModelVisitor<org.platypus.orm.PersistenceDialect, java.util.Set<? extends org.platypus.orm.sql.Index>> {
    public static final org.platypus.orm.sql.ddl.IndiceVisitor INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.Index> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.PersistenceDialect p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.Index> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.PersistenceDialect p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.Index> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.MixinModel<?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.PersistenceDialect p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.Index> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.PersistenceDialect p) {
        return null;
    }
    
    private IndiceVisitor() {
        super();
    }
}