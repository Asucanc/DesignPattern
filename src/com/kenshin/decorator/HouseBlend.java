package com.kenshin.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    /**
     * 一种黑咖啡，属于混合咖啡
     * @return
     */
    @Override
    public double cost() {
        return 0.80;
    }
}
