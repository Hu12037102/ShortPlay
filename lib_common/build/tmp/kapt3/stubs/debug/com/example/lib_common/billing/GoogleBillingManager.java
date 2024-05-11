package com.example.lib_common.billing;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/20
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010J\u001a\u00020 H\u0002J\u0010\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020MH\u0002J\u0006\u0010N\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0006\u0010O\u001a\u00020 J\u0006\u0010P\u001a\u00020 J \u0010Q\u001a\u00020 2\u0006\u0010R\u001a\u00020S2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010UH\u0016J\u0006\u0010V\u001a\u00020 J\u0006\u0010W\u001a\u00020 J\u0010\u0010X\u001a\u00020 2\u0006\u0010Y\u001a\u00020\u0006H\u0002J\u0010\u0010Z\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0018\u0010[\u001a\u00020 2\u0006\u0010\\\u001a\u00020]2\u0006\u00103\u001a\u000205H\u0002J)\u0010^\u001a\u00020 2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040`2\b\b\u0002\u0010a\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010bJ+\u0010c\u001a\u00020 2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010a\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ\u001d\u0010e\u001a\u0004\u0018\u00010f2\b\b\u0002\u0010a\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJ\u0006\u0010h\u001a\u00020 J\u0006\u0010i\u001a\u00020 J\u000e\u0010j\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0006J\u00d0\u0001\u0010k\u001a\u00020 2b\u0010!\u001a^\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 0\u00192d\u0010\u0018\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u0019J\u00d0\u0001\u0010l\u001a\u00020 2b\u0010/\u001a^\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 0\u00192d\u0010.\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u0019J\u00d0\u0001\u0010m\u001a\u00020 2b\u0010;\u001a^\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 0\u00192d\u0010:\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u0019J\u00d0\u0001\u0010n\u001a\u00020 2b\u0010=\u001a^\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 0\u00192d\u0010<\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u0019J0\u0010o\u001a\u00020 2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010a\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rn\u0010\u0018\u001ab\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rl\u0010!\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000Rn\u0010.\u001ab\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rl\u0010/\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020504X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rn\u0010:\u001ab\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rl\u0010;\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rn\u0010<\u001ab\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rl\u0010=\u001a`\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020 \u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006p"}, d2 = {"Lcom/example/lib_common/billing/GoogleBillingManager;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "()V", "DECIMAL", "", "GOOGLE_CONSUME", "", "GOOGLE_CONSUME_FAIL", "GOOGLE_CONSUME_SUCCESS", "GOOGLE_PAY", "HOME_PAGER_TYPE", "ME_PAGER_TYPE", "PLAY_FLASH_TYPE", "PLAY_PAGER_TYPE", "SUB_PAGER_TYPE", "TRANSFORMPRICEVALUE", "", "WALLET_PAGER_TYPE", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "createOrderTimer", "", "delayCall", "eventType", "flashPlayFail", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "productId", "purchaseState", "purchaseToken", "zzb", "", "flashPlaySuccess", "orderId", "isConnection", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "setConnection", "(Landroidx/lifecycle/MutableLiveData;)V", "isConnectionEstablished", "()Z", "setConnectionEstablished", "(Z)V", "maxTries", "playPlayFail", "playPlaySuccess", "priceAmountMicros", "priceCurrencyCode", "priceNumber", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "getProductDetails", "()Ljava/util/Map;", "setProductDetails", "(Ljava/util/Map;)V", "storePlayFail", "storePlaySuccess", "subPlayFail", "subPlaySuccess", "tries", "getTries", "()I", "setTries", "(I)V", "userPayData", "Lcom/example/lib_base/event/SingleLiveEvent;", "Lcom/example/lib_common/db/UserPayData;", "getUserPayData", "()Lcom/example/lib_base/event/SingleLiveEvent;", "setUserPayData", "(Lcom/example/lib_base/event/SingleLiveEvent;)V", "connectGooglePay", "handlePurchase", "purchase", "Lcom/android/billingclient/api/Purchase;", "init", "onDestroy", "onPlayDestroy", "onPurchasesUpdated", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchases", "", "onStoreDestroy", "onSubDestroy", "payConsumeParams", "type", "payEvent", "paymentPlay", "activity", "Landroid/app/Activity;", "processAllPurchases", "productIds", "", "isSub", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processPurchases", "(Landroid/app/Activity;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchaseHistory", "Lcom/android/billingclient/api/PurchaseHistoryResult;", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchasesAsync", "retryBillingServiceConnection", "setEventType", "setOnGoogleFlashPay", "setOnGooglePlayPay", "setOnGoogleStorePay", "setOnGoogleSub", "toGooglePlay", "lib_common_debug"})
public final class GoogleBillingManager implements com.android.billingclient.api.PurchasesUpdatedListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.billing.GoogleBillingManager INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails> productDetails;
    @org.jetbrains.annotations.NotNull()
    private static androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConnection;
    @org.jetbrains.annotations.NotNull()
    private static com.example.lib_base.event.SingleLiveEvent<com.example.lib_common.db.UserPayData> userPayData;
    private static com.android.billingclient.api.BillingClient billingClient;
    private static long priceAmountMicros = -1L;
    private static java.lang.String priceCurrencyCode = "";
    private static long createOrderTimer = -1L;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> storePlaySuccess;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> storePlayFail;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> playPlaySuccess;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> playPlayFail;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> flashPlaySuccess;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> flashPlayFail;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> subPlaySuccess;
    private static kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> subPlayFail;
    private static int eventType = 1;
    private static float priceNumber = 1.0F;
    private static java.lang.String productId = "";
    private static final int GOOGLE_PAY = 100;
    private static final int GOOGLE_CONSUME = 1;
    private static final int GOOGLE_CONSUME_SUCCESS = 2;
    private static final int GOOGLE_CONSUME_FAIL = 3;
    public static final float TRANSFORMPRICEVALUE = 1000000.0F;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DECIMAL = "%.2f";
    public static final int PLAY_FLASH_TYPE = 0;
    public static final int HOME_PAGER_TYPE = 1;
    public static final int ME_PAGER_TYPE = 2;
    public static final int PLAY_PAGER_TYPE = 3;
    public static final int WALLET_PAGER_TYPE = 4;
    public static final int SUB_PAGER_TYPE = 5;
    private static int delayCall = 1;
    
    /**
     * 连接重试
     */
    private static int tries = 1;
    private static final int maxTries = 3;
    private static boolean isConnectionEstablished = false;
    
    private GoogleBillingManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails> getProductDetails() {
        return null;
    }
    
    public final void setProductDetails(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConnection() {
        return null;
    }
    
    public final void setConnection(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<com.example.lib_common.db.UserPayData> getUserPayData() {
        return null;
    }
    
    public final void setUserPayData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<com.example.lib_common.db.UserPayData> p0) {
    }
    
    /**
     * 初始化
     */
    public final void init() {
    }
    
    /**
     * 连接google
     */
    private final void connectGooglePay() {
    }
    
    public final int getTries() {
        return 0;
    }
    
    public final void setTries(int p0) {
    }
    
    public final boolean isConnectionEstablished() {
        return false;
    }
    
    public final void setConnectionEstablished(boolean p0) {
    }
    
    public final void retryBillingServiceConnection() {
    }
    
    /**
     * 查询所有的商品信息
     * isSub : true == 订阅  false  一次性消耗
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processAllPurchases(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> productIds, boolean isSub, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * 判断是否连接
     */
    public final void isConnection() {
    }
    
    /**
     * 查询单个商品的信息
     * isSub : true == 订阅  false  一次性消耗
     */
    private final java.lang.Object processPurchases(android.app.Activity activity, java.lang.String productId, boolean isSub, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * google pay 支付
     */
    public final void toGooglePlay(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, float priceNumber, int eventType, boolean isSub) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object queryPurchaseHistory(boolean isSub, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.android.billingclient.api.PurchaseHistoryResult> continuation) {
        return null;
    }
    
    /**
     * 调起google支付
     */
    private final void paymentPlay(android.app.Activity activity, com.android.billingclient.api.ProductDetails productDetails) {
    }
    
    /**
     * 支付回调
     */
    @java.lang.Override()
    public void onPurchasesUpdated(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.BillingResult billingResult, @org.jetbrains.annotations.Nullable()
    java.util.List<com.android.billingclient.api.Purchase> purchases) {
    }
    
    /**
     * 消耗商品
     */
    private final void handlePurchase(com.android.billingclient.api.Purchase purchase) {
    }
    
    /**
     * 支付完成后下次支付前查询消耗
     */
    public final void queryPurchasesAsync() {
    }
    
    /**
     * store支付回调
     */
    public final void setOnGoogleStorePay(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> storePlaySuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> storePlayFail) {
    }
    
    /**
     * 播放器支付回调
     */
    public final void setOnGooglePlayPay(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> playPlaySuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> playPlayFail) {
    }
    
    /**
     * 首页闪购礼包支付回调
     */
    public final void setOnGoogleFlashPay(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> flashPlaySuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> flashPlayFail) {
    }
    
    /**
     * 订阅回调
     */
    public final void setOnGoogleSub(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> subPlaySuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> subPlayFail) {
    }
    
    private final void payEvent(int purchaseState) {
    }
    
    private final void payConsumeParams(int type) {
    }
    
    public final void setEventType(int eventType) {
    }
    
    public final void onStoreDestroy() {
    }
    
    public final void onPlayDestroy() {
    }
    
    public final void onSubDestroy() {
    }
    
    /**
     * 断开连接
     */
    public final void onDestroy() {
    }
}