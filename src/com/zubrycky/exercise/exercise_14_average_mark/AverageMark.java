package com.zubrycky.exercise.exercise_14_average_mark;

public class AverageMark {

    public static String newList(String[] students) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            String student = students[i];
            int index = getLastIndexOfName(student);
            String studentName = student.substring(0, index).trim();
            int[] marks = getMarks(index, student);
            int averageMark = getAverage(marks);
            output.append(studentName).append("-").append(averageMark).append(";");
        }
        return output.toString();
    }

    public static int getAverage(int[] marks) {
        if (marks.length == 0)
            return 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public static int[] getMarks(int index, String student) {
        char[] chars = student.toCharArray();
        int[] marks = new int[0];
        StringBuilder temp = new StringBuilder();
        for (int i = index; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                temp.append(chars[i]);
                if (i < chars.length - 1) {
                    continue;
                }
            }
            if (temp.isEmpty() || Integer.parseInt(temp.toString()) > 10 || Integer.parseInt(temp.toString()) < 1) {
                temp = new StringBuilder("");
                continue;
            }
            int markToAdd = Integer.parseInt(temp.toString());
            marks = addNewMark(marks, markToAdd);
            temp = new StringBuilder("");
        }
        return marks;
    }

    public static int[] addNewMark(int[] marksArray, int markToAdd) {
        int[] newArray = new int[marksArray.length + 1];
        for (int i = 0; i < marksArray.length; i++) {
            newArray[i] = marksArray[i];
        }
        newArray[marksArray.length] = markToAdd;
        return newArray;
    }

    public static int getLastIndexOfName(String student) {
        char[] chars = student.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) || Character.isWhitespace(chars[i])) {
                continue;
            } else return i;
        }
        return 0;
    }
}
