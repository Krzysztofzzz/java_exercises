package com.zubrycky.lesson3;

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

    private class Person {
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
    }
}
