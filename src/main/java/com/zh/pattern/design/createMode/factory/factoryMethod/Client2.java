package com.zh.pattern.design.createMode.factory.factoryMethod;

import com.zh.pattern.design.createMode.factory.Operation;

//工厂方法模式，先声明产品，然后根据产品生成对应的产品实例
public class Client2 {
    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(6);
        oper.setNumberB(9);
        double result = oper.getResult();
        System.out.println("工厂方法模式：A + B = " + result);
    }
}
