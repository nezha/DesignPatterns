package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/9.
 */
public class AmericanGirl extends Girl {
    //一个实例，相当于被装饰者。
    public AmericanGirl(){
        description = description + "+American";
    }
    @Override
    public int cost() {
        return 0;
    }
}
