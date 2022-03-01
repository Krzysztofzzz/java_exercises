package com.zubrycky.lesson.lesson21_design_patterns.factory;

import com.zubrycky.lesson.lesson21_design_patterns.factory.art_deco.ArtDecoFurnitureFactory;
import com.zubrycky.lesson.lesson21_design_patterns.factory.modern.ModernFurnitureFactory;
import com.zubrycky.lesson.lesson21_design_patterns.factory.victorian.VictorianFurnitureFactory;

import java.util.Scanner;

import static com.zubrycky.utils.Utils.print;

public class FactoryRunner implements Runnable {
    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        AbstractFurnitureFactory abstractFurnitureFactory;

        while (true) {
            print("Wybierz opcje:");
            print("1 - Art Deco\n2 - Modern\n3 - Victorian");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> abstractFurnitureFactory = new ArtDecoFurnitureFactory();
                case 2 -> abstractFurnitureFactory = new ModernFurnitureFactory();
                case 3 -> abstractFurnitureFactory = new VictorianFurnitureFactory();
                default -> abstractFurnitureFactory = new ArtDecoFurnitureFactory();
            }

            Chair chair = abstractFurnitureFactory.createChair();
            Sofa sofa = abstractFurnitureFactory.createSofa();
            CoffeeTable coffeeTable = abstractFurnitureFactory.createCoffeeTable();

            print("Twoje meble: " + chair + " " + sofa + " " + coffeeTable);
        }
    }
}
