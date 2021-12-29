package com.zubrycky.lesson4;

import com.zubrycky.lesson3.Person;

import static com.zubrycky.utils.Utils.print;

public class Lesson4 implements Runnable{
    @Override
    public void run() {
        UniqueObjectList uniqueObjectList = new UniqueObjectList();
        Person person1 = new Person("Krzysztofik", 1994);
        Person person4 = new Person("Krzysztofik", 1994);
        Person person2 = new Person("Krycha", 1989);
        Person person3 = new Person("Mariusz", 1898);

        print(uniqueObjectList.size());

        uniqueObjectList.add(person1);
        uniqueObjectList.add(person2);
        uniqueObjectList.add(person3);
        uniqueObjectList.add(person4);
        uniqueObjectList.add(person1);

        print(uniqueObjectList.size());

    }
}
