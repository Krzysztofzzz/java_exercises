package com.zubrycky.lesson14;

import com.zubrycky.excercise1.Animal;
import com.zubrycky.excercise1.Cat;
import com.zubrycky.excercise1.Fish;
import com.zubrycky.excercise1.Spider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.zubrycky.utils.Utils.print;

public class Lesson14 implements Runnable{
    @Override
    public void run() {
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
    private class AnimalComparator implements Comparator<Animal>{

        @Override
        public int compare(Animal animal1, Animal animal2) {
            if (animal1.getNumberOfLegs()<animal2.getNumberOfLegs()){
                return -1;
            }else if (animal1.getNumberOfLegs()>animal2.getNumberOfLegs()){
                return 1;
            }else {
                return 0;
            }
        }
    }
}

