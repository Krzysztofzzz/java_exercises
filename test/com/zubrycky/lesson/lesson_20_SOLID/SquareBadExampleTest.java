package com.zubrycky.lesson.lesson_20_SOLID;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareBadExampleTest {
    @Test
    public void whenChangingSquareWidthThenItsHeightAlsoChanges() {
        SquareBadExample squareBadExample = new SquareBadExample(20);
        squareBadExample.setWidth(30);

        assertEquals(30, squareBadExample.getHeight(), 0);
    }
}