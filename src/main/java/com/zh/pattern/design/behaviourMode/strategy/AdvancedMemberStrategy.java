package com.zh.pattern.design.behaviourMode.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double cacuPrice(double bookPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return bookPrice * 0.8;
    }
}
