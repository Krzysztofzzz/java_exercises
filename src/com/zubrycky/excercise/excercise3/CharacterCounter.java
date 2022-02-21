package com.zubrycky.excercise.excercise3;

public class CharacterCounter {
    public String countLetters(String input) {
        input = input.concat(" ");
        String output = "";
        Integer characterCounter = 1;
        Character currentChar;
        Character nextChar;

        for (int i = 0; i < input.length()-1; i++) {
            currentChar = input.charAt(i);
            nextChar = input.charAt(i + 1);
            if (currentChar.equals(nextChar)) {
                characterCounter++;
            } else {
                output = output.concat(currentChar.toString()).concat(characterCounter.toString());
                characterCounter = 1;

            }
        }
        return output;
    }
}
