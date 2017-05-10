package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/9.
 */
public class Science extends GirlDecorator {
    private Girl girl;

    public Science(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        //其中this.girl.getDescription()可能是原始被装饰者
        //或者已经装饰过的girl了
        return this.girl.getDescription() + "+Like Science";
    }
    //装饰者附加上的功能
    public void caltulateStuff() {
        System.out.println("scientific calculation!");
    }

    @Override
    public int cost() {
        //装饰者，去装饰girl对象，然后加上装饰的新属性和任务
        return girl.cost() + 100;
    }
}
