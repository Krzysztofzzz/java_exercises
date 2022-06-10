package com.zubrycky.exercise.exercise_9_recurison;

import java.util.ArrayList;
import java.util.List;

public class PermutationIteration {

    public void permutate(String input) {
        if (input == null || input.length() == 0) {
            return;
        }
        List<String> partial = new ArrayList<>();

        partial.add(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {

                String s = partial.remove(j);

                for (int k = 0; k <= s.length(); k++) {
                    partial.add(s.substring(0, k) + input.charAt(i) + s.substring(k));
                }
            }
        }
        System.out.println(partial);
    }
}
