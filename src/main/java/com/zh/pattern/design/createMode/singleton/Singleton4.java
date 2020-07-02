package com.zh.pattern.design.createMode.singleton;
/*
*   单例模式4 -- 静态内部类
    优点：线程安全，调用效率高，同时实现了延时加载
* */
public class Singleton4 {
    private Singleton4(){

    }
    //类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，
    // 而且只有被调用到才会装载，从而实现了延迟加载
    private static class SingletonClassInstace{
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonClassInstace.instance;
    }
}
