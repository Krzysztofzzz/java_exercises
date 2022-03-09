package com.zubrycky.excercise.excercise9_recurison;

import static com.zubrycky.utils.Utils.print;

public class PermutationRecursion {


    public void permutate(String input, int start) {
        if (input == null || input.isEmpty()) {
            return;
        }
        for (int i = start; i < input.length(); i++) {
            if (start != 0 && i == start) continue;
            final String replaced = replace(input, start, i);
            print(replaced);
            permutate(replaced, start + 1);
        }
    }

    private String replace(String input, int i, int j) {
        final String letter = input.substring(i, i + 1);
        final String nextLetter = input.substring(j, j + 1);
        final StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.replace(i, i + 1, nextLetter);
        stringBuilder.replace(j, j + 1, letter);
        return stringBuilder.toString();
    }
}

