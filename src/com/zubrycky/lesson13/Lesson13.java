package com.zubrycky.lesson13;

import java.util.ArrayList;
import java.util.List;

import static com.zubrycky.utils.Utils.print;

public class Lesson13 implements Runnable {

    @Override
    public void run() {
        Rectangle rectangle = new Rectangle(20.0, 30.0);
        Triangle triangle = new Triangle(10, 15);
        Circle circle = new Circle(25);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(circle);

        printShapes(shapeList);
        resize(shapeList,0.5);
        printShapes(shapeList);
        resize(shapeList,2);
        printShapes(shapeList);
    }

    private void printShapes(List<Shape> shapeList) {
        for (Shape s : shapeList) {
            print(s);
            print(s.getArea());
            try{
                print(s.getPerimeter());
            }catch (PerimeterNotSupportedException e){
                print(e.getMessage());
            }

        }
    }
    private void resize(List<? extends Resizable> resizableList, double factor){
        for (Resizable r : resizableList) {
            r.resize(factor);
        }
    }
}
