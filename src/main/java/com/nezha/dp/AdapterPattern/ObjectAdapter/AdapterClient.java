package com.nezha.dp.AdapterPattern.ObjectAdapter;

/**
 * @Description: 客户端模拟 <br>
 * @Date: 2019/1/7 11:19 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class AdapterClient {
    public static void main(String[] args) {
        //1.实例化源 Adaptee
        Adaptee adaptee = new Adaptee();
        //2.创建适配者对象，并且传入源
        Target target = new Adapter(adaptee);
        target.operateA();
        target.operateB();
    }
}
