package com.zubrycky.excercise.excercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCounterTest {

    @Test
    public void countLettersWhenInputIsEmpty() {
        CharacterCounter characterCounter = new CharacterCounter();
        String input = "";
        String output = characterCounter.countLetters(input);
        assertEquals("", output);
    }

    @Test
    public void countLettersWhenLettersAreTheSame() {
        CharacterCounter characterCounter = new CharacterCounter();
        String input = "AAAAAAAAAA";
        String output = characterCounter.countLetters(input);
        assertEquals("A10", output);
    }

    @Test
    public void countLettersWhenLettersAreDifferent() {
        CharacterCounter characterCounter = new CharacterCounter();
        String input = "AAAAABBBBB";
        String output = characterCounter.countLetters(input);
        assertEquals("A5B5", output);
    }

    @Test
    public void countLettersWhenLettersAreSmallAndCapital() {
        CharacterCounter characterCounter = new CharacterCounter();
        String input = "AAaaBBBbYYYY";
        String output = characterCounter.countLetters(input);
        assertEquals("A2a2B3b1Y4", output);
    }

    @Test
    public void countLettersWhenNumbersAndSpacesAreIncluded() {
        CharacterCounter characterCounter = new CharacterCounter();
        String input = "aaa  111222555555    GGhhh";
        String output = characterCounter.countLetters(input); 
        assertEquals("a3 2132356 4G2h3", output);
    }
}