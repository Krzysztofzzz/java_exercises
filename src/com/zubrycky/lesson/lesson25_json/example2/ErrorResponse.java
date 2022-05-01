package com.zubrycky.lesson.lesson25_json.example2;

import java.util.List;

public class ErrorResponse {
    private  List<ErrorData> errors;

    public ErrorResponse(List<ErrorData> errors) {
        this.errors = errors;
    }
}
