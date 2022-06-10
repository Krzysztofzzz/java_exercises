package com.zubrycky.lesson.lesson_21_design_patterns.adapter;

public class NewCar implements CarKmh {
    @Override
    public int getMaximumSpeed() {
        return 300;
    }
}
