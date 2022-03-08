package com.zubrycky.excercise.excercise9_recurison;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationRecursionTest {
    @Test
    public void whenStringIsEmptyReturnsErrorMessage() {
        PermutationRecursion permutation = new PermutationRecursion();
        String input = "";

        permutation.permutate(input);
    }

    @Test
    public void whenInputIsOneCharacterReturnsIt() {
        PermutationRecursion permutation = new PermutationRecursion();
        String input = "a";

        permutation.permutate(input);
    }

    @Test
    public void printAllPermutationsOfGivenString() {
        PermutationRecursion permutation = new PermutationRecursion();
        String input = "1234";

        permutation.permutate(input);
    }

}