package com.nezha.dp.Singleton;

/**
 * Created by 123 on 2016/12/19.
 * 采用急切创建模式
 * 缺点：即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了。
 */
public class SingletonUrge {
    //创建类的时候就会执行这句话
    private static SingletonUrge instance = new SingletonUrge();
    private SingletonUrge(){}
    public static SingletonUrge getInstance(){
        return instance;
    }
}
