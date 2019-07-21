package com.kenshin.factory.simpleFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory simpleFactory) {
        this.factory = simpleFactory;
    }

    public Pizza orderPizza(PizzaTypeEnum type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
