package com.zubrycky.exercise.exercise_11_ceasar_cipher;

public class CeasarCipher {

    public String encode(String code, int move) throws WrongNumberOfPositionsException {
        if (code == null) {
            return null;
        }
        if (code.isEmpty()) {
            return "";
        }
        if (move < 0 || move > 26) {
            throw new WrongNumberOfPositionsException();
        }

        int integerOfSmallLetterZ = 122;
        int integerOfSmallLetterA = 97;
        int integerOfCapitalLetterZ = 90;
        int integerOfCapitalLetterA = 65;
        StringBuilder coded = new StringBuilder();
        char[] characterArray = code.toCharArray();
        int integerOfCharacter;

        for (int i = 0; i < characterArray.length; i++) {
            integerOfCharacter = characterArray[i];

            if (integerOfCharacter >= integerOfSmallLetterA && integerOfCharacter <= integerOfSmallLetterZ) {
                characterArray[i] = codeCharacter(integerOfCharacter, integerOfSmallLetterA, integerOfSmallLetterZ, move);
            }
            if (integerOfCharacter >= integerOfCapitalLetterA && integerOfCharacter <= integerOfCapitalLetterZ) {
                characterArray[i] = codeCharacter(integerOfCharacter, integerOfCapitalLetterA, integerOfCapitalLetterZ, move);
            }

            coded.append(characterArray[i]);
        }

        return coded.toString();
    }

    private char codeCharacter(int integerOfCharacter, int firstIntOfLetters, int lastIntOfLetters, int move) {
        integerOfCharacter = integerOfCharacter + move;
        if (integerOfCharacter > lastIntOfLetters) {
            int remainingIntegers = integerOfCharacter - lastIntOfLetters;
            integerOfCharacter = firstIntOfLetters - 1 + remainingIntegers;
        }
        return (char) integerOfCharacter;
    }
}
