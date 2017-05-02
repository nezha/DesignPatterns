package com.nezha.dp.Observer;

/**
 * Created by nezha on 2017/5/2.
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        //create subject
        ConcreteSubject subject = new ConcreteSubject();

        //create observers
        Observer obj1 = new ConcreteObserver(subject,"Obj1");
        Observer obj2 = new ConcreteObserver(subject,"Obj2");
        Observer obj3 = new ConcreteObserver(subject,"Obj3");
        //now send message to subject
        subject.postMessage("New Message");
        //这里是解绑某一个对象，主动权在subject手中
        subject.unregister(obj2);

        subject.postMessage("将二号对象移除");
    }
}


