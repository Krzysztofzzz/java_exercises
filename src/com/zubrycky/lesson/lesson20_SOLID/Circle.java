package com.zubrycky.lesson.lesson20_SOLID;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }
}
