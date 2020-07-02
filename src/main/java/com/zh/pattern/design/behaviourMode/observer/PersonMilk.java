package com.zh.pattern.design.behaviourMode.observer;

public class PersonMilk implements Observer {
    @Override
    public void receiver(String state) {
        System.out.println("牛奶工厂今天的营业状态：" + state);
    }
}
