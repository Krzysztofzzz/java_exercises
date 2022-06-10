package com.zubrycky.exercise.exercise_1_inheritance;

import static com.zubrycky.utils.Utils.print;

public abstract class Animal {
    protected int numberOfLegs;

    protected Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    abstract void eat();

    public void walk() {
        print("Animal moved its " + numberOfLegs + " legs.");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


}
