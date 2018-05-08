package com.practice.design_pattern.factory;

public class ShapeFatory {

    public Shape getShape(String shapeType){
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
