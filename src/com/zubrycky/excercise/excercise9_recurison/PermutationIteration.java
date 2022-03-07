package com.zubrycky.excercise.excercise9_recurison;

public class PermutationIteration {

    public void permutate(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println(input);

        if (!input.isEmpty()) {
            for (int i = input.length() - 1; i > 0; i--) {
                char move = input.charAt(i);
                stringBuilder.deleteCharAt(i);

                for (int position = 0; position < input.length(); position++) {
                    stringBuilder.insert(position, move);
                    if (stringBuilder.toString().equals(input)){
                        break;
                    }
                    System.out.println(stringBuilder);
                    stringBuilder.deleteCharAt(position);
                }

            }
        } else System.err.println("Brak tekstu");
    }
}
