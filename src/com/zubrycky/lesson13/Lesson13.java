package com.zubrycky.lesson13;

import java.util.ArrayList;
import java.util.List;

import static com.zubrycky.utils.Utils.print;

public class Lesson13 implements Runnable {

    @Override
    public void run() {
        Rectangle rectangle = new Rectangle(20.0, 30.0);
        Triangle triangle = new Triangle(10, 15);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(triangle);

        printShapes(shapeList);


    }

    private void printShapes(List<Shape> shapeList) {
        for (Shape s : shapeList) {
            print(s);
            print(s.getArea());
        }
    }
}
