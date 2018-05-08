package com.practice.design_pattern.abstract_factory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Colors getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Square();
        }
        return null;
    }
}
