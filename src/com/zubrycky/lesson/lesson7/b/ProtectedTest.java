package com.zubrycky.lesson.lesson7.b;

import com.zubrycky.lesson.lesson7.a.DefaultTest;

public class ProtectedTest {

    protected String id = "1231";

    void test() {
        DefaultTest defaultTest = new DefaultTest();
        //Nie możemy odczytać pola name ponieważ jesteśmy  w innym package
        //defaultTest.name;
    }

}