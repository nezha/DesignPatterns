package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/9.
 */
public class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return this.girl.getDescription() + "+Like Art";
    }

    @Override
    public int cost() {
        return girl.cost() + 200;
    }
}