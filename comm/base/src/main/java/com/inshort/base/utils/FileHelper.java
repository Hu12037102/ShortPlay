package com.inshort.base.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;

/**
 * @author: 张勇
 * @date: 2024/5/24
 */
public class FileHelper {

    /**
     * 读取文件
     *
     * @param filepath 文件路径
     */
    public static String readFile(String filepath) {
        String encoding = "UTF-8";
        return readFile(filepath, encoding);
    }

    /**
     * 读取文件，指定编码
     *
     * @param filepath 文件路径
     */
    public static String readFile(String filepath, String encoding) {
        try {
            filepath = URLDecoder.decode(filepath, "utf-8");
            File file = new File(filepath);
            Long filelength = file.length();
            byte[] filecontent = new byte[filelength.intValue()];
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
            return new String(filecontent, encoding);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    public static void writeFile(String filepath, String text) {

        try {
            filepath = URLDecoder.decode(filepath, "utf-8");
            File file = new File(filepath);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filepath));
            writer.append(text);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
