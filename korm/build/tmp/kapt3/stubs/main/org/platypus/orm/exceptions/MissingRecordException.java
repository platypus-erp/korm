package org.platypus.orm.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/exceptions/MissingRecordException;", "Lorg/platypus/orm/exceptions/OrmException;", "modelID", "Lorg/platypus/cache/ModelID;", "env", "Lorg/platypus/PlatypusEnvironment;", "(Lorg/platypus/cache/ModelID;Lorg/platypus/PlatypusEnvironment;)V", "korm"})
public final class MissingRecordException extends org.platypus.orm.exceptions.OrmException {
    
    public MissingRecordException(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        super(null, null, null);
    }
}