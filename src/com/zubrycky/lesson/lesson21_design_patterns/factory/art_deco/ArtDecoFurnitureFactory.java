package com.zubrycky.lesson.lesson21_design_patterns.factory.art_deco;

import com.zubrycky.lesson.lesson21_design_patterns.factory.AbstractFurnitureFactory;
import com.zubrycky.lesson.lesson21_design_patterns.factory.Chair;
import com.zubrycky.lesson.lesson21_design_patterns.factory.CoffeeTable;
import com.zubrycky.lesson.lesson21_design_patterns.factory.Sofa;

public class ArtDecoFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
