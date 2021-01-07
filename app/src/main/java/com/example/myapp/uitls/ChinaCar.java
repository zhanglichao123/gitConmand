package com.example.myapp.uitls;

import com.example.myapp.view.Engine;

import javax.inject.Inject;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
public class ChinaCar  {
    Engine engine;
    @Inject
    public ChinaCar(Engine engine){
        this.engine=engine;
    }
    public Engine getEngine(){
        return engine;
    }
}
