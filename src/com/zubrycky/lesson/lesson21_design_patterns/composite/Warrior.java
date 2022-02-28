package com.zubrycky.lesson.lesson21_design_patterns.composite;

import java.util.UUID;

import static com.zubrycky.utils.Utils.print;

public class Warrior implements MilitaryUnit{

    private String name = "Warrior " + UUID.randomUUID().toString();

    @Override
    public void goUp() {
        print(name + " going up");
    }

    @Override
    public void goDown() {
        print(name + " going down");

    }

    @Override
    public void goRight() {
        print(name + " going right");

    }

    @Override
    public void goLeft() {
        print(name + " going left");

    }
}
