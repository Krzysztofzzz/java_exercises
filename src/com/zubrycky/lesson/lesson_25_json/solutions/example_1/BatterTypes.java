package com.zubrycky.lesson.lesson_25_json.solutions.example_1;

import java.util.List;

public class BatterTypes {
    private List<Batter> batters;

    public BatterTypes(List<Batter> batters) {
        this.batters = batters;
    }

    public List<Batter> getBatters() {
        return batters;
    }
}
