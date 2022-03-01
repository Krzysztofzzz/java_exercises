package com.zubrycky.lesson.lesson21_design_patterns.factory;

public interface AbstractFurnitureFactory {

    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();


}
