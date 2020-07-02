package com.zh.pattern.design.createMode.factory.abstractFactory;

public interface IUser {
    void insert(User user);
    User getUser(int userId);
}
