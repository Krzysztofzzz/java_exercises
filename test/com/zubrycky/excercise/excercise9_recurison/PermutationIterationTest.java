package com.zubrycky.excercise.excercise9_recurison;

import org.junit.Test;

public class PermutationIterationTest {

    @Test
    public void whenStringIsEmptyReturnsErrorMessage() {
        PermutationIteration permutation = new PermutationIteration();
        String input = "";

        permutation.permutate(input);
    }

    @Test
    public void whenInputIsOneCharacterReturnsIt() {
        PermutationIteration permutation = new PermutationIteration();
        String input = "a";

        permutation.permutate(input);
    }

    @Test
    public void printAllPermutationsOfGivenString() {
        PermutationIteration permutation = new PermutationIteration();
        String input = "1234";

        permutation.permutate(input);
    }
}