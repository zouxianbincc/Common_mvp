package com.zouxianbin.common.base;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by zouxianbin on 2017/6/19.
 */

public abstract class BPresenter<V> {

    protected V mView;

    protected CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    public void setView(V v) {
        this.mView = v;
        this.onAttached();
    }

    public abstract void onAttached();

    public void onDetached() {
        mCompositeSubscription.unsubscribe();
    }
}
