package com.kenshin.singleton;

/**
 * 双重检查加锁实现单例模式
 * 利用volatile语义和Synchronized
 * volatile 语义在 JDK 1.4之后得到增强，具体是在多线程环境下禁止内初始化步骤的重排序，此方法适用于JDK 1.4之后
 */
public class DoubleCheckSingleton {
    /**
     * 此处必须使用volatile修饰，否则会在一些情况下出现错误。
     */
    private volatile static DoubleCheckSingleton uniqueInstance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
