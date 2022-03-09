package com.zubrycky.excercise.excercise8_transposition;

import org.junit.Assert;
import org.junit.Test;

public class TranspositionTest {

    @Test
    public void whenMatrixHasOneNumberReturnOneNumber() {
        int matrix[][] = {{1}};
        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);
        Assert.assertArrayEquals(matrix,transMatrix);
    }

    @Test
    public void whenMatrixHasOneRowReturnOneColumn() {
        int matrix[][] = {{1,2,3,4,5,6,7}};
        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);
        int expectedMatrix[][] = {{1},{2},{3},{4},{5},{6},{7}};
        Assert.assertArrayEquals(expectedMatrix,transMatrix);

    }

    @Test
    public void whenMatrixHasOneColumnReturnOneRow() {
        int matrix[][] = {{1},{2},{3},{4}};
        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);

        int expectedMatrix[][] = {{1,2,3,4}};
        Assert.assertArrayEquals(expectedMatrix,transMatrix);
    }

    @Test
    public void whenMatrixHasMultipleColumnsAndRowsReturnsTransposition() {
        int matrix[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);

        int expectedMatrix[][] = {{1,6,11}, {2,7,12}, {3,8,13},{4,9,14},{5,10,15}};
        Assert.assertArrayEquals(expectedMatrix,transMatrix);
    }
}