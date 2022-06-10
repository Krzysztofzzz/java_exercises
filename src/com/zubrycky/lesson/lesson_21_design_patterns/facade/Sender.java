package com.zubrycky.lesson.lesson_21_design_patterns.facade;

import static com.zubrycky.utils.Utils.print;

public class Sender {
    public void send(Package p) {
        print("Sending package " + p);
    }
}
