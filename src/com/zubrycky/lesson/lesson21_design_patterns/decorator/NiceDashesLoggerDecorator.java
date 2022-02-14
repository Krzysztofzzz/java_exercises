package com.zubrycky.lesson.lesson21_design_patterns.decorator;

public class NiceDashesLoggerDecorator implements Logger {

    private final Logger logger;

    public NiceDashesLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        this.logger.log("--- " + message + " ---");
    }
}
