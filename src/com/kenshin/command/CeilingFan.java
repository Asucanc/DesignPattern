package com.kenshin.command;

/**
 * 电风扇此处定义拥有四挡风速，每次撤销操作会回到上一档风速上去。
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(this.location + "'s CeilingFan current speed is high");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(this.location + "'s CeilingFan current speed is medium");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(this.location + "'s CeilingFan current speed is low");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(this.location + "'s CeilingFan current speed is off");
    }

    public int getSpeed() {
        return speed;
    }
}
