package com.zubrycky.lesson.lesson_25_json.solutions.example_1;

import java.util.List;

public class Cake {
    private String id;
    private String type;
    private String name;
    private double ppu;
    private BatterTypes batters;
    private List<Topping> toppings;

    public Cake(String id, String type, String name, double ppu, BatterTypes batters, List<Topping> toppings) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.ppu = ppu;
        this.batters = batters;
        this.toppings = toppings;
    }
}
