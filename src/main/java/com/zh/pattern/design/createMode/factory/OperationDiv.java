package com.zh.pattern.design.createMode.factory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        try {
            result = getNumberA() / getNumberB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
