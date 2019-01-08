package com.nezha.dp.TemplatePattern;

/**
 * @Description: 篮球游戏 <br>
 * @Date: 2019/1/8 10:35 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class BasketBall extends Game {
    @Override
    void initialize() {
        System.out.println("初始化篮球游戏");
    }

    @Override
    void startGame() {
        System.out.println("开始玩篮球");
    }

    @Override
    void endGame() {
        System.out.println("结束篮球游戏");
    }
}
