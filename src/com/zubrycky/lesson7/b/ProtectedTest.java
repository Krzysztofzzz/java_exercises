package com.zubrycky.lesson7.b;

import com.zubrycky.lesson7.a.DefaultTest;

public class ProtectedTest {
    void test(){
        DefaultTest defaultTest = new DefaultTest();
        //Nie możemy odczytać pola name ponieważ jesteśmy  w innym package
        //defaultTest.name;
    }
}
