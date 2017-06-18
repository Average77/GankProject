package com.mslzyy.gankio.presenter;

import com.mslzyy.gankio.contract.HomeContract;
import com.mslzyy.gankio.model.bean.GankBean;
import com.mslzyy.gankio.model.biz.GankBiz;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public class HomePresenter implements HomeContract.HomePresenter {
    HomeContract.HomeView homeView;
    HomeContract.HomeModel homeModel;
    public HomePresenter(HomeContract.HomeView homeView) {
        this.homeView=homeView;
        homeModel=new GankBiz();
    }

    @Override
    public GankBean getInfo() {
        return homeModel.getData();
    }

    @Override
    public void showInfo() {
        GankBean gankBean = getInfo();
        homeView.show(gankBean.getResults());
    }
}
