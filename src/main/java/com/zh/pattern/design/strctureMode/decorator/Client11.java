package com.zh.pattern.design.strctureMode.decorator;
/*
* 装饰器模式：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰器模式比生成子类更灵活。
* */
public class Client11 {
    static void print(Coffee c) {
        System.out.println("花费了: " + c.getCost());
        System.out.println("配料: " + c.getIngredients());
        System.out.println("============");
    }

    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        print(c);

        Coffee d = new CoffeeWithMilk(new CoffeeWithSugar(new SimpleCoffee()));
        print(d);

    }
}
