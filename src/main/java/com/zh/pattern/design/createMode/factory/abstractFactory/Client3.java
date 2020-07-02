package com.zh.pattern.design.createMode.factory.abstractFactory;

 /*
    其实本质还是工厂方法模式，但是当涉及到多张表的时候，就变成了抽象工厂模式，
    比如在添加一张用户部门表的操作时，就需要增加IDepartment类、MysqlDepartment类、OrecelDepartment类,
    并且修改MysqlFactory类和OrecelFactory类。
    还有一种结合使用简单工厂方法的例子，见DataAcess类

    抽象工厂和工厂方法阿德区别：
        如果工厂的产品全部属于同一个等级结构，则属于工厂方法模式
        如果工厂的产品来自多个等级结构，则属于抽象工厂模式（在本例中，user和department就不属于同一个等级结构）
  */

public class Client3 {
    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new MysqlFactory();
        IUser mysqlUser = factory.createUser();

        mysqlUser.insert(user);
        mysqlUser.getUser(1);
    }
}
