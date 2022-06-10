package com.zubrycky.exercise.exercise_2_comparator.items.weapon;

public class Bow extends Weapon {
    public Bow(String name, double baseDamage, double baseDurability, int value, double weight) {
        super(name, baseDamage, baseDurability, value, weight);
    }

    @Override
    public void polish() {
        if (getDurability() < 100) {
            setDurabilityModifier(getDurabilityModifier() + Weapon.MODIFIER_CHANGE_RATE);
            System.out.println(getName() + " durability increased.");
        } else {
            System.out.println(getName() + " durability is max.");
        }
    }
}
