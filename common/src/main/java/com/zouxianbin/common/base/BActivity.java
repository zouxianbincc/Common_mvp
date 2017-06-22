package com.zouxianbin.common.base;

import android.databinding.ViewDataBinding;

/**
 * Created by zouxianbin on 2017/6/19.
 */

public abstract class BActivity<P extends BPresenter, B extends ViewDataBinding> extends DataBindingActivity<B> {

    public P mPresenter;


    @Override
    protected void initPresenter() {

        mPresenter = newPresenter();

        if (this instanceof BView) {

            mPresenter.setView(this);
        }

        // 对外提供一个保护方法，在初始化View 和 Data 之前
        // 注要是考虑，在项目中使用时，可能需要实现自己的BaseActivity,做一些其他的操作
        init();

        initView();

        initData();

    }

    protected void init(){}

    public abstract P newPresenter();

    public abstract void initView();

    public abstract void initData();

    @Override
    protected void onDestroy() {

        super.onDestroy();

        if (mPresenter != null) mPresenter.onDetached();
    }
}
