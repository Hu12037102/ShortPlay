package com.inshort.base.compat;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.inshort.base.utils.LogUtils;

import java.io.File;

public final class FileCompat {
    private FileCompat() {
    }

    @NonNull
    public static File getRootDir() {
        Context context = DataCompat.applicationContext();
        File[] files = ContextCompat.getExternalFilesDirs(context, null);
        if (files.length > 0) {
            return files[0];
        } else {
            File file = context.getExternalFilesDir(null);
            if (DataCompat.isNull(file)) {
                return context.getFilesDir();
            } else {
                return file;
            }
        }
    }

    @NonNull
    public static File getCacheDir() {
        Context context = DataCompat.applicationContext();
        File[] files = ContextCompat.getExternalCacheDirs(context);
        if (files.length > 0) {
            return files[0];
        } else {
            File file = context.getExternalCacheDir();
            if (DataCompat.isNull(file)) {
                return context.getCacheDir();
            } else {
                return file;
            }
        }
    }

    @Nullable
    public static File createDir(@Nullable File parentDir, String childName) {
        File file = null;
        if (!DataCompat.isNull(parentDir) && parentDir.exists() && parentDir.isDirectory()) {
            file= new File(parentDir, childName);
            if (!file.exists()){
                boolean isMkdirs= file.mkdirs();
                if (!isMkdirs){
                    file = parentDir;
                    LogUtils.d("FileCompat--","文件创建不成功---");
                }
            }
        }
        return file;
    }
    public static long getFileLength(File file) {
        int initSize = 0;
        if (file == null) {
            return initSize;
        }
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            if (list != null) {
                for (File childFile : list) {
                    initSize += getFileLength(childFile);
                }
            }
        } else {
            initSize += file.length();
        }
        return initSize;
    }
    public static long getCacheFileLength() {
        Context context = DataCompat.applicationContext();
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        LogUtils.w("getCacheFileLength--", getFileLength(externalCacheDir) + "--"
                + getFileLength(cacheDir) + "--" + getFileLength(externalCacheDir) + getFileLength(cacheDir));
        return getFileLength(externalCacheDir) + getFileLength(cacheDir);
    }

}
