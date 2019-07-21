package com.kenshin.factory.simpleFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaTypeEnum type) {
        Pizza pizza = null;
        switch (type){
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case PEPPEROI:
                pizza = new PepperoniPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
