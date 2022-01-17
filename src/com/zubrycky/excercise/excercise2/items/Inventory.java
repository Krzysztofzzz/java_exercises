package com.zubrycky.excercise.excercise2.items;

import com.zubrycky.excercise.excercise2.comparator.ItemComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory implements ItemComparator {

    List<Item> items = new ArrayList<>();

    public Inventory() {
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void sort() {
        Collections.sort(items);
        //items.sort(this);
    }

    public void sort(ItemComparator comparator) {
        items.sort(comparator);
    }


    @Override
    public int compare(Item o1, Item o2) {
        return o1.compareTo(o2);
    }

    @Override
    public String toString() {
        return "Inventory{" + items + "}";
    }
}
