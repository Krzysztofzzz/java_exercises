package com.zubrycky.exercise.exercise_1_inheritance;

import static com.zubrycky.utils.Utils.print;

public class Spider extends Animal {
    private static final int NUMBER_OF_LEGS = 8;

    public Spider() {
        super(NUMBER_OF_LEGS);
    }

    @Override
    void eat() {
        print("Spider ate a fly.");
    }
}
