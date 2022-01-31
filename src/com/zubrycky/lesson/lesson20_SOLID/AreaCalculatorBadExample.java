package com.zubrycky.lesson.lesson20_SOLID;

public class AreaCalculatorBadExample {

    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

}
