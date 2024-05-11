package com.example.lib_common.flyer;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/9/18
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u008d\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010$\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u009a\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J0\u0010\u009e\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a1\u00012\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0004J\u0011\u0010\u00a4\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00a5\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00a6\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00a7\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00a8\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00a9\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00aa\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00ab\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00ac\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00ad\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00ae\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00af\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00b0\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u001b\u0010\u00b1\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\b\u0010\u00b2\u0001\u001a\u00030\u00a1\u0001J\u0011\u0010\u00b3\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00b4\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u001b\u0010\u00b5\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\b\u0010\u00b2\u0001\u001a\u00030\u00a1\u0001J\u0011\u0010\u00b6\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00b7\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00b8\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00b9\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00ba\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00bb\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00bc\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00bd\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00be\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00bf\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00c0\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00c1\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00c2\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u001d\u0010\u00c3\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\n\b\u0002\u0010\u00c4\u0001\u001a\u00030\u00a1\u0001J\u0011\u0010\u00c5\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00c6\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00c7\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\b\u0010\u00c8\u0001\u001a\u00030\u009b\u0001J\u0011\u0010\u00c9\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00ca\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\b\u0010\u00cb\u0001\u001a\u00030\u009b\u0001J\u001d\u0010\u00cc\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\n\b\u0002\u0010\u00c4\u0001\u001a\u00030\u00a1\u0001J\u0012\u0010\u00cd\u0001\u001a\u00030\u009b\u00012\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u0001J\u001a\u0010\u00ce\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\u0007\u0010\u00cf\u0001\u001a\u00020\u0004J\u0013\u0010\u00d0\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004H\u0002J\u0012\u0010\u00d1\u0001\u001a\u00030\u009b\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a1\u0001J\b\u0010\u00d2\u0001\u001a\u00030\u009b\u0001J\u0011\u0010\u00d3\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0012\u0010\u00d4\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J\u0011\u0010\u00d5\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0012\u0010\u00d6\u0001\u001a\u00030\u009b\u00012\b\u0010\u00d7\u0001\u001a\u00030\u00a1\u0001J\u0011\u0010\u00d8\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00d9\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00da\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00db\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00dc\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00dd\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00de\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00df\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00e0\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00e1\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00e2\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0011\u0010\u00e3\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\b\u0010\u00e4\u0001\u001a\u00030\u009b\u0001J+\u0010\u00e5\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\u0016\u0010\u00e6\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00e7\u0001H\u0002J\u0011\u0010\u00e8\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0011\u0010\u00e9\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d7\u0001\u001a\u00020\u0004J\u0012\u0010\u00ea\u0001\u001a\u00030\u009b\u00012\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u0001J\b\u0010\u00eb\u0001\u001a\u00030\u009b\u0001J\u001b\u0010\u00ec\u0001\u001a\u00030\u009b\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a1\u00012\u0007\u0010\u00ed\u0001\u001a\u00020\u0004J\u001d\u0010\u00ee\u0001\u001a\u00030\u009b\u00012\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u00012\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u00ef\u0001\u001a\u00030\u009b\u00012\b\u0010\u00f0\u0001\u001a\u00030\u00a1\u0001J\u0012\u0010\u00f1\u0001\u001a\u00030\u009b\u00012\b\u0010\u00f0\u0001\u001a\u00030\u00a1\u0001J\u0012\u0010\u00f2\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0097\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u00a8\u0006\u00f3\u0001"}, d2 = {"Lcom/example/lib_common/flyer/AppFlyerManger;", "", "()V", "AF_COMPLETE_REGISTRATION", "", "AF_LOGIN", "BUY_COINS_IN_PLAYER", "DEBUG_ACCESS_TOKEN", "DEBUG_AGREEMENT", "DEBUG_AGREEMENT_CANCEL", "DEBUG_AGREEMENT_FIRST_LAUNCH", "DEBUG_AGREEMENT_FIRST_LAUNCH_CANCEL", "DEBUG_AGREEMENT_FIRST_LAUNCH_SUCCESS", "DEBUG_AGREEMENT_SUCCESS", "DEBUG_APP_CREATE_AD", "DEBUG_APP_CREATE_AF", "DEBUG_APP_CREATE_CRASH", "DEBUG_APP_CREATE_FIRST_LAUNCH", "DEBUG_APP_CREATE_ROUTER", "DEBUG_DATA_BASE_DAO_NULL", "DEBUG_FIRST_LAUNCH", "DEBUG_FIRST_LAUNCH_CODE", "DEBUG_FLASH_CONSUME", "DEBUG_FLASH_CONSUME_FAIL", "DEBUG_FLASH_CONSUME_SUCCESS", "DEBUG_FLASH_CREATE_ORDER", "DEBUG_FLASH_CREATE_ORDER_FAIL", "DEBUG_FLASH_CREATE_ORDER_SUCCESS", "DEBUG_FLASH_GET_GOODS", "DEBUG_FLASH_GET_GOODS_FAIL", "DEBUG_FLASH_GET_GOODS_SUCCESS", "DEBUG_FLASH_PAY", "DEBUG_FLASH_PAY_CANCEL", "DEBUG_FLASH_PAY_FAIL", "DEBUG_FLASH_PAY_OTHER", "DEBUG_FLASH_PAY_SUCCESS", "DEBUG_FLASH_PURCHASE_COIN", "DEBUG_FLASH_PURCHASE_COIN_FAIL", "DEBUG_FLASH_PURCHASE_COIN_SUCCESS", "DEBUG_FLASH_SHOW", "DEBUG_GET_HOME_FAIL", "DEBUG_GET_USERINFO", "DEBUG_GET_USERINFO_FAIL", "DEBUG_GET_USERINFO_FAIL_FIRST_LAUNCH", "DEBUG_GET_USERINFO_SUCCESS", "DEBUG_GET_USERINFO_SUCCESS_FIRST_LAUNCH", "DEBUG_GET_USERINFO__FIRST_LAUNCH", "DEBUG_GET_VERSION", "DEBUG_GET_VERSION_FAIL", "DEBUG_GET_VERSION_FAIL_FIRST_LAUNCH", "DEBUG_GET_VERSION_FIRST_LAUNCH", "DEBUG_GET_VERSION_SUCCESS", "DEBUG_GET_VERSION_SUCCESS_FIRST_LAUNCH", "DEBUG_GOOGLE_CONNECT", "DEBUG_GOOGLE_CONNECT_FAIL", "DEBUG_GOOGLE_CONNECT_SERVICE_DISCONNECTED", "DEBUG_GOOGLE_CONNECT_SUCCESS", "DEBUG_GOOGLE_PRODUCT_ID_LIST", "DEBUG_HOME_CREATE", "DEBUG_HOME_CREATE_FIRST_LAUNCH", "DEBUG_MAIN_CREATE", "DEBUG_MAIN_CREATE_FIRST_LAUNCH", "DEBUG_MAIN_GET_GOODS", "DEBUG_MAIN_GET_GOODS_FAIL", "DEBUG_MAIN_GET_GOODS_SUCCESS", "DEBUG_ORDER_NULL_FAIL", "DEBUG_ORDER_NULL_SUCCESS", "DEBUG_PAY_CANCEL", "DEBUG_PURCHASE_TOKEN_NULL_FAIL", "DEBUG_SINGLE_GET_GOODS", "DEBUG_SINGLE_GET_GOODS_FAIL", "DEBUG_SINGLE_GET_GOODS_SUCCESS", "DEBUG_SPLASH_CREATE", "DEBUG_SPLASH_CREATE_FIRST_LAUNCH", "DEBUG_TOKEN_NULL_SUCCESS", "DEBUG_VIDEO_CONSUME", "DEBUG_VIDEO_CONSUME_FAIL", "DEBUG_VIDEO_CONSUME_SUCCESS", "DEBUG_VIDEO_CREATE_ORDER", "DEBUG_VIDEO_CREATE_ORDER_FAIL", "DEBUG_VIDEO_CREATE_ORDER_SUCCESS", "DEBUG_VIDEO_EPISODE", "DEBUG_VIDEO_FIRING", "DEBUG_VIDEO_FIRING_HOME", "DEBUG_VIDEO_FIRING_HOME_FAIL", "DEBUG_VIDEO_FIRING_HOME_SUCCESS", "DEBUG_VIDEO_GET_GOODS", "DEBUG_VIDEO_GET_GOODS_FAIL", "DEBUG_VIDEO_GET_GOODS_SUCCESS", "DEBUG_VIDEO_PAY", "DEBUG_VIDEO_PAY_CANCEL", "DEBUG_VIDEO_PAY_FAIL", "DEBUG_VIDEO_PAY_OTHER", "DEBUG_VIDEO_PAY_SUCCESS", "DEBUG_VIDEO_PURCHASE_COIN", "DEBUG_VIDEO_PURCHASE_COIN_FAIL", "DEBUG_VIDEO_PURCHASE_COIN_SUCCESS", "DEBUG_VIDEO_STORE", "DEBUG_VIDEO_STORE_FAIL", "DEBUG_VIDEO_STORE_SUCCESS", "DEBUG_WALLET_CONSUME", "DEBUG_WALLET_CONSUME_FAIL", "DEBUG_WALLET_CONSUME_SUCCESS", "DEBUG_WALLET_CREATE_ORDER", "DEBUG_WALLET_CREATE_ORDER_FAIL", "DEBUG_WALLET_CREATE_ORDER_SUCCESS", "DEBUG_WALLET_GET_GOODS", "DEBUG_WALLET_GET_GOODS_FAIL", "DEBUG_WALLET_GET_GOODS_SUCCESS", "DEBUG_WALLET_ME", "DEBUG_WALLET_PAY", "DEBUG_WALLET_PAY_CANCEL", "DEBUG_WALLET_PAY_FAIL", "DEBUG_WALLET_PAY_OTHER", "DEBUG_WALLET_PAY_SUCCESS", "DEBUG_WALLET_PURCHASE_COIN", "DEBUG_WALLET_PURCHASE_COIN_FAIL", "DEBUG_WALLET_PURCHASE_COIN_SUCCESS", "DEBUG_WALLET_SHOW", "DEBUG_WALLET_STORE", "DEBUG_WALLET_STORE_FAIL", "DEBUG_WALLET_STORE_SUCCESS", "DRAMA_SERIES_ID", "DRAMA_TITLE", "EPISODE_NUMBER", "FINISHED_1_EPISODE_FIRST_TIME", "FINISHED_AD_IN_PLAYER", "FINISHED_ALL_AD_IN_PLAYER", "FINISHED_THE_LAST_FREE_EPISODE", "OPEN_PLAYER_FIRST_TIME", "PAY", "PLATFORM", "PRODUCT_TYPE", "SYSTEM_COUNTRY", "SYSTEM_DEVICE", "SYSTEM_LANGUAGE", "SYSTEM_MODEL", "SYSTEM_VERSION", "UNLOCKED_EPISODE_BY_COINS", "UNLOCKED_EPISODE_BY_COINS_FAIL", "UNLOCKED_FULL_SERIES", "UNLOCK_NEW_SERIES", "USERID", "USER_LOGIN", "USER_REGISTER", "isDataReport", "", "()Z", "setDataReport", "(Z)V", "productTypeData", "Landroidx/lifecycle/MutableLiveData;", "getProductTypeData", "()Landroidx/lifecycle/MutableLiveData;", "buyCoinsInPlayer", "", "price", "", "coinsFirstTime", "event", "episodeID", "", "currentEpisodes", "dramaTitle", "debugAccessToken", "debugAgreement", "debugAgreementCancel", "debugAgreementSuccess", "debugAppCreate", "debugFirstLaunch", "debugFlashConsume", "debugFlashCreateOrder", "debugFlashGetGoods", "debugFlashPay", "debugFlashPurchaseCoin", "debugFlashShow", "debugGetUserInfo", "debugGetUserInfoFail", "error", "debugGetUserInfoSuccess", "debugGetVersion", "debugGetVersionFail", "debugGetVersionSuccess", "debugHomeCreate", "debugMainCreate", "debugSplashCreate", "debugVideoConsume", "debugVideoCreateOrder", "debugVideoEpisode", "debugVideoFiringHome", "debugVideoFiringHomeFail", "debugVideoFiringHomeSuccess", "debugVideoGetGoods", "debugVideoPay", "debugVideoPurchaseCoin", "debugVideoStore", "errCode", "debugWalletConsume", "debugWalletCreateOrder", "debugWalletGetGoods", "debugWalletMe", "debugWalletPay", "debugWalletPurchaseCoin", "debugWalletShow", "debugWalletStore", "episodeFirstTime", "eventDistribution", "position", "eventMap", "finishedAd", "finishedAllAd", "firingApp", "flashSale", "googleConnect", "homeBannerClick", "eventIndex", "homeBannerExposure", "homeComingSoon", "homeEvent", "homeLimitDiscounts", "homeLoveAfterMarriage", "homePageExposure", "homeRecommend", "homeShortSeries", "homeTaskCheck", "homeTopClick", "homeTrendDramas", "homeTrendingClick", "lastFreeEpisode", "logEvent", "mapData", "", "newUserLoginAndRegister", "paymentFeedbackWindowSelect", "playerFirstTime", "unlockEpisode", "unlockNewSeries", "type", "unlockedFull", "userLogin", "platform", "userRegister", "walletTopUp", "lib_common_debug"})
public final class AppFlyerManger {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.flyer.AppFlyerManger INSTANCE = null;
    private static final java.lang.String USER_REGISTER = "user_register";
    private static final java.lang.String USER_LOGIN = "user_login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AF_LOGIN = "af_login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AF_COMPLETE_REGISTRATION = "af_complete_registration";
    private static final java.lang.String OPEN_PLAYER_FIRST_TIME = "open_player_first_time";
    private static final java.lang.String FINISHED_1_EPISODE_FIRST_TIME = "finished_1_episode_first_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNLOCKED_EPISODE_BY_COINS = "unlocked_episode_by_coins_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNLOCKED_EPISODE_BY_COINS_FAIL = "unlocked_episode_by_coins_fail";
    private static final java.lang.String UNLOCKED_FULL_SERIES = "unlocked_full_series";
    private static final java.lang.String FINISHED_AD_IN_PLAYER = "finished_ad_in_player";
    private static final java.lang.String FINISHED_ALL_AD_IN_PLAYER = "finished_all_ad_in_player";
    private static final java.lang.String PAY = "pay";
    private static final java.lang.String BUY_COINS_IN_PLAYER = "buy_coins_in_player";
    private static final java.lang.String UNLOCK_NEW_SERIES = "unlock_new_series";
    private static final java.lang.String FINISHED_THE_LAST_FREE_EPISODE = "finished_the_last_free_episode";
    private static final java.lang.String DEBUG_WALLET_ME = "debug_wallet_me";
    private static final java.lang.String DEBUG_WALLET_SHOW = "debug_wallet_show";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_STORE = "debug_wallet_store";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_STORE_SUCCESS = "debug_wallet_store_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_STORE_FAIL = "debug_wallet_store_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_GET_GOODS = "debug_wallet_get_goods";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_MAIN_GET_GOODS = "debug_main_get_goods";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_SINGLE_GET_GOODS = "debug_single_get_goods";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_GET_GOODS_SUCCESS = "debug_wallet_get_goods_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_MAIN_GET_GOODS_SUCCESS = "debug_main_get_goods_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_SINGLE_GET_GOODS_SUCCESS = "debug_single_get_goods_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_GET_GOODS_FAIL = "debug_wallet_get_goods_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_SINGLE_GET_GOODS_FAIL = "debug_single_get_goods_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_MAIN_GET_GOODS_FAIL = "debug__main_get_goods_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_CREATE_ORDER = "debug_wallet_create_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_CREATE_ORDER_SUCCESS = "debug_wallet_create_order_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_CREATE_ORDER_FAIL = "debug_wallet_create_order_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PAY = "debug_wallet_pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PAY_SUCCESS = "debug_wallet_pay_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PAY_FAIL = "debug_wallet_pay_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PAY_CANCEL = "debug_wallet_pay_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PAY_OTHER = "debug_wallet_pay_other";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_CONSUME = "debug_wallet_consume";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_CONSUME_SUCCESS = "debug_wallet_consume_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_CONSUME_FAIL = "debug_wallet_consume_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PURCHASE_COIN = "debug_wallet_purchase_coin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PURCHASE_COIN_SUCCESS = "debug_wallet_purchase_coin_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_WALLET_PURCHASE_COIN_FAIL = "debug_wallet_purchase_coin_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_EPISODE = "debug_video_episode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_STORE = "debug_video_store";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_STORE_SUCCESS = "debug_video_store_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_STORE_FAIL = "debug_video_store_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_GET_GOODS = "debug_video_get_goods";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_GET_GOODS_SUCCESS = "debug_video_get_goods_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_GET_GOODS_FAIL = "debug_video_get_goods_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_CREATE_ORDER = "debug_video_create_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_CREATE_ORDER_SUCCESS = "debug_video_create_order_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_CREATE_ORDER_FAIL = "debug_video_create_order_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PAY = "debug_video_pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PAY_SUCCESS = "debug_video_pay_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PAY_FAIL = "debug_video_pay_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PAY_CANCEL = "debug_video_pay_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_PAY_CANCEL = "debug_pay_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PAY_OTHER = "debug_video_pay_other";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_CONSUME = "debug_video_consume";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_CONSUME_SUCCESS = "debug_video_consume_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_CONSUME_FAIL = "debug_video_consume_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PURCHASE_COIN = "debug_video_purchase_coin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PURCHASE_COIN_SUCCESS = "debug_video_purchase_coin_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_PURCHASE_COIN_FAIL = "debug_video_purchase_coin_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_ORDER_NULL_SUCCESS = "debug_order_null_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_TOKEN_NULL_SUCCESS = "debug_token_null_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_ORDER_NULL_FAIL = "debug_order_null_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_PURCHASE_TOKEN_NULL_FAIL = "debug_purchaseToken_null_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_DATA_BASE_DAO_NULL = "debug_data_base_dao_null";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_FIRING = "debug_video_firing";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_FIRING_HOME = "debug_video_firing_home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_FIRING_HOME_SUCCESS = "debug_video_firing_home_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_VIDEO_FIRING_HOME_FAIL = "debug_video_firing_home_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GOOGLE_CONNECT = "debug_google_connect";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GOOGLE_CONNECT_SUCCESS = "debug_google_connect_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GOOGLE_CONNECT_FAIL = "debug_google_connect_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GOOGLE_CONNECT_SERVICE_DISCONNECTED = "debug_google_connect_service_Disconnected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GOOGLE_PRODUCT_ID_LIST = "debug_google_product_id_list";
    private static final java.lang.String PLATFORM = "platform";
    private static final java.lang.String USERID = "user_id";
    private static final java.lang.String DRAMA_SERIES_ID = "drama_series_id";
    private static final java.lang.String EPISODE_NUMBER = "episode_number";
    private static final java.lang.String DRAMA_TITLE = "dramaTitle";
    private static final java.lang.String PRODUCT_TYPE = "product_type";
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> productTypeData = null;
    private static boolean isDataReport = true;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_SHOW = "debug_flash_show";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_GET_GOODS = "debug_flash_get_goods";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_GET_GOODS_SUCCESS = "debug_flash_get_goods_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_GET_GOODS_FAIL = "debug_flash_get_goods_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_CREATE_ORDER = "debug_flash_create_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_CREATE_ORDER_SUCCESS = "debug_flash_create_order_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_CREATE_ORDER_FAIL = "debug_flash_create_order_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PAY = "debug_flash_pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PAY_SUCCESS = "debug_flash_pay_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PAY_FAIL = "debug_flash_pay_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PAY_CANCEL = "debug_flash_pay_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PAY_OTHER = "debug_flash_pay_other";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_CONSUME = "debug_flash_consume";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_CONSUME_SUCCESS = "debug_flash_consume_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_CONSUME_FAIL = "debug_flash_consume_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PURCHASE_COIN = "debug_flash_purchase_coin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PURCHASE_COIN_SUCCESS = "debug_flash_purchase_coin_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FLASH_PURCHASE_COIN_FAIL = "debug_flash_purchase_coin_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_APP_CREATE_AF = "debug_app_create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_APP_CREATE_FIRST_LAUNCH = "debug_app_create_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_APP_CREATE_AD = "debug_app_create_ad";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_APP_CREATE_CRASH = "debug_app_create_crash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_APP_CREATE_ROUTER = "debug_app_create_router";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FIRST_LAUNCH = "debug_first_launch ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_FIRST_LAUNCH_CODE = "debug_first_launch_code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_SPLASH_CREATE = "debug_splash_create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_SPLASH_CREATE_FIRST_LAUNCH = "debug_splash_create_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_VERSION = "debug_get_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_VERSION_FIRST_LAUNCH = "debug_get_version__first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_VERSION_SUCCESS = "debug_get_version_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_HOME_FAIL = "debug_get_home_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_VERSION_SUCCESS_FIRST_LAUNCH = "debug_get_version_success_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_VERSION_FAIL = "debug_get_version_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_VERSION_FAIL_FIRST_LAUNCH = "debug_get_version_fail_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_USERINFO = "debug_get_userInfo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_USERINFO__FIRST_LAUNCH = "debug_get_userinfo_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_USERINFO_SUCCESS = "debug_get_userInfo_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_USERINFO_SUCCESS_FIRST_LAUNCH = "debug_get_userinfo_success_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_USERINFO_FAIL = "debug_get_userInfo_fail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_GET_USERINFO_FAIL_FIRST_LAUNCH = "debug_get_userinfo_fail_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_MAIN_CREATE = "debug_main_create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_MAIN_CREATE_FIRST_LAUNCH = "debug_main_create_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_HOME_CREATE = "debug_home_create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_HOME_CREATE_FIRST_LAUNCH = "debug_home_create_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_AGREEMENT = "debug_agreement";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_AGREEMENT_FIRST_LAUNCH = "debug_agreement_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_AGREEMENT_SUCCESS = "debug_agreement_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_AGREEMENT_FIRST_LAUNCH_SUCCESS = "debug_agreement_success_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_AGREEMENT_CANCEL = "debug_agreement_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_AGREEMENT_FIRST_LAUNCH_CANCEL = "debug_agreement_cancel_first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_ACCESS_TOKEN = "debug_access_token";
    private static final java.lang.String SYSTEM_MODEL = "system_model";
    private static final java.lang.String SYSTEM_VERSION = "system_version";
    private static final java.lang.String SYSTEM_COUNTRY = "system_country";
    private static final java.lang.String SYSTEM_LANGUAGE = "system_language";
    private static final java.lang.String SYSTEM_DEVICE = "system_device";
    
