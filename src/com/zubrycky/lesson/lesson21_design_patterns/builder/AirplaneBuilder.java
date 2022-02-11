package com.zubrycky.lesson.lesson21_design_patterns.builder;

public class AirplaneBuilder {

    private int numberOfDoors = 1;
    private int numberOfWings = 2;
    private String colour = "White";

    public AirplaneBuilder() {
    }

    public Airplane build() {
        Airplane airplane = new Airplane(numberOfDoors, numberOfWings, colour);
        return airplane;
    }

    public AirplaneBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public AirplaneBuilder setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
        return this;

    }

    public AirplaneBuilder setColour(String colour) {
        this.colour = colour;
        return this;

    }
}
