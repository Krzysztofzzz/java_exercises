package com.zubrycky.lesson.lesson21_design_patterns.adapter;

public class NewCar implements CarKmh{
    @Override
    public int getMaximumSpeed() {
        return 300;
    }
}
