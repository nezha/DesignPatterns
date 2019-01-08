package com.nezha.dp.CommandPattern;

/**
 * @Description: 具体命令 <br>
 * @Date: 2019/1/8 10:13 AM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand,开始执行接受者Receiver");
        receiver.action();
        System.out.println("ConcreteCommand,结束执行接受者Receiver");
    }
}
