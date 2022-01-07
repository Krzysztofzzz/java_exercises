package com.zubrycky.lesson13;

public abstract class Shape {

    private int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double getArea();

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
