package com.zubrycky.excercise.excercise2.items.weapon;

import org.junit.Test;

import static com.zubrycky.utils.Utils.print;
import static org.junit.Assert.*;

public class WeaponTest {
    @Test
    public void testingWeaponWhenItBreaks() {
        Bow bow = new Bow("Bow",100,100,1000,10);

        print(bow);

        for (int i = 0;i<2200;i++)
            bow.use();

        print(bow);

        bow.polish();
        bow.polish();

        print(bow);

        bow.use();
        bow.use();
    }

    @Test
    public void testingToStringOverride() {
        Bow bow1 = new Bow("Bow1", 100, 100, 3000, 5);
        Bow bow2 = new Bow("Z", 200, 100, 1000, 5);
        Bow bow3 = new Bow("A", 300, 100, 1000, 5);
        Bow bow4 = new Bow("A", 300, 100, 1000, 5);

        print(bow1);
        print(bow2);
    }
}