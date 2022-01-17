package com.zubrycky.lesson.lesson18_vararg_labels;

import static com.zubrycky.utils.Utils.print;

public class Lesson18 implements Runnable {
    @Override
    public void run() {
/*        test("ala");
        test("ala", "ma");
        test("ala", "ma", "kota");
        test();
        test2(1, "fiut");
        test2(1, "fiut", "kdsjnfs", "dfssd");*/

        //loopTest();

        loopTest2();
    }

    public void test(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            print(strings[i]);
        }

    }

    void test2(Integer i, String label, String... strings) {

    }

    void loopTest() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            for (int j = 0; j < 10; j++) {
                if (j == 1) {
                    continue;
                }
                print("i = " + i + ", j = " + j);
            }
        }
    }

    void loopTest2() {
        outerLoop:
        for (int i = 0; i < 6; i++) {
            //innerLoop:
            for (int j = 0; j < 6; j++) {
                if (i != 0 && j != 0 && i % 2 == 0 && j % 2 == 0) {

                    continue outerLoop;
                }
                print("i = " + i + ", j = " + j);
            }


        }
    }

}
