package com.mslzyy.gankio.net;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.mslzyy.gankio.model.api.GankService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public enum  RetrofitUtils {
    INSTANCE;
    public Retrofit getRetrofit(String url){
        return new Retrofit.Builder()
                .client(OkhttpUtils.INSTANCE.getDefaultOkhttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build();
    }
    public GankService getGankService(){
        return getRetrofit("http://gank.io/api/").create(GankService.class);
    }
}
