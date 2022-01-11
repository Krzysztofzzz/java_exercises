package com.zubrycky.lesson14;

import com.zubrycky.excercise1.Animal;

import java.util.Comparator;

class AnimalComparator implements Comparator<Animal> {

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
