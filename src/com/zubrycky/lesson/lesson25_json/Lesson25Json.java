package com.zubrycky.lesson.lesson25_json;

import com.zubrycky.lesson.lesson25_json.example1.*;
import com.zubrycky.lesson.lesson25_json.example2.ErrorData;
import com.zubrycky.lesson.lesson25_json.example2.ErrorResponse;
import com.zubrycky.lesson.lesson25_json.example2.SourceData;
import com.zubrycky.lesson.lesson25_json.solutions.example_1.Batter;
import com.zubrycky.lesson.lesson25_json.solutions.example_1.BatterTypes;
import com.zubrycky.lesson.lesson25_json.solutions.example_1.Cake;
import com.zubrycky.lesson.lesson25_json.solutions.example_1.Topping;
import com.zubrycky.lesson.lesson25_json.solutions.example_2.Item;
import com.zubrycky.lesson.lesson25_json.solutions.example_2.Menu;
import com.zubrycky.lesson.lesson25_json.solutions.example_2.Viewer;
import com.zubrycky.lesson.lesson25_json.solutions.example_3.SuperEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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

    private void solution1() {
        final Batter batter1 = new Batter("1001", "Regular");
        final Batter batter2 = new Batter("1002", "Chocolate");
        final Batter batter3 = new Batter("1003", "Blueberry");
        final Batter batter4 = new Batter("1004", "Devil's Food");
        final List<Batter> battersList = List.of(batter1, batter2, batter3, batter4);

        final BatterTypes batterTypes = new BatterTypes(battersList);

        Optional<BatterTypes> batterTypesOptional = Optional.of(batterTypes);
        Optional<List<Batter>> batterList = batterTypesOptional.map(new Function<BatterTypes, List<Batter>>() {
            @Override
            public List<Batter> apply(BatterTypes batterTypes) {
                return batterTypes.getBatters();
            }
        });

        Optional<List<Batter>> batterList1 = batterTypesOptional.flatMap(new Function<BatterTypes, Optional<List<Batter>>>() {
            @Override
            public Optional<List<Batter>> apply(BatterTypes batterTypes) {
                return Optional.of(batterTypes.getBatters());
            }
        });

        final Topping topping1 = new Topping("5001", "None");
        final Topping topping2 = new Topping("5002", "Glazed");
        final Topping topping3 = new Topping("5003", "Chocolate");
        final Topping topping4 = new Topping("5004", "Maple");
        final Topping topping5 = new Topping("5005", "Sugar");
        final Topping topping6 = new Topping("5006", "Chocolate with Sprinkles");
        final Topping topping7 = new Topping("5007", "Powdered Sugar");

        final List<Topping> toppingsList = List.of(topping1, topping2, topping5, topping7, topping6, topping3, topping4);

        final Cake cake = new Cake("0001", "donut", "Cake", 0.55, batterTypes, toppingsList);
    }

    private void solution2() {
        final List<Item> itemList = List.of(
                new Item("Open", null),
                new Item("OpenNew", "Open New"),
                null,
                new Item("ZoomIn", "Zoom In"),
                new Item("ZoomOut", "Zoom Out"),
                new Item("OriginalView", "Original View"),
                null,
                new Item("Quality", null),
                new Item("Pause", null),
                new Item("Mute", null),
                null,
                new Item("Find", "Find..."),
                new Item("FindAgain", "Find Again"),
                new Item("Copy", null),
                new Item("CopyAgain", "Copy Again"),
                new Item("CopySVG", "Copy SVG"),
                new Item("ViewSVG", "View SVG"),
                new Item("ViewSource", "View Source"),
                new Item("SaveAs", "Save As"),
                null,
                new Item("Help", null),
                new Item("About", "About Adobe CVG Viewer...")
        );
        final Menu menu = new Menu("SVG Viewer", itemList);

        final Viewer viewer = new Viewer(menu);
    }

    private void solution3() {
        final SuperEntity superEntity1 = new SuperEntity("Molecule Man", 29, "Dan Jukes", List.of(
                "Radiation resistance",
                "Turning tiny",
                "Radiation blast"
        ));
        final SuperEntity superEntity2 = new SuperEntity("Madame Uppercut", 39, "Jane Wilson", List.of(
                "Million tonne punch",
                "Damage resistance",
                "Superhuman reflexes"
        ));
    }

}
