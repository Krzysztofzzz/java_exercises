package com.zubrycky.excercise.excercise4_palindrome;

public class Excercise4Palindrome implements Runnable{
    @Override
    public void run() {
        Palindrome palindrome = new Palindrome();
        String input = "Aaa";
        int length = input.length();
        System.out.println(length);
    }
}
