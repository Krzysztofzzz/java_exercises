package com.zubrycky.excercise.excercise2;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements ItemComparator{

    List<Item> items = new ArrayList<>();

    public Inventory(){
    }
    public void addItem(){}
    public void sort(){
    }
    public void sort(ItemComparator comparator){}

    
    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Inventory{" + items + "}";
    }
}
