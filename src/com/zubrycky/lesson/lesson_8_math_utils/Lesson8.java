package com.zubrycky.lesson.lesson_8_math_utils;

import java.util.Random;

public class Lesson8 implements Runnable {
    @Override
    public void run() {
        double pi = MathUtils.PI;
        MathUtils mathUtils = new MathUtils();
        Random random = mathUtils.random;
        double pi1 = MathUtils.PI;
        MathUtils.add(1, 2);

    }
}
