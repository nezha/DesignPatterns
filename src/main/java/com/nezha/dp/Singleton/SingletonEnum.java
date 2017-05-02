package com.nezha.dp.Singleton;

/**
 * Created by nezha on 2017/3/24.
 */

public enum SingletonEnum{
        INSTANCE;
        private Resouce instance;
        private SingletonEnum(){
            instance = new Resouce();
        }
}

class EnumSingleton{
    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton{
        INSTANCE;

        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}


