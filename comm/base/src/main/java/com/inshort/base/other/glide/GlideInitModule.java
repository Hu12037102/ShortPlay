package com.inshort.base.other.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;
import com.inshort.base.compat.FileCompat;
import com.inshort.base.factory.FileFactory;

import java.io.File;
import java.io.InputStream;

@GlideModule(glideName = "GlideInShort")
public class GlideInitModule extends AppGlideModule {
    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        registry.replace(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory());
    }

    @Override
    public boolean isManifestParsingEnabled() {
        return true;
    }

    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        File file = FileFactory.createCacheDir(FileFactory.TYPE_GLIDE);
        if (file == null) {
            file = FileCompat.getCacheDir();
        }
        RequestOptions options = createDefaultOptions();
        builder.setDefaultRequestOptions(options)
                .setDiskCacheExecutor(GlideExecutor.newDiskCacheExecutor())
                .setDiskCache(new DiskLruCacheFactory(file.getAbsolutePath(), 200 * 1024 * 1024))
                .setLogLevel(Log.WARN)
                .setSourceExecutor(GlideExecutor.newSourceExecutor());

    }

    private RequestOptions createDefaultOptions() {
        return new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .skipMemoryCache(false)
                .centerCrop()
                .encodeQuality(80)
                .format(DecodeFormat.PREFER_ARGB_8888)
                .placeholder(android.R.color.white)
                .encodeFormat(Bitmap.CompressFormat.PNG)
                .disallowHardwareConfig()
                .priority(Priority.LOW);
    }
}
