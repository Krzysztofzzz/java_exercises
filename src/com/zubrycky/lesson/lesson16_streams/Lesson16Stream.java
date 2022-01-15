package com.zubrycky.lesson.lesson16_streams;

import com.zubrycky.excercise.excercise1.Animal;
import com.zubrycky.excercise.excercise1.Cat;
import com.zubrycky.excercise.excercise1.Fish;
import com.zubrycky.excercise.excercise1.Spider;

import java.util.List;

public class Lesson16Stream implements Runnable {

    @Override
    public void run() {
        final List<Animal> animals = List.of(
                new Fish("nemo"),
                new Cat("freja"),
                new Spider()
        );
    }

    private double calculateAverageLegsCount(List<Animal> animals) {
        throw new UnsupportedOperationException("not implemented");
    }

    private List<String> getPetsNames(List<Animal> animals) {
        throw new UnsupportedOperationException("not implemented");
    }
}
