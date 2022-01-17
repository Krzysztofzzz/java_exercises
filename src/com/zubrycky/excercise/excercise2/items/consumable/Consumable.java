package com.zubrycky.excercise.excercise2.items.consumable;

import com.zubrycky.excercise.excercise2.items.Item;

public abstract class Consumable extends Item {
    private final boolean consumed;
    private final boolean spoiled;

    public Consumable(String name, int value, double weight, boolean spoiled) {
        super(name, value, weight);
        this.spoiled = spoiled;
        consumed = false;
    }

    public String eat() {
        return "You eat the " + getName() + ".";
    }

    public void use() {
        if (!spoiled && !consumed) {
            eat();
        } else if (consumed) {
            System.out.println("There is nothing left of the " + getName() + " to consume.");
        } else if (spoiled) {
            System.out.println(eat() + "\nYou feel sick.");
        }
    }

    public boolean isConsumed() {
        return true;
    }

    public void setConsumed(boolean consumed) {
    }

    public boolean isSpoiled() {
        return true;
    }

    @Override
    public String toString() {
        return "Consumable{" +
                "consumed=" + consumed +
                ", spoiled=" + spoiled +
                "} " + super.toString();
    }
}
