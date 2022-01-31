package com.zubrycky.lesson.lesson20_SOLID;

public class SquareBadExample extends Rectangle{

    public SquareBadExample(double size){
        super(size,size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        this.width = height;
    }
}
