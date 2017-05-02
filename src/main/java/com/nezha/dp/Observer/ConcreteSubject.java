package com.nezha.dp.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by nezha on 2017/5/2.
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();

    public ConcreteSubject(){
        this.observers=new ArrayList<Observer>();
    }
    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed=false;
        }
        for (Observer obj : observersLocal) {
            obj.update("" + new Date() + ">>>"+this.message);
        }

    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Subject:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }

}
