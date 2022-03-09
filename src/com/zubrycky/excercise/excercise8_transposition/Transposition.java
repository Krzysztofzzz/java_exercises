package com.zubrycky.excercise.excercise8_transposition;

public class Transposition {

    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int transMatrix[][] = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int number = matrix[i][j];
                transMatrix[j][i] = number;
            }
        }

        return transMatrix;
    }

/*    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }*/
}
