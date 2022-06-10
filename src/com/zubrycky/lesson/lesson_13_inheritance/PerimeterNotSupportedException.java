package com.zubrycky.lesson.lesson_13_inheritance;

public class PerimeterNotSupportedException extends Exception {

    public PerimeterNotSupportedException() {
        super("getPerimeter is not supported");
    }
}
