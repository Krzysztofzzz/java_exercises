package com.zubrycky.lesson.lesson_7_access_modifiers.c;

import com.zubrycky.lesson.lesson_7_access_modifiers.b.ProtectedTest;

import static com.zubrycky.utils.Utils.print;

public class ProtectedTest3 extends ProtectedTest {
    void test() {
        print(id);
    }
}
