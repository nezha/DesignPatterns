package com.nezha.dp.CommandPattern;

/**
 * @Description: 命令模式客户端 <br>
 * @Date: 2019/1/8 10:24 AM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class CommandClient {
    public static void main(String[] args) {
        //1.创建接受者（会执行具体的业务逻辑)
        Receiver receiver = new Receiver();
        //2.创建具体的命令，然后注入相应的接受者
        Command command = new ConcreteCommand(receiver);
        //3.创建调用者
        Invoker invoker = new Invoker();
        //4.为调用者设置项目的命令
        invoker.setCommand(command);
        //5.调用者执行命令
        invoker.executeCommand();
    }
}
