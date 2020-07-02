package com.zh.pattern.design.strctureMode.adapter;

/*
*   适配器模式：将一个类的接口转换成客户期望的另一个接口类型,适配器的原则是让原本不兼容的类可以合作无间
*
*   适配器模式总共有三种类型:类适配器,对象适配器,接口适配器。
    类适配器:是通过类的继承的方式实现的
    对象适配器:是通过对象的组合而实现的
    接口适配器:是通过接口的实现和成为抽象类实现的
* */
public class Client8 {
    public static void main(String[] args) {
        Player kebi = new Forwoard("kebi");
        kebi.attack();

        Player yaoming = new Adapter("姚明");
        yaoming.defense();
    }
}
