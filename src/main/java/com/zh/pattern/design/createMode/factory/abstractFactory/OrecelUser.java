package com.zh.pattern.design.createMode.factory.abstractFactory;


public class OrecelUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在Orecel数据库中执行了'插入'操作！");
    }

    @Override
    public User getUser(int userId) {
        User user = new User();
        user.setUserId(userId);
        System.out.println("在Orecel数据库中查找ID未为:" + userId + " 的用户");
        return user;
    }
}
