package com.zubrycky.exercise.exercise_5_armstrong_number;

public class ArmstrongNumber {

    public boolean isArmstrongNumber(int number) {

        int changingOriginalNumber = number;
        int length = Integer.toString(number).length();
        int tempNumber;
        int armstrong = 0;

        for (int i = 0; i < length; i++) {
            tempNumber = changingOriginalNumber % 10;
            armstrong += tempNumber * tempNumber * tempNumber;
            changingOriginalNumber = changingOriginalNumber / 10;
        }

        if (armstrong == number) {
            return true;
        } else return false;
    }
}
