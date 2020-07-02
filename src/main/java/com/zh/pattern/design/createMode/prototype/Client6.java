package com.zh.pattern.design.createMode.prototype;
/*
*   原型模式：使用原型实例指定待创建对象的类型，并且通过复制这个原型来创建新的对象！
*
*   浅克隆：在浅克隆中，如果原型对象的成员变量是值类型，那么就直接复制，
        如果是复杂的类型，（枚举，String,对象）就只复制对应的内存地址。

    深克隆：在引用类型的类中也实现了Cloneabel接口，重写clone方法，是clone的嵌套，复制后的对象与原对象之间完全不会影响。


* */
public class Client6 {
    public static void main(String[] args) {
        WeekLog weekLog1, weekLog2;
        weekLog1 = new WeekLog();
        Attachment attachment = new Attachment();
        attachment.setName("111");
        weekLog1.setAttachment(attachment);
        try {
            //浅拷贝
            weekLog2 = weekLog1.clone();
            System.out.println("周报是否相同:" + (weekLog1 == weekLog2));
            System.out.println("附件是否相同"+(weekLog1.getAttachment()==weekLog2.getAttachment()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
