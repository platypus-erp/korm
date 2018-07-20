package org.platypus.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010%\u001a\u00020\u0011J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&2\u0006\u0010%\u001a\u00020\u0011J\u0016\u0010\'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0004J(\u0010*\u001a\u00020\u001f2\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020\u001fH\u0016J\u0011\u0010-\u001a\u00020.2\u0006\u0010+\u001a\u00020\u0011H\u0086\u0002J!\u0010/\u001a\u00020\u00112\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u00101J(\u00102\u001a\u00020\u001f2\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0002J4\u00103\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u00104\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\b\u00105\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000fJ#\u00107\u001a\u0004\u0018\u00010\u00112\u0016\u00108\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000309\u0012\u0004\u0012\u00020:0\u001eH\u0086\u0002J\'\u00107\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010;\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030<H\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010;\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030=H\u0086\u0002J;\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u0001H>0\u001e\"\b\b\u0000\u0010>*\u00020\r2\u0006\u0010\"\u001a\u00020\u00112\u0010\u0010;\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H>0?H\u0086\u0002J)\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020.0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030@H\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010A0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030BH\u0086\u0002J)\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020.0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030CH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010D0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030EH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030FH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010G0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030HH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010D0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030IH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010J0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030KH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010:0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030LH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030MH\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$H\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030NH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010:0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030OH\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&H\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030PH\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030QH\u0086\u0002J/\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010:0\u001e2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030RH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010:0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030SH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010:0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030TH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010U0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030VH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010D0\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030WH\u0086\u0002J+\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030XH\u0086\u0002J3\u00107\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00192\n\u00100\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010Y\u001a\u00020:H\u0086\u0002J?\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u0001H>0\u001e\"\b\b\u0000\u0010>*\u00020\r2\u0006\u0010\"\u001a\u00020\u00112\u0010\u0010#\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H>0[H\u0000\u00a2\u0006\u0002\b\\J8\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010+\u001a\u00020\u00042\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fJ\u0006\u0010]\u001a\u00020\u001fJ\u000e\u0010^\u001a\u00020.2\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010_\u001a\u00020.2\u0006\u0010`\u001a\u00020\u0011J\u001e\u0010_\u001a\u00020.2\u0006\u0010`\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fJ\u000e\u0010a\u001a\u00020.2\u0006\u0010\"\u001a\u00020\u0011J\u001e\u0010b\u001a\u00020.2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fJ \u0010c\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0002J(\u0010d\u001a\u00020\u001f2\u000e\u0010;\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\"\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u00010\rJ\u000e\u0010e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010f\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020\u0011J(\u0010f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010%\u001a\u00020\u0011J(\u0010f\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&2\u0006\u0010%\u001a\u00020\u0011J\u000e\u0010f\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020!J3\u0010g\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u001c\u0010h\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0019H\u0000\u00a2\u0006\u0002\biJ\u0006\u0010j\u001a\u00020\u001fJ\u0012\u0010j\u001a\u00020\u001f2\n\u00100\u001a\u0006\u0012\u0002\b\u000309J7\u0010k\u001a\b\u0012\u0004\u0012\u0002Hm0l\"\u000e\b\u0000\u0010m*\b\u0012\u0004\u0012\u0002Hm092\u0006\u00100\u001a\u0002Hm2\f\u0010n\u001a\b\u0012\u0004\u0012\u0002Hm0l\u00a2\u0006\u0002\u0010oJ%\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030@2\u0006\u00105\u001a\u00020.H\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030B2\b\u00105\u001a\u0004\u0018\u00010AH\u0086\u0002J%\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030C2\u0006\u00105\u001a\u00020.H\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030E2\b\u00105\u001a\u0004\u0018\u00010DH\u0086\u0002J%\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030F2\u0006\u00105\u001a\u00020\u0011H\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030H2\b\u00105\u001a\u0004\u0018\u00010GH\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030I2\b\u00105\u001a\u0004\u0018\u00010DH\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030K2\b\u00105\u001a\u0004\u0018\u00010JH\u0086\u0002J,\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030L2\b\u00105\u001a\u0004\u0018\u00010:H\u0080\u0002\u00a2\u0006\u0002\bqJ,\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030M2\b\u00105\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a2\u0006\u0002\u0010rJ9\u0010p\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0\u001eH\u0086\u0002J+\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030N2\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0086\u0002J+\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030s2\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030O2\b\u00105\u001a\u0004\u0018\u00010:H\u0086\u0002J7\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&2\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0\u001eH\u0086\u0002J+\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030P2\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0086\u0002J+\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030Q2\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0086\u0002J/\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030R2\f\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u00010tH\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030S2\b\u00105\u001a\u0004\u0018\u00010:H\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030T2\b\u00105\u001a\u0004\u0018\u00010:H\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030V2\b\u00105\u001a\u0004\u0018\u00010UH\u0086\u0002J\'\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030W2\b\u00105\u001a\u0004\u0018\u00010DH\u0086\u0002J%\u0010p\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\n\u0010#\u001a\u0006\u0012\u0002\b\u00030X2\u0006\u00105\u001a\u00020\u0011H\u0086\u0002J&\u0010u\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010v\u001a\u00020\u000fJ\u000e\u0010v\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u0011J\u001e\u0010v\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fJ,\u0010w\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u0014\u0010x\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u00152\u0006\u0010y\u001a\u00020zJ\u000e\u0010w\u001a\u00020\u001f2\u0006\u0010y\u001a\u00020zJ*\u0010{\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\b\u00105\u001a\u0004\u0018\u00010\rH\u0002J(\u0010|\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010%\u001a\u00020\u0011H\u0002J\f\u0010}\u001a\u00020\u001f*\u00020\u0011H\u0002J\f\u0010}\u001a\u00020\u001f*\u00020!H\u0002J\u00b4\u0001\u00107\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e0~j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e`\u007f*?\u0012\r\u0012\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0080\u0001\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e0~j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e`\u007f0\n2\u000f\u00100\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0080\u00012/\u0010\u0081\u0001\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e0~j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e`\u007fH\u0086\u0002J\u001d\u0010\u0082\u0001\u001a\u00020!*\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$H\u0002J#\u0010\u0083\u0001\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0019*\u00020\u0011H\u0002J\'\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0011*\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010%\u001a\u00020\u0011H\u0002J$\u0010u\u001a\u00020\u001f*\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010v\u001a\u00020\u000fH\u0002J\u001e\u0010\u0085\u0001\u001a\u00020\u000f*\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0082\u0004J\u001e\u0010\u0086\u0001\u001a\u00020\u001f*\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0082\u0004J \u0010\u0087\u0001\u001a\u0004\u0018\u00010\r*\u00020\u00112\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0082\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR@\u0010\t\u001a4\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012&\u0012$\u0012\u0004\u0012\u00020\u0004\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n0\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u000e\u001a2\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u000f0\n0\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R8\u0010\u0012\u001a,\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u00130\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R;\u0010\u0018\u001a,\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u00150\u00190\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0088\u0001"}, d2 = {"Lorg/platypus/cache/PlatypusCache;", "Ljava/lang/AutoCloseable;", "()V", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "data", "", "Lorg/platypus/model/IModel;", "Lorg/platypus/model/field/api/IModelField;", "", "dataState", "Lorg/platypus/cache/CacheState;", "scheduledInsert", "Lorg/platypus/cache/ModelID;", "scheduledUpdate", "", "toInsert", "", "getToInsert", "()Ljava/util/Set;", "toUpdate", "", "getToUpdate", "()Ljava/util/Map;", "visitorSetter", "Lorg/platypus/model/field/api/FieldVisitor;", "Lkotlin/Pair;", "", "add", "Lorg/platypus/cache/ModelIDS;", "modelId", "prop", "Lorg/platypus/model/field/impl/Many2ManyField;", "targetModelID", "Lorg/platypus/model/field/impl/One2ManyField;", "addnewId", "toinsert", "newId", "checkConsitencyOfManyToMany", "id", "close", "contains", "", "createFakeRecordIfNeeded", "model", "(Lorg/platypus/model/IModel;Ljava/lang/Integer;)Lorg/platypus/cache/ModelID;", "createlink", "forceSet", "f", "value", "forceState", "get", "modelRef", "Lorg/platypus/model/Model;", "", "field", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "T", "Lorg/platypus/model/field/api/SimpleModelField;", "Lorg/platypus/model/field/impl/ArchivedModelField;", "", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Ljava/time/LocalDateTime;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Ljava/time/LocalDate;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Ljava/math/BigDecimal;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Ljava/time/LocalTime;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "ref", "getValue", "Lorg/platypus/model/field/api/ModelField;", "getValue$korm", "hardClear", "isInDB", "isNONE_STATE", "modelID", "isNotInDB", "isToUpdate", "markAsUpdate", "put", "realID", "remove", "replaceData", "values", "replaceData$korm", "reset", "scheduleInsert", "Lorg/platypus/entity/Record;", "M", "entity", "(Lorg/platypus/model/Model;Lorg/platypus/entity/Record;)Lorg/platypus/entity/Record;", "set", "set$korm", "(Lorg/platypus/cache/ModelID;Lorg/platypus/model/field/impl/IntField;Ljava/lang/Integer;)V", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/entity/SelectionValue;", "setState", "state", "store", "fieldsToStore", "row", "Lorg/platypus/orm/sql/query/ResultRow;", "updateValue", "updateValueMany2Many", "deleteInCache", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lorg/platypus/model/LinkModel;", "defaultValue", "getAllLink", "getData", "getExistingLink", "stateOf", "updateState", "valueOf", "korm"})
public final class PlatypusCache implements java.lang.AutoCloseable {
    private final java.util.Map<org.platypus.model.IModel<?>, java.util.Map<java.lang.Integer, java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object>>> data = null;
    private final java.util.Map<org.platypus.model.IModel<?>, java.util.Map<java.lang.Integer, java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, org.platypus.cache.CacheState>>> dataState = null;
    private final java.util.Map<org.platypus.model.IModel<?>, java.util.Map<java.lang.Integer, java.util.Set<org.platypus.model.field.api.IModelField<?, ?>>>> scheduledUpdate = null;
    private final java.util.Map<org.platypus.cache.ModelID, org.platypus.cache.ModelID> scheduledInsert = null;
    private int counter;
    private final org.platypus.model.field.api.FieldVisitor<kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object>, kotlin.Unit> visitorSetter = null;
    
