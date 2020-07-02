package com.zh.pattern.design.createMode.prototype;

/*
*
*   抽象原型类（prototype）:它是声明克隆方法的接口，是所有具体原型类的公共父类，它可以是接口，抽象类甚至是一个具体的实现类。
*   优点
        当创建的对象实例较为复杂的时候，使用原型模式可以简化对象的创建过程！
        扩展性好，由于写原型模式的时候使用了抽象原型类，在客户端进行编程的时候可以将具体的原型类通过配置进行读取。
        可以使用深度克隆来保存对象的状态，使用原型模式进行复制。当你需要恢复到某一时刻就直接跳到。比如我们的idea种就有历史版本

    缺点
        需要为每一个类配备一个克隆方法，而且该克隆方法位于一个类的里面，当对已有的类经行改造时需要修改源代码，违背了开闭原则。
        在实现深克隆的时需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用的时候，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现相对麻烦。

    在以下情况可以考虑使用。
        1、创建对象成本比较大，比如初始化要很长时间的，占用太多CPU的，新对象可以通过复制已有的对象获得的，如果是相似的对象，
        则可以对其成员变量稍作修改。

        2、系统要保存对象状态的，而对象的状态改变很小。

        3、需要避免使用分层次的工厂类来创建分层次的对象，并且类的对象就只用一个或很少的组合状态！

* */
public class Client7 {
    public static void main(String[] args) {
        DeepWeekLog deepWeekLog1, deepWeekLog2;
        deepWeekLog1 = new DeepWeekLog();
        Attachment attachment = new Attachment();
        attachment.setName("111");
        deepWeekLog1.setAttachment(attachment);
        try {
            //深拷贝
            deepWeekLog2 = deepWeekLog1.deepclone();
            System.out.println("周报是否相同:" + (deepWeekLog1 == deepWeekLog2));
            System.out.println("附件是否相同"+(deepWeekLog1.getAttachment()==deepWeekLog2.getAttachment()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
