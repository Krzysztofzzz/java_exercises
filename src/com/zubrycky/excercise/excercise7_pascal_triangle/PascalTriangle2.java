package com.zubrycky.excercise.excercise7_pascal_triangle;

import java.util.Scanner;

import static com.zubrycky.utils.Utils.print;

public class PascalTriangle2 {

    private Scanner scanner = new Scanner(System.in);

    public void printPascalTriangle() {
        while (true) {
            final int numberOfRows = scanNumberOfRows();
            final int[][] matrix = new int[numberOfRows][numberOfRows];
            matrix[0][0] = 1;
            for (int rowNumber = 1; rowNumber < numberOfRows; rowNumber++) {
                for (int columnNumber = 0; columnNumber < numberOfRows; columnNumber++) {
                    final int top = matrix[rowNumber - 1][columnNumber];
                    final int topLeft;
                    if (columnNumber == 0) {
                        topLeft = 0;
                    } else {
                        topLeft = matrix[rowNumber - 1][columnNumber - 1];
                    }
                    matrix[rowNumber][columnNumber] = top + topLeft;
                }
            }
            printMatrix(matrix);
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int rowNumber = 0; rowNumber < matrix.length; rowNumber++) {
            final int[] row = matrix[rowNumber];
            final StringBuilder string = new StringBuilder();
            for (int columnNumber = 0; columnNumber < row.length; columnNumber++) {
                if (row[columnNumber] == 0) {
                    break;
                }
                string.append(row[columnNumber]);
                if (columnNumber < rowNumber) {
                    string.append(", ");
                }
            }
            print(string.toString());
        }
    }

    private int scanNumberOfRows() {
        print("Podaj ilość rzędów w trójkącie Pascala:");
        return scanner.nextInt();
    }
}
