package org.platypus.module.base.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lorg/platypus/module/base/models/Languages;", "Lorg/platypus/model/Model;", "()V", "code", "Lorg/platypus/model/field/impl/StringField;", "getCode", "()Lorg/platypus/model/field/impl/StringField;", "dateFormat", "getDateFormat", "decimalPoint", "getDecimalPoint", "direction", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/module/base/models/LanguageDirection;", "getDirection", "()Lorg/platypus/model/field/impl/SelectionField;", "grouping", "getGrouping", "installed", "Lorg/platypus/model/field/impl/BooleanField;", "getInstalled", "()Lorg/platypus/model/field/impl/BooleanField;", "isoCode", "getIsoCode", "thousandsSep", "getThousandsSep", "timeFormat", "getTimeFormat", "translatable", "getTranslatable", "korm"})
public final class Languages extends org.platypus.model.Model<org.platypus.module.base.models.Languages> {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.BooleanField<org.platypus.module.base.models.Languages> installed = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> code = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> isoCode = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.BooleanField<org.platypus.module.base.models.Languages> translatable = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.SelectionField<org.platypus.module.base.models.Languages, org.platypus.module.base.models.LanguageDirection> direction = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> dateFormat = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> timeFormat = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> grouping = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> decimalPoint = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> thousandsSep = null;
    public static final org.platypus.module.base.models.Languages INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.BooleanField<org.platypus.module.base.models.Languages> getInstalled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getIsoCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.BooleanField<org.platypus.module.base.models.Languages> getTranslatable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.SelectionField<org.platypus.module.base.models.Languages, org.platypus.module.base.models.LanguageDirection> getDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getDateFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getTimeFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getGrouping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getDecimalPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<org.platypus.module.base.models.Languages> getThousandsSep() {
        return null;
    }
    
    private Languages() {
        super(null, null);
    }
}