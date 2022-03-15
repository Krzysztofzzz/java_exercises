package com.zubrycky.excercise.excercise11_ceasar_cipher;

public class CeasarCipher {

    public String encode(String code, int move){
        if (code == null) {
            return null;
        }if (code.isEmpty()) {
            return "";
        }if (move<0||move>26){
            throw new WrongNumberOfPositionsException();
        }

        int integerOfLetterZ = 122;
        int integerOfLetterA = 97;
        String coded = "";
        char[] characterArray = code.toCharArray();
        int[] integerArray = new int[characterArray.length];

        for (int i = 0; i < characterArray.length; i++) {
            integerArray[i] = characterArray[i];
            integerArray[i] = integerArray[i] + move;
            if (integerArray[i] > integerOfLetterZ) {
                int remainingIntegers = integerArray[i] - integerOfLetterZ;
                integerArray[i] = integerOfLetterA - 1 + remainingIntegers;
            }
            characterArray[i] = (char) integerArray[i];
            coded = coded.concat(String.valueOf(characterArray[i]));
        }

        return coded;
    }
}
