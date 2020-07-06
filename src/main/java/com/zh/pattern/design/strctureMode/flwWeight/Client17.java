package com.zh.pattern.design.strctureMode.flwWeight;


/*
*   享元模式：享元模式有点类似于单例模式，都是只生成一个对象被共享使用。享元模式主要目的就是让多个对象实现共享，
*   减少不必要的内存消耗，将多个对同一对象的访问集中起来，不必为每个访问者创建一个单独的对象，以此来降低内存的消耗。
*
*   Flyweight（抽象享元类）：通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公共的方法，这些方法
*   可以向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部状态）。

　　ConcreteFlyweight（具体享元类）：它实现了抽象享元类，其实例称为享元对象；在具体享元类中为内部状态提供了存储空间。
    通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。

　　UnsharedConcreteFlyweight（非共享具体享元类）：并不是所有的抽象享元类的子类都需要被共享，不能被共享的子类可设计
    为非共享具体享元类；当需要一个非共享具体享元类的对象时可以直接通过实例化创建。

　　FlyweightFactory（享元工厂类）：享元工厂类用于创建并管理享元对象，它针对抽象享元类编程，将各种类型的具体享元对象
    存储在一个享元池中，享元池一般设计为一个存储“键值对”的集合（也可以是其他类型的集合），可以结合工厂模式进行设计；
    当用户请求一个具体享元对象时，享元工厂提供一个存储在享元池中已创建的实例或者创建一个新的实例（如果不存在的话），
    返回新创建的实例并将其存储在享元池中。
* */
public class Client17 {
    public static void main(String[] args) {
        ConcreteLoginer concreteLoginer_1 = FlwWeightFactory.getFlyWeight("csdn");
        concreteLoginer_1.login(new User("张三", "123456"));

        ConcreteLoginer concreteLoginer_2 = FlwWeightFactory.getFlyWeight("csdn");
        concreteLoginer_2.login(new User("张三", "123456"));

        System.out.println("是否是同一个对象：" + ((concreteLoginer_1 == concreteLoginer_2)));

        ConcreteLoginer concreteLoginer_3 = FlwWeightFactory.getFlyWeight("bogo");
        concreteLoginer_3.login(new User("王五", "123123"));

        ConcreteLoginer concreteLoginer_4 = FlwWeightFactory.getFlyWeight("bogo");
        concreteLoginer_4.login(new User("王五", "123123"));

        System.out.println("是否是同一个对象：" + ((concreteLoginer_3 == concreteLoginer_4)));
    }
}
