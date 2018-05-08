package com.practice.design_pattern.singleton;

/**
 * 静态内部类实现单例模式,无法防止用反射重复构建对象
 */
public class Singleton4 {
    private static class LazyHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4 (){}
    public static Singleton4 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
