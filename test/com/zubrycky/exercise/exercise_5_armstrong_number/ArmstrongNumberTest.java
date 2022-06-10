package com.zubrycky.exercise.exercise_5_armstrong_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArmstrongNumberTest {

    @Test
    public void whenNumberIsZeroReturnTrue() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        int number = 0;
        boolean check = armstrongNumber.isArmstrongNumber(number);
        assertEquals(true, check);
    }

    @Test
    public void whenNumberIsOneReturnTrue() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        int number = 1;
        boolean check = armstrongNumber.isArmstrongNumber(number);
        assertEquals(true, check);
    }

    @Test
    public void whenNumberIsArmstrongNumberReturnsTrue() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        int number = 153;
        boolean check = armstrongNumber.isArmstrongNumber(number);
        assertEquals(true, check);
    }

    @Test
    public void whenNumberIsNotAnArmstrongNumberReturnsFalse() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        int number = 165345;
        boolean check = armstrongNumber.isArmstrongNumber(number);
        assertEquals(false, check);
    }
}