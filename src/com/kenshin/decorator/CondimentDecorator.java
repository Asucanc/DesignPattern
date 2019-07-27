package com.kenshin.decorator;

/**
 * 调料超类： 此处需要继承饮料基类，因为在装饰器模式中，只有两者的类型相同才能替换
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
