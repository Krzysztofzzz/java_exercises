package com.zubrycky.lesson.lesson_21_design_patterns.decorator.logger;

import java.time.LocalDateTime;

public class DateTimeLoggerDecorator implements Logger {

    private Logger logger;

    public DateTimeLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(LocalDateTime.now() + " " + message);
    }
}
