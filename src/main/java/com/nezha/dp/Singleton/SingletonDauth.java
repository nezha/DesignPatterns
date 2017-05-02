package com.nezha.dp.Singleton;

/**
 * Created by 123 on 2016/12/19.
 * 采用双重认证，保证只有第一次需要同步加锁
 */
public class SingletonDauth {
    private volatile static SingletonDauth instance;
    private SingletonDauth(){}
    public static SingletonDauth getInstance(){
        if (null == instance) {
            synchronized (SingletonDauth.class){
                if (null == instance){
                    instance = new SingletonDauth();
                }
            }
        }
        return instance;
    }
}
