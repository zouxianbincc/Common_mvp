package com.zouxianbin.common.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zouxianbin on 2017/6/19.
 */

public abstract class DataBindingFragment<B extends ViewDataBinding> extends Fragment {

    public Context mContext;

    public B mViewBinding;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = getActivity();

        initPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(this.getLayoutId(), container, false);

        mViewBinding = DataBindingUtil.bind(rootView);

        return rootView;
    }

    public abstract int getLayoutId();

    protected void initPresenter() {

    }


}
