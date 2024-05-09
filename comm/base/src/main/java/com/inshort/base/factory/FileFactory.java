package com.inshort.base.factory;

import androidx.annotation.Nullable;
import androidx.annotation.StringDef;

import com.inshort.base.compat.FileCompat;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public final class FileFactory {

    public static final String TYPE_GLIDE = "glide";
    public static final String TYPE_APP = "app";
    public static final String TYPE_HTTP = "http";

    private FileFactory() {
    }

    @StringDef({TYPE_GLIDE, TYPE_APP, TYPE_HTTP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DirType {

    }

    @Nullable
    public static File createCacheDir(@DirType String type) {
       return FileCompat.createDir(FileCompat.getCacheDir(), type);
    }

    @Nullable
    public static File createRootDir(@DirType String type) {
        return FileCompat.createDir(FileCompat.getRootDir(), type);
    }

}
