package com.zh.pattern.design.createMode.factory;

public abstract class Operation {
    private double numberA;
    private double numberB;

    //得到结果
    public abstract double getResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }


}
