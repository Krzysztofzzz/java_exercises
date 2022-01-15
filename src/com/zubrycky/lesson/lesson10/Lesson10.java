package com.zubrycky.lesson.lesson10;

import static com.zubrycky.utils.Utils.print;

public class Lesson10 implements Runnable {
    @Override
    public void run() {
        int initial = 10;
        int i = initial;
        int limit = 10;
        while (i < limit) {
            print("i is equal to " + i);
            i++;
        }
        i = initial;
        print("");
        do {
            print("i is equal to " + i);
            i++;
        } while (i < limit);

    }
}
