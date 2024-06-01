package com.inshort.base.html

import android.content.Context
import android.graphics.Color
import android.text.Editable
import android.text.Html
import android.text.Spanned
import android.text.TextUtils
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import org.xml.sax.XMLReader
import java.lang.reflect.Field
import java.util.Locale

class HtmlHandler(private val tag: String?, private val context: Context) : Html.TagHandler{

    private var startIndex : Int? = 0
    private val attributes = HashMap<String, String>()

    override fun handleTag(opening: Boolean, tag: String?, output: Editable?, xmlReader: XMLReader?) {
        if (tag == this@HtmlHandler.tag) {
            parseAttributes(xmlReader)
            if (opening) {
                startHandleTag(output)
            } else {
                endHandleTag(output)
                attributes.clear()
            }
        }
    }

    private fun parseAttributes(xmlReader: XMLReader?) {
        try {
            val elementField: Field? = xmlReader?.javaClass?.getDeclaredField("theNewElement")
            elementField?.isAccessible = true
            val element: Any? = elementField?.get(xmlReader)
            val attsField: Field? = element?.javaClass?.getDeclaredField("theAtts")
            attsField?.isAccessible = true
            val atts: Any? = attsField?.get(element)
            val dataField: Field? = atts?.javaClass?.getDeclaredField("data")
            dataField?.isAccessible = true
            val data = dataField?.get(atts) as Array<*>
            val lengthField: Field = atts.javaClass.getDeclaredField("length")
            lengthField.isAccessible = true
            val len = lengthField.get(atts) as Int
            for (i in 0 until len) {
                attributes[data[i * 5 + 1] as String] = data[i * 5 + 4] as String
            }
        } catch (e: Exception) {
        }
    }

    private fun startHandleTag(output: Editable?) {
        startIndex = output?.length
    }

    private fun endHandleTag(output: Editable?) {
        val stopIndex = output?.length
        val style : String? = attributes["style"]
        if (!TextUtils.isEmpty(style)) {
            analysisStyle(startIndex, stopIndex, output, style)
        }
    }

    /**
     * 解析style属性
     *
     * @param startIndex startIndex
     * @param stopIndex stopIndex
     * @param editable editable
     * @param style style
     */
    private fun analysisStyle(startIndex: Int?, stopIndex: Int?, editable: Editable?, style: String?) {
        val attrArray = style?.split(";")
        val attrMap = HashMap<String, String>()
        if (attrArray != null) {
            for (attr in attrArray) {
                val keyValueArray = attr.split(":")
                if (keyValueArray.size == 2) {
                    // 去除前后空格
                    attrMap[keyValueArray[0].trim()] = keyValueArray[1].trim()
                }
            }
        }

        // 字体颜色
        var color = attrMap["color"]
        if (!TextUtils.isEmpty(color)) {
            if (color!!.startsWith("rgb")) {
                color = color.replace("rgb(", "")
                color = color.replace(")", "")
                val rgbs = color.split(", ")
                if (rgbs.size > 2) {
                    color = toHex(rgbs[0].toInt(), rgbs[1].toInt(), rgbs[2].toInt())
                }
            }
            try {
                editable?.setSpan(
                    ForegroundColorSpan(Color.parseColor(color)),
                    startIndex!!, stopIndex!!, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }
        }
        // 字体大小
        var fontSize = attrMap["font-size"]
        if (!TextUtils.isEmpty(fontSize)) {
            fontSize = fontSize!!.split("px")[0]
            try {
                val absoluteSize = sp2px(context, fontSize.toInt())
                editable?.setSpan(
                    AbsoluteSizeSpan(absoluteSize), startIndex!!,
                    stopIndex!!, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }
        }
    }

    companion object {
        private fun toHex(r : Int, g : Int, b : Int) : String {
            return "#" + toBrowserHexValue(r) + toBrowserHexValue(g) + toBrowserHexValue(b)
        }

        private fun toBrowserHexValue(number: Int) : String {
            val builder = StringBuilder(number.and(0xff).toString(16))
            while (builder.length < 2) {
                builder.append("0")
            }
            return builder.toString().uppercase(Locale.getDefault())
        }

        private fun sp2px(context: Context, pxValue: Int) : Int {
            val fontScale = context.resources.displayMetrics.scaledDensity
            return (pxValue * fontScale + 0.5f).toInt()
        }
    }
}