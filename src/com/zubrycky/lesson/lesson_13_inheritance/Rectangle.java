package com.zubrycky.lesson.lesson_13_inheritance;

public class Rectangle extends Shape {

    private static final int NUMBER_OF_SIDES = 4;

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(NUMBER_OF_SIDES);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }

    @Override
    public void resize(double x) {
        width *= x;
        height *= x;
    }
}
