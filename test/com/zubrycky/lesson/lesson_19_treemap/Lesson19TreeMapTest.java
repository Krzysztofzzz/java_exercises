package com.zubrycky.lesson.lesson_19_treemap;

import com.zubrycky.exercise.exercise_1_inheritance.Animal;
import com.zubrycky.exercise.exercise_1_inheritance.Fish;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class Lesson19TreeMapTest {
    @Test(expected = ClassCastException.class)
    public void whenClassDoesNotImplementComparableThenAnErrorIsThrown() {
        Map<Animal, Integer> animalMap = new TreeMap<>();
        Fish d = new Fish("Nemo");
        //Wykrzacza się bo Animal nie implementuje Comparable
        animalMap.put(d, 13);
    }
}