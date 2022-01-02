package com.zubrycky.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static com.zubrycky.utils.Utils.print;

public class Lesson5 implements Runnable {

    @Override
    public void run() {
        CreditCard creditCard1 = new CreditCard(23423423454353L);
        CreditCard creditCard2 = new CreditCard(45345345333455L);
        CreditCard creditCard3 = new CreditCard(34534534534555L);
        CreditCard creditCard4 = new CreditCard(34534534423424L);
        CreditCard creditCard5 = new CreditCard(34534534234324L);

        Map<CreditCard, CardStatus> map = new HashMap<>();
        map.put(creditCard1, CardStatus.ACTIVE);
        map.put(creditCard2, CardStatus.BLOCKED);
        map.put(creditCard3, CardStatus.INACTIVE);
        map.put(creditCard4, CardStatus.INACTIVE);
        map.put(creditCard5, CardStatus.ACTIVE);

        printMap(map);
        System.out.println("");

        Map<CreditCard, CardStatus> map2 = new LinkedHashMap<>();
        map2.put(creditCard1, CardStatus.ACTIVE);
        map2.put(creditCard2, CardStatus.BLOCKED);
        map2.put(creditCard3, CardStatus.INACTIVE);
        map2.put(creditCard4, CardStatus.INACTIVE);
        map2.put(creditCard5, CardStatus.ACTIVE);

        printMap(map2);
    }

    private void printMap(Map<CreditCard, CardStatus> map) {
        Set<Map.Entry<CreditCard, CardStatus>> entries = map.entrySet();
        for (Map.Entry<CreditCard, CardStatus> entry : entries) {
            print(entry.getKey() + " " + entry.getValue());
        }
    }
}
