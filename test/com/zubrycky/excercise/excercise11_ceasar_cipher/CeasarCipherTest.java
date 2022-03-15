package com.zubrycky.excercise.excercise11_ceasar_cipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipherTest {

    @Test
    public void whenNumberOfPositionsIsWrongThrowException() {
        String input = "z";
        CeasarCipher ceasarCipher = new CeasarCipher();

        try {
            ceasarCipher.encode(input,543);
        }catch (WrongNumberOfPositionsException e){
            e.getMessage();
        }
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