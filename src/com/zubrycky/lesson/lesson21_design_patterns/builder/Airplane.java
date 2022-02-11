package com.zubrycky.lesson.lesson21_design_patterns.builder;

public class Airplane {

    public static final int DEFAULT_NUMBER_OF_WINGS = 2;
    public static final String DEFAULT_COLOUR = "White";

    private int numberOfDoors;
    private int numberOfWings;
    private String colour;

    public Airplane(int numberOfDoors, int numberOfWings, String colour) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWings = numberOfWings;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfWings=" + numberOfWings +
                ", colour='" + colour + '\'' +
                '}';
    }
}
