package com.zh.pattern.design.createMode.factory.factoryMethod;

import com.zh.pattern.design.createMode.factory.Operation;
import com.zh.pattern.design.createMode.factory.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
