package com.zubrycky.excercise.ecxercise4_palindrome;

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
}