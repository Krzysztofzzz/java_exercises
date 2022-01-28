package com.zubrycky.lesson.lesson19_treemap;

import com.zubrycky.excercise.excercise1.Animal;
import com.zubrycky.excercise.excercise1.Fish;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class Lesson19TreeMapTest {
    @Test(expected = ClassCastException.class)
    public void whenClassDoesNotImplementComparableThenAnErrorIsThrown() {
        Map<Animal,Integer> animalMap = new TreeMap<>();
        Fish d = new Fish("Nemo");
        //Wykrzacza się bo Animal nie implementuje Comparable
        animalMap.put(d,13);
    }
}