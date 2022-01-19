package com.zubrycky.excercise.excercise2.items.consumable;

import com.zubrycky.excercise.excercise2.items.Item;

public abstract class Consumable extends Item {
    private boolean consumed;
    private boolean spoiled;

    public Consumable(String name, int value, double weight, boolean spoiled) {
        super(name, value, weight);
        this.spoiled = spoiled;
        this.consumed = false;
    }

    public String eat() {
        if (!spoiled && !consumed) {
            setConsumed(true);
            return "You eat the " + getName() + ".";
        } else if (consumed) {
            return "There is nothing left of the " + getName() + " to consume.";
        } else {
            setConsumed(true);
            return "You eat the " + getName() + "." + "\nYou feel sick.";
        }

    }

    public void use() {
        System.out.println(eat());
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public void setSpoiled(boolean spoiled) {
        this.spoiled = spoiled;
    }

    public boolean isSpoiled() {
        return spoiled;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", consumed = " + consumed +
                ", spoiled = " + spoiled;
    }
}
