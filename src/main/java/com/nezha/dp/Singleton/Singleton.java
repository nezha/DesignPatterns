package com.nezha.dp.Singleton;

/**
 * Created by 123 on 2016/12/19.
 * 这是懒汉模式
 */
public class Singleton {
    private static Singleton instance;
    private Singleton( ){ }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


