package org.platypus.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0000\u00a2\u0006\u0002\b$R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\f\u00a8\u0006%"}, d2 = {"Lorg/platypus/security/ModelGroupBuilder;", "M", "Lorg/platypus/model/Model;", "", "uniqueId", "", "(Ljava/lang/String;)V", "create", "", "getCreate", "()Z", "setCreate", "(Z)V", "delete", "getDelete", "setDelete", "groups", "", "Lorg/platypus/security/PlatypusGroup;", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "name", "getName", "()Ljava/lang/String;", "setName", "read", "getRead", "setRead", "getUniqueId", "write", "getWrite", "setWrite", "build", "Lorg/platypus/security/ModelGroup;", "build$korm", "korm"})
public final class ModelGroupBuilder<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private boolean create;
    private boolean read;
    private boolean write;
    private boolean delete;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<org.platypus.security.PlatypusGroup> groups;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uniqueId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCreate() {
        return false;
    }
    
    public final void setCreate(boolean p0) {
    }
    
    public final boolean getRead() {
        return false;
    }
    
    public final void setRead(boolean p0) {
    }
    
    public final boolean getWrite() {
        return false;
    }
    
    public final void setWrite(boolean p0) {
    }
    
    public final boolean getDelete() {
        return false;
    }
    
    public final void setDelete(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.security.PlatypusGroup> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.security.PlatypusGroup> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.security.ModelGroup<M> build$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueId() {
        return null;
    }
    
    public ModelGroupBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueId) {
        super();
    }
}