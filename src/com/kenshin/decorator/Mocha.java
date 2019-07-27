package com.kenshin.decorator;

/**
 *  摩卡  给某种饮料添加摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 饮料中加入摩卡 价格增加0.20$
     * @return
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
