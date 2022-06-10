package com.zubrycky.lesson.lesson_26_exceptions_2;

public class InvalidAgeException extends FormValidationException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
