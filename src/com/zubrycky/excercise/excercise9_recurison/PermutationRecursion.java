package com.zubrycky.excercise.excercise9_recurison;

public class PermutationRecursion {

    public void permutate(String input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            String letter = input.substring(i,i+1);

            for (int j = 1; j<input.length(); j++){
                String nextLetter = input.substring(j,j+1);
                input.substring()
            }



        }
    }
}

