package com.zubrycky.lesson.lesson_14_comparator;

import com.zubrycky.lesson.lesson_3_equals.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