    public final int getCounter() {
        return 0;
    }
    
    public final void setCounter(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.cache.ModelID> getToInsert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.IModel<?>, java.util.Map<java.lang.Integer, java.util.Set<org.platypus.model.field.api.IModelField<?, ?>>>> getToUpdate() {
        return null;
    }
    
    /**
     * * Clear the cache without asking any question,
     *     * all changed will be lost if no flosh is called before
     */
    public final void hardClear() {
    }
    
    public final void reset() {
    }
    
    public final void reset(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> model) {
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>kotlin.Pair<org.platypus.cache.CacheState, T> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<?, T> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<?, ?> field) {
        return null;
    }
    
    public final void replaceData$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object> values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.cache.ModelID get(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.Model<?>, java.lang.String> modelRef) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> model, @org.jetbrains.annotations.NotNull()
    java.lang.String ref) {
        return null;
    }
    
    private final java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> getData(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver) {
        return null;
    }
    
    private final java.lang.Object valueOf(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver, org.platypus.model.field.api.IModelField<?, ?> prop) {
        return null;
    }
    
    private final org.platypus.cache.CacheState stateOf(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver, org.platypus.model.field.api.IModelField<?, ?> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.CacheState setState(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID id, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.CacheState state) {
        return null;
    }
    
    private final void setState(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver, org.platypus.model.field.api.IModelField<?, ?> prop, org.platypus.cache.CacheState state) {
    }
    
    private final void updateState(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver, org.platypus.model.field.api.IModelField<?, ?> prop) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> scheduleInsert(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Integer>> get(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.LinkModel<?, ?>, java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Integer>>> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> model, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Integer>> defaultValue) {
        return null;
    }
    
    /**
     * * Add the value to the cache without any check or any logic
     *     * The modelId will not be flag as ToInsert ou ToUpdate
     *     * The sate of the field will be [UPDATED] OR [PARTIALLY]
     */
    public final void forceSet(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> f, @org.jetbrains.annotations.Nullable()
    java.lang.Object value, @org.jetbrains.annotations.Nullable()
    org.platypus.cache.CacheState forceState) {
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelID createFakeRecordIfNeeded(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    /**
     * * Store the current [row] in the cache all existing value will be erased
     *     * and all the state of the field will be [FETCHED]
     *     * The [fields] should containt only [ModelField] as expression
     *     * The [modelId] must be in the database
     */
    public final void store(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.field.api.IModelField<?, ?>> fieldsToStore, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ResultRow row) {
    }
    
    public final void store(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ResultRow row) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelID realID(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId) {
        return null;
    }
    
    public final boolean isNotInDB(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId) {
        return false;
    }
    
    public final boolean isToUpdate(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> prop) {
        return false;
    }
    
    public final boolean isInDB(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>kotlin.Pair<org.platypus.cache.CacheState, T> getValue$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, T> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.String> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> prop, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.Integer> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> prop, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.Boolean> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> prop, boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.math.BigDecimal> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> prop, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.time.LocalDate> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> prop, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.String> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> prop, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.SelectionValue<?> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.time.LocalDateTime> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> prop, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.String> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> prop, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.String> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> prop) {
        return null;
    }
    
    public final void set$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> prop, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.time.LocalDateTime> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> prop, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.time.LocalDateTime> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> prop, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.time.LocalTime> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> prop, @org.jetbrains.annotations.Nullable()
    java.time.LocalTime value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.String> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> prop, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, byte[]> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> prop, @org.jetbrains.annotations.Nullable()
    byte[] value) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> prop, boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.Boolean> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID value) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID value) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> prop, @org.jetbrains.annotations.Nullable()
    org.platypus.cache.ModelID value) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> prop, @org.jetbrains.annotations.Nullable()
    org.platypus.cache.ModelID value) {
    }
    
    private final void deleteInCache(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver) {
    }
    
    private final void deleteInCache(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelIDS $receiver) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> prop, @org.jetbrains.annotations.Nullable()
    org.platypus.cache.ModelID value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> prop) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> prop, @org.jetbrains.annotations.Nullable()
    org.platypus.cache.ModelID value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, java.lang.Object> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model, int id, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> prop) {
        return null;
    }
    
    /**
     * * Return the value of the field and the current state  in the cache.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.cache.ModelIDS set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelIDS add(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID targetModelID) {
        return null;
    }
    
    private final org.platypus.cache.ModelID getExistingLink(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver, org.platypus.model.field.impl.Many2ManyField<?, ?> prop, org.platypus.cache.ModelID targetModelID) {
        return null;
    }
    
    private final org.platypus.cache.ModelIDS getAllLink(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver, org.platypus.model.field.impl.Many2ManyField<?, ?> prop) {
        return null;
    }
    
    private final void createlink(org.platypus.model.field.impl.Many2ManyField<?, ?> prop, org.platypus.cache.ModelID modelId, org.platypus.cache.ModelID targetModelID) {
    }
    
    private final void updateValueMany2Many(org.platypus.cache.ModelID modelId, org.platypus.model.field.impl.Many2ManyField<?, ?> prop, org.platypus.cache.ModelID targetModelID) {
    }
    
    /**
     * * The goal of this function is to remove a Mant 2 Many link between to Entity
     *     * How I'm doing that:
     *     * First get the [LinkModel] from [modelId]
     *     * I query witch Id of the [LinkModel] I need to remove
     *     * Remove [targetModelID] of the value in the cache for [modelId] and [prop]
     *     * Remove [modelId] of the value in the cache for [targetModelID] and is reverse [Many2ManyField]
     *     * And flag the [LinkModel] Id to delete in the next flush
     *     * @param modelId the right part of the Many 2 Many
     *     * @param prop the Many 2 Many field in [modelId]
     *     * @param targetModelID the left part of the Many 2 Many
     */
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.cache.ModelID remove(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID targetModelID) {
        return null;
    }
    
    private final void checkConsitencyOfManyToMany(org.platypus.model.field.impl.Many2ManyField<?, ?> prop, org.platypus.cache.ModelID modelId, org.platypus.cache.ModelID id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelIDS add(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID targetModelID) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.cache.ModelIDS remove(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID targetModelID) {
        return null;
    }
    
    private final void updateValue(org.platypus.cache.ModelID modelId, org.platypus.model.field.api.IModelField<?, ?> prop, java.lang.Object value) {
    }
    
    private final void markAsUpdate(org.platypus.cache.ModelID modelId, org.platypus.model.field.api.IModelField<?, ?> prop) {
    }
    
    public final void addnewId(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID toinsert, int newId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.CacheState state(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> prop) {
        return null;
    }
    
    public final boolean isNONE_STATE(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> prop) {
        return false;
    }
    
    public final boolean isNONE_STATE(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.CacheState state(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID) {
        return null;
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelIDS modelID) {
    }
    
    public PlatypusCache() {
        super();
    }
}