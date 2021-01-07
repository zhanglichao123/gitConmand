package com.example.myapp;

import android.app.AppComponentFactory;
import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.multidex.MultiDex;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.example.myapp.component.ApplicationComponent;
import com.example.myapp.component.DaggerApplicationComponent;
import com.example.myapp.uitls.GlideUitls;
import com.example.myapp.view.ILifecycleEvent;
import com.example.myapp.view.ILifecycleEvent.Ve;
import com.samton.IBenRobotSDK.core.MainSDK;

import dagger.hilt.android.HiltAndroidApp;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
@HiltAndroidApp
public class MyApp extends Application implements LifecycleOwner {

    public ApplicationComponent applicationComponent = DaggerApplicationComponent.create();
    private Lifecycle lifecycle;
    private LifecycleRegistry lifecycleRegistry;
    ;

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        GlideUitls.initGlideUilts(this);
        lifecycle = getLifecycle();
        lifecycle.addObserver(new MyObserver());
//        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
//        SDKInitializer.initialize(this);
//        //自4.3.0起，百度地图SDK所有接口均支持百度坐标和国测局坐标，用此方法设置您使用的坐标类型.
//        //包括BD09LL和GCJ02两种坐标，默认是BD09LL坐标。
//        SDKInitializer.setCoordType(CoordType.BD09LL);
        MainSDK.getInstance().init(this, "123", "kr3399l", false);

    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        lifecycleRegistry = new LifecycleRegistry(this);
        return lifecycleRegistry;
    }

    /**
     * 程序终止的时候执行
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * onLowMemory（） 低内存的时候执行
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    /**
     * 配置改变时触发这个方法
     *
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

    /**
     * 程序在进行内存清理时执行
     *
     * @param level
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
