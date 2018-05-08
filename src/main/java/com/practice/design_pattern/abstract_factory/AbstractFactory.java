package com.practice.design_pattern.abstract_factory;



public abstract class AbstractFactory {
    abstract Colors getColor(String color);
    abstract Shape getShape(String shape);
}
