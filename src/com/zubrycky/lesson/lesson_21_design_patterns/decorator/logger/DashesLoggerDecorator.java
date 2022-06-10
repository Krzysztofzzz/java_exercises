package com.zubrycky.lesson.lesson_21_design_patterns.decorator.logger;

public class DashesLoggerDecorator implements Logger {

    private Logger logger;

    public DashesLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log("--- " + message + " ---");
    }
}
