package com.zubrycky.lesson.lesson_13_inheritance;

public class Circle extends Shape {

    private static final int NUMBER_OF_SIDES = 0;

    private double radius;

    public Circle(double radius) {
        super(NUMBER_OF_SIDES);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public void resize(double x) {
        radius *= x;
    }
}
