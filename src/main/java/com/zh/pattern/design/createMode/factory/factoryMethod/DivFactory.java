package com.zh.pattern.design.createMode.factory.factoryMethod;

import com.zh.pattern.design.createMode.factory.Operation;
import com.zh.pattern.design.createMode.factory.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
