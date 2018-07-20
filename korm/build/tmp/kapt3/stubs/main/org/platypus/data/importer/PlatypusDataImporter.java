package org.platypus.data.importer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/data/importer/PlatypusDataImporter;", "", "allowedExtention", "", "", "getAllowedExtention", "()Ljava/util/Set;", "readFile", "", "env", "Lorg/platypus/PlatypusEnvironment;", "stream", "Ljava/io/InputStream;", "repo", "Lorg/platypus/repository/RecordRepository;", "korm"})
public abstract interface PlatypusDataImporter {
    
    /**
     * * The extentions of the file that this importer can read
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> getAllowedExtention();
    
    /**
     * * Read the file and do what ever you want with it
     *     * @return all the errors detected in the file
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> readFile(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    java.io.InputStream stream, @org.jetbrains.annotations.NotNull()
    org.platypus.repository.RecordRepository<?> repo);
}