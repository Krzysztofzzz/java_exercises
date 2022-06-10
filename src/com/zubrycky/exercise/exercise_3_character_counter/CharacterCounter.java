package com.zubrycky.exercise.exercise_3_character_counter;

public class CharacterCounter {
    public String countLetters(String input) {
        if (input.isEmpty())
            return "";
        String output = "";
        int characterCounter = 1;
        char currentChar = input.charAt(0);
        char nextChar;

        for (int i = 1; i < input.length(); i++) {
            nextChar = input.charAt(i);
            if (currentChar == nextChar) {
                characterCounter++;
            } else {
                output = output.concat(String.valueOf(currentChar)).concat(Integer.toString(characterCounter));
                characterCounter = 1;
                currentChar = nextChar;

            }
        }
        output = output.concat(String.valueOf(currentChar)).concat(Integer.toString(characterCounter));

        return output;
    }
}
