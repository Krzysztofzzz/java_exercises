package com.zubrycky.lesson.lesson26_exceptions_2;

public class InvalidGenderException extends FormValidationException {
    public InvalidGenderException(String message) {
        super(message);
    }
}
