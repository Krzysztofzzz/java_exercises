package com.zubrycky.lesson.lesson21_design_patterns.factory.modern;

import com.zubrycky.lesson.lesson21_design_patterns.factory.AbstractFurnitureFactory;
import com.zubrycky.lesson.lesson21_design_patterns.factory.Chair;
import com.zubrycky.lesson.lesson21_design_patterns.factory.CoffeeTable;
import com.zubrycky.lesson.lesson21_design_patterns.factory.Sofa;

public class ModernFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
