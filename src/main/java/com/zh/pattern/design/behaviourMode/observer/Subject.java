package com.zh.pattern.design.behaviourMode.observer;

import java.util.ArrayList;
import java.util.List;

//观者者主题对象 或者  被观察对象
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();
    //订阅该主题
    public void attach(Observer observer){
        list.add(observer);
    }
    //取消订阅
    public void detach(Observer observer){
        list.remove(observer);
    }

    //通知变动
    public void notifyChange(String state){
        for (Observer obs : list){
            obs.receiver(state);
        }
    }
}
