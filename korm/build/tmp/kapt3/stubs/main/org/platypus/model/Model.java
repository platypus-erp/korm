package org.platypus.model;

import java.lang.System;

/**
 * * This is the base class of all Model in platypus
 * * You need to choose a spacific impl for this models.
 * * A Model is the representation a SQL Table DDL
 * * @see ModelImplementations and it's chidren to pickup the best implementation
 * * @constructor [modelName] the name of the should be valid against the regex [modelNameVadatorRegex]
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00e2\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007JJ\u0010\u0098\u0001\u001a\u0003H\u0099\u0001\"\n\b\u0001\u0010\u009a\u0001*\u00030\u009b\u0001\"\n\b\u0002\u0010\u0099\u0001*\u00030\u009b\u00012\u0016\u0010\u009c\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u009a\u0001\u0012\u0005\u0012\u0003H\u0099\u00010\u009d\u00012\b\u0010\u009e\u0001\u001a\u0003H\u009a\u0001H\u0016\u00a2\u0006\u0003\u0010\u009f\u0001J:\u0010\u00a0\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00a1\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00a4\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ:\u0010\u00a5\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00a6\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00a7\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ@\u0010\u00a8\u0001\u001a\u00020v2\u0006\u00106\u001a\u00020\u00042\u000b\b\u0002\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u00042 \u0010\u00aa\u0001\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ab\u00010\u000b0\u00a3\u0001\u00a2\u0006\u0002\bwH\u0004J:\u0010\u00ac\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ad\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00ae\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ:\u0010\u00af\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00b0\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00b1\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ:\u0010\u00b2\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00b3\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00b4\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ\u0013\u0010\u00b5\u0001\u001a\u00020\u00042\b\u0010\u00b6\u0001\u001a\u00030\u00b7\u0001H\u0016J\u0017\u0010\u00b8\u0001\u001a\u00030\u00ab\u00012\n\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0096\u0002J\t\u0010\u00ba\u0001\u001a\u00020&H\u0016J:\u0010\u00bb\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00bc\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00bd\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ\u0084\u0001\u0010\u00be\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00bf\u0001\"\u0010\b\u0001\u0010\u00c0\u0001*\t\u0012\u0005\u0012\u0003H\u00c0\u00010\u00002\u0006\u00106\u001a\u00020\u00042(\u0010\u00c1\u0001\u001a#\u0012\u0005\u0012\u00030\u00c2\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00c3\u00010\u00a3\u0001\u00a2\u0006\u0002\bw2)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00c4\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ\u0084\u0001\u0010\u00c5\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00bf\u0001\"\u0010\b\u0001\u0010\u00c0\u0001*\t\u0012\u0005\u0012\u0003H\u00c0\u00010\u00002\u0006\u00106\u001a\u00020\u00042(\u0010\u00c1\u0001\u001a#\u0012\u0005\u0012\u00030\u00c2\u0001\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u0003H\u00c0\u0001\u0012\u0004\u0012\u00028\u00000\u00c3\u00010\u00a3\u0001\u00a2\u0006\u0002\bw2)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00c4\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJj\u0010\u00c6\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00c7\u0001\"\u0010\b\u0001\u0010\u00c0\u0001*\t\u0012\u0005\u0012\u0003H\u00c0\u00010\u00002\u0006\u00106\u001a\u00020\u00042\b\u0010\u00c1\u0001\u001a\u0003H\u00c0\u00012)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00c8\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bw\u00a2\u0006\u0003\u0010\u00c9\u0001J4\u0010J\u001a\u0003H\u00ca\u0001\"\u000f\b\u0001\u0010\u00ca\u0001*\b\u0012\u0004\u0012\u00028\u00000L2\u0007\u0010J\u001a\u0003H\u00ca\u00012\t\b\u0002\u0010\u00cb\u0001\u001a\u00020MH\u0004\u00a2\u0006\u0003\u0010\u00cc\u0001J\u001a\u0010\u00cd\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ce\u00012\b\u0010\u00b6\u0001\u001a\u00030\u00b7\u0001H\u0016Jx\u0010\u00cf\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00d0\u0001\"\u0010\b\u0001\u0010\u00c0\u0001*\t\u0012\u0005\u0012\u0003H\u00c0\u00010\u00002\u0006\u00106\u001a\u00020\u00042\u001c\u0010\u00d1\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u0003H\u00c0\u0001\u0012\u0004\u0012\u00028\u00000\u00c7\u00010\u00d2\u00012)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00d3\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJj\u0010\u00d4\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00d5\u0001\"\u0010\b\u0001\u0010\u00c0\u0001*\t\u0012\u0005\u0012\u0003H\u00c0\u00010\u00002\u0006\u00106\u001a\u00020\u00042\b\u0010\u00c1\u0001\u001a\u0003H\u00c0\u00012)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00d6\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bw\u00a2\u0006\u0003\u0010\u00d7\u0001JJ\u0010k\u001a\u00020v2<\u0010\u00d8\u0001\u001a\u001f\u0012\u001a\b\u0001\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020\f0\n0\u00d9\u0001\"\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0003\u0010\u00da\u0001J)\u0010k\u001a\u00020v2!\u0010\u00d8\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020\f0\n0;J!\u0010k\u001a\u00020v2\u000f\u0010\u00db\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030^2\b\b\u0002\u0010k\u001a\u00020\fJ\"\u0010\u00dc\u0001\u001a\u00020v2\u0011\u0010\u00dd\u0001\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000pH\u0000\u00a2\u0006\u0003\b\u00de\u0001Jx\u0010\u00df\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00e0\u0001\"\u0010\b\u0001\u0010\u00c0\u0001*\t\u0012\u0005\u0012\u0003H\u00c0\u00010\u00002\u0006\u00106\u001a\u00020\u00042\u001c\u0010\u00d1\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u0003H\u00c0\u0001\u0012\u0004\u0012\u00028\u00000\u00d5\u00010\u00d2\u00012)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c0\u00010\u00e1\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJk\u0010\u00e2\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00e4\u00010\u00e3\u0001\"\u0011\b\u0001\u0010\u00e4\u0001*\n\u0012\u0005\u0012\u0003H\u00e4\u00010\u00e5\u00012\u0006\u00106\u001a\u00020\u00042\b\u0010\u00e2\u0001\u001a\u0003H\u00e4\u00012)\b\u0002\u0010\u00a2\u0001\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00e4\u00010\u00e6\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bw\u00a2\u0006\u0003\u0010\u00e7\u0001J:\u0010\u00e8\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00e9\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00ea\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ\u0013\u0010\u00eb\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020;H\u0016J:\u0010\u00ec\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ed\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00ee\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ:\u0010\u00ef\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00f0\u00012\u0006\u00106\u001a\u00020\u00042\"\b\u0002\u0010\u00a2\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00f1\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwJ\t\u0010\u00f2\u0001\u001a\u00020\u0004H\u0016JO\u0010\u00f3\u0001\u001a\u00020v2\u0006\u00106\u001a\u00020\u00042\u000b\b\u0002\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u00042)\u0010,\u001a\u0016\u0012\u0011\b\u0001\u0012\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00f4\u00010\u00d9\u0001\"\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00f4\u0001H\u0004\u00a2\u0006\u0003\u0010\u00f5\u0001JL\u0010\u00f6\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020v0\u0018\"\n\b\u0001\u0010\u00f7\u0001*\u00030\u009b\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00f7\u00010^2\u001a\u0010\u00f8\u0001\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0004\u0012\u00020v0\u00a3\u0001J6\u0010\u00f9\u0001\u001a\u00020v*\b\u0012\u0004\u0012\u00028\u00000Y2 \u0010\u00f8\u0001\u001a\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00fa\u0001\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwH\u0086\u0004JX\u0010\u00f9\u0001\u001a\u00020v\"\u0005\b\u0001\u0010\u00fb\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fb\u00010]24\u0010\u00f8\u0001\u001a/\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fb\u00010\u00fc\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00ce\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010t\u00a2\u0006\u0002\bwH\u0084\u0004Ju\u0010\u00f9\u0001\u001a\u00020v\"\u0005\b\u0001\u0010\u00fd\u0001\"\u0005\b\u0002\u0010\u00fb\u0001*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u0001042C\u0010\u00f8\u0001\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u00ff\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00ce\u0001\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u00fe\u0001\u00a2\u0006\u0002\bwH\u0084\u0004JX\u0010\u00f9\u0001\u001a\u00020v\"\u0005\b\u0001\u0010\u00fb\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fb\u00010\u0080\u000223\u0010\u00f8\u0001\u001a.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fb\u00010\u0081\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000=\u0012\u0005\u0012\u0003H\u00fb\u00010t\u00a2\u0006\u0002\bwH\u0084\u0004Ju\u0010\u00f9\u0001\u001a\u00020v\"\u0005\b\u0001\u0010\u00fd\u0001\"\u0005\b\u0002\u0010\u00fb\u0001*\u0017\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u0082\u00022B\u0010\u00f8\u0001\u001a=\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u0083\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000=\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u00fe\u0001\u00a2\u0006\u0002\bwH\u0084\u0004JW\u0010\u00f9\u0001\u001a\u00020v\"\u0005\b\u0001\u0010\u00fb\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fb\u00010\u001823\u0010\u00f8\u0001\u001a.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fb\u00010\u0084\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0005\u0012\u0003H\u00fb\u00010t\u00a2\u0006\u0002\bwH\u0084\u0004Ju\u0010\u00f9\u0001\u001a\u00020v\"\u0005\b\u0001\u0010\u00fd\u0001\"\u0005\b\u0002\u0010\u00fb\u0001*\u0017\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u008b\u00012B\u0010\u00f8\u0001\u001a=\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u0085\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0005\u0012\u0003H\u00fd\u0001\u0012\u0005\u0012\u0003H\u00fb\u00010\u00fe\u0001\u00a2\u0006\u0002\bwH\u0084\u0004J_\u0010\u0086\u0002\u001a\u0003H\u0087\u0002\"\u0017\b\u0001\u0010\u0088\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u0087\u00020\u0089\u0002\"\u0013\b\u0002\u0010\u0087\u0002*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030^*\u0003H\u0088\u00022\u001a\u0010\u00a2\u0001\u001a\u0015\u0012\u0005\u0012\u0003H\u0088\u0002\u0012\u0004\u0012\u00020v0\u00a3\u0001\u00a2\u0006\u0002\bwH\u0002\u00a2\u0006\u0003\u0010\u008a\u0002J\u00a0\u0001\u0010\u008b\u0002\u001a\u0003H\u008c\u0002\"\u0010\b\u0001\u0010\u008d\u0002*\t\u0012\u0005\u0012\u0003H\u008d\u00020\u0000\"\u0005\b\u0002\u0010\u00f7\u0001\"\u0017\b\u0003\u0010\u008c\u0002*\u0010\u0012\u0005\u0012\u0003H\u008d\u0002\u0012\u0005\u0012\u0003H\u00f7\u00010^*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u008d\u00020p2\u000b\b\u0002\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u00042\u000b\b\u0002\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0090\u0002\u001a\u00030\u00ab\u00012\n\b\u0002\u0010\u0091\u0002\u001a\u00030\u00ab\u00012\u001b\u0010\u0092\u0002\u001a\u0016\u0012\u0005\u0012\u0003H\u008d\u0002\u0012\u0005\u0012\u0003H\u008c\u00020\u00a3\u0001\u00a2\u0006\u0002\bw\u00a2\u0006\u0003\u0010\u0093\u0002R$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R)\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R#\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R$\u0010,\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030.0-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100R\u001e\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00100R>\u00103\u001a/\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110&\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u001904\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109RD\u0010:\u001a5\u0012\u0004\u0012\u00028\u0000\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0;\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(<\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000=0\u001904\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000?X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR$\u0010B\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030.0CX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000G\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR \u0010J\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L\u0012\u0004\u0012\u00020M0KX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00048F@DX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010T\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00048F@DX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR\u0014\u0010W\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010QR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000Y\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R-\u0010\\\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030^0-0]\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R#\u0010a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010\u001cR8\u0010c\u001a)\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110d\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001904\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00109R#\u0010g\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0]\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010`R#\u0010i\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0]\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010`R\'\u0010k\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\f0\n0;8F\u00a2\u0006\u0006\u001a\u0004\bl\u0010mR\u001e\u0010n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000p0oX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010q\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000p0-8F\u00a2\u0006\u0006\u001a\u0004\br\u00100RU\u0010s\u001aF\u0012\u0004\u0012\u00028\u0000\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000u\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020v0t\u00a2\u0006\u0002\bw\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(x\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000=04\u00a2\u0006\b\n\u0000\u001a\u0004\by\u00109RD\u0010z\u001a5\u0012\u0004\u0012\u00028\u0000\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000{\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000=0\u001904\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u00109R\u0015\u0010}\u001a\u00020~8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\"\u0010\u0081\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0082\u00010KX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0083\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0084\u00010KX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0085\u0001\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030.0-8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0086\u0001\u00100R\u0017\u0010\u0087\u0001\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R>\u0010\u008a\u0001\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00028\u00000\u008c\u0001\u00a2\u0006\r\b5\u0012\t\b6\u0012\u0005\b\b(\u008d\u0001\u0012\u0004\u0012\u00020v0\u008b\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0091\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\u00a8\u0006\u0094\u0002"}, d2 = {"Lorg/platypus/model/Model;", "M", "Lorg/platypus/model/IModel;", "baseModelName", "", "type", "Lorg/platypus/model/ModelType;", "(Ljava/lang/String;Lorg/platypus/model/ModelType;)V", "_orderByColumns", "", "Lkotlin/Pair;", "Lorg/platypus/orm/sql/expression/Expression;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "_slots", "Lorg/platypus/model/ModelSlotsImpl;", "api", "Lorg/platypus/model/functions/ModelFunction;", "getApi", "()Lorg/platypus/model/functions/ModelFunction;", "archived", "Lorg/platypus/model/field/impl/ArchivedModelField;", "getArchived", "()Lorg/platypus/model/field/impl/ArchivedModelField;", "create", "Lorg/platypus/model/functions/one/ApiOneNoParamStacker;", "Lorg/platypus/model/functions/PublicApiReturn;", "Lorg/platypus/entity/Record;", "getCreate", "()Lorg/platypus/model/functions/one/ApiOneNoParamStacker;", "createDate", "Lorg/platypus/model/field/impl/CreateDateModelField;", "getCreateDate", "()Lorg/platypus/model/field/impl/CreateDateModelField;", "createUid", "Lorg/platypus/model/field/impl/CreateUID;", "getCreateUid", "()Lorg/platypus/model/field/impl/CreateUID;", "delete", "", "getDelete", "externalRef", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "getExternalRef", "()Lorg/platypus/model/field/impl/ExternalRefModelField;", "fields", "", "Lorg/platypus/model/field/api/IModelField;", "getFields", "()Ljava/util/Set;", "fieldsExpression", "getFieldsExpression", "getById", "Lorg/platypus/model/functions/empty/ApiEmptyParamStacker;", "Lkotlin/ParameterName;", "name", "id", "getGetById", "()Lorg/platypus/model/functions/empty/ApiEmptyParamStacker;", "getByIds", "", "ids", "Lorg/platypus/bag/Bag;", "getGetByIds", "Lorg/platypus/model/field/impl/PKModelField;", "getId", "()Lorg/platypus/model/field/impl/PKModelField;", "internalFields", "Ljava/util/HashSet;", "getInternalFields$korm", "()Ljava/util/HashSet;", "metadata", "Lorg/platypus/model/ModelMetaDataImpl;", "getMetadata", "()Lorg/platypus/model/ModelMetaDataImpl;", "mixin", "Ljava/util/HashMap;", "Lorg/platypus/model/MixinModel;", "Lorg/platypus/model/MixinType;", "value", "modelHelp", "getModelHelp", "()Ljava/lang/String;", "setModelHelp", "(Ljava/lang/String;)V", "modelLabel", "getModelLabel", "setModelLabel", "modelName", "getModelName", "Lorg/platypus/model/field/impl/NameModelField;", "getName", "()Lorg/platypus/model/field/impl/NameModelField;", "nameExpr", "Lorg/platypus/model/functions/empty/ApiEmptyNoParamStacker;", "Lorg/platypus/model/field/api/ModelField;", "getNameExpr", "()Lorg/platypus/model/functions/empty/ApiEmptyNoParamStacker;", "nameGet", "getNameGet", "nameSearch", "Lorg/platypus/model/NameSearchParam;", "param", "getNameSearch", "newTemporary", "getNewTemporary", "newTemporaryWithDefault", "getNewTemporaryWithDefault", "orderBy", "getOrderBy", "()Ljava/util/List;", "privateReference", "", "Lorg/platypus/model/field/impl/ReferenceField;", "reference", "getReference", "search", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/query/SearchQuery;", "", "Lkotlin/ExtensionFunctionType;", "query", "getSearch", "searchRead", "Lorg/platypus/model/SearchQueryParam;", "getSearchRead", "slots", "Lorg/platypus/model/ModelSlots;", "getSlots", "()Lorg/platypus/model/ModelSlots;", "sqlCheck", "Lorg/platypus/orm/CheckConstraint;", "sqlUnique", "Lorg/platypus/orm/UniqueConstraint;", "storeFields", "getStoreFields$korm", "thisModel", "getThisModel", "()Lorg/platypus/model/Model;", "update", "Lorg/platypus/model/functions/one/ApiOneParamStacker;", "Lorg/platypus/entity/FieldsWrite;", "fieldsWrited", "getUpdate", "()Lorg/platypus/model/functions/one/ApiOneParamStacker;", "writeDate", "Lorg/platypus/model/field/impl/WriteDateModelField;", "getWriteDate", "()Lorg/platypus/model/field/impl/WriteDateModelField;", "writeUid", "Lorg/platypus/model/field/impl/WriteUID;", "getWriteUid", "()Lorg/platypus/model/field/impl/WriteUID;", "accept", "RETURN", "PARAM", "", "visitor", "Lorg/platypus/model/ModelVisitor;", "p", "(Lorg/platypus/model/ModelVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "binary", "Lorg/platypus/model/field/impl/BinaryField;", "info", "Lkotlin/Function1;", "Lorg/platypus/model/field/impl/BinaryField$Builder;", "boolean", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/BooleanField$Builder;", "check", "errorMsg", "checkPredicate", "", "date", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateField$Builder;", "dateTime", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DateTimeField$Builder;", "decimal", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/DecimalField$Builder;", "describe", "env", "Lorg/platypus/PlatypusEnvironment;", "equals", "other", "hashCode", "integer", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/IntField$Builder;", "many2many", "Lorg/platypus/model/field/impl/Many2ManyField;", "TM", "target", "Lorg/platypus/model/ModelMany2Many;", "Lorg/platypus/model/LinkModel;", "Lorg/platypus/model/field/impl/Many2ManyField$Builder;", "many2manyR", "many2one", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneField$Builder;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function1;)Lorg/platypus/model/field/impl/Many2OneField;", "MIX", "mixinType", "(Lorg/platypus/model/MixinModel;Lorg/platypus/model/MixinType;)Lorg/platypus/model/MixinModel;", "newRepo", "Lorg/platypus/repository/RecordRepository;", "one2many", "Lorg/platypus/model/field/impl/One2ManyField;", "targetField", "Lkotlin/Function0;", "Lorg/platypus/model/field/impl/One2ManyField$Builder;", "one2one", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/One2OneField$Builder;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function1;)Lorg/platypus/model/field/impl/One2OneField;", "columns", "", "([Lkotlin/Pair;)V", "column", "referencedBy", "field", "referencedBy$korm", "revOne2one", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/RevOne2OneField$Builder;", "selection", "Lorg/platypus/model/field/impl/SelectionField;", "D", "Lorg/platypus/entity/Selection;", "Lorg/platypus/model/field/impl/SelectionField$Builder;", "(Ljava/lang/String;Lorg/platypus/entity/Selection;Lkotlin/jvm/functions/Function1;)Lorg/platypus/model/field/impl/SelectionField;", "string", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/StringField$Builder;", "targetTables", "text", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TextField$Builder;", "time", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/TimeField$Builder;", "toString", "unique", "Lorg/platypus/model/field/impl/RealModelField;", "(Ljava/lang/String;Ljava/lang/String;[Lorg/platypus/model/field/impl/RealModelField;)V", "constraint", "KT", "function", "extends", "Lorg/platypus/model/field/impl/NameModelField$Builder;", "R", "Lorg/platypus/model/functions/empty/ApiEmptyNoParamExtends;", "P", "Lkotlin/Function3;", "Lorg/platypus/model/functions/empty/ApiEmptyParamExtends;", "Lorg/platypus/model/functions/multi/ApiMultiNoParamStacker;", "Lorg/platypus/model/functions/multi/ApiMultiNoParamExtends;", "Lorg/platypus/model/functions/multi/ApiMultiParamStacker;", "Lorg/platypus/model/functions/multi/ApiMultiParamExtends;", "Lorg/platypus/model/functions/one/ApiOneNoParamExtends;", "Lorg/platypus/model/functions/one/ApiOneParamExtends;", "registerField", "FIELD", "B", "Lorg/platypus/model/field/api/ModelField$Builder;", "(Lorg/platypus/model/field/api/ModelField$Builder;Lkotlin/jvm/functions/Function1;)Lorg/platypus/model/field/api/ModelField;", "related", "F", "MT", "label", "help", "store", "readonly", "getter", "(Lorg/platypus/model/field/impl/ReferenceField;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)Lorg/platypus/model/field/api/ModelField;", "korm"})
public abstract class Model<M extends org.platypus.model.Model<M>> implements org.platypus.model.IModel<M> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String modelName = null;
    private final java.util.Set<org.platypus.model.field.impl.ReferenceField<?, M>> privateReference = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<org.platypus.model.field.api.IModelField<M, ?>> internalFields = null;
    private final java.util.HashMap<org.platypus.model.MixinModel<M>, org.platypus.model.MixinType> mixin = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.PKModelField<M> id = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.NameModelField<M> name = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ExternalRefModelField<M> externalRef = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ArchivedModelField<M> archived = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.CreateUID<M> createUid = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.WriteUID<M> writeUid = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.CreateDateModelField<M> createDate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.WriteDateModelField<M> writeDate = null;
    private final org.platypus.model.ModelSlotsImpl _slots = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.ModelFunction<M> api = null;
    private final java.util.HashMap<java.lang.String, org.platypus.orm.CheckConstraint<M>> sqlCheck = null;
    private final java.util.HashMap<java.lang.String, org.platypus.orm.UniqueConstraint<M>> sqlUnique = null;
    private final java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> _orderByColumns = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.ModelMetaDataImpl<M> metadata = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.one.ApiOneNoParamStacker<M, org.platypus.model.functions.PublicApiReturn<java.lang.String>> nameGet = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyNoParamStacker<M, java.util.Set<org.platypus.model.field.api.ModelField<M, ?>>> nameExpr = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, java.lang.Integer, org.platypus.model.functions.PublicApiReturn<org.platypus.entity.Record<M>>> getById = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, java.util.List<java.lang.Integer>, org.platypus.model.functions.PublicApiReturn<org.platypus.bag.Bag<M>>> getByIds = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyNoParamStacker<M, org.platypus.entity.Record<M>> newTemporary = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyNoParamStacker<M, org.platypus.entity.Record<M>> newTemporaryWithDefault = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.one.ApiOneNoParamStacker<M, org.platypus.model.functions.PublicApiReturn<org.platypus.entity.Record<M>>> create = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.one.ApiOneParamStacker<M, org.platypus.entity.FieldsWrite<M>, kotlin.Unit> update = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.one.ApiOneNoParamStacker<M, org.platypus.model.functions.PublicApiReturn<java.lang.Integer>> delete = null;
    
    /**
     * Search for records that have a display name matching the given
     *     * ``name`` pattern when compared with the given ``operator``, while also
     *     * matching the optional search domain (``args``).
     *     *
     *     * This is used for example to provide suggestions based on a partial
     *     * value for a relational field. Sometimes be seen as the inverse
     *     * function of :meth:`~.name_get`, but it is not guaranteed to be.
     *     *
     *     * This method is equivalent to calling :meth:`~.search` with a search
     *     * domain based on ``display_name`` and then :meth:`~.name_get` on the
     *     * result of the search.
     *     *
     *     * :param str name: the name pattern to match
     *     * :param list args: optional search domain (see :meth:`~.search` for
     *     * syntax), specifying further restrictions
     *     * :param str operator: domain operator for matching ``name``, such as
     *     * ``'like'`` or ``'='``.
     *     * @param int limit: optional max number of records to return
     *     * @rtype: list
     *     * @return: list of pairs ``(id, text_repr)`` for all matching records.
     */
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, org.platypus.model.NameSearchParam, org.platypus.model.functions.PublicApiReturn<java.lang.String>> nameSearch = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, org.platypus.model.SearchQueryParam<M>, org.platypus.model.functions.PublicApiReturn<org.platypus.bag.Bag<M>>> searchRead = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, kotlin.jvm.functions.Function2<org.platypus.orm.sql.query.SearchQuery<M>, M, kotlin.Unit>, org.platypus.bag.Bag<M>> search = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.repository.RecordRepository<M> newRepo(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final M getThisModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getModelName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.impl.ReferenceField<?, M>> getReference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<org.platypus.model.field.api.IModelField<M, ?>> getInternalFields$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.IModelField<M, ?>> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.api.IModelField<M, ?>> getStoreFields$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.PKModelField<M> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.NameModelField<M> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.ExternalRefModelField<M> getExternalRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.ArchivedModelField<M> getArchived() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.CreateUID<M> getCreateUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.WriteUID<M> getWriteUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.CreateDateModelField<M> getCreateDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.WriteDateModelField<M> getWriteDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <MIX extends org.platypus.model.MixinModel<M>>MIX mixin(@org.jetbrains.annotations.NotNull()
    MIX mixin, @org.jetbrains.annotations.NotNull()
    org.platypus.model.MixinType mixinType) {
        return null;
    }
    
    public final void referencedBy$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<?, M> field) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String describe(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.model.IModel<?>> targetTables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.ModelSlots getSlots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModelHelp() {
        return null;
    }
    
    protected final void setModelHelp(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModelLabel() {
        return null;
    }
    
    protected final void setModelLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super PARAM, ? extends RETURN> visitor, @org.jetbrains.annotations.NotNull()
    PARAM p) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.model.functions.ModelFunction<M> getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> getOrderBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.ModelMetaDataImpl<M> getMetadata() {
        return null;
    }
    
    protected final void check(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> checkPredicate) {
    }
    
    protected final void unique(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?>... fields) {
    }
    
    public final void orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy) {
    }
    
    public final void orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns) {
    }
    
    public final void orderBy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<M, org.platypus.model.functions.PublicApiReturn<java.lang.String>> getNameGet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyNoParamStacker<M, java.util.Set<org.platypus.model.field.api.ModelField<M, ?>>> getNameExpr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, java.lang.Integer, org.platypus.model.functions.PublicApiReturn<org.platypus.entity.Record<M>>> getGetById() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, java.util.List<java.lang.Integer>, org.platypus.model.functions.PublicApiReturn<org.platypus.bag.Bag<M>>> getGetByIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyNoParamStacker<M, org.platypus.entity.Record<M>> getNewTemporary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyNoParamStacker<M, org.platypus.entity.Record<M>> getNewTemporaryWithDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<M, org.platypus.model.functions.PublicApiReturn<org.platypus.entity.Record<M>>> getCreate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneParamStacker<M, org.platypus.entity.FieldsWrite<M>, kotlin.Unit> getUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<M, org.platypus.model.functions.PublicApiReturn<java.lang.Integer>> getDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, org.platypus.model.NameSearchParam, org.platypus.model.functions.PublicApiReturn<java.lang.String>> getNameSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, org.platypus.model.SearchQueryParam<M>, org.platypus.model.functions.PublicApiReturn<org.platypus.bag.Bag<M>>> getSearchRead() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.empty.ApiEmptyParamStacker<M, kotlin.jvm.functions.Function2<org.platypus.orm.sql.query.SearchQuery<M>, M, kotlin.Unit>, org.platypus.bag.Bag<M>> getSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.StringField<M> string(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.StringField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.DateField<M> date(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.DateField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.DateTimeField<M> dateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.DateTimeField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.TimeField<M> time(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.TimeField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.TextField<M> text(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.TextField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.DecimalField<M> decimal(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.DecimalField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.IntField<M> integer(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.IntField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.BinaryField<M> binary(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.BinaryField.Builder<M>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <TM extends org.platypus.model.Model<TM>>org.platypus.model.field.impl.Many2ManyField<M, TM> many2many(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.ModelMany2Many, org.platypus.model.LinkModel<M, TM>> target, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.Many2ManyField.Builder<M, TM>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <TM extends org.platypus.model.Model<TM>>org.platypus.model.field.impl.Many2ManyField<M, TM> many2manyR(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.ModelMany2Many, org.platypus.model.LinkModel<TM, M>> target, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.Many2ManyField.Builder<M, TM>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <D extends org.platypus.entity.Selection<D>>org.platypus.model.field.impl.SelectionField<M, D> selection(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    D selection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.SelectionField.Builder<M, D>, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <MT extends org.platypus.model.Model<MT>, KT extends java.lang.Object, F extends org.platypus.model.field.api.ModelField<MT, KT>>F related(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, MT> $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String help, boolean store, boolean readonly, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super MT, ? extends F> getter) {
        return null;
    }
    
    /**
     * * Create a Reverse link between to entity.
     *     * This field don't really exist in the database.
     *     * @param name The name of the field
     *     * @param targetField A lambda with the targeted [Many2OneField]
     *     * @param info The builder to fieldSet additional info
     */
    @org.jetbrains.annotations.NotNull()
    public final <TM extends org.platypus.model.Model<TM>>org.platypus.model.field.impl.One2ManyField<M, TM> one2many(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> targetField, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.One2ManyField.Builder<M, TM>, kotlin.Unit> info) {
        return null;
    }
    
    /**
     * * Create a real link between to [StoredEntity]
     *     * @param name The name of the field/column in the database
     *     * @param target the Target  entity to use to create the link.
     *     * The field id is used to create de link
     *     * @param info The builder to fieldSet additionnal info
     */
    @org.jetbrains.annotations.NotNull()
    public final <TM extends org.platypus.model.Model<TM>>org.platypus.model.field.impl.Many2OneField<M, TM> many2one(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    TM target, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.Many2OneField.Builder<M, TM>, kotlin.Unit> info) {
        return null;
    }
    
    /**
     * * Create a real link between two [StoredEntity], this link unique
     *     * @param name The name of the field/column in the database
     *     * @param target the Target  entity to use to create the link.
     *     * The field id is used to create de link
     *     * @param info The builder to fieldSet additional info
     *     * @see many2one if you don't wan't an unique link
     */
    @org.jetbrains.annotations.NotNull()
    public final <TM extends org.platypus.model.Model<TM>>org.platypus.model.field.impl.One2OneField<M, TM> one2one(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    TM target, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.One2OneField.Builder<M, TM>, kotlin.Unit> info) {
        return null;
    }
    
    /**
     * * Create a Reverse link between to entity.
     *     * This field don't really exist in the database.
     *     * @param name The name of the field
     *     * @param targetField A lambda with the targeted [Many2OneField]
     *     * @param info The builder to fieldSet additional info
     */
    @org.jetbrains.annotations.NotNull()
    public final <TM extends org.platypus.model.Model<TM>>org.platypus.model.field.impl.RevOne2OneField<M, TM> revOne2one(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> targetField, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.model.field.impl.RevOne2OneField.Builder<M, TM>, kotlin.Unit> info) {
        return null;
    }
    
    private final <B extends org.platypus.model.field.api.ModelField.Builder<M, ? extends FIELD>, FIELD extends org.platypus.model.field.api.ModelField<M, ?>>FIELD registerField(@org.jetbrains.annotations.NotNull()
    B $receiver, kotlin.jvm.functions.Function1<? super B, kotlin.Unit> info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <KT extends java.lang.Object>org.platypus.model.functions.one.ApiOneNoParamStacker<M, kotlin.Unit> constraint(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, KT> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> function) {
        return null;
    }
    
    public Model(@org.jetbrains.annotations.NotNull()
    java.lang.String baseModelName, @org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelType type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTableName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.ColumnSet getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join join(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join innerJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join leftJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join crossJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns) {
        return null;
    }
}