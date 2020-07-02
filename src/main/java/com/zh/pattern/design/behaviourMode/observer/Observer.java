package com.zh.pattern.design.behaviourMode.observer;

//订阅者对象
public interface Observer {
    //接收变动通知
    public void receiver(String state);
}
