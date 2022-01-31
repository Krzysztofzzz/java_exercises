package com.zubrycky.lesson.lesson20_SOLID;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void whenSettingRectangleHeightItsWidthDoesNotChange() {
        double rectangleInitialWidth = 10;
        Rectangle rectangle = new SquareBadExample(rectangleInitialWidth);
        rectangle.setHeight(50);


        Assert.assertEquals(rectangleInitialWidth, rectangle.getWidth(),0);

    }
}