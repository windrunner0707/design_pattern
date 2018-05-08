package com.practice.design_pattern.abstract_factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
