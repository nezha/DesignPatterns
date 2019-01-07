package com.nezha.dp.AdapterPattern.ClassAdapter;

/**
 * @Description: 适配器（Adapter）角色 <br>
 * @Date: 2019/1/7 11:03 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class Adapter extends Adaptee implements Target {
    //其中operateA通过继承的方式已经集成到Adapter中了
    @Override
    public void operateB() {
        System.out.println("我是通过适配器实现的operateB");
    }
}
