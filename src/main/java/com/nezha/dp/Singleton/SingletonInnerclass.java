package com.nezha.dp.Singleton;

/**
 * Created by 123 on 2016/12/19.
 */
public class SingletonInnerclass {
    private static class SingletonHolder{
        public static final SingletonInnerclass instance = new SingletonInnerclass();
    }
    private SingletonInnerclass(){}
    public static final SingletonInnerclass getInstance(){
        return SingletonHolder.instance;
    }
}
