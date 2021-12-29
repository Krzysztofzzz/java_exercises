package com.zubrycky.lesson4;

import com.zubrycky.lesson3.Person;

import java.util.ArrayList;
import java.util.List;

public class UniqueObjectList {
    private List<Person> uniqueObjectsList = new ArrayList<>();

    public void add(Person person) {
        for (int i = 0; i < uniqueObjectsList.size(); i++) {
            Person p = uniqueObjectsList.get(i);
            if (p.equals(person))
                return;
        }
        uniqueObjectsList.add(person);
    }

    public void remove(Person person) {
        for (int i = 0; i < uniqueObjectsList.size(); i++) {
            Person p = uniqueObjectsList.get(i);
            if (p.equals(person)) {
                uniqueObjectsList.remove(i);
                return;
            }
        }
    }
    public int size(){
        int listSize=0;
        for (int i=0;i<uniqueObjectsList.size(); i++){
            listSize++;
        }
        return listSize;
    }

    public Person get(int index){
        return uniqueObjectsList.get(index);
    }
}
