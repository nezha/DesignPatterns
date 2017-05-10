package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/9.
 */
public abstract class Girl {
    String description = "no particular";
    public String getDescription(){
        return description;
    }
    public abstract int cost();
}
