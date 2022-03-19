package com.zubrycky.excercise.excercise12_even_odd;

import java.util.List;

public class CommaSeparated {

    public String getString(List<Integer> list) {

        StringBuilder stringBuilder = new StringBuilder("");

        for (int index = 0; index < list.size(); index++) {
            Integer i = list.get(index);
            if (i % 2 == 0) {
                stringBuilder.append("e").append(i);
            } else {
                stringBuilder.append("o").append(i);
            }
            if (index == list.size() - 1)
                break;
            stringBuilder.append(",");
        }

        return stringBuilder.toString();
    }
}
