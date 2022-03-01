package com.zubrycky.excercise.excercise4_palindrome;

public class Palindrome {

    String reversedString = "";
    char reversedChar;

    public boolean isPalindrome(String input) {

        int length = input.length();

        if (input.isEmpty() || length == 1) {
            return true;
        }
        for (int i = length - 1; i > -1; i--) {
            reversedChar = input.charAt(i);
            reversedString = reversedString + reversedChar;
        }
        return reversedString.equals(input);
    }
}
