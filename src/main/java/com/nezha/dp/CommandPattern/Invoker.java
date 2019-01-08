package com.nezha.dp.CommandPattern;

/**
 * @Description: 调用者 <br>
 * @Date: 2019/1/8 10:15 AM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        System.out.println("调用者Invoker，注入具体命令："+command.getClass().getName());
        this.command = command;
    }

    public void executeCommand(){
        System.out.println("调用者执行命令");
        command.execute();
    }
}
