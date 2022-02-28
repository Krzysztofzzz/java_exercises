package com.zubrycky.excercise.excercise3;

public class Excercise3CharacterCounter implements Runnable{
    private String input = "";
    @Override
    public void run() {
        CharacterCounter characterCounter = new CharacterCounter();
        String output = characterCounter.countLetters(input);
        System.out.println(output);
    }
}
