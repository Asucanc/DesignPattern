package com.kenshin.decorator;

/**
 * 饮料类 超类 相当于类图中的Component
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
