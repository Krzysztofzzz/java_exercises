package com.zubrycky.excercise.excercise2.items;

import com.zubrycky.excercise.excercise2.items.weapon.Bow;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemTest {
    @Test
    public void whenCreatingNewItemsThenTheyHaveDifferentIds() {
        Bow bow1 = new Bow("Bow1", 100, 100, 1000, 5);
        Bow bow2 = new Bow("Bow2", 200, 100, 1000, 5);
        Bow bow3 = new Bow("Bow3", 300, 100, 1000, 5);

        assertEquals(1, bow1.getId());
        assertEquals(2, bow2.getId());
        assertEquals(3, bow3.getId());
    }

    @Test
    public void whenComparingItemsTheyAreComparedBasedOnValueThenName() {
        Bow bow1 = new Bow("Bow1", 100, 100, 3000, 5);
        Bow bow2 = new Bow("Z", 200, 100, 1000, 5);
        Bow bow3 = new Bow("A", 300, 100, 1000, 5);
        Bow bow4 = new Bow("A", 300, 100, 1000, 5);

        assertTrue(bow1.compareTo(bow2) > 0);
        assertTrue(bow2.compareTo(bow3) > 0);
        assertTrue(bow3.compareTo(bow2) < 0);

        assertEquals(0, bow3.compareTo(bow4));
    }

    @Test
    public void testingResetIdMethod() {
        Bow bow1 = new Bow("Bow1", 100, 100, 3000, 5);
        Bow bow2 = new Bow("Z", 200, 100, 1000, 5);
        Bow bow3 = new Bow("A", 300, 100, 1000, 5);
        Bow bow4 = new Bow("A", 300, 100, 1000, 5);

        Item.reset();
        Bow bow5 = new Bow("A", 300, 100, 1000, 5);
        Bow bow6 = new Bow("A", 300, 100, 1000, 5);
        assertEquals(1, bow5.getId());
        assertEquals(2, bow6.getId());

    }

}