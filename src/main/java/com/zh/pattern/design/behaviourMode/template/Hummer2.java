package com.zh.pattern.design.behaviourMode.template;

public class Hummer2 extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动......");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停止......");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛......");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的......");
    }

    @Override
    Boolean isAlarm() {
        return false;
    }
}
