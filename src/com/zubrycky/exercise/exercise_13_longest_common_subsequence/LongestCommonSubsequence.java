package com.zubrycky.exercise.exercise_13_longest_common_subsequence;

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
            StringBuilder subsequence = new StringBuilder();

            for (int i = move; i < s1.length(); i++) {
                for (int j = 0; j < tempS2.length(); j++) {
                    if (s1.charAt(i) == tempS2.charAt(j)) {

                        subsequence.append(s1.charAt(i));
                        tempS2 = deleteLeftOfStringInclusive(tempS2, j);
                        break;
                    }
                }
            }
            if (subsequence.length() > 0) {
                subsequencesList.add(subsequence.toString());
            }

        }
        return findLCSInList(subsequencesList);


    }

    private String findLCSInList(List<String> lcsList) {
        if (lcsList.isEmpty()) return null;
        int sizeOfBiggestLcs = lcsList.get(0).length();

        for (int i = 1; i < lcsList.size(); i++) {
            if (lcsList.get(i).length() > lcsList.get(i - 1).length()) {
                sizeOfBiggestLcs = lcsList.get(i).length();
            }
        }
        StringBuilder output = new StringBuilder();
        for (String str : lcsList) {
            if (str.length() == sizeOfBiggestLcs) {
                if (output.length() > 0) {
                    output.append(",");
                }
                output.append(str);
            }
        }

        return output.toString();
    }

    private String deleteLeftOfStringInclusive(String string, int indexToDelete) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.deleteCharAt(indexToDelete).substring(indexToDelete);
    }
}
