package com.zubrycky.lesson.lesson14;

import com.zubrycky.lesson.lesson3.Person;

import java.util.Comparator;

public class PersonYearOfBirthComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getYearOfBirth(), person2.getYearOfBirth());
    }
}
