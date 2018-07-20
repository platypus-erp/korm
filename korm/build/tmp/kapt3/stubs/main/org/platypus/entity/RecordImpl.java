package org.platypus.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00f6\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00d2\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u00d2\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tB%\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fBA\b\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0010J\b\u0010n\u001a\u00020oH\u0016J\u0018\u0010p\u001a\u00020o2\u0010\u0010q\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030rJ\u000e\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010u\u001a\u00020oH\u0016J\b\u0010v\u001a\u00020oH\u0016J\u0013\u0010w\u001a\u00020\u000e2\b\u0010x\u001a\u0004\u0018\u00010yH\u0096\u0002J\u000e\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0016\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010|\u001a\u00020\u000eH\u0002J\b\u0010}\u001a\u00020\u000eH\u0002J \u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010q\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030rH\u0016J\u001f\u0010~\u001a\u0004\u0018\u00010y2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020y0rH\u0086\u0002J8\u0010~\u001a\t\u0012\u0005\u0012\u0003H\u0080\u00010\u007f\"\u0010\b\u0001\u0010\u0080\u0001*\t\u0012\u0005\u0012\u0003H\u0080\u00010\u00022\u0014\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u0080\u00010\u0081\u0001H\u0096\u0002J8\u0010~\u001a\t\u0012\u0005\u0012\u0003H\u0080\u00010\u0003\"\u0010\b\u0001\u0010\u0080\u0001*\t\u0012\u0005\u0012\u0003H\u0080\u00010\u00022\u0014\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u0080\u00010\u0082\u0001H\u0096\u0002J3\u0010~\u001a\u0005\u0018\u0001H\u0083\u0001\"\t\b\u0001\u0010\u0083\u0001*\u00020y2\u0014\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u0083\u00010\u0084\u0001H\u0096\u0002\u00a2\u0006\u0003\u0010\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0087\u0001\u001a\u00020\u000eH\u0016J\u0007\u0010\u0088\u0001\u001a\u000201J\u001e\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007f2\f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001b\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u0007H\u0002J\u001e\u0010\u008d\u0001\u001a\u00020o2\u0007\u0010\u008e\u0001\u001a\u0002012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010yH\u0096\u0002J\u0019\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\u000f\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0016J\t\u0010\u0094\u0001\u001a\u000201H\u0016J\u001f\u0010\u0095\u0001\u001a\u00020o2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0097\u0001H\u0000\u00a2\u0006\u0003\b\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u0002010\u009a\u0001H\u0016J\n\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0016J5\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001e\u0010\u009e\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u00a0\u00010\u009f\u0001\"\u0007\u0012\u0002\b\u00030\u00a0\u0001H\u0016\u00a2\u0006\u0003\u0010\u00a1\u0001JK\u0010\u00a2\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u007f\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00a4\u00012\u0015\u0010\u00a5\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u00030\u00a6\u0001H\u0002J4\u00104\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0003\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u00020\u00072\u0007\u0010\b\u001a\u0003H\u00a3\u0001H\u0002\u00a2\u0006\u0003\u0010\u00a7\u0001J3\u0010\u00a8\u0001\u001a\u00020\u000e*\t\u0012\u0004\u0012\u00028\u00000\u00a9\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J6\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00ae\u0001*\t\u0012\u0004\u0012\u00028\u00000\u00af\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J3\u0010\u00a8\u0001\u001a\u00020\u000e*\t\u0012\u0004\u0012\u00028\u00000\u00b0\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J3\u0010\u00a8\u0001\u001a\u00020$*\t\u0012\u0004\u0012\u00028\u00000\u00b1\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J=\u0010\u00a8\u0001\u001a\f\u0012\u0004\u0012\u00020*0\u0003j\u0002`+*\t\u0012\u0004\u0012\u00028\u00000\u00b2\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J6\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00b3\u0001*\t\u0012\u0004\u0012\u00028\u00000\u00b4\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J5\u0010\u00a8\u0001\u001a\u0004\u0018\u00010$*\t\u0012\u0004\u0012\u00028\u00000\u00b5\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J6\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00b6\u0001*\t\u0012\u0004\u0012\u00028\u00000\u00b7\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J5\u0010\u00a8\u0001\u001a\u0004\u0018\u000101*\t\u0012\u0004\u0012\u00028\u00000\u00b8\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J;\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0005*\t\u0012\u0004\u0012\u00028\u00000\u00b9\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002\u00a2\u0006\u0003\u0010\u00ba\u0001JS\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u007f\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00bb\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002JS\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0003\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00bc\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J5\u0010\u00a8\u0001\u001a\u0004\u0018\u000101*\t\u0012\u0004\u0012\u00028\u00000\u00bd\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002JS\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u007f\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00be\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002JS\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0003\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00bf\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002JS\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0003\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00c0\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002JW\u0010\u00a8\u0001\u001a\f\u0012\u0005\u0012\u0003H\u00c2\u0001\u0018\u00010\u00c1\u0001\"\u0011\b\u0001\u0010\u00c2\u0001*\n\u0012\u0005\u0012\u0003H\u00c2\u00010\u00c3\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c2\u00010\u00c4\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J5\u0010\u00a8\u0001\u001a\u0004\u0018\u000101*\t\u0012\u0004\u0012\u00028\u00000\u00c5\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J5\u0010\u00a8\u0001\u001a\u0004\u0018\u000101*\t\u0012\u0004\u0012\u00028\u00000\u00c6\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J6\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00c7\u0001*\t\u0012\u0004\u0012\u00028\u00000\u00c8\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J5\u0010\u00a8\u0001\u001a\u0004\u0018\u00010$*\t\u0012\u0004\u0012\u00028\u00000\u00c9\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002J=\u0010\u00a8\u0001\u001a\f\u0012\u0004\u0012\u00020*0\u0003j\u0002`+*\t\u0012\u0004\u0012\u00028\u00000\u00ca\u00012\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00ab\u00012\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u0001H\u0096\u0002JC\u0010\u00cb\u0001\u001a\u00020o\"\t\b\u0001\u0010\u00cc\u0001*\u00020y*\b\u0012\u0004\u0012\u00028\u00000k2\u0013\u0010q\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00cc\u00010r2\n\u0010\u008f\u0001\u001a\u0005\u0018\u0001H\u00cc\u0001\u00a2\u0006\u0003\u0010\u00cd\u0001JC\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00a9\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000eH\u0096\u0002\u00a2\u0006\u0003\u0010\u00cf\u0001J>\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00af\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0096\u0002JC\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00b0\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000eH\u0096\u0002\u00a2\u0006\u0003\u0010\u00d0\u0001J>\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00b4\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u00b3\u0001H\u0096\u0002J=\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00b5\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010$H\u0096\u0002J>\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00b7\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u00b6\u0001H\u0096\u0002JC\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00b9\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u0096\u0002\u00a2\u0006\u0003\u0010\u00d1\u0001Jb\u0010\u00ce\u0001\u001a\u00020o\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00bb\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\u0015\u0010\u008f\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u00030\u00a6\u0001H\u0096\u0002J]\u0010\u00ce\u0001\u001a\u00020o\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00bc\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\u0010\u0010\u008f\u0001\u001a\u000b\u0012\u0005\u0012\u0003H\u00a3\u0001\u0018\u00010\u0003H\u0096\u0002J=\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00bd\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u000101H\u0096\u0002Jb\u0010\u00ce\u0001\u001a\u00020o\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00be\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\u0015\u0010\u008f\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u00030\u00a6\u0001H\u0096\u0002J]\u0010\u00ce\u0001\u001a\u00020o\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00bf\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\u0010\u0010\u008f\u0001\u001a\u000b\u0012\u0005\u0012\u0003H\u00a3\u0001\u0018\u00010\u0003H\u0096\u0002J]\u0010\u00ce\u0001\u001a\u00020o\"\u0010\b\u0001\u0010\u00a3\u0001*\t\u0012\u0005\u0012\u0003H\u00a3\u00010\u0002*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00a3\u00010\u00c0\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\u0010\u0010\u008f\u0001\u001a\u000b\u0012\u0005\u0012\u0003H\u00a3\u0001\u0018\u00010\u0003H\u0096\u0002J_\u0010\u00ce\u0001\u001a\u00020o\"\u0011\b\u0001\u0010\u00c2\u0001*\n\u0012\u0005\u0012\u0003H\u00c2\u00010\u00c3\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u0003H\u00c2\u00010\u00c4\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\u0011\u0010\u008f\u0001\u001a\f\u0012\u0005\u0012\u0003H\u00c2\u0001\u0018\u00010\u00c1\u0001H\u0096\u0002J=\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00c5\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u000101H\u0096\u0002J=\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00c6\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u000101H\u0096\u0002J>\u0010\u00ce\u0001\u001a\u00020o*\t\u0012\u0004\u0012\u00028\u00000\u00c8\u00012\r\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000k2\f\u0010\u00ac\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u00c7\u0001H\u0096\u0002R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R%\u0010)\u001a\f\u0012\u0004\u0012\u00020*0\u0003j\u0002`+8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u0002018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001d\u00108\u001a\u0004\u0018\u0001018VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b9\u00103R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010@\u001a\u00020?2\u0006\u0010\u0017\u001a\u00020?@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bF\u0010\u001aR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020K8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\bL\u0010MR/\u0010N\u001a\u0004\u0018\u0001012\b\u0010\u0017\u001a\u0004\u0018\u0001018V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bO\u00103\"\u0004\bP\u0010QR\u001c\u0010T\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u00020]2\u0006\u0010\u0017\u001a\u00020]@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001d\u0010c\u001a\u0004\u0018\u00010$8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\be\u0010f\u001a\u0004\bd\u0010&R%\u0010g\u001a\f\u0012\u0004\u0012\u00020*0\u0003j\u0002`+8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bh\u0010-R+\u0010J\u001a\u00020K\"\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010k8F\u00a2\u0006\u0006\u001a\u0004\bl\u0010m\u00a8\u0006\u00d3\u0001"}, d2 = {"Lorg/platypus/entity/RecordImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/entity/Record;", "_id", "", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "(ILorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "loader", "Lorg/platypus/orm/sql/query/SearchQuery;", "(Lorg/platypus/orm/sql/query/SearchQuery;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "fetched", "", "_empty", "(Lorg/platypus/orm/sql/query/SearchQuery;ILorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;ZZ)V", "api", "Lorg/platypus/entity/PrivateApi;", "getApi", "()Lorg/platypus/entity/PrivateApi;", "api$delegate", "Lkotlin/Lazy;", "<set-?>", "archived", "getArchived", "()Z", "setArchived", "(Z)V", "archived$delegate", "Lorg/platypus/model/field/impl/ArchivedModelField;", "cacheState", "Lorg/platypus/cache/CacheState;", "getCacheState", "()Lorg/platypus/cache/CacheState;", "createDate", "Ljava/time/LocalDateTime;", "getCreateDate", "()Ljava/time/LocalDateTime;", "createDate$delegate", "Lorg/platypus/model/field/impl/CreateDateModelField;", "createUid", "Lorg/platypus/module/base/models/Users;", "Lorg/platypus/module/base/entities/User;", "getCreateUid", "()Lorg/platypus/entity/Record;", "createUid$delegate", "Lorg/platypus/model/field/impl/CreateUID;", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "empty", "getEmpty", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "externalRef", "getExternalRef", "externalRef$delegate", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "id", "getId", "()I", "Lorg/platypus/entity/EntityState;", "internalState", "getInternalState", "()Lorg/platypus/entity/EntityState;", "setInternalState", "(Lorg/platypus/entity/EntityState;)V", "loaded", "getLoaded", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "modelID", "Lorg/platypus/cache/ModelID;", "getModelID$korm", "()Lorg/platypus/cache/ModelID;", "name", "getName", "setName", "(Ljava/lang/String;)V", "name$delegate", "Lorg/platypus/model/field/impl/NameModelField;", "query", "getQuery", "()Lorg/platypus/orm/sql/query/SearchQuery;", "readWriteMode", "Lorg/platypus/entity/ReadWriteMode;", "getReadWriteMode", "()Lorg/platypus/entity/ReadWriteMode;", "setReadWriteMode", "(Lorg/platypus/entity/ReadWriteMode;)V", "Lorg/platypus/entity/EntityValidateMode;", "validateMode", "getValidateMode", "()Lorg/platypus/entity/EntityValidateMode;", "setValidateMode", "(Lorg/platypus/entity/EntityValidateMode;)V", "writeDate", "getWriteDate", "writeDate$delegate", "Lorg/platypus/model/field/impl/WriteDateModelField;", "writeUid", "getWriteUid", "writeUid$delegate", "Lorg/platypus/model/field/impl/WriteUID;", "Lorg/platypus/entity/MutableRecordDelegate;", "getModelID", "(Lorg/platypus/entity/MutableRecordDelegate;)Lorg/platypus/cache/ModelID;", "attach", "", "checkAccessWrite", "field", "Lorg/platypus/model/field/api/ModelField;", "copy", "deepCopy", "delete", "detach", "equals", "other", "", "fetch", "fetchForce", "force", "fetchIfNeeded", "get", "Lorg/platypus/bag/Bag;", "MT", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "T", "Lorg/platypus/model/field/api/SimpleModelField;", "(Lorg/platypus/model/field/api/SimpleModelField;)Ljava/lang/Object;", "hashCode", "isStore", "nameGet", "plus", "repository", "Lorg/platypus/repository/RecordRepository;", "e", "set", "fieldName", "value", "sudo", "user", "Lorg/platypus/security/PlatypusUser;", "toBag", "toString", "update", "fieldWrite", "Lorg/platypus/entity/FieldsWrite;", "update$korm", "validate", "", "warmCache", "Lorg/platypus/cache/PlatypusCache;", "withContext", "vals", "", "Lorg/platypus/context/ContextKey$Value;", "([Lorg/platypus/context/ContextKey$Value;)Lorg/platypus/entity/Record;", "asBag", "TM", "Lorg/platypus/model/field/impl/MutliReferenceField;", "iterable", "", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)Lorg/platypus/entity/Record;", "getValue", "Lorg/platypus/model/field/impl/ArchivedModelField;", "o", "Lorg/platypus/entity/RecordDelegate;", "desc", "Lkotlin/reflect/KProperty;", "", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Ljava/time/LocalDate;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Ljava/math/BigDecimal;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/IntField;", "(Lorg/platypus/model/field/impl/IntField;Lorg/platypus/entity/RecordDelegate;Lkotlin/reflect/KProperty;)Ljava/lang/Integer;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/entity/SelectionValue;", "D", "Lorg/platypus/entity/Selection;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Ljava/time/LocalTime;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "performUpdate", "KT", "(Lorg/platypus/entity/MutableRecordDelegate;Lorg/platypus/model/field/api/ModelField;Ljava/lang/Object;)V", "setValue", "(Lorg/platypus/model/field/impl/ArchivedModelField;Lorg/platypus/entity/MutableRecordDelegate;Lkotlin/reflect/KProperty;Ljava/lang/Boolean;)V", "(Lorg/platypus/model/field/impl/BooleanField;Lorg/platypus/entity/MutableRecordDelegate;Lkotlin/reflect/KProperty;Ljava/lang/Boolean;)V", "(Lorg/platypus/model/field/impl/IntField;Lorg/platypus/entity/MutableRecordDelegate;Lkotlin/reflect/KProperty;Ljava/lang/Integer;)V", "Companion", "korm"})
public final class RecordImpl<M extends org.platypus.model.Model<M>> implements org.platypus.entity.Record<M> {
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.model.field.impl.NameModelField name$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.model.field.impl.CreateDateModelField createDate$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.model.field.impl.WriteDateModelField writeDate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.CreateUID createUid$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.WriteUID writeUid$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.model.field.impl.ExternalRefModelField externalRef$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ArchivedModelField archived$delegate = null;
    
    /**
     * * Return the Validate strategy used
     */
    @org.jetbrains.annotations.NotNull()
    private org.platypus.entity.EntityValidateMode validateMode;
    
    /**
     * * Return the current state of the entity
     */
    @org.jetbrains.annotations.NotNull()
    private org.platypus.entity.EntityState internalState;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.entity.ReadWriteMode readWriteMode;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    private final org.platypus.orm.sql.query.SearchQuery<M> loader = null;
    private int _id;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    private boolean fetched;
    private boolean _empty;
    public static final org.platypus.entity.RecordImpl.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getLoaded() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.time.LocalDateTime getCreateDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.time.LocalDateTime getWriteDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<org.platypus.module.base.models.Users> getCreateUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<org.platypus.module.base.models.Users> getWriteUid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getExternalRef() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getArchived() {
        return false;
    }
    
    public void setArchived(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String nameGet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelID getModelID$korm() {
        return null;
    }
    
    @java.lang.Override()
    public void detach() {
    }
    
    private final org.platypus.cache.CacheState getCacheState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.EntityValidateMode getValidateMode() {
        return null;
    }
    
    private void setValidateMode(org.platypus.entity.EntityValidateMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.EntityState getInternalState() {
        return null;
    }
    
    private void setInternalState(org.platypus.entity.EntityState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.entity.ReadWriteMode getReadWriteMode() {
        return null;
    }
    
    public final void setReadWriteMode(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.ReadWriteMode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, java.lang.Object> field) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>T get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<M, T> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <MT extends org.platypus.model.Model<MT>>org.platypus.entity.Record<MT> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<M, MT> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <MT extends org.platypus.model.Model<MT>>org.platypus.bag.Bag<MT> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<M, MT> field) {
        return null;
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.NotNull()
    java.lang.String fieldName, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    private final <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> empty(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver, TM model) {
        return null;
    }
    
    private final boolean fetchIfNeeded() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.PrivateApi<M> getApi() {
        return null;
    }
    
    private final org.platypus.repository.RecordRepository<M> repository(org.platypus.PlatypusEnvironment e) {
        return null;
    }
    
    /**
     * * Attach the current entity to the [env] cache
     *     * put the [internalState] to [EntityState.MANAGED]
     */
    @java.lang.Override()
    public void attach() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> validate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> fetch() {
        return null;
    }
    
    @java.lang.Override()
    public void delete() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> copy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> deepCopy() {
        return null;
    }
    
    private final org.platypus.entity.Record<M> fetchForce(boolean force) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isStore() {
        return false;
    }
    
    /**
     * * Return a new Entity with the [sudoUser] = [user] and the same [id]
     *     * The data of the entity are still the same
     *     * @see PlatypusEnvironment.sudo
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> sudo(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user) {
        return null;
    }
    
    /**
     * * Return a new Entity with the same [id]
     *     * the new Entity context equal to current [env.context] + [vals]
     *     * The data of the entity are still the same
     *     * @see PlatypusEnvironment.withContext
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> withContext(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey.Value<?>... vals) {
        return null;
    }
    
    /**
     * * Return an [PlatypusCache] to create all the min.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.cache.PlatypusCache warmCache() {
        return null;
    }
    
    /**
     * * Return a read only bag with only the current StoredEntity in it
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> toBag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> fetchIfNeeded(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, ?> field) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.time.LocalTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.time.LocalDate getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.time.LocalDateTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.time.LocalDateTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.time.LocalDateTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @java.lang.Override()
    public boolean getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return false;
    }
    
    @java.lang.Override()
    public boolean getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <D extends org.platypus.entity.Selection<D>>org.platypus.entity.SelectionValue<D> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<M, D> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public byte[] getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>org.platypus.bag.Bag<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<org.platypus.module.base.models.Users> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<org.platypus.module.base.models.Users> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>org.platypus.bag.Bag<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc) {
        return null;
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public <D extends org.platypus.entity.Selection<D>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<M, D> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.SelectionValue<D> value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.time.LocalTime value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    byte[] value) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends org.platypus.entity.Record<TM>> value) {
    }
    
    @java.lang.Override()
    public <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends org.platypus.entity.Record<TM>> value) {
    }
    
    public final void checkAccessWrite(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, ?> field) {
    }
    
    private final <TM extends org.platypus.model.Model<TM>>org.platypus.bag.Bag<TM> asBag(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.MutliReferenceField<M, TM> $receiver, java.lang.Iterable<? extends org.platypus.entity.Record<TM>> iterable) {
        return null;
    }
    
    public final void update$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.FieldsWrite<M> fieldWrite) {
    }
    
    public final <KT extends java.lang.Object>void performUpdate(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, KT> field, @org.jetbrains.annotations.Nullable()
    KT value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <M extends org.platypus.model.Model<M>>org.platypus.cache.ModelID getModelID(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> $receiver) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    private RecordImpl(org.platypus.orm.sql.query.SearchQuery<M> loader, int _id, org.platypus.PlatypusEnvironment env, M model, boolean fetched, boolean _empty) {
        super();
    }
    
    public RecordImpl(int _id, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    public RecordImpl(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuery<M> loader, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\nJ9\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u000eJ9\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/entity/RecordImpl$Companion;", "", "()V", "empty", "Lorg/platypus/entity/Record;", "M", "Lorg/platypus/model/Model;", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)Lorg/platypus/entity/Record;", "fromId", "id", "", "(ILorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)Lorg/platypus/entity/Record;", "temporary", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> empty(@org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
        M model) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> temporary(int id, @org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
        M model) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> fromId(int id, @org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
        M model) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}