package com.zubrycky.excercise.excercise2.items;

import com.zubrycky.excercise.excercise2.comparator.ItemComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory implements ItemComparator {

    List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addMultipleItems(Item... items) {
        for (Item i : items) {
            this.items.add(i);
        }

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
        String printItems = "Inventory:\n";

        for (Item i : items) {
            printItems += i + "\n";
        }

        return printItems;
    }
}
