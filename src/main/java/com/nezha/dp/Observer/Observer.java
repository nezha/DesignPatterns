package com.nezha.dp.Observer;

/**
 * Created by nezha on 2017/5/2.
 */
public interface Observer {
    //method to update the observer, used by subject
    public void update(String content);
}
