package com.zubrycky.lesson.lesson_25_json.solutions.example_3;

import java.util.List;

public class SuperEntity {
    private String name;
    private int age;
    private String secretIdentity;
    private List<String> powers;

    public SuperEntity(String name, int age, String secretIdentity, List<String> powers) {
        this.name = name;
        this.age = age;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }
}
