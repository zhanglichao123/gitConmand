package com.example.myapp.model;

import com.example.myapp.uitls.ChinaEngine;
import com.example.myapp.view.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
@Module
@InstallIn(ActivityComponent.class)
interface MainModule {
    @Binds
    public Engine bindEngine(ChinaEngine chinaEngine);
}
