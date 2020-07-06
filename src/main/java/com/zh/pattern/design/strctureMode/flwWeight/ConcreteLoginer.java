package com.zh.pattern.design.strctureMode.flwWeight;

public class ConcreteLoginer extends Loginer {
    // 登陆者凭证
    private String loginerKey = "";

    public ConcreteLoginer(String loginerKey) {
        this.loginerKey = loginerKey;
    }

    @Override
    public void login(User user) {
        System.out.println("登陆者凭证：" + this.loginerKey+",用户名：" + user.getUsername() + ",密码：" + user.getPassword());
    }
}
