package com.zh.pattern.design.behaviourMode.template;

public class Hummer1 extends HummerModel {
    private boolean alarmFlag = false;
    @Override
    public void start() {
        System.out.println("悍马H1发动......");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止......");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛......");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的......");
    }

    @Override
    Boolean isAlarm() {
        return super.isAlarm();
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
