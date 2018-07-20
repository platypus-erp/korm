package org.platypus.module.base.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"=\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"=\u0010\f\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t\"=\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t\"I\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u000e\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\"=\u0010\u001d\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\t\"9\u0010\"\u001a\u00020!*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010\u0000\u001a\u00020!8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\"=\u0010)\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\t\"\u001f\u0010-\u001a\f\u0012\u0004\u0012\u00020\u00040.j\u0002`/*\u0002008F\u00a2\u0006\u0006\u001a\u0004\b1\u00102\"=\u00103\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b6\u0010\u000b\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\t\"=\u00107\u001a\u0004\u0018\u00010\u0001*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010\u000b\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\t\"9\u0010;\u001a\u00020!*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010\u0000\u001a\u00020!8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u0010(\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&*\u0016\u0010?\"\b\u0012\u0004\u0012\u00020\u00040@2\b\u0012\u0004\u0012\u00020\u00040@*\u0016\u0010A\"\b\u0012\u0004\u0012\u00020\u00040B2\b\u0012\u0004\u0012\u00020\u00040B*\u0016\u0010C\"\b\u0012\u0004\u0012\u00020\u00040.2\b\u0012\u0004\u0012\u00020\u00040.*\u0016\u0010D\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a8\u0006E"}, d2 = {"<set-?>", "", "code", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Languages;", "Lorg/platypus/module/base/entities/Language;", "getCode", "(Lorg/platypus/entity/Record;)Ljava/lang/String;", "setCode", "(Lorg/platypus/entity/Record;Ljava/lang/String;)V", "code$delegate", "Lorg/platypus/model/field/impl/StringField;", "dateFormat", "getDateFormat", "setDateFormat", "dateFormat$delegate", "decimalPoint", "getDecimalPoint", "setDecimalPoint", "decimalPoint$delegate", "Lorg/platypus/entity/SelectionValue;", "Lorg/platypus/module/base/models/LanguageDirection;", "direction", "getDirection", "(Lorg/platypus/entity/Record;)Lorg/platypus/entity/SelectionValue;", "setDirection", "(Lorg/platypus/entity/Record;Lorg/platypus/entity/SelectionValue;)V", "direction$delegate", "Lorg/platypus/model/field/impl/SelectionField;", "grouping", "getGrouping", "setGrouping", "grouping$delegate", "", "installed", "getInstalled", "(Lorg/platypus/entity/Record;)Z", "setInstalled", "(Lorg/platypus/entity/Record;Z)V", "installed$delegate", "Lorg/platypus/model/field/impl/BooleanField;", "isoCode", "getIsoCode", "setIsoCode", "isoCode$delegate", "languageRepo", "Lorg/platypus/repository/RecordRepository;", "Lorg/platypus/module/base/entities/LangageRepository;", "Lorg/platypus/PlatypusEnvironment;", "getLanguageRepo", "(Lorg/platypus/PlatypusEnvironment;)Lorg/platypus/repository/RecordRepository;", "thousandsSep", "getThousandsSep", "setThousandsSep", "thousandsSep$delegate", "timeFormat", "getTimeFormat", "setTimeFormat", "timeFormat$delegate", "translatable", "getTranslatable", "setTranslatable", "translatable$delegate", "LangageBag", "Lorg/platypus/bag/Bag;", "LangageData", "Lorg/platypus/data/DataRef;", "LangageRepository", "Language", "korm"})
public final class LanguageKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.BooleanField installed$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField code$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField isoCode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.model.field.impl.BooleanField translatable$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.SelectionField direction$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField dateFormat$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField timeFormat$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField grouping$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField decimalPoint$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final org.platypus.model.field.impl.StringField thousandsSep$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.repository.RecordRepository<org.platypus.module.base.models.Languages> getLanguageRepo(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver) {
        return null;
    }
    
    public static final boolean getInstalled(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return false;
    }
    
    public static final void setInstalled(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, boolean p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getCode(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setCode(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getIsoCode(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setIsoCode(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    public static final boolean getTranslatable(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return false;
    }
    
    public static final void setTranslatable(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, boolean p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final org.platypus.entity.SelectionValue<org.platypus.module.base.models.LanguageDirection> getDirection(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setDirection(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.SelectionValue<org.platypus.module.base.models.LanguageDirection> p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDateFormat(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setDateFormat(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getTimeFormat(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setTimeFormat(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getGrouping(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setGrouping(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDecimalPoint(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setDecimalPoint(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getThousandsSep(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver) {
        return null;
    }
    
    public static final void setThousandsSep(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<org.platypus.module.base.models.Languages> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
}