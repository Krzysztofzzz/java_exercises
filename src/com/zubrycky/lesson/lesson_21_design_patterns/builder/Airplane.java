package com.zubrycky.lesson.lesson_21_design_patterns.builder;

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

    public static class Builder {

        private int numberOfDoors = 1;
        private int numberOfWings = 2;
        private String colour = "White";

        public Builder() {
        }

        public Airplane build() {
            return new Airplane(numberOfDoors, numberOfWings, colour);
        }

        public Builder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder setNumberOfWings(int numberOfWings) {
            this.numberOfWings = numberOfWings;
            return this;

        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }
    }
}
