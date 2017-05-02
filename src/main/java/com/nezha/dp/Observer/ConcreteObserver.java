package com.nezha.dp.Observer;

/**
 * Created by nezha on 2017/5/2.
 */
public class ConcreteObserver implements Observer {

    private String name;
    private Subject topic;
    private String content;

    public ConcreteObserver(Subject topic, String nm){
        this.name=nm;
        this.topic=topic;
        topic.register(this);
    }
    @Override
    public void update(String content) {
        this.content = content;
        System.out.println(name + this.getClass().getName() +"--- update the info:"+this.content);
    }
}
