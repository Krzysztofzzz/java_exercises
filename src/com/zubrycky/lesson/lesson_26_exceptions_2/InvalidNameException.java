package com.zubrycky.lesson.lesson_26_exceptions_2;

public class InvalidNameException extends FormValidationException {
    public InvalidNameException(String message) {
        super(message);
    }
}
