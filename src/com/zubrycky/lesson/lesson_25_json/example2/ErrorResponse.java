package com.zubrycky.lesson.lesson_25_json.example2;

import java.util.List;

public class ErrorResponse {
    private List<ErrorData> errors;

    public ErrorResponse(List<ErrorData> errors) {
        this.errors = errors;
    }
}
