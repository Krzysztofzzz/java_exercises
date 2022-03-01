package com.zubrycky.lesson.lesson21_design_patterns.adapter;

public class OldCar implements CarMph{

    @Override
    public double getMaxSpeed() {
        return 100;
    }
}
