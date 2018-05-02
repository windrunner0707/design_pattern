package com.practice.design_pattern.builder;

public interface CarDirector {
    Car directCar();
}
class MyCarDirector implements CarDirector {

    private CarBuilder carBuilder;

    public MyCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    @Override
    public Car directCar() {
        Engine engine = this.carBuilder.buildEngine();
        Tyre tyre = this.carBuilder.buildTyre();
        Seat seat = this.carBuilder.buildSeat();
        // 装配
        Car car = new Car();
        car.setEngine(engine);
        car.setTyre(tyre);
        car.setSeat(seat);

        return car;
    }

}
