package com.zubrycky.lesson.lesson13;

public abstract class Shape implements Resizable {

    private int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter() throws PerimeterNotSupportedException;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numberOfSides=" + numberOfSides +
                '}';
    }
}
