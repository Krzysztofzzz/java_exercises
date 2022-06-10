package com.zubrycky.lesson.lesson_14_comparator;

import com.zubrycky.exercise.exercise_1_inheritance.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getNumberOfLegs() < animal2.getNumberOfLegs()) {
            return -1;
        } else if (animal1.getNumberOfLegs() > animal2.getNumberOfLegs()) {
            return 1;
        } else {
            return 0;
        }
    }
}
