package com.zh.pattern.design.behaviourMode.strategy;

public class IntermediateMemberStrategy implements MemberStrategy{
    @Override
    public double cacuPrice(double bookPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return bookPrice * 0.9;
    }
}
