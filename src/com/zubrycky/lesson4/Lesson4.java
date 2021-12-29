package com.zubrycky.lesson4;

import com.zubrycky.lesson3.Person;

import java.util.HashMap;
import java.util.Map;

import static com.zubrycky.utils.Utils.print;

public class Lesson4 implements Runnable{
    @Override
    public void run() {
        UniqueObjectList uniqueObjectList = new UniqueObjectList();
        Person person1 = new Person("Krzysztofik", 1994);
        Person person2 = new Person("Krycha", 1989);
        Person person3 = new Person("Mariusz", 1898);
        Person person4 = new Person("Krzysztofik", 1994);
        Person person5 = new Person("Mateusz", 1988);

        print(uniqueObjectList.size());

        uniqueObjectList.add(person1);
        uniqueObjectList.add(person2);
        uniqueObjectList.add(person3);
        uniqueObjectList.add(person4);
        uniqueObjectList.add(person1);

        print(uniqueObjectList.size());

        print(person1.hashCode());
        print(person2.hashCode());
        print(person3.hashCode());
        print(person4.hashCode());
        print(person5.hashCode());

        Map<Person, String> mapaLudzi = new HashMap<>();
        mapaLudzi.put(person1,"żyje");
        mapaLudzi.put(person2,"umarł");
        mapaLudzi.put(person3,"ledwo żyje");
        mapaLudzi.put(person4,"nie żyje");
        mapaLudzi.put(person5,"prawie umarł");

        print(mapaLudzi.size());
        String valuePerson1 = mapaLudzi.get(person1);
        print(valuePerson1);

        String valuePerson2 = mapaLudzi.get(person2);
        print(valuePerson2);

        String valuePerson5 = mapaLudzi.get(person5);
        print(valuePerson5);
    }
}
