package com.zh.pattern.design.createMode.singleton;

/*
*   单例模式3 -- 枚举
    优点 -- 类初始化时就加载这个对象，线程安全.方法没有同步，调用效率高。避免了反射和反序列化的漏洞
    缺点 -- 没有延时加载
* */
public enum Singleton3 {
    INSTANCE;

    public void singletonOperation(){

    }
}
