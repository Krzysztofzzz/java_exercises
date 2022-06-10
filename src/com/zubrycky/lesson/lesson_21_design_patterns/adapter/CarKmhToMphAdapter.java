package com.zubrycky.lesson.lesson_21_design_patterns.adapter;

public class CarKmhToMphAdapter implements CarMph {

    private CarKmh carKmh;

    public CarKmhToMphAdapter(CarKmh carKmh) {
        this.carKmh = carKmh;
    }

    @Override
    public double getMaxSpeed() {
        return carKmh.getMaximumSpeed() / 1.6;
    }
}
