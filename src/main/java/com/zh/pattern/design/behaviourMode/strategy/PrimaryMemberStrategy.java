package com.zh.pattern.design.behaviourMode.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double cacuPrice(double bookPrice) {
        System.out.println("对于初级会员的没有折扣");
        return bookPrice;
    }
}
