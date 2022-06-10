package com.zubrycky.lesson.lesson_25_json.solutions.example_2;

import java.util.List;

public class Menu {
    private String header;
    private List<Item> items;

    public Menu(String header, List<Item> items) {
        this.header = header;
        this.items = items;
    }
}
