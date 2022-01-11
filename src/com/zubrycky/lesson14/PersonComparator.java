package com.zubrycky.lesson14;

import com.zubrycky.lesson3.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getYearOfBirth() < person2.getYearOfBirth()) {
            return -1;
        } else if (person1.getYearOfBirth() > person2.getYearOfBirth()) {
            return 1;
        } else {
            return person1.getName().compareTo(person2.getName());
        }

    }
}
