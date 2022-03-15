package com.zubrycky.excercise.excercise10_second_largest_number;

public class LargestNumber {

    public int findSecondLargestNumber(int[] input) throws NullPointerException, EmptyTableException {
        int largestNumber, secondLargestNumber;

        if (input == null) {
            throw new NullPointerException();

        } else if (input.length == 0) {
            throw new EmptyTableException();

        } else if (input.length == 1) {
            return input[0];

        } else {
            if (input[0] > input[1]) {
                largestNumber = input[0];
                secondLargestNumber = input[1];
            } else {
                largestNumber = input[1];
                secondLargestNumber = input[0];
            }

            for (int i = 1; i < input.length; i++) {

                if (largestNumber < input[i]) {
                    secondLargestNumber = largestNumber;
                    largestNumber = input[i];
                } else if (secondLargestNumber < input[i] && largestNumber != input[i]) {
                    secondLargestNumber = input[i];
                }
            }

        }
        return secondLargestNumber;


    }
}
