package com.nezha.dp.AdapterPattern.ObjectAdapter;

/**
 * @Description: 对象适配器 <br>
 * @Date: 2019/1/7 11:15 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void operateA() {
        //通过传入的源对象实现operateA
        this.adaptee.operateA();
    }

    @Override
    public void operateB() {
        System.out.println("我是通过适配器的实现接口实现的operateB");
    }
}
