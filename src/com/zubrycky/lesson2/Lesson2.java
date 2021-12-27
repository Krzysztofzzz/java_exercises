package com.zubrycky.lesson2;

import static com.zubrycky.utils.Utils.print;

public class Lesson2 implements Runnable {

    @Override
    public void run() {
        int i1 = 5;
        int i2 = 5;
        print(i1 == i2);
        Integer i3 = 5;
        print(i1 == i3);
        Integer i4 = 5;
        print(i3 == i4);
        Integer i5 = 129;
        Integer i6 = 129;
        print(i5 == i6);

        Double d1 = 20.0;
        Double d2 = 20.0;
        print(d1 == d2);

        Integer i7 = boxingTest(i1);
    }

    private int boxingTest(Integer i){
        print(i);
        return i;
    }
}
