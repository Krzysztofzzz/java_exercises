package com.zubrycky.excercise.excercise2.items;

public abstract class Item implements Comparable<Item> {

    private static int numberOfItems;
    private static int id = 0;
    private int value;
    private String name;
    private double weight;

    public Item(String name, int value, double weight) {
        id++;
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    @Override
    public int compareTo(Item other) {
        if (this.value > other.value) {
            return 1;
        } else if (this.value < other.value) {
            return -1;
        } else {
            return this.name.compareTo(other.name);
        }

    }

    public void use() {
    }

    public static void reset() {
        id = 0;
    }


    public int getId() {
        return id;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "-" +
                "Value: " + value +
                ", Weight: " + weight;
    }
}
