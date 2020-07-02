package com.zh.pattern.design.behaviourMode.template;

public abstract class HummerModel {
    //基本方法
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();

    //模板方法
    public void run(){
        this.start();
        this.engineBoom();
        if (this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    //钩子函数
    Boolean isAlarm(){
        return true;
    }
}
