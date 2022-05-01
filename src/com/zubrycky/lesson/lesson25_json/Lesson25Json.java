package com.zubrycky.lesson.lesson25_json;

import com.zubrycky.lesson.lesson25_json.example1.*;
import com.zubrycky.lesson.lesson25_json.example2.ErrorData;
import com.zubrycky.lesson.lesson25_json.example2.ErrorResponse;
import com.zubrycky.lesson.lesson25_json.example2.SourceData;

import java.util.List;

public class Lesson25Json implements Runnable {

    @Override
    public void run() {
        example1();
        example1();
        example1();
    }

    private void example1() {
        final AuthorData authorData = new AuthorData("42", "people");
        final Author author = new Author(authorData);
        final Relationships relationships = new Relationships(author);
        final Attributes attributes = new Attributes(
                "JSON:API paints my bikeshed!",
                "The shortest article. Ever.",
                "2015-05-22T14:56:29.000Z",
                "2015-05-22T14:56:28.000Z"
        );
        final Data data = new Data("articles", "1", attributes, relationships);
        final List<Data> dataList = List.of(data);

        final IncludedAttributes includedAttributes = new IncludedAttributes("John", 80, "male");
        final IncludedData includedData = new IncludedData("people", "42", includedAttributes);
        final List<IncludedData> includedDataList = List.of(includedData);

        final Response response = new Response(dataList, includedDataList);
    }

    private void example2() {
        final SourceData sourceData1 = new SourceData("/data/attributes/secretPowers");
        final ErrorData errorData1 = new ErrorData("403", sourceData1, null, "Editing secret powers is not authorized on Sundays.");

        final SourceData sourceData2 = new SourceData("/data/attributes/volume");
        final ErrorData errorData2 = new ErrorData("422", sourceData2, null, "Volume does not, in fact, go to 11.");

        final SourceData sourceData3 = new SourceData("/data/attributes/reputation");
        final ErrorData errorData3 = new ErrorData("500", sourceData3, "The backend responded with an error", "Reputation service not responding after three requests.");

        final List<ErrorData> errorDataList = List.of(errorData1, errorData2, errorData3);
        final ErrorResponse errorResponse = new ErrorResponse(errorDataList);
    }

}
