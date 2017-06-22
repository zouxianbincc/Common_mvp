package com.zouxainbin.androidcommon.base;

import android.databinding.ViewDataBinding;
import android.util.Log;

import com.zouxianbin.common.base.BActivity;
import com.zouxianbin.common.base.BPresenter;

/**
 * Created by zouxianbin on 2017/6/21.
 */

public abstract class BaseActivity<P extends BPresenter, B extends ViewDataBinding> extends BActivity<P, B> {

    @Override
    protected void init() {
        super.init();


        //做一些在initView之前的操作。

        Log.d("", "测试继承BActivity,实现自己的BaseActivity");


    }
}
