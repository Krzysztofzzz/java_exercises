package com.zubrycky.lesson.lesson21_design_patterns;

import com.zubrycky.lesson.lesson21_design_patterns.builder.Airplane;
import com.zubrycky.lesson.lesson21_design_patterns.decorator.logger.ConsoleLogger;
import com.zubrycky.lesson.lesson21_design_patterns.decorator.logger.Logger;

import static com.zubrycky.utils.Utils.print;

public class Lesson21DesignPatterns implements Runnable {

    @Override
    public void run() {
        //singletonPatternTest();
        //builderPatternTest();
        decoratorPatternTest();


    }

    private void decoratorPatternTest(){
        Logger logger = new ConsoleLogger();
        logger.log("Hello world");
    }

    private void singletonPatternTest() {
        //Logger logger = Logger.getInstance();
        //logger.log("coś tam");
    }

    private void builderPatternTest() {
        Airplane airplane1 = new Airplane(1, Airplane.DEFAULT_NUMBER_OF_WINGS, Airplane.DEFAULT_COLOUR);
        Airplane airplane2 = new Airplane(2, Airplane.DEFAULT_NUMBER_OF_WINGS, "Red");
        Airplane airplane3 = new Airplane(3, 1, Airplane.DEFAULT_COLOUR);

        Airplane airplane4 = new Airplane.Builder()
                .setNumberOfWings(1)
                .setColour("Red")
                .build();

        print(airplane4);

        StringBuilder stringBuilder = new StringBuilder("Ala ma kota");
        print(stringBuilder);
        stringBuilder.replace(7, 11, "koty");
        print(stringBuilder);
        stringBuilder.insert(7, "cztery ");
        stringBuilder.append(" i psa.");

        print(stringBuilder.toString());
    }
}
