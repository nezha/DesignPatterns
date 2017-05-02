package com.nezha.dp.Singleton;

/**
 * Created by 123 on 2016/12/19.
 * 这是加了同步锁，但是这样会有效率上开销
 */
public class SingletonSync {
    private static SingletonSync instance;
    private SingletonSync(){}
    public synchronized static SingletonSync getInstance(){
        if (null == instance) {
            instance = new SingletonSync();
        }
        return instance;
    }
}
