package org.platypus.ui.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010!\u001a\u00020\"R\u0017\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0019j\b\u0012\u0004\u0012\u00020\u0000`\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017\u00a8\u0006$"}, d2 = {"Lorg/platypus/ui/menu/UIMenu;", "", "uuid", "", "name", "parent", "sequence", "", "icon", "action", "Lorg/platypus/ui/action/UIMenuAction;", "groups", "", "(Ljava/lang/String;Ljava/lang/String;Lorg/platypus/ui/menu/UIMenu;ILjava/lang/String;Lorg/platypus/ui/action/UIMenuAction;Ljava/util/Set;)V", "getAction", "()Lorg/platypus/ui/action/UIMenuAction;", "children", "", "getChildren", "()Ljava/util/List;", "getGroups", "()Ljava/util/Set;", "getIcon", "()Ljava/lang/String;", "mutableChildren", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getName", "getParent", "()Lorg/platypus/ui/menu/UIMenu;", "getSequence", "()I", "getUuid", "toJson", "Lcom/beust/klaxon/JsonObject;", "Builder", "korm"})
public final class UIMenu {
    private final java.util.ArrayList<org.platypus.ui.menu.UIMenu> mutableChildren = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uuid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.ui.menu.UIMenu parent = null;
    private final int sequence = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.ui.action.UIMenuAction<?> action = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> groups = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.platypus.ui.menu.UIMenu> getChildren() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.beust.klaxon.JsonObject toJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.ui.menu.UIMenu getParent() {
        return null;
    }
    
    public final int getSequence() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.ui.action.UIMenuAction<?> getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    private UIMenu(java.lang.String uuid, java.lang.String name, org.platypus.ui.menu.UIMenu parent, int sequence, java.lang.String icon, org.platypus.ui.action.UIMenuAction<?> action, java.util.Set<java.lang.String> groups) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020\u0019R \u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013\u00a8\u0006&"}, d2 = {"Lorg/platypus/ui/menu/UIMenu$Builder;", "", "uuid", "", "(Ljava/lang/String;)V", "action", "Lorg/platypus/ui/action/UIMenuAction;", "getAction", "()Lorg/platypus/ui/action/UIMenuAction;", "setAction", "(Lorg/platypus/ui/action/UIMenuAction;)V", "groups", "", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "icon", "getIcon", "()Ljava/lang/String;", "setIcon", "name", "getName", "setName", "parent", "Lorg/platypus/ui/menu/UIMenu;", "getParent", "()Lorg/platypus/ui/menu/UIMenu;", "setParent", "(Lorg/platypus/ui/menu/UIMenu;)V", "sequence", "", "getSequence", "()I", "setSequence", "(I)V", "getUuid", "build", "korm"})
    public static final class Builder {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private org.platypus.ui.menu.UIMenu parent;
        private int sequence;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String icon;
        @org.jetbrains.annotations.Nullable()
        private org.platypus.ui.action.UIMenuAction<?> action;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<java.lang.String> groups;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String uuid = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.platypus.ui.menu.UIMenu getParent() {
            return null;
        }
        
        public final void setParent(@org.jetbrains.annotations.Nullable()
        org.platypus.ui.menu.UIMenu p0) {
        }
        
        public final int getSequence() {
            return 0;
        }
        
        public final void setSequence(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.platypus.ui.action.UIMenuAction<?> getAction() {
            return null;
        }
        
        public final void setAction(@org.jetbrains.annotations.Nullable()
        org.platypus.ui.action.UIMenuAction<?> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getGroups() {
            return null;
        }
        
        public final void setGroups(@org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.ui.menu.UIMenu build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUuid() {
            return null;
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        java.lang.String uuid) {
            super();
        }
    }
}