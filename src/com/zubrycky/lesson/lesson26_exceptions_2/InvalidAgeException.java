package com.zubrycky.lesson.lesson26_exceptions_2;

public class InvalidAgeException extends FormValidationException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
