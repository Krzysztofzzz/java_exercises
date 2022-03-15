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

        int integerOfSmallLetterZ = 122;
        int integerOfSmallLetterA = 97;
        int integerOfCapitalLetterZ = 90;
        int integerOfCapitalLetterA = 65;
        String coded = "";
        char[] characterArray = code.toCharArray();
        int[] integerArray = new int[characterArray.length];

        for (int i = 0; i < characterArray.length; i++) {
            integerArray[i] = characterArray[i];

            if (integerArray[i]>= integerOfSmallLetterA && integerArray[i]<=integerOfSmallLetterZ){
                integerArray[i] = integerArray[i] + move;
                if (integerArray[i] > integerOfSmallLetterZ) {
                    int remainingIntegers = integerArray[i] - integerOfSmallLetterZ;
                    integerArray[i] = integerOfSmallLetterA - 1 + remainingIntegers;
                }
                characterArray[i] = (char) integerArray[i];
            }

            if (integerArray[i]>= integerOfCapitalLetterA && integerArray[i]<=integerOfCapitalLetterZ){
                integerArray[i] = integerArray[i] + move;
                if (integerArray[i] > integerOfCapitalLetterZ) {
                    int remainingIntegers = integerArray[i] - integerOfCapitalLetterZ;
                    integerArray[i] = integerOfCapitalLetterA - 1 + remainingIntegers;
                }
                characterArray[i] = (char) integerArray[i];
            }
                coded = coded.concat(String.valueOf(characterArray[i]));
        }

        return coded;
    }
}
