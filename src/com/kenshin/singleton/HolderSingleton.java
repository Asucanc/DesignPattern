package com.kenshin.singleton;

/**
 * 静态内部类实现单例：
 * 原理： JVM在初始化的时候会保证线程安全：
 * Singleton实例的创建过程在Java程序编译时期收集至<clinit>()方法中，该方法又是同步方法，同步方法可以保证内存的可见性、JVM指令的顺序性和原子性
 * 利用类加载机制，当引用一个类的静态成员时会导致这个类立即初始化。
 */
public class HolderSingleton {

    private HolderSingleton() {

    }

    private static class SingletonHolder {
        public static HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
