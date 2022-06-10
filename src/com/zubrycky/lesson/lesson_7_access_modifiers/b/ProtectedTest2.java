package com.zubrycky.lesson.lesson_7_access_modifiers.b;

import static com.zubrycky.utils.Utils.print;

public class ProtectedTest2 {
    void test() {
        ProtectedTest protectedTest = new ProtectedTest();
        print(protectedTest.id);
    }
}
