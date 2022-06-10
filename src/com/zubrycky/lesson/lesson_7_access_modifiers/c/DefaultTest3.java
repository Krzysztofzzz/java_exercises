package com.zubrycky.lesson.lesson_7_access_modifiers.c;

import com.zubrycky.lesson.lesson_7_access_modifiers.a.DefaultTest;

public class DefaultTest3 extends DefaultTest {
    void test() {
        //Nawet jeżeli dziedziczymy po tej klasie, nie ma dostępu do pola default
        //print(name);
    }
}
