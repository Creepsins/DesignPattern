package com.zh.pattern.design.createMode.factory.simpleFactory;

import com.zh.pattern.design.createMode.factory.Operation;

//简单工厂方法模式
public class Client1 {
    public static void main(String[] args) {
        Operation opera = OperationFactory.createOperation("+");
        opera.setNumberA(3);
        opera.setNumberB(9);
        double result = opera.getResult();
        System.out.println("简单工厂模式：A + B = " + result);
    }
}
