package com.mslzyy.gankio.contract;

import com.mslzyy.gankio.model.bean.GankBean;

import java.util.List;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public class HomeContract {

    public interface HomeView{
        void show(List<GankBean.ResultsBean> resultsBeanList);
    }
    public interface HomePresenter{
        GankBean getInfo();
        void showInfo();
    }
    public interface HomeModel{
        GankBean getData();
    }
}
