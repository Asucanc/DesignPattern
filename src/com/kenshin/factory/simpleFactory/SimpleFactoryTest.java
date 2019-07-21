package com.kenshin.factory.simpleFactory;

/**
 *  简单工厂与其说是一种设计模式，不如说是一种编程习惯
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaTypeEnum.CHEESE);
        store.orderPizza(PizzaTypeEnum.CLAM);
        store.orderPizza(PizzaTypeEnum.VEGGIE);
        store.orderPizza(PizzaTypeEnum.PEPPEROI);
    }

}
