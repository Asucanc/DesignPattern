package com.kenshin.command;

/**
 *  电灯类拥有基本的开和关方法
 */
public class Light {
    public String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " Light is On");
    }

    public void off() {
        System.out.println(this.name + " Light is Off");
    }
}
