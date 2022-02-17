package com.zubrycky.lesson.lesson21_design_patterns.facade;

import static com.zubrycky.utils.Utils.print;

public class LabelMaker {
    public String createLabel(){
        print("Creating label");
        return "label";
    }
}
