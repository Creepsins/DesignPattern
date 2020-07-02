package com.zh.pattern.design.createMode.singleton;

/*
*   单例模式5 -- 双重检查锁式
    优点 -- 将同步内容下放到if内部，提高了执行效率，不必每次获取对象时都进行同步，只有第一次才同步，创建了以后就没必要了
    缺点 -- 由于编译器优化原因和JVM底层内部模型的原因，偶尔会出问题，不建议使用
* */
public class Singleton5 {
    //实例必须有 volatile 关键字修饰，其保证初始化完全。
    private volatile static Singleton5 singleton5 = null;
    private Singleton5 (){

    }

    public static Singleton5 getInstance(){
        if (singleton5 == null){
            synchronized (Singleton5.class){
                if (singleton5 == null){
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }
}
