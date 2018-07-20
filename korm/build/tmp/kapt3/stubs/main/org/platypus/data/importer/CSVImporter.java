package org.platypus.data.importer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/data/importer/CSVImporter;", "Lorg/platypus/data/importer/PlatypusDataImporter;", "()V", "allowedExtention", "", "", "getAllowedExtention", "()Ljava/util/Set;", "readFile", "", "env", "Lorg/platypus/PlatypusEnvironment;", "stream", "Ljava/io/InputStream;", "repo", "Lorg/platypus/repository/RecordRepository;", "korm"})
public final class CSVImporter implements org.platypus.data.importer.PlatypusDataImporter {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> allowedExtention = null;
    public static final org.platypus.data.importer.CSVImporter INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> getAllowedExtention() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> readFile(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    java.io.InputStream stream, @org.jetbrains.annotations.NotNull()
    org.platypus.repository.RecordRepository<?> repo) {
        return null;
    }
    
    private CSVImporter() {
        super();
    }
}