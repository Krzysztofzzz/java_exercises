package com.zubrycky.lesson13;

public class Triangle extends Shape {

    private static final int NUMBER_OF_SIDES = 3;

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(NUMBER_OF_SIDES);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() throws PerimeterNotSupportedException {
        throw new PerimeterNotSupportedException();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "} " + super.toString();
    }

    @Override
    public void resize(double x) {
        base *= x;
        height *= x;
    }
}
