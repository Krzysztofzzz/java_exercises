package com.zubrycky.exercise.exercise_6_floyds_triangle;

import java.util.Scanner;

import static com.zubrycky.utils.Utils.print;

public class FloydsTriangle {
    Scanner scanner = new Scanner(System.in);

    public void printFloydsTriangle() {
        while (true) {
            print("Podaj ilość rzędów w trójkącie Floyda:");
            int numberOfRows = scanner.nextInt();
            int number = 1;
            int numbersInARow = 0;

            for (int i = 0; i < numberOfRows; i++) {
                System.out.println();
                numbersInARow += 1;
                for (int j = 0; j < numbersInARow; j++) {
                    System.out.print(number + " ");
                    number += 1;
                }
            }
            System.out.println();
        }
    }
}
