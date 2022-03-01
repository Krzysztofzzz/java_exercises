package com.zubrycky.lesson.lesson21_design_patterns.strategy;

public class ChristmasPriceCalculator implements PriceCalculator{
    @Override
    public double calculatePrice(double price) {
        return price*0.7;
    }
}
