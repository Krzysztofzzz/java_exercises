package com.zubrycky.lesson.lesson21_design_patterns.factory.victorian;

import com.zubrycky.lesson.lesson21_design_patterns.factory.AbstractFurnitureFactory;
import com.zubrycky.lesson.lesson21_design_patterns.factory.Chair;
import com.zubrycky.lesson.lesson21_design_patterns.factory.CoffeeTable;
import com.zubrycky.lesson.lesson21_design_patterns.factory.Sofa;

public class VictorianFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
