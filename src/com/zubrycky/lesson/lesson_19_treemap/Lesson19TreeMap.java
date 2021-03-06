package com.zubrycky.lesson.lesson_19_treemap;

import com.zubrycky.exercise.exercise_1_inheritance.Animal;
import com.zubrycky.exercise.exercise_1_inheritance.Cat;
import com.zubrycky.exercise.exercise_1_inheritance.Fish;
import com.zubrycky.lesson.lesson_3_equals.Person;

import java.util.Map;
import java.util.TreeMap;

import static com.zubrycky.utils.Utils.print;

public class Lesson19TreeMap implements Runnable {
    @Override
    public void run() {
        Map<Person, Animal> personAnimalMap = new TreeMap<>();
        Fish d = new Fish("Nemo");
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Person person4 = new Person("Burak", 2004);
        Person person5 = new Person("Wojtek", 1994);
        Person person6 = new Person("Michał", 2004);
        Person person7 = new Person("Cebulak", 2004);

        personAnimalMap.put(person6, d);
        personAnimalMap.put(person4, c);
        personAnimalMap.put(person5, a);
        personAnimalMap.put(person7, d);

        personAnimalMap.forEach((person, animal) -> print(person.getName() + " " + animal));

    }
}
