package com.zubrycky.exercise.exercise_10_second_largest_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {

    @Test(expected = NullPointerException.class)
    public void whenTableIsNullThrowNullPointerException() throws EmptyTableException {
        int input[] = null;
        LargestNumber largestNumber = new LargestNumber();
        largestNumber.findSecondLargestNumber(input);

    }

    @Test(expected = EmptyTableException.class)
    public void whenTableIsEmptyThrowEmptyTableException() throws EmptyTableException {
        int[] input = {};
        LargestNumber largestNumber = new LargestNumber();
        largestNumber.findSecondLargestNumber(input);
    }

    @Test
    public void whenInputTableHasOneIntegerReturnIt() throws EmptyTableException {
        int input[] = {1};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasTwoIntegersReturnSecondLargest() throws EmptyTableException {
        int input[] = {1, 2};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasTwoIntegersReturnSecondLargestReversed() throws EmptyTableException {
        int input[] = {2, 1};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasMultipleIntegersReturnSecondLargest() throws EmptyTableException {
        int input[] = {2, 1, 54, 2, 121, 76, 33, 21};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(76, secondLargest);
    }

    @Test
    public void whenInputTableHasMultipleSameIntegersReturnIt() throws EmptyTableException {
        int input[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasTwoButMultipleIntegersReturnSecondLargest() throws EmptyTableException {
        int input[] = {5, 5, 5, 5, 5, 5, 9, 9, 9, 9, 9, 9, 5, 5, 5, 5, 5, 9, 9, 9, 9, 9};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(5, secondLargest);
    }
}