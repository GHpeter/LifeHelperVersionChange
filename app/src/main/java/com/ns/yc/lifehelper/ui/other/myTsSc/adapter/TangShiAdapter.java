package com.ns.yc.lifehelper.ui.other.myTsSc.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ns.yc.lifehelper.R;
import com.ns.yc.lifehelper.ui.other.myTsSc.bean.TangShiChapter;

import org.yczbj.ycrefreshviewlib.adapter.RecyclerArrayAdapter;
import org.yczbj.ycrefreshviewlib.viewHolder.BaseViewHolder;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/8/29
 * 描    述：唐诗页面适配器
 * 修订历史：
 * ================================================
 */
public class TangShiAdapter extends RecyclerArrayAdapter<TangShiChapter.ResultBean> {

    public TangShiAdapter(Activity activity) {
        super(activity);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExpressDeliveryViewHolder(parent);
    }


    private class ExpressDeliveryViewHolder extends BaseViewHolder<TangShiChapter.ResultBean> {

        TextView tv_title , tv_name ;

        ExpressDeliveryViewHolder(ViewGroup parent) {
            super(parent, R.layout.item_ts_list);
            tv_title = $(R.id.tv_title);
            tv_name = $(R.id.tv_name);
        }

        @Override
        public void setData(TangShiChapter.ResultBean data) {
            super.setData(data);
            tv_title.setText(data.getName());
            tv_name.setText(data.getAuthor());
        }
    }
}
