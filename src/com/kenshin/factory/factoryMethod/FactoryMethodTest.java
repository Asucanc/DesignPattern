package com.kenshin.factory.factoryMethod;

/**
 *  工厂方法设置模式：
 *      定义：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法将对象的实例化推迟的子类。
 *      意义：将超类的代码与子类的代码进行了解耦。
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("I ordered a " + pizza.getName());

        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("kenshin ordered a " + pizza1.getName());
    }
}
