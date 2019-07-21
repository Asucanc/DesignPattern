package com.kenshin.factory.simpleFactory;

public abstract class Pizza {
    String name;

    void prepare() {
        System.out.println("Preparing " + this.name + " Pizza");
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the Pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place the pizza in a official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }
}
