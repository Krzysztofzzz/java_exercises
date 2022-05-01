package com.zubrycky.lesson.lesson25_json.example1;

public class Data {

    private String type;
    private String id;
    private Attributes attributes;
    private Relationships relationships;

    public Data(String type, String id, Attributes attributes, Relationships relationships) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.relationships = relationships;
    }
}
