package com.zouxianbin.common.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.view.View;

import com.zouxianbin.android.slide.SlideBackAppCompatActivity;


/**
 * Created by zouxianbin on 2017/6/19.
 */

public abstract class DataBindingActivity<B extends ViewDataBinding> extends SlideBackAppCompatActivity {

    public Context mContext;

    public B mViewBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        // 首页禁用滑动返回
        setSlideable(setBackIsSlide());

        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().inflate(this.getLayoutId(), null, false);
        mViewBinding = DataBindingUtil.bind(rootView);
        setContentView(rootView);
        mContext = this;
        initPresenter();

    }

    public abstract int getLayoutId();

    protected void initPresenter() {

    }

    public abstract boolean setBackIsSlide();


}
