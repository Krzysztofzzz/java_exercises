package com.zubrycky.excercise.excercise2;

public class Pizza extends Consumable{
    public Pizza(String name, int value, double weight, boolean spoiled) {
        super(name, value, weight, spoiled);
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
