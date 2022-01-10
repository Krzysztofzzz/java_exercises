package com.zubrycky.excercise1;

import static com.zubrycky.utils.Utils.print;

public class Spider extends Animal{
    private static final int NUMBER_OF_LEGS = 8;

    public Spider() {
        super(NUMBER_OF_LEGS);
    }

    @Override
    void eat() {
        print("Spider ate a fly.");
    }
}
