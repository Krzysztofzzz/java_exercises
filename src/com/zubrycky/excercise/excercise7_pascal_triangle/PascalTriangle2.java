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
            for (int i = 1; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfRows; j++) {
                    final int top = matrix[i - 1][j];
                    final int topLeft;
                    if (j == 0) {
                        topLeft = 0;
                    } else {
                        topLeft = matrix[i - 1][j - 1];
                    }
                    matrix[i][j] = top + topLeft;
                }
            }
            printMatrix(matrix);
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            final int[] row = matrix[i];
            final StringBuilder string = new StringBuilder();
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0) {
                    continue;
                }
                string.append(row[j]);
                if (j < i) {
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
