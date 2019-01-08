package com.nezha.dp.TemplatePattern;

/**
 * @Description: 模板抽象类 <br>
 * @Date: 2019/1/8 10:27 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public abstract class Game {
    //三个步骤：
    //1.初始化游戏
    abstract void initialize();
    //2.开始游戏
    abstract void startGame();
    //3.结束游戏
    abstract void endGame();

    //！！！定义一个final不可改方法
    public final void play(){
        initialize();
        startGame();
        endGame();
    }
}
