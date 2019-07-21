package com.kenshin.singleton;

/**
 * lazy singleton, implement by intelliJ IDEA
 */
public class HungerSingleton {
    private static HungerSingleton ourInstance = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return ourInstance;
    }

    private HungerSingleton() {
    }
}
