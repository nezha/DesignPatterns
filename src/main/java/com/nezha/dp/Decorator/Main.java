package com.nezha.dp.Decorator;

/**
 * Created by nezha on 2017/5/9.
 */
public class Main {
    public static void main(String[] args) {
        //普通美国女孩
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        //喜欢科学的
        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        //喜欢艺术的
        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());

        //喜欢体育
        Sports g4 = new Sports(g3);
        System.out.println(g4.getDescription());
        System.out.println("g1,g2,g3,g4包装后的费用:"+g4.cost());


    }
}
