package com.kenshin.decorator;

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 2.30;
    }
}
