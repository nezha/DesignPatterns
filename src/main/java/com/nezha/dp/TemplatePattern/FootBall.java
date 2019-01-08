package com.nezha.dp.TemplatePattern;

/**
 * @Description: 足球游戏 <br>
 * @Date: 2019/1/8 10:31 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class FootBall extends Game {
    @Override
    void initialize() {
        System.out.println("初始化足球游戏");
    }

    @Override
    void startGame() {
        System.out.println("开始踢球！");
    }

    @Override
    void endGame() {
        System.out.println("游戏结束");
    }
}
