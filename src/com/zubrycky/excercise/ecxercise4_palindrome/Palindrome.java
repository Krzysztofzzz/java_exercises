package com.zubrycky.excercise.ecxercise4_palindrome;

public class Palindrome {

    String reversedString;

    public boolean isPalindrome(String input) {

        if (input.isEmpty() || input.length() == 1) {
            return true;
        }
        for (int i = input.length(); i == 0; i--) {
            Character reversedChar = input.charAt(i);
            reversedString += reversedChar.toString();
        }
        if (input.equals(reversedString)) {
            return true;
        } else return false;
    }
}
