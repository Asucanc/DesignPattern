package com.kenshin.decorator;

/**
 * 奶泡, 调料类
 */
public class Whip extends Beverage{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
