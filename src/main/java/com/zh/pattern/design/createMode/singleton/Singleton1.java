package com.zh.pattern.design.createMode.singleton;

/*
 *  单例模式1--懒汉式
    好处-- 延时加载，节省内存空间
    坏处 -- 线程不安全
 */

public class Singleton1 {
    private static Singleton1 singleTon1;
    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if (singleTon1 == null){
            singleTon1 =  new Singleton1();
        }

        return singleTon1;
    }
}
