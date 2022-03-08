package com.zubrycky.excercise.excercise9_recurison;

public class PermutationRecursion {


    // Utility function to swap two characters in a character array
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // Recursive function to generate all permutations of a string
    private void permutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public void permutate(String str) {

        // base case
        if (str == null || str.length() == 0) {
            return;
        }

        permutations(str.toCharArray(), 0);
    }


}

