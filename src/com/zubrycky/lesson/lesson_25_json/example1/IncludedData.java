package com.zubrycky.lesson.lesson_25_json.example1;

public class IncludedData {

    private String type;
    private String id;
    private IncludedAttributes attributes;

    public IncludedData(String type, String id, IncludedAttributes attributes) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
    }
}
