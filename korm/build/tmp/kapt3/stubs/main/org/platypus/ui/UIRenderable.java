package org.platypus.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/platypus/ui/UIRenderable;", "", "render", "O", "consumer", "Lkotlinx/html/TagConsumer;", "env", "Lorg/platypus/ReadOnlyPlatypusEnvironment;", "(Lkotlinx/html/TagConsumer;Lorg/platypus/ReadOnlyPlatypusEnvironment;)Ljava/lang/Object;", "korm"})
public abstract interface UIRenderable {
    
    /**
     * * Render an UI element in a FreeMarker string domModule
     */
    public abstract <O extends java.lang.Object>O render(@org.jetbrains.annotations.NotNull()
    kotlinx.html.TagConsumer<? extends O> consumer, @org.jetbrains.annotations.NotNull()
    org.platypus.ReadOnlyPlatypusEnvironment env);
}