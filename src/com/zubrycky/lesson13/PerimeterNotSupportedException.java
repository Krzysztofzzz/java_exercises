package com.zubrycky.lesson13;

public class PerimeterNotSupportedException extends Exception{

    public PerimeterNotSupportedException() {
        super("getPerimeter is not supported");
    }
}
