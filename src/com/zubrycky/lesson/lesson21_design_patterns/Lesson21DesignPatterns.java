package com.zubrycky.lesson.lesson21_design_patterns;

import com.zubrycky.lesson.lesson21_design_patterns.singleton.Logger;

public class Lesson21DesignPatterns implements Runnable{

    @Override
    public void run() {

        Logger logger = Logger.getInstance();

        logger.log("coś tam");

    }
}
