package com.example.lib_common.html;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J.\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/lib_common/html/HtmlTagHandler;", "Landroid/text/Html$TagHandler;", "tag", "", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "attributes", "Ljava/util/HashMap;", "startIndex", "", "Ljava/lang/Integer;", "analysisStyle", "", "stopIndex", "editable", "Landroid/text/Editable;", "style", "(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/text/Editable;Ljava/lang/String;)V", "endHandleTag", "output", "handleTag", "opening", "", "xmlReader", "Lorg/xml/sax/XMLReader;", "parseAttributes", "startHandleTag", "Companion", "lib_common_debug"})
public final class HtmlTagHandler implements android.text.Html.TagHandler {
    private final java.lang.String tag = null;
    private final android.content.Context context = null;
    private java.lang.Integer startIndex = 0;
    private final java.util.HashMap<java.lang.String, java.lang.String> attributes = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.html.HtmlTagHandler.Companion Companion = null;
    
    public HtmlTagHandler(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void handleTag(boolean opening, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    android.text.Editable output, @org.jetbrains.annotations.Nullable()
    org.xml.sax.XMLReader xmlReader) {
    }
    
    private final void parseAttributes(org.xml.sax.XMLReader xmlReader) {
    }
    
    private final void startHandleTag(android.text.Editable output) {
    }
    
    private final void endHandleTag(android.text.Editable output) {
    }
    
    /**
     * 解析style属性
     *
     * @param startIndex startIndex
     * @param stopIndex stopIndex
     * @param editable editable
     * @param style style
     */
    private final void analysisStyle(java.lang.Integer startIndex, java.lang.Integer stopIndex, android.text.Editable editable, java.lang.String style) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/example/lib_common/html/HtmlTagHandler$Companion;", "", "()V", "sp2px", "", "context", "Landroid/content/Context;", "pxValue", "toBrowserHexValue", "", "number", "toHex", "r", "g", "b", "lib_common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String toHex(int r, int g, int b) {
            return null;
        }
        
        private final java.lang.String toBrowserHexValue(int number) {
            return null;
        }
        
        private final int sp2px(android.content.Context context, int pxValue) {
            return 0;
        }
    }
}