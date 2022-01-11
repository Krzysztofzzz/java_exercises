package com.zubrycky.lesson14;

import com.zubrycky.excercise1.Animal;
import com.zubrycky.excercise1.Cat;
import com.zubrycky.excercise1.Fish;
import com.zubrycky.excercise1.Spider;
import com.zubrycky.lesson3.Person;

import java.util.*;

import static com.zubrycky.utils.Utils.print;

public class Lesson14Comparator implements Runnable {
    @Override
    public void run() {
        testPersonComparator();
    }

    private void testPersonComparator() {
        Person person1 = new Person("Krzys", 1994);
        Person person2 = new Person("Miś", 2004);
        Person person3 = new Person("Zdziś", 1994);
        Person person4 = new Person("Burak", 2004);
        Person person5 = new Person("Wojtek", 1994);
        Person person6 = new Person("Michał", 2004);
        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6);



        print(personList);

//        PersonComparator personComparator = new PersonComparator();
//        Collections.sort(personList, personComparator);


//        PersonNameComparator personNameComparator = new PersonNameComparator();
//        PersonYearOfBirthComparator personYearOfBirthComparator = new PersonYearOfBirthComparator();
//        Collections.sort(personList,personYearOfBirthComparator.thenComparing(personNameComparator));

        Collections.sort(personList);



        print(personList);
    }

    private void testAnimalComparator() {
        Fish fish = new Fish("Nemo");
        Cat cat = new Cat("Fluffy");
        Animal animal1 = new Fish();
        Animal animal2 = new Spider();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(fish);
        animalList.add(cat);
        animalList.add(animal1);
        animalList.add(animal2);

        print(animalList);

        AnimalComparator animalComparator = new AnimalComparator();
        Comparator<Animal> reversedAnimalComparator = animalComparator.reversed();

        Collections.sort(animalList, reversedAnimalComparator);

        print(animalList);
    }

}

