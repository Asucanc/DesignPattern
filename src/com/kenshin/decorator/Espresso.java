package com.kenshin.decorator;

/**
 *  浓缩咖啡类
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    /**
     * 基本款浓缩咖啡价格为1.99$
     * @return
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
