package com.zh.pattern.design.createMode.factory.abstractFactory;

public class OrecelFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new OrecelUser();
    }
}
