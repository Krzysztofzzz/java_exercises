package com.zubrycky.excercise.excercise10_second_largest_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {

    @Test
    public void whenTableIsNullThrowNullPointerException() {
        int input[] = null;
        LargestNumber largestNumber = new LargestNumber();
        try {
            largestNumber.findSecondLargestNumber(input);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void whenTableIsEmptyThrowEmptyTableException() {
        int[] input = {};
        LargestNumber largestNumber = new LargestNumber();
        try {
            largestNumber.findSecondLargestNumber(input);
        } catch (EmptyTableException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void whenInputTableHasOneIntegerReturnIt() {
        int input[] = {1};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasTwoIntegersReturnSecondLargest() {
        int input[] = {1,2};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasTwoIntegersReturnSecondLargestReversed() {
        int input[] = {2,1};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasMultipleIntegersReturnSecondLargest() {
        int input[] = {2, 1,54,2,121,76,33,21};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(76, secondLargest);
    }

    @Test
    public void whenInputTableHasMultipleSameIntegersReturnIt() {
        int input[] = {1,1,1,1,1,1,1,1,1};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(1, secondLargest);
    }

    @Test
    public void whenInputTableHasTwoButMultipleIntegersReturnSecondLargest() {
        int input[] = {5,5,5,5,5,5,9,9,9,9,9,9,5,5,5,5,5,9,9,9,9,9};
        LargestNumber largestNumber = new LargestNumber();
        int secondLargest = largestNumber.findSecondLargestNumber(input);
        assertEquals(5, secondLargest);
    }
}