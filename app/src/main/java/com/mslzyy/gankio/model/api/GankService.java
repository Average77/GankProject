package com.mslzyy.gankio.model.api;

import com.mslzyy.gankio.model.bean.GankBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public interface GankService {
    //首页
    @GET("data/Android/10/1")
    Flowable<GankBean> getGankInfo();
}
