package com.zubrycky.excercise.excercise8_transposition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranspositionTest {

    @Test
    public void whenMatrixHasOneNumberReturnOneNumber() {
        int matrix[][] = {{1}};
        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);
    }

    @Test
    public void whenMatrixHasOneRowReturnOneColumn() {
        int matrix[][] = {{1,2,3,4,5,6,7}};
        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);
    }

    @Test
    public void whenMatrixHasOneColumnReturnOneRow() {
        int matrix[][] = {{1},{2},{3},{4}};
        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);
    }

    @Test
    public void whenMatrixHasMultipleColumnsAndRowsReturnsTransposition() {
        int matrix[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        Transposition transposition = new Transposition();

        int transMatrix[][] = transposition.transpose(matrix);
    }
}