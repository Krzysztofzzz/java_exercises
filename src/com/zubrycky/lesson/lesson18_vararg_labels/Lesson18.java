package com.zubrycky.lesson.lesson18_vararg_labels;

import static com.zubrycky.utils.Utils.print;

public class Lesson18 implements Runnable {
    @Override
    public void run() {
        test("ala");
        test("ala", "ma");
        test("ala", "ma", "kota");
        test();
        test2(1,"fiut");
        test2(1,"fiut","kdsjnfs","dfssd");
    }

    public void test(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            print(strings[i]);
        }

    }
    void test2(Integer i, String label, String... strings){

    }

}
