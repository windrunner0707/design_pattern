package com.practice.design_pattern.builder;

public class Client {
    public static void main(String[] args) {

        CarDirector director = new MyCarDirector(new MyCarBuilder());

        Car car = director.directCar();

        car.intro();

    }
}