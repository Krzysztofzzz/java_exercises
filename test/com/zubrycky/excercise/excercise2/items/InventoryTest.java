package com.zubrycky.excercise.excercise2.items;

import com.zubrycky.excercise.excercise2.items.consumable.Pizza;
import com.zubrycky.excercise.excercise2.items.weapon.Bow;
import com.zubrycky.excercise.excercise2.items.weapon.Sword;
import org.junit.Test;

import static com.zubrycky.utils.Utils.print;
import static org.junit.Assert.*;

public class InventoryTest {
    @Test
    public void inventorySortTestByValueThenName() {
        Bow bow1 = new Bow("Bow1", 100, 100, 5, 5);
        Bow bow3 = new Bow("BowB", 300, 1300, 4, 52);
        Bow bow2 = new Bow("BowA", 200, 100, 4, 56);

        Sword sword1 = new Sword("ExcaliburB", 1080,100,3,153);
        Sword sword2= new Sword("Excalibur2", 1040,1050,5,153);
        Sword sword3= new Sword("ExcaliburA", 15040,1050,3,145);
        Pizza pizza = new Pizza("Pepperoni", 1,0.5, false);
        Inventory inventory = new Inventory();
        inventory.addMultipleItems(bow1,bow2,bow3,sword1,sword2,sword3,pizza);
        print(inventory);
        inventory.sort();
        print(inventory);

    }

    @Test
    public void addingItemsToInventoryAndToStringTest() {
        Bow bow1 = new Bow("Bow1", 100, 100, 3000, 5);
        Bow bow2 = new Bow("Bow2", 200, 100, 10400, 56);
        Bow bow3 = new Bow("Bow3", 300, 1300, 10500, 52);
        Sword sword1 = new Sword("Excalibur", 1080,100,3000,153);
        Sword sword2= new Sword("Excalibur2", 1040,1050,3340,153);
        Sword sword3= new Sword("Excalibur3", 15040,1050,30050,145);
        Pizza pizza = new Pizza("Pepperoni", 20,0.5, false);

        Inventory inventory = new Inventory();

        inventory.addMultipleItems(bow1,bow2,bow3,sword1,sword2,sword3,pizza);

        print(inventory);

        Pizza pizza2 = new Pizza("Capriczioza", 20,0.5, true);
        inventory.addItem(pizza2);
        print(inventory);

    }
}