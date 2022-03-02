package com.zubrycky.excercise.excercise7_pascal_triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.zubrycky.utils.Utils.print;

public class PascalTriangle {
    Scanner scanner = new Scanner(System.in);
    int numberOfRows;
    List<Integer> previousRow = new ArrayList<>();
    List<Integer> currentRow = new ArrayList<>();

    public void printPascalTriangle() {
        while (true) {
            scanNumberOfRows();
            if (numberOfRows == 1) {
                printIfOneRow();
                clearLists();
            } else if (numberOfRows == 2) {
                printIfTwoRows();
                clearLists();
            } else {
                printIfTwoRows();
                int indexOfCurrentRow = 1;
                for (int i = 2; i < numberOfRows; i++) {
                    transferCurrentToPreviousList();
                    currentRow.add(1);
                    indexOfCurrentRow += 1;

                    for (int j = 1; j < indexOfCurrentRow; j++) {
                        addNextNumberToCurrentRow(j);
                    }
                    currentRow.add(1);
                    print(currentRow);
                }
                clearLists();
            }
        }


    }

    private void scanNumberOfRows() {
        print("Podaj ilość rzędów w trójkącie Pascala:");
        numberOfRows = scanner.nextInt();
    }

    private void addNextNumberToCurrentRow(int j) {
        currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
    }

    private void transferCurrentToPreviousList() {
        previousRow.clear();
        for (int x = 0; x < currentRow.size(); x++) {
            previousRow.add(currentRow.get(x));
        }
        currentRow.clear();
    }

    private void printIfOneRow() {
        currentRow.add(1);
        print(currentRow);
    }

    private void printIfTwoRows() {
        previousRow.add(1);
        print(previousRow);
        currentRow.add(1);
        currentRow.add(1);
        print(currentRow);
    }

    private void clearLists() {
        previousRow.clear();
        currentRow.clear();
    }
}
