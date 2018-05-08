package com.practice.design_pattern.singleton;

/**
 * 使用枚举实现单例模式,可以防止反射构建对象,保证线程安全
 * 缺点:并非使用懒加载,单例对象在枚举类被加载时进行初始化
 */
public enum Singleton3 {
    INSTANCE;
}
