package com.nezha.dp.AdapterPattern.ClassAdapter;

/**
 * @Description: 类适配器模式 <br>
 * @Date: 2019/1/7 11:06 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class AdapterClient {
    public static void main(String[] args) {
        //目标Target是通过适配器Adapter获得的
        Target adapter = new Adapter();
        adapter.operateA();
        adapter.operateB();
    }
}
