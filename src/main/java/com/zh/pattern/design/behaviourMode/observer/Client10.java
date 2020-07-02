package com.zh.pattern.design.behaviourMode.observer;

/*
*   观察者模式：在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。
*
*   Subject 观察主题对象，也可以叫被观察或者被订阅对象
    Observer 观察者或者订阅者对象，当Subject有变动，就会通知到每一个Observer
* */
public class Client10 {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();

        PersonMilk personMilk1 = new PersonMilk();
        PersonMilk personMilk2 = new PersonMilk();

        //加入观察者
        milkFactory.attach(personMilk1);
        milkFactory.attach(personMilk2);

        //改变状态，并通知订阅者
        milkFactory.setState("下雨，今天不营业");
        milkFactory.change(milkFactory.getState());
    }
}
