package com.zubrycky.lesson.lesson8;

import java.util.Random;

public class MathUtils {

    public static final double PI = 3.14;
    public Random random = new Random();

    public int randomInt() {
        return random.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    private static int abs(int a) {
        return (a < 0) ? -a : a;
    }
}
