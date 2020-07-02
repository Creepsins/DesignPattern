package com.zh.pattern.design.strctureMode.proxy;

/*
*   代理模式：为其他对象提供一种代理以控制对这个对象的访问。代理对象起到中介作用，可去掉功能服务或增加额外的服务。
*       一般分为：静态代理、动态代理（JDK代理）、Cglib代理
*
*   代理模式的关键点是:代理对象与目标对象.代理对象是对目标对象的扩展,并会调用目标对象
*
*   静态代理：
*   优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.
    缺点: 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
* */
public class Client12 {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
