package com.practice.design_pattern.reflect;

public class ReflectServiceImpl2 {
    private String name;

    public ReflectServiceImpl2(String name){
        this.name = name;
    }

    public void sayHello(String name){
        System.err.print("Hello " + name);
    }

    @Override
    public String toString() {
        return "ReflectServiceImpl2{" +
                "name='" + name + '\'' +
                '}';
    }
}
