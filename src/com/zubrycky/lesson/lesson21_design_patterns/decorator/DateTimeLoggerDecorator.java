package com.zubrycky.lesson.lesson21_design_patterns.decorator;

import java.util.Calendar;

public class DateTimeLoggerDecorator implements Logger {

    private final Logger logger;

    public DateTimeLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        this.logger.log(Calendar.getInstance().getTime() + ": " + message);
    }
}
