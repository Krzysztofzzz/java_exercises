package com.zubrycky.lesson.lesson21_design_patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.zubrycky.utils.Utils.print;

public class Warriors implements MilitaryUnit {

    private String name = "Warriors " + UUID.randomUUID().toString();

    public List<Warrior> warriors = new ArrayList<>();

    public Warriors() {
    }

    public void addWarrior(Warrior warrior) {
        warriors.add(warrior);
    }

    public void removeWarrior(Warrior warrior) {
        warriors.remove(warrior);
    }

    @Override
    public void goUp() {
        print(name + " going up");

        for (Warrior w : warriors) {
            w.goUp();
        }
    }

    @Override
    public void goDown() {
        print(name + " going down");

        for (Warrior w : warriors) {
            w.goDown();
        }
    }

    @Override
    public void goRight() {
        print(name + " going right");

        for (Warrior w : warriors) {
            w.goRight();
        }
    }

    @Override
    public void goLeft() {
        print(name + " going left");

        for (Warrior w : warriors) {
            w.goLeft();
        }
    }
}
