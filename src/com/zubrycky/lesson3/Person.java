package com.zubrycky.lesson3;

import java.util.Objects;

public class Person {
    private String name;
    private int yearOfBirth;

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
                    if (other.name.equals(this.name)) return true;
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
}
