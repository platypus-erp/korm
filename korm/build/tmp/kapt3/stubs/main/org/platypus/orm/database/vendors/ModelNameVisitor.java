package org.platypus.orm.database.vendors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\u0003\u001a\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\u0003\u001a\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H&J\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H&\u00a8\u0006\f"}, d2 = {"Lorg/platypus/orm/database/vendors/ModelNameVisitor;", "Lorg/platypus/model/ModelVisitor;", "", "visit", "m", "Lorg/platypus/model/Alias;", "p", "Lorg/platypus/model/LinkModel;", "Lorg/platypus/model/MixinModel;", "Lorg/platypus/model/Model;", "inProperCase", "quotedIfNeeded", "korm"})
public abstract interface ModelNameVisitor extends org.platypus.model.ModelVisitor<java.lang.String, java.lang.String> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> m, @org.jetbrains.annotations.NotNull()
    java.lang.String p);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> m, @org.jetbrains.annotations.NotNull()
    java.lang.String p);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.MixinModel<?> m, @org.jetbrains.annotations.NotNull()
    java.lang.String p);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.String visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<?> m, @org.jetbrains.annotations.NotNull()
    java.lang.String p);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String inProperCase(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String quotedIfNeeded(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.lang.String visit(org.platypus.orm.database.vendors.ModelNameVisitor $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.Model<?> m, @org.jetbrains.annotations.NotNull()
        java.lang.String p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.lang.String visit(org.platypus.orm.database.vendors.ModelNameVisitor $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.LinkModel<?, ?> m, @org.jetbrains.annotations.NotNull()
        java.lang.String p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.lang.String visit(org.platypus.orm.database.vendors.ModelNameVisitor $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.MixinModel<?> m, @org.jetbrains.annotations.NotNull()
        java.lang.String p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.lang.String visit(org.platypus.orm.database.vendors.ModelNameVisitor $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.Alias<?> m, @org.jetbrains.annotations.NotNull()
        java.lang.String p) {
            return null;
        }
    }
}