package com.zubrycky.exercise.exercise_10_second_largest_number;

public class LargestNumber {

    public int findSecondLargestNumber(int[] input) throws EmptyTableException {

        if (input == null) {
            throw new NullPointerException();

        } else if (input.length == 0) {
            throw new EmptyTableException();

        } else if (input.length == 1) {
            return input[0];

        } else {
            Integer largestNumber = null;
            Integer secondLargestNumber = null;

            for (int actualNumber : input) {

                if (largestNumber == null || largestNumber < actualNumber) {
                    secondLargestNumber = largestNumber;
                    largestNumber = actualNumber;
                } else if (secondLargestNumber == null || (secondLargestNumber < actualNumber && largestNumber > actualNumber)) {
                    secondLargestNumber = actualNumber;
                }
            }
            //noinspection ConstantConditions
            return secondLargestNumber;
        }
    }
}
