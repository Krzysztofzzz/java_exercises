package com.zubrycky.exercise.exercise_2_comparator.items.weapon;

public class Sword extends Weapon {
    public Sword(String name, double baseDamage, double baseDurability, int value, double weight) {
        super(name, baseDamage, baseDurability, value, weight);
    }

    @Override
    public void polish() {
        if (getDamage() < getBaseDamage() * 1.25) {
            setDamageModifier(getDamageModifier() + Weapon.MODIFIER_CHANGE_RATE);
            System.out.println(getName() + " damage increased.");
        } else {
            System.out.println(getName() + " damage is max.");
        }
    }

}
