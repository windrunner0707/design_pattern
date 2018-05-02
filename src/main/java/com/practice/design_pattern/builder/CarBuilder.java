package com.practice.design_pattern.builder;

public interface CarBuilder {
    Engine buildEngine();

    Tyre buildTyre();

    Seat buildSeat();
}
class MyCarBuilder implements CarBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine();
    }
    @Override
    public Tyre buildTyre() {
        return new Tyre();
    }
    @Override
    public Seat buildSeat() {
        return new Seat();
    }

}