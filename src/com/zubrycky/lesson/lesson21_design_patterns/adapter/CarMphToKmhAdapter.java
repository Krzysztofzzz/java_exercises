package com.zubrycky.lesson.lesson21_design_patterns.adapter;

public class CarMphToKmhAdapter implements CarKmh {

    private CarMph carMph;

    public CarMphToKmhAdapter(CarMph carMph) {
        this.carMph = carMph;
    }

    @Override
    public int getMaximumSpeed() {
        return (int) (carMph.getMaxSpeed()*1.6);
    }
}
