package com.zh.pattern.design.behaviourMode.strategy;

public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice){
        return this.memberStrategy.cacuPrice(bookPrice);
    }
}
