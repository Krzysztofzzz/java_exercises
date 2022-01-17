package com.zubrycky.excercise.excercise2.comparator;

import com.zubrycky.excercise.excercise2.items.Item;

public class ItemWeightComparator implements ItemComparator {

    @Override
    public int compare(Item first, Item second) {
        if (first.getWeight() > second.getWeight()) {
            return 1;
        } else if (first.getWeight() < second.getWeight()) {
            return -1;
        } else return first.compareTo(second);
    }
}
