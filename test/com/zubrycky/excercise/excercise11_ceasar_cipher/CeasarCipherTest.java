package com.zubrycky.excercise.excercise11_ceasar_cipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipherTest {

    @Test
    public void testingCapitalLettersWhenNotMoving() {
        String input = "ABCD";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("ABCD", ceasarCipher.encode(input, 0));
    }

    @Test
    public void testingCapitalAndSmallLettersWithMovingBy8() {
        String input = "ABCD efgHIJ,fsSD.fs  adf!!";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("IJKL mnoPQR,naAL.na  iln!!", ceasarCipher.encode(input, 8));
    }

    @Test
    public void testToIncludeOtherCharactersAndMoveLettersBy1() {
        String input = "A B,cde;Fg";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("B C,def;Gh", ceasarCipher.encode(input, 1));
    }

    @Test
    public void whenNumberOfPositionsIsMoreThan26OrLessThan0ThrowException() {
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        try {
            ceasarCipher.encode(input,-43);
        }catch (WrongNumberOfPositionsException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void whenNumberOfPositionsIs0ReturnSameStringAsInput() {
        String input = "abc";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("abc", ceasarCipher.encode(input, 0));
    }

    @Test
    public void whenNumberOfPositionsIs26ReturnSameStringAsInput() {
        String input = "abc";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("abc", ceasarCipher.encode(input, 26));
    }

    @Test
    public void whenInputIsNullReturnNull() {
        String input = null;
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals(null, ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputIsEmptyReturnEmptyString() {
        String input = "";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputHasOneLetterMoveItsPositionBy5() {
        String input = "a";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("f", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputHasMultipleLettersMoveItsPositionBy5() {
        String input = "abc";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("fgh", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputIsLetterZMoveItsPositionBy1ToLetterA() {
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("a", ceasarCipher.encode(input, 1));
    }

    @Test
    public void whenInputIsLetterZMoveItsPositionBy5ToLetterE() {
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("e", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputIs5LastLettersOfTheAlphabetMoveItTo5FirstPositionsOfTheAlphabet() {
        String input = "vwxyz";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("abcde", ceasarCipher.encode(input, 5));
    }


}