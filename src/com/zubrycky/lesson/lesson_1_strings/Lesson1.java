package com.zubrycky.lesson.lesson_1_strings;

import static com.zubrycky.utils.Utils.print;

public class Lesson1 implements Runnable {

    @Override
    public void run() {
        String s1 = "ala ma kota";
        String s2 = "ala ma kota";
        // s1 i s2 wsakzują na ten sam obiekt w puli Stringów -> true
        print("s1 == s2: " + (s1 == s2));

        String s3 = "ala ma kota";
        String s4 = "ala ma kota";
        // "new String" wymusza stworznie String'a poza pulą
        // s3 i s4 wskazują na różne obiekty -> false
        print("s3 == s4: " + (s3 == s4));

        // zapamiętać: stringi zawsze porównujemy metodą equals
        print("s1.equals(s2): " + s1.equals(s2));
        print("s4.equals(s2): " + s4.equals(s2));
    }


}
