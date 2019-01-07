package com.nezha.dp.AdapterPattern.ObjectAdapter;

/**
 * @Description: 目标（Target）接口 <br>
 * @Date: 2019/1/7 11:11 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public interface Target {
    //1.operateA是在源(Adaptee)中有实现的
    void operateA();
    //2.operateB在源(Adaptee)中没有实现，需要使用适配器
    void operateB();
}
