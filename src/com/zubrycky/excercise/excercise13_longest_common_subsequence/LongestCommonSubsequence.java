package com.zubrycky.excercise.excercise13_longest_common_subsequence;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    public String findLongestCommonSequence(String s1, String s2) throws EmptyStringException {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            throw new EmptyStringException();
        }

        List<String> subsequencesList = new ArrayList<>();

        for (int move = 0; move < s1.length(); move++) {

            String tempS2 = s2;
            String subsequence = "";

            for (int i = move; i < s1.length(); i++) {
                for (int j = 0; j < tempS2.length(); j++) {
                    if (s1.charAt(i) == tempS2.charAt(j)) {

                        subsequence += s1.charAt(i);
                        tempS2 = deleteLeftOfStringInclusive(tempS2, j);
                        break;
                    }
                }
            }
            //tu dodac do listy
            if (!subsequence.isEmpty()) {
                subsequencesList.add(subsequence);
            }

        }
        return findLCSInList(subsequencesList);


    }

    private String findLCSInList(List<String> lcsList) {
        int sizeOfBiggestLcs = lcsList.get(0).length();
        String output = "";
        for (int i = 1; i < lcsList.size(); i++) {
            if (lcsList.get(i).length() > lcsList.get(i-1).length()) {
                sizeOfBiggestLcs = lcsList.get(i).length();
            }
        }
        for (String str : lcsList) {
            if (str.length() == sizeOfBiggestLcs) {
                output += str + ",";
            }
        }
        StringBuilder stringBuilder = new StringBuilder(output);
        output = stringBuilder.deleteCharAt(output.length()-1).toString();
        return output;
    }

    private String deleteLeftOfStringInclusive(String string, int indexToDelete) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.deleteCharAt(indexToDelete).substring(indexToDelete);
    }
}
