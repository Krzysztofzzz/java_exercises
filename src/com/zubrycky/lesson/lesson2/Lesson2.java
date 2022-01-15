package com.zubrycky.lesson.lesson2;

import static com.zubrycky.utils.Utils.print;

public class Lesson2 implements Runnable {

    @Override
    public void run() {
        int i1 = 5;
        int i2 = 5;
        // porównanie typów prostych
        print(i1 == i2);

        Integer i3 = 5;
        // dla i3 zachodzi auto unboxing i porównanie dwóch typów prostych
        print(i1 == i3);

        Integer i4 = 5;
        // zwraca true tylko i wyłącznie dlatego, że Int w zakresie <-127, 127> brany jest z puli
        print(i3 == i4);

        Integer i5 = 129;
        Integer i6 = 129;
        // zwraca false bo Int brany jest spoza zakresu puli więc są to dwa różne obiekty
        print(i5 == i6);

        Double d1 = 20.0;
        Double d2 = 20.0;
        // zwraca false bo są to dwa różne obiekty
        print(d1 == d2);

        // zachodzi tutaj: auto boxing, unboxing, boxing
        Integer i7 = boxingTest(i1);
    }

    private int boxingTest(Integer i) {
        print(i);
        return i;
    }
}
