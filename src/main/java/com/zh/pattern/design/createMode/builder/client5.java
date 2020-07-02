package com.zh.pattern.design.createMode.builder;

/*
*   建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
*   1、  易于拓展。想要创建其他diy车型只要单独将这个类像car1那样建好，交给Director就可以了。无需修改原有代码。符合“开闭原则”。

    2、  代码解耦，模块化，方便维护。产品本身与创建过程解耦，可以使用相同的创建过程得到不同的产品。

    短板有：使用范围有限。建造者模式创造出来的产品，其组成部分基本相同。如果产品之间的差异较大，则不适用这个模式。
 */
public class client5 {
    public static void main(String[] args) {
        Director director = new Director();

        Builder audi = new Car1();
        Builder masha = new Car2();

        director.construct(audi);
        Car car1 = audi.getResult();
        car1.show();

        director.construct(masha);
        Car car2 = masha.getResult();
        car2.show();
    }
}
