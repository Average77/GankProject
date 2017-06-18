package com.mslzyy.gankio.view.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mslzyy.gankio.GankApp;
import com.mslzyy.gankio.R;
import com.mslzyy.gankio.base.BaseActivity;
import com.mslzyy.gankio.contract.HomeContract;
import com.mslzyy.gankio.model.bean.GankBean;
import com.mslzyy.gankio.view.adapter.HomeAdapter;

import java.util.List;

import butterknife.BindView;

public class HomeActivity extends BaseActivity implements HomeContract.HomeView {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void show(List<GankBean.ResultsBean> resultsBeanList) {
        recyclerview.setLayoutManager(new LinearLayoutManager(GankApp.getContext()));
        recyclerview.setAdapter(new HomeAdapter(GankApp.getContext(),resultsBeanList));
    }
}
