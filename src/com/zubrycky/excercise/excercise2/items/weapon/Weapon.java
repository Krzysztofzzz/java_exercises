package com.zubrycky.excercise.excercise2.items.weapon;

import com.zubrycky.excercise.excercise2.items.Item;

public abstract class Weapon extends Item {

    public static final double MODIFIER_CHANGE_RATE = 0.05;
    private double baseDamage;
    private double damageModifier;
    private double baseDurability;
    private double durabilityModifier;

    public Weapon(String name, double baseDamage, double baseDurability, int value, double weight) {
        super(name, value, weight);
        this.baseDamage = baseDamage;
        this.baseDurability = baseDurability;
    }

    public void polish() {

    }

    public void use() {
        if (getDurability() > 0) {
            durabilityModifier -= MODIFIER_CHANGE_RATE;
            System.out.println("You use the " + getName() + ", dealing " + getDamage() + " points of damage.");
            if (getDurability() <= 0) {
                System.out.println("The " + getName() + " breaks.");
            }
        } else {
            System.out.println("You can't use the " + getName() + ", it is broken.");
        }
    }

    public double getDamage() {
        return baseDamage + damageModifier;
    }

    public double getDurability() {
        return baseDurability + durabilityModifier;
    }


    @Override
    public String toString() {
        return getName() + " - " +
                "Value: " + getValue() +
                ", Weight: " + getWeight() +
                ", Damage: " + getDamage() +
                ", Durability: " + getDurability() + "%";
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public double getBaseDurability() {
        return baseDurability;
    }

    public void setBaseDurability(double baseDurability) {
        this.baseDurability = baseDurability;
    }

    public double getDurabilityModifier() {
        return durabilityModifier;
    }

    public void setDurabilityModifier(double durabilityModifier) {
        this.durabilityModifier = durabilityModifier;
    }

    public double getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(double damageModifier) {
        this.damageModifier = damageModifier;
    }
}
