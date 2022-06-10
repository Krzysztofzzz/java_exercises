package com.zubrycky.lesson.lesson_21_design_patterns.singleton;

public final class Logger {
    private static Logger LOGGER;

    public static Logger getInstance() {
        if (LOGGER == null) {
            LOGGER = new Logger();
        }
        return LOGGER;
    }

    public void log(String message) {
        System.out.println(message);
    }


    private Logger() {
    }
}
