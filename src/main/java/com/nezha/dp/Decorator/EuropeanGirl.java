package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/9.
 */
public class EuropeanGirl extends Girl{
    public EuropeanGirl(){
        description = "+European";
    }

    @Override
    public int cost() {
        return 0;
    }
}
