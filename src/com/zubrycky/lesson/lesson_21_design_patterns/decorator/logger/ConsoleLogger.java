package com.zubrycky.lesson.lesson_21_design_patterns.decorator.logger;

public final class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
