package com.zubrycky.excercise.excercise12_even_odd;

import java.util.List;

public class CommaSeparated {

    public String getString(List<Integer> list){
        String string = "";

        if (list.isEmpty()){
            return string;
        }

        for (Integer i : list) {
            if (i%2==0){
                string += "e" + i.toString();
            }else {
                string += "o" + i.toString();
            }
            if (i.equals(list.get(list.size()-1)))
                break;
            string += ",";
        }

        return string;
    }
}
