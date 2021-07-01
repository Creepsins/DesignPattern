package com.zh.pattern.design.strctureMode.proxy;

public class UserDaoProxy1 implements IUserDao {
    private IUserDao userDao;

    public UserDaoProxy1(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开始上班");
        userDao.save();
        System.out.println("下班下班");
    }
}
