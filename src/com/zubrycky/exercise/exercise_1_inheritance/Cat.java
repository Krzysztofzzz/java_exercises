package com.zubrycky.exercise.exercise_1_inheritance;

import static com.zubrycky.utils.Utils.print;

public class Cat extends Animal implements Pet {
    private String name;
    private static final int NUMBER_OF_LEGS = 4;

    public Cat(String name) {
        super(NUMBER_OF_LEGS);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    void eat() {
        print("Cat ate 50 grams of food.");
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
        print("Cat played for 2 minutes.");
    }
}
