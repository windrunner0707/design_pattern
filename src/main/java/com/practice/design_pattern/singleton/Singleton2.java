package com.practice.design_pattern.singleton;

/**
 * 单例模式
 *
 * 懒汉式:懒汉式的特点是延迟加载，比如配置文件，采用懒汉式的方法，顾名思义，懒汉么，很懒的，配置文件的实例直到用到的
 * 时候才会加载,存在线程安全的问题
 *
 * 饿汉试:饿汉式的特点是一开始就加载了，如果说懒汉式是“时间换空间”，那么饿汉式就是“空间换时间”，因为一开始就创建了实
 * 例，所以每次用到的之后直接返回就好了,不存在线程安全的问题
 *
 *
 * 本例为懒汉式
 */
public class Singleton2 {

    private Singleton2() {}  //私有构造函数

    private volatile static Singleton2 instance = null;  //单例对象

    //静态工厂方法
    public static Singleton2 getInstance() {
        if (instance == null) {      //双重检测机制
            synchronized (Singleton2.class){  //同步锁
                if (instance == null) {     //双重检测机制
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
