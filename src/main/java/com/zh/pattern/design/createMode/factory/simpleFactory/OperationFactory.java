package com.zh.pattern.design.createMode.factory.simpleFactory;

import com.zh.pattern.design.createMode.factory.Operation;
import com.zh.pattern.design.createMode.factory.OperationAdd;
import com.zh.pattern.design.createMode.factory.OperationDiv;

public class OperationFactory {
    public static Operation createOperation(String operation){
        Operation opera = null;
        switch (operation){
            case "+" :
                opera = new OperationAdd();
                break;
            case "/" :
                opera = new OperationDiv();
                break;
        }
        return opera;
    }
}
