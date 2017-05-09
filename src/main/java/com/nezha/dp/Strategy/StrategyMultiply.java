package com.nezha.dp.Strategy;

/**
 * Created by 123 on 2017/5/9.
 */
public class StrategyMultiply implements IStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
