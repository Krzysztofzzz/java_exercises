package com.zubrycky.lesson.lesson8;

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
