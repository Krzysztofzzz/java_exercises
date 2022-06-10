package com.zubrycky.lesson.lesson_25_json.example1;

import java.util.List;

public class Response {

    private List<Data> data;
    private List<IncludedData> included;

    public Response(List<Data> data, List<IncludedData> included) {
        this.data = data;
        this.included = included;
    }
}

