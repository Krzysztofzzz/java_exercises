package com.zubrycky.exercise.exercise_1_inheritance;

import static com.zubrycky.utils.Utils.print;

public class Fish extends Animal implements Pet {
    private static final int NUMBER_OF_LEGS = 0;

    private String name;

    public Fish(String name) {
        super(NUMBER_OF_LEGS);
        this.name = name;
    }

    public Fish() {
        this("");
    }

    @Override
    public void walk() {
        print("Fish don't walk, they swim. Number of legs: " + NUMBER_OF_LEGS);
    }

    @Override
    void eat() {
        print("Fish ate a worm.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        print("Fish swims a circle.");
    }
}
