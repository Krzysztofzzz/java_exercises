package com.zubrycky.lesson.lesson_3_equals;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;
    private final int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person other = (Person) o;
            if (other.yearOfBirth == this.yearOfBirth) {
                if (other.name == null && this.name == null) return true;
                if (other.name != null && this.name != null) {
                    return other.name.equals(this.name);
                }
                return false;
            }
            return false;
        } else return false;
    }

    @Override
    public String toString() {
        return name + " " + yearOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Person o) {
        if (this.yearOfBirth < o.yearOfBirth) {
            return -1;
        } else if (this.yearOfBirth > o.yearOfBirth) {
            return 1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
