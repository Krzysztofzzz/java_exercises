package com.zubrycky.excercise.excercise2.items.weapon;

import org.junit.Test;

import static com.zubrycky.utils.Utils.print;
import static org.junit.Assert.*;

public class BowTest {

    @Test
    public void testingBowDurabilitiOutputWhenPolishAndUseMethodIsUsed() {
        Bow bow = new Bow("Bow",100,100,1000,10);

        print(bow);
        bow.use();
        print(bow);
        bow.polish();
        print(bow);
        bow.polish();
        print(bow);

    }
}