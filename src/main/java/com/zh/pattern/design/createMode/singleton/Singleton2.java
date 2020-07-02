package com.zh.pattern.design.createMode.singleton;

/*
    单例模式2 -- 饿汉式
    优点 -- 线程安全
    缺点 -- 没有延时加载，类加载之后会占用内存空间
*/
public class Singleton2 {
    private static final Singleton2 singleton2 = new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        return singleton2;
    }
}
