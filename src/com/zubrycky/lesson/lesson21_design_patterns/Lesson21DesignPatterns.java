package com.zubrycky.lesson.lesson21_design_patterns;

import com.zubrycky.lesson.lesson21_design_patterns.adapter.*;
import com.zubrycky.lesson.lesson21_design_patterns.builder.Airplane;
import com.zubrycky.lesson.lesson21_design_patterns.composite.MilitaryUnit;
import com.zubrycky.lesson.lesson21_design_patterns.composite.Warrior;
import com.zubrycky.lesson.lesson21_design_patterns.composite.Warriors;
import com.zubrycky.lesson.lesson21_design_patterns.decorator.logger.ConsoleLogger;
import com.zubrycky.lesson.lesson21_design_patterns.decorator.logger.DashesLoggerDecorator;
import com.zubrycky.lesson.lesson21_design_patterns.decorator.logger.DateTimeLoggerDecorator;
import com.zubrycky.lesson.lesson21_design_patterns.decorator.logger.Logger;
import com.zubrycky.lesson.lesson21_design_patterns.facade.Package;
import com.zubrycky.lesson.lesson21_design_patterns.facade.PackageFacade;
import com.zubrycky.lesson.lesson21_design_patterns.strategy.PriceCalculatorRunner;

import java.util.ArrayList;
import java.util.List;

import static com.zubrycky.utils.Utils.print;

public class Lesson21DesignPatterns implements Runnable {

    @Override
    public void run() {
        //singletonPatternTest();
        //builderPatternTest();
        //decoratorPatternTest();
        //facadePatternTest();
        //compositeTest();
        //adapterTest();
        strategyTest();
    }

    private void strategyTest(){
        PriceCalculatorRunner priceCalculatorRunner = new PriceCalculatorRunner();
        priceCalculatorRunner.run();
    }
    private void adapterTest() {
        NewCar newCar = new NewCar();
        OldCar oldCar = new OldCar();

        List<CarKmh> carsKmh = new ArrayList<>();
        carsKmh.add(newCar);
        carsKmh.add(new CarMphToKmhAdapter(oldCar));

        List<CarMph> carsMph = new ArrayList<>();
        carsMph.add(new CarKmhToMphAdapter(newCar));
        carsMph.add(oldCar);

        for (CarKmh c : carsKmh) {
            print(c.getMaximumSpeed());
        }

        for (CarMph c:carsMph) {
            print(c.getMaxSpeed());

        }
    }

    private void compositeTest() {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();
        Warrior warrior3 = new Warrior();
        Warrior warrior4 = new Warrior();
        Warrior warrior5 = new Warrior();
        Warrior warrior6 = new Warrior();

        Warriors warriors = new Warriors();
        warriors.addWarrior(warrior2);
        warriors.addWarrior(warrior4);

        List<MilitaryUnit> militaryUnits = new ArrayList<>();
        militaryUnits.add(warrior3);
        militaryUnits.add(warrior5);
        militaryUnits.add(warriors);

        for (MilitaryUnit m : militaryUnits) {
            m.goRight();
        }
    }

    private void facadePatternTest() {
        PackageFacade packageFacade = new PackageFacade();
        Package p = new Package();
        packageFacade.sendPackage(p);
    }

    private void decoratorPatternTest() {
        Logger logger = new DateTimeLoggerDecorator(new DashesLoggerDecorator(new ConsoleLogger()));
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
