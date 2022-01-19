package com.zubrycky.excercise.excercise2.items.consumable;

import org.junit.Assert;
import org.junit.Test;

import static com.zubrycky.utils.Utils.print;

public class ConsumableTest {

    @Test
    public void name() {

    }

    @Test
    public void testingEatAndUseMethodOnPizza() {
        Pizza pizza = new Pizza("Pepperoni", 20, 0.5, true);

        System.out.println(pizza.eat());

        pizza.use();
        pizza.use();

    }

    @Test
    public void testingToStringMethod() {
        Pizza pizza = new Pizza("Pepperoni", 20, 0.5, false);

        print(pizza);
        pizza.setConsumed(pizza.isConsumed());
        print(pizza);
        pizza.setSpoiled(pizza.isSpoiled());
        print(pizza);
    }

    @Test
    public void whenCreatingNewConsumableIsConsumedReturnsFalse() {
        Pizza pizza = new Pizza("Pepperoni", 20, 0.5, false);
        Assert.assertFalse(pizza.isConsumed());
    }
}