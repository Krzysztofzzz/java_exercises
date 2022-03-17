package com.zubrycky.excercise.excercise12_even_odd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CommaSeparatedTest {
    @Test
    public void testingAddingOToOddNumbersAndEToEvenNumbersComaSeparated() {
        List<Integer> list = List.of(1,2,3,4,5,12,3441,234,765,342);
        CommaSeparated commaSeparated = new CommaSeparated();
        String string = commaSeparated.getString(list);
        assertEquals("o1,e2,o3,e4,o5,e12,o3441,e234,o765,e342", string);
    }
}