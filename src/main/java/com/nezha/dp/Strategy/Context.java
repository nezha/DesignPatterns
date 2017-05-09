package com.nezha.dp.Strategy;

/**
 * Created by 123 on 2017/5/9.
 */
public class Context{
    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
