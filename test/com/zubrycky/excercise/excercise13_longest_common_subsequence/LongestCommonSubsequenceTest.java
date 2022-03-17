package com.zubrycky.excercise.excercise13_longest_common_subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test(expected = EmptyStringException.class)
    public void whenEitherStringIsNullOrEmptyThrowException() throws EmptyStringException {
        String s1 = "";
        String s2 = "fdfsef";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
    }

    @Test
    public void test1() throws EmptyStringException {
        String s1 = "sdf";
        String s2 = "fdfsef";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("sf,df", lcs);
    }

    @Test
    public void test2() throws EmptyStringException {
        String s1 = "bcdaacd";
        String s2 = "acdbac";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("cdac", lcs);
    }

    @Test
    public void test3() throws EmptyStringException {
        String s1 = "abcd";
        String s2 = "acbad";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("abd", lcs);
    }

    @Test
    public void test4() throws EmptyStringException {
        String s1 = "a";
        String s2 = "a";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("a", lcs);
    }

    @Test
    public void test5() throws EmptyStringException {
        String s1 = "a";
        String s2 = "ba";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("a", lcs);
    }

    @Test
    public void test6() throws EmptyStringException {
        String s1 = "ABCDEFGH";
        String s2 = "BCDAHDFG";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("BCDFG", lcs);
    }

    @Test
    public void test7() throws EmptyStringException {
        String s1 = "AA";
        String s2 = "AA";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("AA", lcs);
    }
    @Test
    public void test8() throws EmptyStringException {
        String s1 = "ab";
        String s2 = "b";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.findLongestCommonSequence(s1, s2);
        assertEquals("b,b", lcs);
    }
}