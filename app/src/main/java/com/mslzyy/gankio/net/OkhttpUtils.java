package com.mslzyy.gankio.net;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public enum  OkhttpUtils {
    INSTANCE;
    OkhttpUtils(){
    }
    public OkHttpClient getDefaultOkhttpClient(){
        return new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();
    }
}
