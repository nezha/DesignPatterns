package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/10.
 */
public class Sports extends GirlDecorator {
    Girl girl;
    public Sports(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "; also learn Sports";
    }

    @Override
    public int cost() {
        return girl.cost() + 300;
    }
}

