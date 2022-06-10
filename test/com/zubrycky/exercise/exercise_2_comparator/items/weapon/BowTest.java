package com.zubrycky.exercise.exercise_2_comparator.items.weapon;

import org.junit.Test;

import static com.zubrycky.utils.Utils.print;

public class BowTest {

    @Test
    public void testingBowDurabilitiOutputWhenPolishAndUseMethodIsUsed() {
        Bow bow = new Bow("Bow", 100, 100, 1000, 10);

        print(bow);
        bow.use();
        print(bow);
        bow.polish();
        print(bow);
        bow.polish();
        print(bow);

    }
}