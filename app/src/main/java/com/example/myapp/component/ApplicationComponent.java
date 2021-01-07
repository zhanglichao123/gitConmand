package com.example.myapp.component;

import com.example.myapp.ui.LoginActivity;

import dagger.Component;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
@Component
public interface ApplicationComponent {
    void inject(LoginActivity loginActivity);
}
