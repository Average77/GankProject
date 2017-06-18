package com.mslzyy.gankio.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mslzyy.gankio.R;
import com.mslzyy.gankio.model.bean.GankBean;

import java.util.List;

/**
 * description
 * Created by 张芸艳 on 2017/6/18.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder>{
    private Context context;
    private List<GankBean.ResultsBean> list;

    public HomeAdapter(Context context, List<GankBean.ResultsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeViewHolder homeViewHolder=new HomeViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview_home,parent,false));

        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.tv_home.setText(list.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder{
        TextView tv_home;
        public HomeViewHolder(View itemView) {
            super(itemView);
            tv_home= (TextView) itemView.findViewById(R.id.tv_home);
        }
    }
}
