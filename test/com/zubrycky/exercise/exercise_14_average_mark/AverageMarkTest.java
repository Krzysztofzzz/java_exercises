package com.zubrycky.exercise.exercise_14_average_mark;

import org.junit.Assert;
import org.junit.Test;

public class AverageMarkTest {

    @Test
    public void returnNameAndAverageMarksOfAGivenStudentString() {
        String[] students = {"Marek Grechuta    1 2 3 4 ", "Krzysztof Zubrycki 3;12;8"};
        String newList = AverageMark.newList(students);
        Assert.assertEquals("Marek Grechuta-2;Krzysztof Zubrycki-5;", newList);
    }

    @Test
    public void returnNameAndAverageMarksOfAGivenStudentString2() {
        String[] students = {"Krzysztof Zubrycki 3;12;8"};
        String newList = AverageMark.newList(students);
        Assert.assertEquals("Krzysztof Zubrycki-5;", newList);
    }

    @Test
    public void returnNameAndAverageMarksOfAGivenStudentString3() {
        String[] students = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String newList = AverageMark.newList(students);
        Assert.assertEquals("Madeline Choi-5;Ethan Wyatt-9;", newList);
    }

    @Test
    public void returnNameAndAverageMarksOfAGivenStudentString4() {
        String[] students = {"Denver Wagner 6 7 8", " Ernie Gibbs 11 2"};
        String newList = AverageMark.newList(students);
        Assert.assertEquals("Denver Wagner-7;Ernie Gibbs-2;", newList);
    }

    @Test
    public void returnNameAndAverageMarksOfAGivenStudentString5() {
        String[] students = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};
        String newList = AverageMark.newList(students);
        Assert.assertEquals("Kim Ramos-5;Giovanni Landry-10;", newList);
    }

    @Test
    public void returnNameAndAverageMarksOfAGivenStudentString6() {
        String[] students = {"Henrietta Moon:5;5;8", "Edwin Bonilla 100;"};
        String newList = AverageMark.newList(students);
        Assert.assertEquals("Henrietta Moon-6;Edwin Bonilla-0;", newList);
    }

    @Test
    public void checkIfGetAverageFunctionReturnsMeanOfGivenNumbers1() {
        int[] numbers = new int[]{0};
        int mean = AverageMark.getAverage(numbers);
        Assert.assertEquals(0, mean);
    }

    @Test
    public void checkIfGetAverageFunctionReturnsMeanOfGivenNumbers2() {
        int[] numbers = new int[]{1};
        int mean = AverageMark.getAverage(numbers);
        Assert.assertEquals(1, mean);
    }

    @Test
    public void checkIfGetAverageFunctionReturnsMeanOfGivenNumbers3() {
        int[] numbers = new int[]{1, 2, 3};
        int mean = AverageMark.getAverage(numbers);
        Assert.assertEquals(2, mean);
    }

    @Test
    public void checkIfGetAverageFunctionReturnsMeanOfGivenNumbers4() {
        int[] numbers = new int[]{1, 2, 3, 11, 15};
        int mean = AverageMark.getAverage(numbers);
        Assert.assertEquals(6, mean);
    }
}