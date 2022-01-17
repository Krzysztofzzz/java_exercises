package com.zubrycky.excercise.excercise2.items.consumable;

public class Pizza extends Consumable {
    private int numberOfSlices;
    private int slicesEaten;

    public Pizza(String name, int value, double weight, boolean spoiled) {
        super(name, value, weight, spoiled);
    }

}
