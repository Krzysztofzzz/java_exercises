package com.zubrycky.lesson.lesson24_optional_stream;

import java.util.Random;
import java.util.UUID;

public class StringRepository {
    public String getString() {
        return UUID.randomUUID().toString();
    }

    public String getStringOrNull() {
        Random random = new Random();
        if (random.nextBoolean())
            return getString();
        else return null;
    }
}
