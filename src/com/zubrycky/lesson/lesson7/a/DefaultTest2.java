package com.zubrycky.lesson.lesson7.a;

import static com.zubrycky.utils.Utils.print;

public class DefaultTest2 {
    void test() {
        DefaultTest defaultTest = new DefaultTest();
        //Możemy odczytać pole name ponieważ jesteśmy w tym samym package
        print(defaultTest.name);
    }
}
