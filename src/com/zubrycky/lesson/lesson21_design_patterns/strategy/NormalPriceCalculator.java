package com.zubrycky.lesson.lesson21_design_patterns.strategy;

public class NormalPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
