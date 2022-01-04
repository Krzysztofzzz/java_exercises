package com.zubrycky.lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.zubrycky.utils.Utils.print;

public class Lesson11 implements Runnable {
    @Override
    public void run() {
        //iteratorTest();
        removeTest();
    }

    private void iteratorTest() {
        List<String> stringList = new ArrayList<>();
        stringList.add("raz");
        stringList.add("dwa");
        stringList.add("trzy");

//        for (String s : stringList) {
//            print(s);
//        }

        Iterator<String> iterator = stringList.iterator();
//        String next = iterator.next();
//        print(next);
//        String next2 = iterator.next();
//        print(next2);
//        String next3 = iterator.next();
//        print(next3);
//        String next4 = iterator.next();
//        print(next4);
        while (iterator.hasNext()) {
            print(iterator.next());
        }
    }

    private void removeTest() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(8);
        integerList.add(2);
        integerList.add(23);


        print(integerList);

        //To nie zadziała ponieważ nie możemy usuwać elementów z kolekcji po któej iterujemy for each
//        for (Integer i : integerList) {
//            if (i < 10) {
//                integerList.remove(i);
//            }
//        }
//        print(integerList);
//        Iterator<Integer> iterator = integerList.iterator();
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            if (i<10){
//                iterator.remove();
//            }
//        }
//        print(integerList);
        //Nie wszystkie elementy się usunęły bo się przestawiły ich indexy
//        for(int i = 0; i< integerList.size();i++){
//            Integer value = integerList.get(i);
//            if (value<10){
//                integerList.remove(i);
//            }
//        }
//        print(integerList);

        for (int i = integerList.size() - 1; i > 0; i--) {
            Integer value = integerList.get(i);
            if (value < 10) {
                integerList.remove(i);
            }
        }
        print(integerList);
    }
}
