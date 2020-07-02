package com.zh.pattern.design.strctureMode.proxy;

public class UserDaoProxy implements IUserDao {
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("先划划水");
        userDao.save();
        System.out.println("完了，早知道不划水了！");
    }
}
