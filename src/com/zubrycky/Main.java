package com.zubrycky;

public class Main {

    public static void main(String[] args) {
        char character = 'z';
        System.out.print(character + " ");
        int intCharacter = character;
        System.out.println(intCharacter);

        intCharacter = intCharacter + 1;
        character = (char) intCharacter;
        System.out.print(character + " ");
        System.out.println(intCharacter);
    }
}
