package com.zubrycky.lesson.lesson21_design_patterns.strategy;

import java.util.Scanner;

import static com.zubrycky.utils.Utils.print;

public class PriceCalculatorRunner implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        PriceCalculator priceCalculator;

        while (true) {
            print("Podaj cenę: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            print("Czy są święta?");
            String isChristmas = scanner.nextLine();

            if (isChristmas.equals("tak")) {
                priceCalculator = new ChristmasPriceCalculator();
            } else {
                print("Czy masz kupon?");
                String hasCoupon = scanner.nextLine();
                if (hasCoupon.equals("tak")) {
                    priceCalculator = new CouponPriceCalculator();
                } else {
                    priceCalculator = new NormalPriceCalculator();
                }
            }
            print("Nowa cena to: " + priceCalculator.calculatePrice(price));

        }
    }
}
