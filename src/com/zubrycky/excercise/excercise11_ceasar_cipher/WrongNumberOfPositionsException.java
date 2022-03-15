package com.zubrycky.excercise.excercise11_ceasar_cipher;

public class WrongNumberOfPositionsException extends RuntimeException{

    String message = "move input must be between 0 and 26";

    @Override
    public String getMessage() {
        return message;
    }
}
