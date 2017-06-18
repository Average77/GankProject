package com.mslzyy.gankio.model.biz;

import com.mslzyy.gankio.contract.HomeContract;
import com.mslzyy.gankio.model.bean.GankBean;
import com.mslzyy.gankio.net.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public class GankBiz implements HomeContract.HomeModel {
    @Override
    public GankBean getData() {
        RetrofitUtils.INSTANCE.getGankService()
                .getGankInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GankBean>() {
                    @Override
                    public void accept(@NonNull GankBean gankBean) throws Exception {

                    }
                });
        return null;
    }
}
