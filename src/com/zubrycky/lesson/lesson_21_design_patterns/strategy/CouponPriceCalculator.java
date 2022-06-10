package com.zubrycky.lesson.lesson_21_design_patterns.strategy;

public class CouponPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice(double price) {
        return price * 0.8;
    }
}