    private AppFlyerManger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProductTypeData() {
        return null;
    }
    
    public final boolean isDataReport() {
        return false;
    }
    
    public final void setDataReport(boolean p0) {
    }
    
    /**
     * 上报事件
     */
    private final void logEvent(java.lang.String event, java.util.Map<java.lang.String, ? extends java.lang.Object> mapData) {
    }
    
    /**
     * 、注册上报
     *
     * @platform 用户类型 ：游客、fb、google和其他
     */
    public final void userRegister(int platform) {
    }
    
    /**
     * 、登录上报
     *
     * @type 用户类型 ：游客、fb、google和其他
     */
    public final void userLogin(int platform) {
    }
    
    public final void newUserLoginAndRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 、用户第一次打开播放器
     * open_player_first_time
     * @episode 剧集ID
     */
    public final void playerFirstTime(int episodeID) {
    }
    
    /**
     * 、用户第一次看完完整一集
     *
     * @episode 剧集ID
     */
    public final void episodeFirstTime(int episodeID) {
    }
    
    /**
     * 、用户用金币解锁剧集成功、失败
     * 每次用金币解锁子集时，上报一次
     * @episode 剧集ID
     */
    public final void coinsFirstTime(@org.jetbrains.annotations.NotNull()
    java.lang.String event, int episodeID, int currentEpisodes, @org.jetbrains.annotations.Nullable()
    java.lang.String dramaTitle) {
    }
    
