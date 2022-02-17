package com.zubrycky.lesson.lesson21_design_patterns.decorator.logger;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
