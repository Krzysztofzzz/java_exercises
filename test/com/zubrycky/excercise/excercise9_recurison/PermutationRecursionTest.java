package com.zubrycky.excercise.excercise9_recurison;

import org.junit.Test;

public class PermutationRecursionTest {
    @Test
    public void whenStringIsEmptyReturnsErrorMessage() {
        PermutationRecursion permutation = new PermutationRecursion();
        String input = "";

        permutation.permutate(input,0);
    }

    @Test
    public void whenInputIsOneCharacterReturnsIt() {
        PermutationRecursion permutation = new PermutationRecursion();
        String input = "a";

        permutation.permutate(input,0);
    }

    @Test
    public void printAllPermutationsOfGivenString() {
        PermutationRecursion permutation = new PermutationRecursion();
        String input = "ABCD";

        permutation.permutate(input,0);
    }

}