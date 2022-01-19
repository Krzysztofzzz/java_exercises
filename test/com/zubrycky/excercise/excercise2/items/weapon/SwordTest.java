package com.zubrycky.excercise.excercise2.items.weapon;

import org.junit.Test;

import static com.zubrycky.utils.Utils.print;
import static org.junit.Assert.*;

public class SwordTest {
    @Test
    public void testingPolishAndUseMethodOnSword() {
        Sword sword = new Sword("Excalibur", 100, 100, 3000, 15);

        print(sword);
        sword.use();
        print(sword);

        sword.polish();
        print(sword);
        sword.use();

        for (int i = 0; i < 550; i++)
            sword.polish();
        print(sword);

    }
}