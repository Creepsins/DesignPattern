package com.zh.pattern.design.createMode.factory.abstractFactory;

public class MysqlFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }
}
