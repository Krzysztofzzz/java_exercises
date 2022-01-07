package com.zubrycky.lesson13;

import static com.zubrycky.utils.Utils.print;

public class Lesson13 implements Runnable{

    @Override
    public void run() {
        Rectangle rectangle = new Rectangle(20.0,30.0);
        print(rectangle);
        Triangle triangle = new Triangle(10,15);
        print(triangle);
    }
}
