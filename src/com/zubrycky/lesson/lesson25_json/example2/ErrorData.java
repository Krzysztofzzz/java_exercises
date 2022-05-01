package com.zubrycky.lesson.lesson25_json.example2;

public class ErrorData {
    private String status;
    private SourceData source;
    private String title;
    private String detail;

    public ErrorData(String status, SourceData source, String title, String detail) {
        this.status = status;
        this.source = source;
        this.title = title;
        this.detail = detail;
    }
}
