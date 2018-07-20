package org.platypus.ui.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003JT\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&Jn\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0016J\u00ac\u0001\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2-\b\u0002\u0010\u001e\u001a\'\u0012\u0004\u0012\u00020 \u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"0!\u00a2\u0006\u0002\b#\u0018\u00010\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0!\u00a2\u0006\u0002\b#H\u0016Ji\u0010\'\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H&J|\u0010\u0019\u001a\u00020\u000e\"\b\b\u0001\u0010+*\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H+0\u001a2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&JK\u0010-\u001a\u00020\u000e\"\b\b\u0001\u0010+*\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H+0\u001a2#\u0010)\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H+0.\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016J\u0087\u0001\u0010/\u001a\u00020\u000e2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H&Js\u00102\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u00103\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u00104\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u00105\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u00106\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u00107\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016J_\u00108\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016J\"\u00109\u001a\u00020\u000e2\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000!H&J^\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&J}\u0010<\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u0002012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u0010>\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H&J}\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u0002012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Js\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000e0!\u00a2\u0006\u0002\b#H\u0016Jt\u0010\u0019\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0B2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&Jt\u0010\u0019\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0C2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&J\u00a3\u0001\u0010\u0019\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002\"\b\b\u0002\u0010+*\u00020\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0D2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2#\u0010E\u001a\u001f\u0012\u0004\u0012\u0002HA\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u0002H+0F0!\u00a2\u0006\u0002\b#H&Jt\u0010\u0019\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0G2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&J\u0099\u0001\u0010H\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0B2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2#\u0010)\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002HA0J\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u00020\u000e0I\u00a2\u0006\u0002\b#H&J\u0099\u0001\u0010H\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0C2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2#\u0010)\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002HA0J\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u00020\u000e0I\u00a2\u0006\u0002\b#H&JG\u00109\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0D2\u001d\u0010:\u001a\u0019\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u0002HA0K0!\u00a2\u0006\u0002\b#H&JG\u0010L\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0B2\u001d\u0010:\u001a\u0019\u0012\u0004\u0012\u00020M\u0012\n\u0012\b\u0012\u0004\u0012\u0002HA0J0!\u00a2\u0006\u0002\b#H&JG\u0010L\u001a\u00020\u000e\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002HA0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HA0C2\u001d\u0010:\u001a\u0019\u0012\u0004\u0012\u00020M\u0012\n\u0012\b\u0012\u0004\u0012\u0002HA0J0!\u00a2\u0006\u0002\b#H&Jl\u0010\u001b\u001a\u00020\u000e*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030F2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH&J\r\u0010N\u001a\u00020\u000e*\u00020\bH\u0096\u0002R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006O"}, d2 = {"Lorg/platypus/ui/form/FormViewBuilder;", "M", "Lorg/platypus/model/Model;", "", "model", "getModel", "()Lorg/platypus/model/Model;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "a", "", "invisible", "", "groups", "", "href", "id", "cssClass", "widget", "options", "button", "field", "Lorg/platypus/model/field/impl/RealModelField;", "label", "icon", "buttonAction", "attrs", "Lkotlin/Pair;", "Lorg/platypus/ui/UIElementAttribute;", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "Lkotlin/ExtensionFunctionType;", "act", "Lorg/platypus/ui/action/MenuAction;", "Lorg/platypus/ui/action/UIMenuAction;", "buttonBox", "placeHolder", "function", "div", "T", "readonly", "fieldButton", "Lorg/platypus/ui/ButtonFieldBuilder;", "group", "col", "", "h1", "h2", "h3", "h4", "h5", "h6", "header", "includeForm", "functionGetter", "Lorg/platypus/ui/form/ModelFormViews;", "notebook", "colSpan", "p", "page", "sheet", "TM", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/ReferenceField;", "fieldGet", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "fieldTree", "Lkotlin/Function2;", "Lorg/platypus/ui/tree/TreeViewBuilder;", "Lorg/platypus/ui/form/FormViewDefinition;", "includeTree", "Lorg/platypus/ui/tree/TreeViews;", "unaryPlus", "korm"})
public abstract interface FormViewBuilder<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getTitle();
    
    public abstract void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract void group(int col, @org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void div(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void buttonBox(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void p(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void a(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String href, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract void unaryPlus(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver);
    
    public abstract void label(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, ?> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract void label(@org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract void includeForm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.ModelFormViews, ? extends org.platypus.ui.form.FormViewBuilder<M>> functionGetter);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void includeForm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.ModelFormViews, org.platypus.ui.form.FormViewDefinition<TM>> functionGetter);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void includeTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.tree.TreeViews, ? extends org.platypus.ui.tree.TreeViewBuilder<TM>> functionGetter);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void includeTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.tree.TreeViews, ? extends org.platypus.ui.tree.TreeViewBuilder<TM>> functionGetter);
    
    public abstract <T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field, boolean invisible, boolean readonly, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void fieldTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.tree.TreeViewBuilder<TM>, ? super TM, kotlin.Unit> function);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void fieldTree(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.ui.tree.TreeViewBuilder<TM>, ? super TM, kotlin.Unit> function);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract <TM extends org.platypus.model.Model<TM>, T extends java.lang.Object>void field(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M, TM> $receiver, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.model.field.api.ModelField<TM, T>> fieldGet);
    
    public abstract void sheet(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void h1(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void h2(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void h3(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void h4(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void h5(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void h6(boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void notebook(int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void page(int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void header(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function);
    
    public abstract void button(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<?, ?> field, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String options);
    
    public abstract void buttonAction(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
    java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String widget, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<org.platypus.ui.UIElementAttribute, ? extends kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>>> attrs, @org.jetbrains.annotations.NotNull()
    java.lang.String options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act);
    
    public abstract <T extends java.lang.Object>void fieldButton(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, T> field, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.ui.ButtonFieldBuilder<M, T>, kotlin.Unit> function);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        public static <M extends org.platypus.model.Model<M>>void buttonBox(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void unaryPlus(org.platypus.ui.form.FormViewBuilder<M> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String $receiver) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void sheet(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void h1(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void h2(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void h3(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void h4(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void h5(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void h6(org.platypus.ui.form.FormViewBuilder<M> $this, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void notebook(org.platypus.ui.form.FormViewBuilder<M> $this, int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void page(org.platypus.ui.form.FormViewBuilder<M> $this, int colSpan, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
        java.lang.String placeHolder, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void header(org.platypus.ui.form.FormViewBuilder<M> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.form.FormViewBuilder<M>, kotlin.Unit> function) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void button(org.platypus.ui.form.FormViewBuilder<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RealModelField<?, ?> field, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.lang.String icon, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String options) {
        }
        
        public static <M extends org.platypus.model.Model<M>>void buttonAction(org.platypus.ui.form.FormViewBuilder<M> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> groups, boolean invisible, @org.jetbrains.annotations.NotNull()
        java.lang.String cssClass, @org.jetbrains.annotations.NotNull()
        java.lang.String icon, @org.jetbrains.annotations.NotNull()
        java.lang.String widget, @org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.Nullable()
        kotlin.Pair<org.platypus.ui.UIElementAttribute, ? extends kotlin.jvm.functions.Function1<? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>>> attrs, @org.jetbrains.annotations.NotNull()
        java.lang.String options, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.action.MenuAction, org.platypus.ui.action.UIMenuAction<M>> act) {
        }
        
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>void fieldButton(org.platypus.ui.form.FormViewBuilder<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RealModelField<M, T> field, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.platypus.ui.ButtonFieldBuilder<M, T>, kotlin.Unit> function) {
        }
    }
}