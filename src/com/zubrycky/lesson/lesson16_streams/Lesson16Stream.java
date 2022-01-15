package com.zubrycky.lesson.lesson16_streams;

import com.zubrycky.excercise.excercise1.Animal;
import com.zubrycky.excercise.excercise1.Cat;
import com.zubrycky.excercise.excercise1.Fish;
import com.zubrycky.excercise.excercise1.Spider;

import java.util.List;
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

    }

    private double calculateAverageLegsCount(List<Animal> animals) {
        double legs = 0;
        for (Animal a : animals) {
            legs += a.getNumberOfLegs();
        }
        return legs / animals.size();
    }

    private List<String> getPetsNames(List<Animal> animals) {
        throw new UnsupportedOperationException("not implemented");
    }
}
