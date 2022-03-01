package com.zubrycky.excercise.excercise4_palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void whenInputHasOneCharacterReturnTrue() {
        Palindrome palindrome = new Palindrome();
        String input = "a";
        boolean check = palindrome.isPalindrome(input);
        assertEquals(true,check);
    }

    @Test
    public void whenInputDoesNotHaveAnyCharactersReturnTrue() {
        Palindrome palindrome = new Palindrome();
        String input = "";
        boolean check = palindrome.isPalindrome(input);
        assertEquals(true, check);
    }

    @Test
    public void whenInputHasTwoSameCharactersReturnsTrue() {
        Palindrome palindrome = new Palindrome();
        String input = "aa";
        boolean check = palindrome.isPalindrome(input);
        assertEquals(true, check);
    }

    @Test
    public void whenInputHasTwoDifferentCharactersReturnsFalse() {
        Palindrome palindrome = new Palindrome();
        String input = "ab";
        boolean check = palindrome.isPalindrome(input);
        assertEquals(false, check);
    }

    @Test
    public void whenInputIsAPalindromeReturnTrue() {
        Palindrome palindrome = new Palindrome();
        String input = "abcba";
        boolean check = palindrome.isPalindrome(input);
        assertEquals(true, check);
    }

    @Test
    public void whenInputIsNotAPalindromeReturnFalse() {
        Palindrome palindrome = new Palindrome();
        String input = "ergsggare";
        boolean check = palindrome.isPalindrome(input);
        assertEquals(false, check);
    }
}