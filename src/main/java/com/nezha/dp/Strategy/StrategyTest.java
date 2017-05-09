package com.nezha.dp.Strategy;

import org.junit.Test;

/**
 * Created by 123 on 2017/5/9.
 */

public class StrategyTest{
    @Test
    public void test(){
        Context context = new Context(new StrategyAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new StrategySubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new StrategyMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
