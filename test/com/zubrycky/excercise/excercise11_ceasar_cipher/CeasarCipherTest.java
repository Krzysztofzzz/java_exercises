package com.zubrycky.excercise.excercise11_ceasar_cipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipherTest {

    @Test
    public void testingCapitalLettersWhenNotMoving() throws WrongNumberOfPositionsException {
        String input = "ABCD";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("ABCD", ceasarCipher.encode(input, 0));
    }

    @Test
    public void testingCapitalAndSmallLettersWithMovingBy8() throws WrongNumberOfPositionsException {
        String input = "ABCD efgHIJ,fsSD\n.fs  adf!!";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("IJKL mnoPQR,naAL\n.na  iln!!", ceasarCipher.encode(input, 8));
    }

    @Test
    public void testToIncludeOtherCharactersAndMoveLettersBy1() throws WrongNumberOfPositionsException {
        String input = "A B,cde;Fg";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("B C,def;Gh", ceasarCipher.encode(input, 1));
    }

    @Test(expected = WrongNumberOfPositionsException.class)
    public void whenNumberOfPositionsIsMoreThan26OrLessThan0ThrowException() throws WrongNumberOfPositionsException {
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        ceasarCipher.encode(input, -43);

    }

    @Test
    public void whenNumberOfPositionsIs0ReturnSameStringAsInput() throws WrongNumberOfPositionsException{
        String input = "abc";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("abc", ceasarCipher.encode(input, 0));
    }

    @Test
    public void whenNumberOfPositionsIs26ReturnSameStringAsInput() throws WrongNumberOfPositionsException{
        String input = "abc";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("abc", ceasarCipher.encode(input, 26));
    }

    @Test
    public void whenInputIsNullReturnNull() throws WrongNumberOfPositionsException{
        String input = null;
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals(null, ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputIsEmptyReturnEmptyString() throws WrongNumberOfPositionsException{
        String input = "";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputHasOneLetterMoveItsPositionBy5() throws WrongNumberOfPositionsException{
        String input = "a";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("f", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputHasMultipleLettersMoveItsPositionBy5() throws WrongNumberOfPositionsException{
        String input = "abc";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("fgh", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputIsLetterZMoveItsPositionBy1ToLetterA() throws WrongNumberOfPositionsException{
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("a", ceasarCipher.encode(input, 1));
    }

    @Test
    public void whenInputIsLetterZMoveItsPositionBy5ToLetterE() throws WrongNumberOfPositionsException{
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("e", ceasarCipher.encode(input, 5));
    }

    @Test
    public void whenInputIs5LastLettersOfTheAlphabetMoveItTo5FirstPositionsOfTheAlphabet() throws WrongNumberOfPositionsException{
        String input = "vwxyz";
        CeasarCipher ceasarCipher = new CeasarCipher();

        assertEquals("abcde", ceasarCipher.encode(input, 5));
    }


}