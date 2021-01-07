package com.example.myapp;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
class MyObserver implements LifecycleObserver {
    private static final String TAG = "MyObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void connectListener(){
        Log.e(TAG, "connectListener: ");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void disconnectListener(){
        Log.e(TAG, "disconnectListener: " );
    }
}
