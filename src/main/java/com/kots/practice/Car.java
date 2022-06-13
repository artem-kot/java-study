package com.kots.practice;

public class Car {
    String carBrand;
    CarEngine carEngine;
    CarWheels carWheels;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Car(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    public Car(CarWheels carWheels) {
        this.carWheels = carWheels;
    }

    public int getEnginePower() {
        return carEngine.getPower();
    }

    public int getWheelsCount(int frontWheels, int backWheels) {
        return carWheels.wheelsCount(frontWheels, backWheels);
    }
}
