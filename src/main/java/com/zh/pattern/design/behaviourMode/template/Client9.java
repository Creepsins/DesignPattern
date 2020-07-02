package com.zh.pattern.design.behaviourMode.template;

/*
 * 模板方法：定义一个操作中的算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 *
 * 还可以加入钩子函数，来做特别控制
 * */
public class Client9 {
    public static void main(String[] args) {
        Hummer1 hummer1 = new Hummer1();
        //H1型的需要喇叭响
        hummer1.setAlarm(true);
        hummer1.run();

        Hummer2 hummer2 = new Hummer2();
        hummer2.run();
    }
}
