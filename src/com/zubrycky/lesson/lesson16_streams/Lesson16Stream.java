package com.zubrycky.lesson.lesson16_streams;

import com.zubrycky.excercise.excercise1.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

import static com.zubrycky.utils.Utils.print;

public class Lesson16Stream implements Runnable {

    @Override
    public void run() {
        final List<Animal> animals = List.of(
                new Fish("nemo"),
                new Cat("freja"),
                new Spider(),
                new Spider()
        );
        double averageNumberOfLegs = calculateAverageLegsCount(animals);
        print(averageNumberOfLegs);

        OptionalDouble average = animals
                .stream()
                .mapToInt(Animal::getNumberOfLegs)
                .average();
        print(average);


        print(getPetsNames(animals));

        List<String> petNamesStreamList = animals
                .stream()
                .map(animal -> {
                    if (animal instanceof Pet) {
                        return (Pet) animal;
                    } else {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .map(Pet::getName)
                .toList();
        print(petNamesStreamList);

    }

    private double calculateAverageLegsCount(List<Animal> animals) {
        double legs = 0;
        for (Animal a : animals) {
            legs += a.getNumberOfLegs();
        }
        return legs / animals.size();
    }

    private List<String> getPetsNames(List<Animal> animals) {
        List<String> names = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Pet) {
                names.add(((Pet) a).getName());
            }
        }
        return names;
    }
}
