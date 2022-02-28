package com.zubrycky.excercise.ecxercise4_palindrome;

public class Palindrome {

    String reversedString = "";
    char reversedChar;

    public boolean isPalindrome(String input) {

        int length = input.length();

        if (input.isEmpty() || length == 1) {
            return true;
        }
        for (length = length - 1; length > -1; length--) {
            reversedChar = input.charAt(length);
            reversedString += Character.toString(reversedChar);
        }
        if (input.equals(reversedString)) {
            return true;
        } else return false;
    }
}
