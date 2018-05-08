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
 * 本例为饿汉式
 */
public class Singleton1 {

    //设立静态变量，直接创建实例
    private static Singleton1 mySingleton = new Singleton1();

    private Singleton1(){
        //私有化构造函数
        System.out.println("-->饿汉式单例模式开始调用构造函数");
    }

    //开放一个公有方法，判断是否已经存在实例，有返回，没有新建一个在返回
    public static Singleton1 getInstance(){
        System.out.println("-->饿汉式单例模式开始调用公有方法返回实例");
        return mySingleton;
    }
}
