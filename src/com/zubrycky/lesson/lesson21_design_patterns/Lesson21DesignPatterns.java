package com.zubrycky.lesson.lesson21_design_patterns;

import com.zubrycky.lesson.lesson21_design_patterns.builder.Airplane;
import com.zubrycky.lesson.lesson21_design_patterns.builder.AirplaneBuilder;

import static com.zubrycky.utils.Utils.print;

public class Lesson21DesignPatterns implements Runnable{

    @Override
    public void run() {

        //Logger logger = Logger.getInstance();
        //logger.log("coś tam");

        Airplane airplane1 = new Airplane(1,Airplane.DEFAULT_NUMBER_OF_WINGS,Airplane.DEFAULT_COLOUR);
        Airplane airplane2 = new Airplane(2,Airplane.DEFAULT_NUMBER_OF_WINGS,"Red");
        Airplane airplane3 = new Airplane(3,1,Airplane.DEFAULT_COLOUR);

        AirplaneBuilder airplaneBuilder = new AirplaneBuilder();

        Airplane airplane4 = airplaneBuilder
                .setNumberOfWings(1)
                .setColour("Red")
                .build();

        print(airplane4);


    }
}
