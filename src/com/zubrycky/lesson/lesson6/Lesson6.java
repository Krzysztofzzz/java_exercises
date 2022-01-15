package com.zubrycky.lesson.lesson6;

import com.zubrycky.lesson.lesson5.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.zubrycky.utils.Utils.print;

public class Lesson6 implements Runnable {

    @Override
    public void run() {
        List<CreditCard> creditCards = new ArrayList<>();
        // obiekty zawsze są przekazywane przez referencje
        addNewCard(creditCards);
        // dlatego każda operacja jaką zrobimy na liście creditCards będzie widoczna tutaj
        printCreditCards(creditCards);
        clearCreditCards(creditCards);
        printCreditCards(creditCards);

        Integer i = 100;
        increase(i);
        // jako, że metoda increase nie zwraca żadnego obiektu to wartość i się nie zmienia
        print(i);
    }

    private void addNewCard(List<CreditCard> creditCardList) {
        Random random = new Random();
        CreditCard creditCard1 = new CreditCard(random.nextLong());
        creditCardList.add(creditCard1);
    }

    private void printCreditCards(List<CreditCard> creditCardList) {
        for (CreditCard card : creditCardList) {
            print(card);
        }
    }

    private void clearCreditCards(List<CreditCard> creditCardList) {
        for (CreditCard card : creditCardList) {
            card.setNumber(0L);
        }
    }

    private void increase(Integer value) {
        // value + 100 tak naprawdę tworzy nowy obiekt, który jest na nowo przypisany do zmiennej value
        value = value + 100;
    }
}