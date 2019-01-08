package com.nezha.dp.TemplatePattern;

/**
 * @Description: 执行游戏的客户端 <br>
 * @Date: 2019/1/8 10:32 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
public class Client {
    public static void main(String[] args) {
        //1.新建一个足球游戏
        Game game = new FootBall();
        //2.玩这个游戏
        game.play();

        //1.新建一个篮球游戏
        Game game2 = new BasketBall();
        //2.玩这个游戏
        game2.play();
    }
}
