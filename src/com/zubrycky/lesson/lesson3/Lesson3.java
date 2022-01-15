package com.zubrycky.lesson.lesson3;

import static com.zubrycky.utils.Utils.print;

public class Lesson3 implements Runnable {

    @Override
    public void run() {
        Person person1 = new Person("Krzys", 1994);
        Person person2 = new Person("null", 1994);

        print(person1 == person2);
        print(person1.equals(person2));

        print(person1);

    }

}
