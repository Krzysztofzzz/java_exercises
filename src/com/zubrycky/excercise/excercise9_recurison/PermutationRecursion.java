package com.zubrycky.excercise.excercise9_recurison;

import static com.zubrycky.utils.Utils.print;

public class PermutationRecursion {


    public void permutate(String input, int start) {
        if (input == null || input.isEmpty()) {
            return;
        }
        print(input);
        for (int i = start; i < input.length(); i++) {

            for (int j = i + 1; j < input.length(); j++) {
                String replaced = replace(input, i, j);

                permutate(replaced, start + 1);
            }


        }
    }

    private String replace(String input, int i, int j) {
        String letter = input.substring(i, i + 1);
        String nextLetter = input.substring(j, j + 1);
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.replace(i, i + 1, nextLetter);
        stringBuilder.replace(j, j + 1, letter);

        return stringBuilder.toString();


    }
}