    /**
     * 用户看完一部剧
     *
     * 每unlock一部剧的最后1集时，上报一次
     */
    public final void unlockedFull(int episodeID, @org.jetbrains.annotations.Nullable()
    java.lang.String dramaTitle) {
    }
    
    /**
     * 用户看完播放器内一条广告
     *
     * 每看完一条广告上报1次
     */
    public final void finishedAd(int currentEpisodes) {
    }
    
    /**
     * 看完当天播放器内所有广告
     *
     * 每天看完后上报1次；
     */
    public final void finishedAllAd() {
    }
    
    /**
     * 、解锁新剧
     *
     * 用户每新解锁一部剧的付费集数
     *
     * @episode 剧集ID
     * @episodes 第几集
     */
    public final void unlockNewSeries(int currentEpisodes, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    /**
     * 用户看完免费集数的最后一集
     *
     * 如果一个剧前5集都是免费，用户看完第5集，就算看完免费集数
     *
     * @episode 剧集ID
     * @episodes 第几集
     */
    public final void lastFreeEpisode() {
    }
    
    /**
     * 在播放器内购买金币
     *
     * 用户看剧，弹出购买金币的付费弹窗，用户在此弹窗支付了
     */
    public final void buyCoinsInPlayer(float price) {
    }
    
    public final void walletTopUp(float price) {
    }
    
    public final void flashSale(float price) {
    }
    
    /**
     * 用户点击me页面时
     */
    public final void debugWalletMe() {
    }
    
    /**
     * 用户进入商城页面时
     */
    public final void debugWalletShow() {
    }
    
    /**
     * 进入商城时首次请求服务器数据
     */
    public final void debugWalletStore(@org.jetbrains.annotations.NotNull()
    java.lang.String event, int errCode) {
    }
    
    /**
     * 获取服务器数据后到google查询商品显示价格
     */
    public final void debugWalletGetGoods(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 当用户点击商品时，请求服务器创建订单
     */
    public final void debugWalletCreateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 当创建订单成功时，调起google支付
     */
    public final void debugWalletPay(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 消费订单
     */
    public final void debugWalletConsume(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 支付成功请求服务器获取金币
     */
    public final void debugWalletPurchaseCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 视频播放页面弹起支付弹窗时
     */
    public final void debugVideoEpisode(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 首次请求服务器数据
     */
    public final void debugVideoStore(@org.jetbrains.annotations.NotNull()
    java.lang.String event, int errCode) {
    }
    
    /**
     * 获取服务器数据后到google查询商品显示价格
     */
    public final void debugVideoGetGoods(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 当用户点击商品时，请求服务器创建订单
     */
    public final void debugVideoCreateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 当创建订单成功时，调起google支付，上报事件
     */
    public final void debugVideoPay(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 消费订单
     */
    public final void debugVideoConsume(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 支付成功请求服务器获取金币
     */
    public final void debugVideoPurchaseCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 启动app时，上报事件
     */
    public final void firingApp(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 进入home界面时
     */
    public final void debugVideoFiringHome(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 进入home界面时成功
     */
    public final void debugVideoFiringHomeSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 进入home界面时失败
     */
    public final void debugVideoFiringHomeFail(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * google连接
     */
    public final void googleConnect(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    /**
     * 视频播放触发解锁弹窗上报
     */
    public final void unlockEpisode() {
    }
    
    public final void debugFlashShow(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugFlashGetGoods(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugFlashCreateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugFlashPay(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugFlashConsume(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugFlashPurchaseCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugAppCreate(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugFirstLaunch(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugSplashCreate(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugGetVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugGetVersionSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugGetVersionFail(@org.jetbrains.annotations.NotNull()
    java.lang.String event, int error) {
    }
    
    public final void debugGetUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugGetUserInfoSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugGetUserInfoFail(@org.jetbrains.annotations.NotNull()
    java.lang.String event, int error) {
    }
    
    public final void debugMainCreate(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugHomeCreate(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugAgreement(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugAgreementSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugAgreementCancel(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void debugAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void homeBannerClick(int eventIndex) {
    }
    
    public final void homeTrendingClick(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeTopClick(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeComingSoon(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeLoveAfterMarriage(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeTrendDramas(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeRecommend(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeLimitDiscounts(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void homeShortSeries(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final void homeTaskCheck(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homePageExposure(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void homeBannerExposure(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void paymentFeedbackWindowSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String eventIndex) {
    }
    
    public final void eventDistribution(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    java.lang.String position) {
    }
    
    private final void eventMap(java.lang.String event) {
    }
}