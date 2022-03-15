package com.zubrycky.excercise.excercise10_second_largest_number;

public class EmptyTableException extends RuntimeException {

    private String message;

    public EmptyTableException() {
        this.message = "Table is empty";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
