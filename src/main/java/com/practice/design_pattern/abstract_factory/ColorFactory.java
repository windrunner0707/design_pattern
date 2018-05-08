package com.practice.design_pattern.abstract_factory;

public class ColorFactory extends AbstractFactory {
    @Override
    Colors getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
